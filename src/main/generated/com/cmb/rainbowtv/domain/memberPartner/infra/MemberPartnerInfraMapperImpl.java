package com.cmb.rainbowtv.domain.memberPartner.infra;

import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberEntity;
import com.cmb.rainbowtv.domain.member.infra.data.entity.MemberSuspensionCategoryEntity;
import com.cmb.rainbowtv.domain.member.model.Member;
import com.cmb.rainbowtv.domain.member.model.MemberSuspensionCategory;
import com.cmb.rainbowtv.domain.memberPartner.infra.data.entity.MemberPartnerAdvertisementEntity;
import com.cmb.rainbowtv.domain.memberPartner.infra.data.entity.MemberPartnerEntity;
import com.cmb.rainbowtv.domain.memberPartner.infra.data.entity.MemberPartnerMediaEntity;
import com.cmb.rainbowtv.domain.memberPartner.infra.data.entity.MemberPartnerOutInfoEntity;
import com.cmb.rainbowtv.domain.memberPartner.infra.data.entity.MemberPartnerShoppingEntity;
import com.cmb.rainbowtv.domain.memberPartner.model.MemberPartner;
import com.cmb.rainbowtv.domain.memberPartner.model.MemberPartnerAdvertisement;
import com.cmb.rainbowtv.domain.memberPartner.model.MemberPartnerMedia;
import com.cmb.rainbowtv.domain.memberPartner.model.MemberPartnerOutInfo;
import com.cmb.rainbowtv.domain.memberPartner.model.MemberPartnerShopping;
import com.cmb.rainbowtv.global.define.group.infra.data.entity.GroupEntity;
import com.cmb.rainbowtv.global.define.group.model.Group;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-19T18:53:49+0900",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class MemberPartnerInfraMapperImpl implements MemberPartnerInfraMapper {

    @Override
    public MemberPartner toMemberPartner(MemberPartnerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MemberPartner.MemberPartnerBuilder<?, ?> memberPartner = MemberPartner.builder();

        memberPartner.createdAt( entity.getCreatedAt() );
        memberPartner.updatedAt( entity.getUpdatedAt() );
        memberPartner.mpIdx( entity.getMpIdx() );
        memberPartner.member( memberEntityToMember( entity.getMember() ) );
        memberPartner.mpType( entity.getMpType() );
        memberPartner.mpStatus( entity.getMpStatus() );
        memberPartner.mpCategory( entity.getMpCategory() );
        memberPartner.mpCancelDate( entity.getMpCancelDate() );
        memberPartner.mpCancelReason( entity.getMpCancelReason() );

        return memberPartner.build();
    }

    @Override
    public MemberPartnerEntity toMemberPartnerEntity(MemberPartner partner) {
        if ( partner == null ) {
            return null;
        }

        MemberPartnerEntity.MemberPartnerEntityBuilder memberPartnerEntity = MemberPartnerEntity.builder();

        memberPartnerEntity.mpIdx( partner.getMpIdx() );
        memberPartnerEntity.member( memberToMemberEntity( partner.getMember() ) );
        memberPartnerEntity.mpType( partner.getMpType() );
        memberPartnerEntity.mpStatus( partner.getMpStatus() );
        memberPartnerEntity.mpCategory( partner.getMpCategory() );
        memberPartnerEntity.mpCancelDate( partner.getMpCancelDate() );
        memberPartnerEntity.mpCancelReason( partner.getMpCancelReason() );

        return memberPartnerEntity.build();
    }

    @Override
    public List<MemberPartner> toMemberPartnerList(List<MemberPartnerEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MemberPartner> list = new ArrayList<MemberPartner>( entityList.size() );
        for ( MemberPartnerEntity memberPartnerEntity : entityList ) {
            list.add( toMemberPartner( memberPartnerEntity ) );
        }

        return list;
    }

    @Override
    public MemberPartnerMedia toMemberPartnerMedia(MemberPartnerMediaEntity memberPartnerEntity) {
        if ( memberPartnerEntity == null ) {
            return null;
        }

        MemberPartnerMedia.MemberPartnerMediaBuilder<?, ?> memberPartnerMedia = MemberPartnerMedia.builder();

        memberPartnerMedia.createdAt( memberPartnerEntity.getCreatedAt() );
        memberPartnerMedia.updatedAt( memberPartnerEntity.getUpdatedAt() );
        memberPartnerMedia.mpmIdx( memberPartnerEntity.getMpmIdx() );
        memberPartnerMedia.memberPartner( toMemberPartner( memberPartnerEntity.getMemberPartner() ) );
        memberPartnerMedia.mpmCompany( memberPartnerEntity.getMpmCompany() );
        memberPartnerMedia.mpmAddress( memberPartnerEntity.getMpmAddress() );
        memberPartnerMedia.mpmAddressDetail( memberPartnerEntity.getMpmAddressDetail() );
        memberPartnerMedia.mpmHp( memberPartnerEntity.getMpmHp() );
        memberPartnerMedia.mpmZipCode( memberPartnerEntity.getMpmZipCode() );

        return memberPartnerMedia.build();
    }

    @Override
    public MemberPartnerMediaEntity toMemberPartnerMediaEntity(MemberPartnerMedia memberPartnerMedia) {
        if ( memberPartnerMedia == null ) {
            return null;
        }

        MemberPartnerMediaEntity.MemberPartnerMediaEntityBuilder memberPartnerMediaEntity = MemberPartnerMediaEntity.builder();

        memberPartnerMediaEntity.mpmIdx( memberPartnerMedia.getMpmIdx() );
        memberPartnerMediaEntity.memberPartner( toMemberPartnerEntity( memberPartnerMedia.getMemberPartner() ) );
        memberPartnerMediaEntity.mpmCompany( memberPartnerMedia.getMpmCompany() );
        memberPartnerMediaEntity.mpmAddress( memberPartnerMedia.getMpmAddress() );
        memberPartnerMediaEntity.mpmAddressDetail( memberPartnerMedia.getMpmAddressDetail() );
        memberPartnerMediaEntity.mpmHp( memberPartnerMedia.getMpmHp() );
        memberPartnerMediaEntity.mpmZipCode( memberPartnerMedia.getMpmZipCode() );

        return memberPartnerMediaEntity.build();
    }

    @Override
    public MemberPartnerOutInfoEntity toMemberPartnerOutInfoEntity(MemberPartnerOutInfo memberPartnerOutInfo) {
        if ( memberPartnerOutInfo == null ) {
            return null;
        }

        MemberPartnerOutInfoEntity.MemberPartnerOutInfoEntityBuilder memberPartnerOutInfoEntity = MemberPartnerOutInfoEntity.builder();

        memberPartnerOutInfoEntity.mpoiIdx( memberPartnerOutInfo.getMpoiIdx() );
        memberPartnerOutInfoEntity.memberPartner( toMemberPartnerEntity( memberPartnerOutInfo.getMemberPartner() ) );
        memberPartnerOutInfoEntity.mpoiType( memberPartnerOutInfo.getMpoiType() );
        memberPartnerOutInfoEntity.mpoiCategory( memberPartnerOutInfo.getMpoiCategory() );
        memberPartnerOutInfoEntity.mpoiCompany( memberPartnerOutInfo.getMpoiCompany() );
        memberPartnerOutInfoEntity.mpoiAddress( memberPartnerOutInfo.getMpoiAddress() );
        memberPartnerOutInfoEntity.mpoiAddressDetail( memberPartnerOutInfo.getMpoiAddressDetail() );
        memberPartnerOutInfoEntity.mpoiHp( memberPartnerOutInfo.getMpoiHp() );
        memberPartnerOutInfoEntity.mpoiZipCode( memberPartnerOutInfo.getMpoiZipCode() );

        return memberPartnerOutInfoEntity.build();
    }

    @Override
    public MemberPartnerShopping toMemberPartnerShopping(MemberPartnerShoppingEntity memberPartnerShoppingEntity) {
        if ( memberPartnerShoppingEntity == null ) {
            return null;
        }

        MemberPartnerShopping.MemberPartnerShoppingBuilder<?, ?> memberPartnerShopping = MemberPartnerShopping.builder();

        memberPartnerShopping.createdAt( memberPartnerShoppingEntity.getCreatedAt() );
        memberPartnerShopping.updatedAt( memberPartnerShoppingEntity.getUpdatedAt() );
        memberPartnerShopping.mpsIdx( memberPartnerShoppingEntity.getMpsIdx() );
        memberPartnerShopping.memberPartner( toMemberPartner( memberPartnerShoppingEntity.getMemberPartner() ) );
        memberPartnerShopping.mpsCompany( memberPartnerShoppingEntity.getMpsCompany() );
        memberPartnerShopping.mpsAddress( memberPartnerShoppingEntity.getMpsAddress() );
        memberPartnerShopping.mpsAddressDetail( memberPartnerShoppingEntity.getMpsAddressDetail() );
        memberPartnerShopping.mpsHp( memberPartnerShoppingEntity.getMpsHp() );
        memberPartnerShopping.mpsZipCode( memberPartnerShoppingEntity.getMpsZipCode() );

        return memberPartnerShopping.build();
    }

    @Override
    public MemberPartnerShoppingEntity toMemberPartnerShoppingEntity(MemberPartnerShopping memberPartnerShopping) {
        if ( memberPartnerShopping == null ) {
            return null;
        }

        MemberPartnerShoppingEntity.MemberPartnerShoppingEntityBuilder memberPartnerShoppingEntity = MemberPartnerShoppingEntity.builder();

        memberPartnerShoppingEntity.mpsIdx( memberPartnerShopping.getMpsIdx() );
        memberPartnerShoppingEntity.memberPartner( toMemberPartnerEntity( memberPartnerShopping.getMemberPartner() ) );
        memberPartnerShoppingEntity.mpsCompany( memberPartnerShopping.getMpsCompany() );
        memberPartnerShoppingEntity.mpsAddress( memberPartnerShopping.getMpsAddress() );
        memberPartnerShoppingEntity.mpsAddressDetail( memberPartnerShopping.getMpsAddressDetail() );
        memberPartnerShoppingEntity.mpsHp( memberPartnerShopping.getMpsHp() );
        memberPartnerShoppingEntity.mpsZipCode( memberPartnerShopping.getMpsZipCode() );

        return memberPartnerShoppingEntity.build();
    }

    @Override
    public MemberPartnerAdvertisement toMemberPartnerAdvertisement(MemberPartnerAdvertisementEntity memberPartnerAdvertisementEntity) {
        if ( memberPartnerAdvertisementEntity == null ) {
            return null;
        }

        MemberPartnerAdvertisement.MemberPartnerAdvertisementBuilder<?, ?> memberPartnerAdvertisement = MemberPartnerAdvertisement.builder();

        memberPartnerAdvertisement.createdAt( memberPartnerAdvertisementEntity.getCreatedAt() );
        memberPartnerAdvertisement.updatedAt( memberPartnerAdvertisementEntity.getUpdatedAt() );
        memberPartnerAdvertisement.mpaIdx( memberPartnerAdvertisementEntity.getMpaIdx() );
        memberPartnerAdvertisement.memberPartner( toMemberPartner( memberPartnerAdvertisementEntity.getMemberPartner() ) );
        memberPartnerAdvertisement.mpaCompany( memberPartnerAdvertisementEntity.getMpaCompany() );
        memberPartnerAdvertisement.mpaAddress( memberPartnerAdvertisementEntity.getMpaAddress() );
        memberPartnerAdvertisement.mpaAddressDetail( memberPartnerAdvertisementEntity.getMpaAddressDetail() );
        memberPartnerAdvertisement.mpaHp( memberPartnerAdvertisementEntity.getMpaHp() );
        memberPartnerAdvertisement.mpaZipCode( memberPartnerAdvertisementEntity.getMpaZipCode() );

        return memberPartnerAdvertisement.build();
    }

    @Override
    public MemberPartnerAdvertisementEntity toMemberPartnerAdvertisementEntity(MemberPartnerAdvertisement memberPartnerAdvertisement) {
        if ( memberPartnerAdvertisement == null ) {
            return null;
        }

        MemberPartnerAdvertisementEntity.MemberPartnerAdvertisementEntityBuilder memberPartnerAdvertisementEntity = MemberPartnerAdvertisementEntity.builder();

        memberPartnerAdvertisementEntity.mpaIdx( memberPartnerAdvertisement.getMpaIdx() );
        memberPartnerAdvertisementEntity.memberPartner( toMemberPartnerEntity( memberPartnerAdvertisement.getMemberPartner() ) );
        memberPartnerAdvertisementEntity.mpaCompany( memberPartnerAdvertisement.getMpaCompany() );
        memberPartnerAdvertisementEntity.mpaAddress( memberPartnerAdvertisement.getMpaAddress() );
        memberPartnerAdvertisementEntity.mpaAddressDetail( memberPartnerAdvertisement.getMpaAddressDetail() );
        memberPartnerAdvertisementEntity.mpaHp( memberPartnerAdvertisement.getMpaHp() );
        memberPartnerAdvertisementEntity.mpaZipCode( memberPartnerAdvertisement.getMpaZipCode() );

        return memberPartnerAdvertisementEntity.build();
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
}
