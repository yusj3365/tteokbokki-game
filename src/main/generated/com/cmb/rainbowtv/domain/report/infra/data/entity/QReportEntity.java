package com.cmb.rainbowtv.domain.report.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReportEntity is a Querydsl query type for ReportEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReportEntity extends EntityPathBase<ReportEntity> {

    private static final long serialVersionUID = -384949147L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReportEntity reportEntity = new QReportEntity("reportEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity member;

    public final StringPath reContent = createString("reContent");

    public final NumberPath<Long> reIdx = createNumber("reIdx", Long.class);

    public final NumberPath<Long> reKey = createNumber("reKey", Long.class);

    public final QReportCategoryDefineEntity reportCategory;

    public final NumberPath<Long> reReport = createNumber("reReport", Long.class);

    public final StringPath reTitle = createString("reTitle");

    public final EnumPath<com.cmb.rainbowtv.domain.report.model.enums.RTypeEnum> reType = createEnum("reType", com.cmb.rainbowtv.domain.report.model.enums.RTypeEnum.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QReportEntity(String variable) {
        this(ReportEntity.class, forVariable(variable), INITS);
    }

    public QReportEntity(Path<? extends ReportEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReportEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReportEntity(PathMetadata metadata, PathInits inits) {
        this(ReportEntity.class, metadata, inits);
    }

    public QReportEntity(Class<? extends ReportEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.cmb.rainbowtv.domain.member.infra.data.entity.QMemberEntity(forProperty("member"), inits.get("member")) : null;
        this.reportCategory = inits.isInitialized("reportCategory") ? new QReportCategoryDefineEntity(forProperty("reportCategory")) : null;
    }

}

