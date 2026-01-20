package com.cmb.rainbowtv.domain.game.infra;

import com.cmb.rainbowtv.domain.game.infra.data.entity.GameEntity;
import com.cmb.rainbowtv.domain.game.model.Game;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:48+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class GameInfraMapperImpl implements GameInfraMapper {

    @Override
    public GameEntity toGameEntity(Game game) {
        if ( game == null ) {
            return null;
        }

        GameEntity.GameEntityBuilder gameEntity = GameEntity.builder();

        gameEntity.gaIdx( game.getGaIdx() );
        gameEntity.gaType( game.getGaType() );
        gameEntity.gaClass( game.getGaClass() );
        gameEntity.gaTitle( game.getGaTitle() );
        gameEntity.gaName( game.getGaName() );
        gameEntity.gaSeq( game.getGaSeq() );
        gameEntity.gaIsAdult( game.getGaIsAdult() );
        gameEntity.gaUrl( game.getGaUrl() );
        gameEntity.gaIsUse( game.getGaIsUse() );
        gameEntity.gaIosPackage( game.getGaIosPackage() );
        gameEntity.gaIosUrl( game.getGaIosUrl() );
        gameEntity.gaLgUrl( game.getGaLgUrl() );
        gameEntity.gaSamsungUrl( game.getGaSamsungUrl() );
        gameEntity.aosDisplay( game.getAosDisplay() );
        gameEntity.smartDisplay( game.getSmartDisplay() );
        gameEntity.ottAppDisplay( game.getOttAppDisplay() );

        return gameEntity.build();
    }

    @Override
    public Game toGame(GameEntity save) {
        if ( save == null ) {
            return null;
        }

        Game.GameBuilder<?, ?> game = Game.builder();

        game.createdAt( save.getCreatedAt() );
        game.updatedAt( save.getUpdatedAt() );
        game.gaIdx( save.getGaIdx() );
        game.gaType( save.getGaType() );
        game.gaClass( save.getGaClass() );
        game.gaTitle( save.getGaTitle() );
        game.gaName( save.getGaName() );
        game.gaSeq( save.getGaSeq() );
        game.gaIsAdult( save.getGaIsAdult() );
        game.gaUrl( save.getGaUrl() );
        game.gaIsUse( save.getGaIsUse() );
        game.gaIosPackage( save.getGaIosPackage() );
        game.gaIosUrl( save.getGaIosUrl() );
        game.gaLgUrl( save.getGaLgUrl() );
        game.gaSamsungUrl( save.getGaSamsungUrl() );
        game.aosDisplay( save.getAosDisplay() );
        game.smartDisplay( save.getSmartDisplay() );
        game.ottAppDisplay( save.getOttAppDisplay() );

        return game.build();
    }
}
