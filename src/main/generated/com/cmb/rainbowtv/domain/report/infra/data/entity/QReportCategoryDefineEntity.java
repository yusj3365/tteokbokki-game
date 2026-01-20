package com.cmb.rainbowtv.domain.report.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReportCategoryDefineEntity is a Querydsl query type for ReportCategoryDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReportCategoryDefineEntity extends EntityPathBase<ReportCategoryDefineEntity> {

    private static final long serialVersionUID = 160295582L;

    public static final QReportCategoryDefineEntity reportCategoryDefineEntity = new QReportCategoryDefineEntity("reportCategoryDefineEntity");

    public final StringPath rcCategory = createString("rcCategory");

    public final NumberPath<Long> rcIdx = createNumber("rcIdx", Long.class);

    public final NumberPath<Long> rcSeq = createNumber("rcSeq", Long.class);

    public QReportCategoryDefineEntity(String variable) {
        super(ReportCategoryDefineEntity.class, forVariable(variable));
    }

    public QReportCategoryDefineEntity(Path<? extends ReportCategoryDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReportCategoryDefineEntity(PathMetadata metadata) {
        super(ReportCategoryDefineEntity.class, metadata);
    }

}

