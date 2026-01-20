package com.tteokbokki.global.repository;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;

import java.util.List;
import java.util.Map;

public interface GlobalFirestoreRepository {

    <T> ApiFuture<WriteResult> addEntity(String paths, String entityId, T entity);

    <R> List<ApiFuture<WriteResult>> addSubCollection(String collectionPath, String entityId, Map<String, R> subCollectionEntity);

    ApiFuture<WriteResult> updateEntityField(String collectionPath, String entityId, Map<String, Object> updates);

    ApiFuture<WriteResult> deleteEntity(String collectionPath, String entityId);

    DocumentSnapshot getEntity(String collectionPath, String entityId);
}
