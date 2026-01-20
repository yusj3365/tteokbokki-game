package com.cmb.rainbowtv.global.define.setting.infra.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSettingDefineEntity is a Querydsl query type for SettingDefineEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSettingDefineEntity extends EntityPathBase<SettingDefineEntity> {

    private static final long serialVersionUID = -1842826070L;

    public static final QSettingDefineEntity settingDefineEntity = new QSettingDefineEntity("settingDefineEntity");

    public final com.cmb.rainbowtv.global.entity.QBaseEntity _super = new com.cmb.rainbowtv.global.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath seAosValue = createString("seAosValue");

    public final NumberPath<Long> seIdx = createNumber("seIdx", Long.class);

    public final StringPath seIosValue = createString("seIosValue");

    public final StringPath seKey = createString("seKey");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QSettingDefineEntity(String variable) {
        super(SettingDefineEntity.class, forVariable(variable));
    }

    public QSettingDefineEntity(Path<? extends SettingDefineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSettingDefineEntity(PathMetadata metadata) {
        super(SettingDefineEntity.class, metadata);
    }

}

