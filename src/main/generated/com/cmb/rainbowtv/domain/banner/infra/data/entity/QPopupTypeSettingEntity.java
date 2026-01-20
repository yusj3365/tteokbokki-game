package com.cmb.rainbowtv.domain.banner.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPopupTypeSettingEntity is a Querydsl query type for PopupTypeSettingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPopupTypeSettingEntity extends EntityPathBase<PopupTypeSettingEntity> {

    private static final long serialVersionUID = 1772228515L;

    public static final QPopupTypeSettingEntity popupTypeSettingEntity = new QPopupTypeSettingEntity("popupTypeSettingEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath ptsChannelName = createString("ptsChannelName");

    public final EnumPath<com.cmb.rainbowtv.domain.banner.model.enums.RecommendChannelItemEnum> ptsChannelType = createEnum("ptsChannelType", com.cmb.rainbowtv.domain.banner.model.enums.RecommendChannelItemEnum.class);

    public final NumberPath<Long> ptsIdx = createNumber("ptsIdx", Long.class);

    public final NumberPath<Integer> ptsPopupType = createNumber("ptsPopupType", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QPopupTypeSettingEntity(String variable) {
        super(PopupTypeSettingEntity.class, forVariable(variable));
    }

    public QPopupTypeSettingEntity(Path<? extends PopupTypeSettingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPopupTypeSettingEntity(PathMetadata metadata) {
        super(PopupTypeSettingEntity.class, metadata);
    }

}

