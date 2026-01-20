package com.cmb.rainbowtv.global.define.boardCategory.infra;

import com.cmb.rainbowtv.global.define.boardCategory.infra.data.entity.BoardCategoryDefineEntity;
import com.cmb.rainbowtv.global.define.boardCategory.model.BoardCategoryDefine;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:45+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class BoardCategoryDefineInfraMapperImpl implements BoardCategoryDefineInfraMapper {

    @Override
    public BoardCategoryDefine toBoardCategoryDefine(BoardCategoryDefineEntity entity) {
        if ( entity == null ) {
            return null;
        }

        BoardCategoryDefine.BoardCategoryDefineBuilder<?, ?> boardCategoryDefine = BoardCategoryDefine.builder();

        boardCategoryDefine.createdAt( entity.getCreatedAt() );
        boardCategoryDefine.updatedAt( entity.getUpdatedAt() );
        boardCategoryDefine.bcIdx( entity.getBcIdx() );
        boardCategoryDefine.boTable( entity.getBoTable() );
        boardCategoryDefine.bcName( entity.getBcName() );
        boardCategoryDefine.bcIsDisplay( entity.getBcIsDisplay() );
        boardCategoryDefine.bcIsUse( entity.getBcIsUse() );
        boardCategoryDefine.bcSeq( entity.getBcSeq() );

        return boardCategoryDefine.build();
    }
}
