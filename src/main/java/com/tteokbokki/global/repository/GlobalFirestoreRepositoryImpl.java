package com.tteokbokki.global.repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;
import io.hamagroups.fcm.FcmClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class GlobalFirestoreRepositoryImpl implements GlobalFirestoreRepository {

    private final FcmClient fcmClient;

    @Override
    public <T> ApiFuture<WriteResult> addEntity(String collectionPath, String entityId, T entity) {
        // Firestore value 에 대한 String 입력 검증
        if (entity instanceof String) {
            throw new IllegalArgumentException("Document 의 Value 로는 JSON 객체가 입력되어야 합니다.");
        }

        // Firestore 에 path > id > entity 저장
        try {
            log.info("Adding entity {} to collection {} value of {}", entityId, collectionPath, entity);
            return fcmClient.getFirestore().collection(collectionPath)
                .document(entityId)
                .set(entity);
        } catch (Exception e) {
            log.error("[Firestore error on adding entity] : {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public <R> List<ApiFuture<WriteResult>> addSubCollection(String collectionPath, String entityId, Map<String, R> subCollectionEntity) {
        // Firestore value 에 대한 String 입력 검증
        boolean isValueString = subCollectionEntity
            .values()
            .stream()
            .anyMatch(value -> value instanceof String);
        if (isValueString) {
            throw new IllegalArgumentException("Document 의 Value 로는 JSON 객체가 입력되어야 합니다.");
        }

        // Firestore 에 path > id > Collection 저장
        try {
            DocumentReference document = fcmClient.getFirestore().collection(collectionPath)
                .document(entityId);
            return subCollectionEntity.keySet()
                .stream()
                .map(id ->
                    document
                        .collection(id)
                        .document() // 자동 ID 사용
                        .set(subCollectionEntity.get(id))
                )
                .toList();
        } catch (Exception e) {
            log.error("[Firestore error on adding sub collection] : {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public ApiFuture<WriteResult> updateEntityField(String collectionPath, String entityId, Map<String, Object> updates) {
        // Firestore에 path > id > fieldName 업데이트
        try {

            return fcmClient.getFirestore().collection(collectionPath)
                .document(entityId)
                .update(updates);
        } catch (Exception e) {
            log.error("[Firestore error on updating entity field] : {}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public ApiFuture<WriteResult> deleteEntity(String collectionPath, String entityId) {
        try {
            log.info("[Firestore delete on deleting entity] collectionPath -> {}, entityId -> {}", collectionPath, entityId);
            return fcmClient.getFirestore().collection(collectionPath)
                .document(entityId).delete();
        } catch (Exception e) {
            throw new RuntimeException("Error deleting document: " + e.getMessage(), e);
        }
    }

    @Override
    public DocumentSnapshot getEntity(String collectionPath, String entityId) {
        try {
            ApiFuture<DocumentSnapshot> eventFuture = fcmClient.getFirestore().collection(collectionPath)
                .document(entityId).get();
            return eventFuture.get();
        } catch (Exception e) {
            throw new RuntimeException("Error get document: " + e.getMessage(), e);
        }
    }


}
