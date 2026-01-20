package com.cmb.rainbowtv.domain.fast.infra;

import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastMediaDeleteEntity;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastMediaEntity;
import com.cmb.rainbowtv.domain.fast.infra.data.entity.FastMediaInfoEntity;
import com.cmb.rainbowtv.domain.fast.model.FastMedia;
import com.cmb.rainbowtv.domain.fast.model.FastMediaDelete;
import com.cmb.rainbowtv.domain.fast.model.FastMediaInfo;
import com.cmb.rainbowtv.domain.media.infra.data.entity.MediaDeleteReasonDefineEntity;
import com.cmb.rainbowtv.domain.media.model.MediaDeleteReasonDefine;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:44+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class FastMediaInfraMapperImpl implements FastMediaInfraMapper {

    @Override
    public FastMedia toFastMedia(FastMediaEntity fastMediaEntity) {
        if ( fastMediaEntity == null ) {
            return null;
        }

        FastMedia.FastMediaBuilder<?, ?> fastMedia = FastMedia.builder();

        fastMedia.createdAt( fastMediaEntity.getCreatedAt() );
        fastMedia.updatedAt( fastMediaEntity.getUpdatedAt() );
        fastMedia.fmIdx( fastMediaEntity.getFmIdx() );
        fastMedia.fmType( fastMediaEntity.getFmType() );
        fastMedia.fmDashUrl( fastMediaEntity.getFmDashUrl() );
        fastMedia.fmHlsUrl( fastMediaEntity.getFmHlsUrl() );
        fastMedia.guid( fastMediaEntity.getGuid() );
        fastMedia.mediaPackageId( fastMediaEntity.getMediaPackageId() );
        fastMedia.fmUuid( fastMediaEntity.getFmUuid() );
        fastMedia.fmName( fastMediaEntity.getFmName() );
        fastMedia.fmRunningTime( fastMediaEntity.getFmRunningTime() );
        fastMedia.fmStatus( fastMediaEntity.getFmStatus() );
        fastMedia.fmPostStatus( fastMediaEntity.getFmPostStatus() );
        fastMedia.fmPostTimeSt( fastMediaEntity.getFmPostTimeSt() );
        fastMedia.fmPostTimeEd( fastMediaEntity.getFmPostTimeEd() );
        fastMedia.fmGenreType( fastMediaEntity.getFmGenreType() );
        fastMedia.fmIsAllow( fastMediaEntity.getFmIsAllow() );
        fastMedia.fmReason( fastMediaEntity.getFmReason() );
        fastMedia.fmUse( fastMediaEntity.getFmUse() );
        fastMedia.member( memberEntityToMember( fastMediaEntity.getMember() ) );
        fastMedia.deletedAt( fastMediaEntity.getDeletedAt() );
        fastMedia.sourceLocationName( fastMediaEntity.getSourceLocationName() );

        return fastMedia.build();
    }

    @Override
    public FastMediaInfo toFastMediaInfo(FastMediaInfoEntity fastMediaInfoEntity) {
        if ( fastMediaInfoEntity == null ) {
            return null;
        }

        FastMediaInfo.FastMediaInfoBuilder<?, ?> fastMediaInfo = FastMediaInfo.builder();

        fastMediaInfo.createdAt( fastMediaInfoEntity.getCreatedAt() );
        fastMediaInfo.updatedAt( fastMediaInfoEntity.getUpdatedAt() );
        fastMediaInfo.fmiIdx( fastMediaInfoEntity.getFmiIdx() );
        fastMediaInfo.fastMedia( toFastMedia( fastMediaInfoEntity.getFastMedia() ) );
        fastMediaInfo.fmiBroadcastDate( fastMediaInfoEntity.getFmiBroadcastDate() );
        fastMediaInfo.fmiDirector( fastMediaInfoEntity.getFmiDirector() );
        fastMediaInfo.fmiActors( fastMediaInfoEntity.getFmiActors() );
        fastMediaInfo.fmiStory( fastMediaInfoEntity.getFmiStory() );

        return fastMediaInfo.build();
    }

    @Override
    public FastMediaEntity toFastMediaEntity(FastMedia fastChannelAd) {
        if ( fastChannelAd == null ) {
            return null;
        }

        FastMediaEntity.FastMediaEntityBuilder fastMediaEntity = FastMediaEntity.builder();

        fastMediaEntity.fmIdx( fastChannelAd.getFmIdx() );
        fastMediaEntity.fmType( fastChannelAd.getFmType() );
        fastMediaEntity.fmDashUrl( fastChannelAd.getFmDashUrl() );
        fastMediaEntity.fmHlsUrl( fastChannelAd.getFmHlsUrl() );
        fastMediaEntity.guid( fastChannelAd.getGuid() );
        fastMediaEntity.mediaPackageId( fastChannelAd.getMediaPackageId() );
        fastMediaEntity.fmUuid( fastChannelAd.getFmUuid() );
        fastMediaEntity.fmName( fastChannelAd.getFmName() );
        fastMediaEntity.fmRunningTime( fastChannelAd.getFmRunningTime() );
        fastMediaEntity.fmStatus( fastChannelAd.getFmStatus() );
        fastMediaEntity.fmPostStatus( fastChannelAd.getFmPostStatus() );
        fastMediaEntity.fmPostTimeSt( fastChannelAd.getFmPostTimeSt() );
        fastMediaEntity.fmPostTimeEd( fastChannelAd.getFmPostTimeEd() );
        fastMediaEntity.fmGenreType( fastChannelAd.getFmGenreType() );
        fastMediaEntity.fmIsAllow( fastChannelAd.getFmIsAllow() );
        fastMediaEntity.fmReason( fastChannelAd.getFmReason() );
        fastMediaEntity.fmUse( fastChannelAd.getFmUse() );
        fastMediaEntity.member( memberToMemberEntity( fastChannelAd.getMember() ) );
        fastMediaEntity.deletedAt( fastChannelAd.getDeletedAt() );
        fastMediaEntity.sourceLocationName( fastChannelAd.getSourceLocationName() );

        return fastMediaEntity.build();
    }

    @Override
    public FastMediaInfoEntity toFastMediaInfoEntity(FastMediaInfo fastMediaInfo) {
        if ( fastMediaInfo == null ) {
            return null;
        }

        FastMediaInfoEntity.FastMediaInfoEntityBuilder fastMediaInfoEntity = FastMediaInfoEntity.builder();

        fastMediaInfoEntity.fmiIdx( fastMediaInfo.getFmiIdx() );
        fastMediaInfoEntity.fastMedia( toFastMediaEntity( fastMediaInfo.getFastMedia() ) );
        fastMediaInfoEntity.fmiBroadcastDate( fastMediaInfo.getFmiBroadcastDate() );
        fastMediaInfoEntity.fmiDirector( fastMediaInfo.getFmiDirector() );
        fastMediaInfoEntity.fmiActors( fastMediaInfo.getFmiActors() );
        fastMediaInfoEntity.fmiStory( fastMediaInfo.getFmiStory() );

        return fastMediaInfoEntity.build();
    }

    @Override
    public FastMediaDeleteEntity toFastMediaDeleteEntity(FastMediaDelete fastMediaDelete) {
        if ( fastMediaDelete == null ) {
            return null;
        }

        FastMediaDeleteEntity.FastMediaDeleteEntityBuilder fastMediaDeleteEntity = FastMediaDeleteEntity.builder();

        fastMediaDeleteEntity.mbdIdx( fastMediaDelete.getMbdIdx() );
        fastMediaDeleteEntity.fastMedia( toFastMediaEntity( fastMediaDelete.getFastMedia() ) );
        fastMediaDeleteEntity.mediaDeleteReasonDefine( mediaDeleteReasonDefineToMediaDeleteReasonDefineEntity( fastMediaDelete.getMediaDeleteReasonDefine() ) );
        fastMediaDeleteEntity.member( memberToMemberEntity( fastMediaDelete.getMember() ) );

        return fastMediaDeleteEntity.build();
    }

    protected Group groupEntityToGroup(GroupEntity groupEntity) {
        if ( groupEntity == null ) {
            return null;
        }

        Group.GroupBuilder<?, ?> group = Group.builder();

        group.createdAt( groupEntity.getCreatedAt() );
        group.updatedAt( groupEntity.getUpdatedAt() );
        group.grIdx( groupEntity.getGrIdx() );
        group.grType( groupEntity.getGrType() );
        group.grLevel( groupEntity.getGrLevel() );
        group.grName( groupEntity.getGrName() );
        group.grContent( groupEntity.getGrContent() );
        group.grIsDefault( groupEntity.getGrIsDefault() );
        group.grIsSuper( groupEntity.getGrIsSuper() );

        return group.build();
    }

    protected MemberSuspensionCategory memberSuspensionCategoryEntityToMemberSuspensionCategory(MemberSuspensionCategoryEntity memberSuspensionCategoryEntity) {
        if ( memberSuspensionCategoryEntity == null ) {
            return null;
        }

        MemberSuspensionCategory.MemberSuspensionCategoryBuilder<?, ?> memberSuspensionCategory = MemberSuspensionCategory.builder();

        memberSuspensionCategory.mscIdx( memberSuspensionCategoryEntity.getMscIdx() );
        memberSuspensionCategory.mscCategory( memberSuspensionCategoryEntity.getMscCategory() );
        memberSuspensionCategory.mscCode( memberSuspensionCategoryEntity.getMscCode() );
        memberSuspensionCategory.mscRequireInput( memberSuspensionCategoryEntity.getMscRequireInput() );
        memberSuspensionCategory.mscIsUse( memberSuspensionCategoryEntity.getMscIsUse() );
        memberSuspensionCategory.mscIsAdmin( memberSuspensionCategoryEntity.getMscIsAdmin() );

        return memberSuspensionCategory.build();
    }

    protected Member memberEntityToMember(MemberEntity memberEntity) {
        if ( memberEntity == null ) {
            return null;
        }

        Member.MemberBuilder<?, ?> member = Member.builder();

        member.createdAt( memberEntity.getCreatedAt() );
        member.updatedAt( memberEntity.getUpdatedAt() );
        member.mbNo( memberEntity.getMbNo() );
        member.mbIp( memberEntity.getMbIp() );
        member.mbId( memberEntity.getMbId() );
        member.mbPassword( memberEntity.getMbPassword() );
        member.mbPasswordUpdatedDate( memberEntity.getMbPasswordUpdatedDate() );
        member.mbUuid( memberEntity.getMbUuid() );
        member.mbName( memberEntity.getMbName() );
        member.mbHp( memberEntity.getMbHp() );
        member.group( groupEntityToGroup( memberEntity.getGroup() ) );
        member.mbLastLogin( memberEntity.getMbLastLogin() );
        member.mbIsUse( memberEntity.getMbIsUse() );
        member.mbJoinDate( memberEntity.getMbJoinDate() );
        member.mbStatus( memberEntity.getMbStatus() );
        member.mbCategory( memberEntity.getMbCategory() );
        member.mbIsVerify( memberEntity.getMbIsVerify() );
        member.deletedAt( memberEntity.getDeletedAt() );
        member.mbAnd( memberEntity.getMbAnd() );
        member.mbSmart( memberEntity.getMbSmart() );
        member.mbSmartStatus( memberEntity.getMbSmartStatus() );
        member.mbCertificationDate( memberEntity.getMbCertificationDate() );
        member.mbAdminNo( memberEntity.getMbAdminNo() );
        member.mbTelephone( memberEntity.getMbTelephone() );
        member.memberSuspensionCategory( memberSuspensionCategoryEntityToMemberSuspensionCategory( memberEntity.getMemberSuspensionCategory() ) );
        member.mbEnd( memberEntity.getMbEnd() );

        return member.build();
    }

    protected GroupEntity groupToGroupEntity(Group group) {
        if ( group == null ) {
            return null;
        }

        GroupEntity.GroupEntityBuilder<?, ?> groupEntity = GroupEntity.builder();

        groupEntity.createdAt( group.getCreatedAt() );
        groupEntity.updatedAt( group.getUpdatedAt() );
        groupEntity.grIdx( group.getGrIdx() );
        groupEntity.grType( group.getGrType() );
        groupEntity.grLevel( group.getGrLevel() );
        groupEntity.grName( group.getGrName() );
        groupEntity.grContent( group.getGrContent() );
        groupEntity.grIsDefault( group.getGrIsDefault() );
        groupEntity.grIsSuper( group.getGrIsSuper() );

        return groupEntity.build();
    }

    protected MemberSuspensionCategoryEntity memberSuspensionCategoryToMemberSuspensionCategoryEntity(MemberSuspensionCategory memberSuspensionCategory) {
        if ( memberSuspensionCategory == null ) {
            return null;
        }

        MemberSuspensionCategoryEntity.MemberSuspensionCategoryEntityBuilder memberSuspensionCategoryEntity = MemberSuspensionCategoryEntity.builder();

        memberSuspensionCategoryEntity.mscIdx( memberSuspensionCategory.getMscIdx() );
        memberSuspensionCategoryEntity.mscCategory( memberSuspensionCategory.getMscCategory() );
        memberSuspensionCategoryEntity.mscCode( memberSuspensionCategory.getMscCode() );
        memberSuspensionCategoryEntity.mscRequireInput( memberSuspensionCategory.getMscRequireInput() );
        memberSuspensionCategoryEntity.mscIsUse( memberSuspensionCategory.getMscIsUse() );
        memberSuspensionCategoryEntity.mscIsAdmin( memberSuspensionCategory.getMscIsAdmin() );

        return memberSuspensionCategoryEntity.build();
    }

    protected MemberEntity memberToMemberEntity(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder<?, ?> memberEntity = MemberEntity.builder();

        memberEntity.createdAt( member.getCreatedAt() );
        memberEntity.updatedAt( member.getUpdatedAt() );
        memberEntity.mbNo( member.getMbNo() );
        memberEntity.mbIp( member.getMbIp() );
        memberEntity.mbId( member.getMbId() );
        memberEntity.mbPassword( member.getMbPassword() );
        memberEntity.mbPasswordUpdatedDate( member.getMbPasswordUpdatedDate() );
        memberEntity.mbUuid( member.getMbUuid() );
        memberEntity.mbName( member.getMbName() );
        memberEntity.mbHp( member.getMbHp() );
        memberEntity.group( groupToGroupEntity( member.getGroup() ) );
        memberEntity.mbLastLogin( member.getMbLastLogin() );
        memberEntity.mbIsUse( member.getMbIsUse() );
        memberEntity.mbJoinDate( member.getMbJoinDate() );
        memberEntity.mbStatus( member.getMbStatus() );
        memberEntity.mbCategory( member.getMbCategory() );
        memberEntity.mbIsVerify( member.getMbIsVerify() );
        memberEntity.deletedAt( member.getDeletedAt() );
        memberEntity.mbAnd( member.getMbAnd() );
        memberEntity.mbSmart( member.getMbSmart() );
        memberEntity.mbSmartStatus( member.getMbSmartStatus() );
        memberEntity.mbCertificationDate( member.getMbCertificationDate() );
        memberEntity.mbAdminNo( member.getMbAdminNo() );
        memberEntity.mbTelephone( member.getMbTelephone() );
        memberEntity.memberSuspensionCategory( memberSuspensionCategoryToMemberSuspensionCategoryEntity( member.getMemberSuspensionCategory() ) );
        memberEntity.mbEnd( member.getMbEnd() );

        return memberEntity.build();
    }

    protected MediaDeleteReasonDefineEntity mediaDeleteReasonDefineToMediaDeleteReasonDefineEntity(MediaDeleteReasonDefine mediaDeleteReasonDefine) {
        if ( mediaDeleteReasonDefine == null ) {
            return null;
        }

        MediaDeleteReasonDefineEntity.MediaDeleteReasonDefineEntityBuilder mediaDeleteReasonDefineEntity = MediaDeleteReasonDefineEntity.builder();

        mediaDeleteReasonDefineEntity.mdrIdx( mediaDeleteReasonDefine.getMdrIdx() );
        mediaDeleteReasonDefineEntity.mdrReason( mediaDeleteReasonDefine.getMdrReason() );
        mediaDeleteReasonDefineEntity.mdrType( mediaDeleteReasonDefine.getMdrType() );

        return mediaDeleteReasonDefineEntity.build();
    }
}
