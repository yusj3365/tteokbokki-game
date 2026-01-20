package com.cmb.rainbowtv.domain.advertise.usecase;

import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseDisplayOrderDetailReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseHashtagUpdateReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseListReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseManagementAdminUpdateReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseManagementListReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseSeqUpdateReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.ContentLiveAdSetListReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseDefineResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseDeleteListExcelResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseDeleteListResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseDetailResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseDetailResp.Detail;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseDisplayOrderDetailResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseExcelResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseListResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseManagementListResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseManagementResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertisePendingListExcelResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertisePendingListResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.ContentLiveAdSetComponentListResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.ContentLiveAdSetListExcelResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.ContentLiveAdSetListResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.ContentLiveAdSetResp;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.UploadAdvertiseExcelResp;
import com.cmb.rainbowtv.domain.advertise.infra.AdvertiseAdminInfra;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContent;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentAge;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentHashtag;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentAreaDefine;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentChannel;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentDenyReason;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentDetail;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentFee;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentPeriod;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentSex;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseContentTime;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseManagement;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseMetadata;
import com.cmb.rainbowtv.domain.advertise.model.AdvertiseKeyword;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.req.AdvertiseMetadataSaveReq;
import com.cmb.rainbowtv.domain.advertise.api.dto.cms.resp.AdvertiseMetadataResp;
import com.cmb.rainbowtv.domain.advertise.model.enums.AdvertiseContentDetailTypeEnum;
import com.cmb.rainbowtv.domain.advertise.util.AdvertiseConverterUtils;
import com.cmb.rainbowtv.domain.attachments.api.dto.AttachmentsAdminDetailResp;
import com.cmb.rainbowtv.domain.attachments.infra.AttachmentsInfra;
import com.cmb.rainbowtv.domain.attachments.infra.CustomAttachmentClient;
import com.cmb.rainbowtv.domain.attachments.model.Attachments;
import com.cmb.rainbowtv.domain.attachments.model.enums.ContainerType;
import com.cmb.rainbowtv.domain.media.api.dto.common.HashtagResp;
import com.cmb.rainbowtv.domain.media.model.enums.PostStatusEnum;
import com.cmb.rainbowtv.domain.member.infra.MemberAdminInfra;
import com.cmb.rainbowtv.domain.member.model.MemberAdmin;
import com.cmb.rainbowtv.domain.order.infra.PayInfra;
import com.cmb.rainbowtv.domain.order.model.PayInis;
import com.cmb.rainbowtv.domain.product.infra.ProductAdminInfra;
import com.cmb.rainbowtv.domain.product.model.Item;
import com.cmb.rainbowtv.domain.product.model.ItemAdvertise;
import com.cmb.rainbowtv.global.annotation.UseCase;
import com.cmb.rainbowtv.domain.hashtag.infra.HashTagAdminInfra;
import com.cmb.rainbowtv.domain.hashtag.model.Hashtag;
import com.cmb.rainbowtv.global.define.area.model.AreaDefine;
import com.cmb.rainbowtv.global.dto.request.SearchRequest;
import com.cmb.rainbowtv.global.dto.response.result.ListResult;
import com.cmb.rainbowtv.global.dto.response.result.SingleResult;
import com.cmb.rainbowtv.global.exception.CustomException;
import com.cmb.rainbowtv.global.exception.ErrorCode;
import com.cmb.rainbowtv.global.util.HamaUtil;
import com.cmb.rainbowtv.global.util.PaginationQuery;
import com.cmb.rainbowtv.global.util.ResponseUtil;
import com.cmb.rainbowtv.global.util.StringConverterUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.api.ExcelCreator;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

@UseCase
@RequiredArgsConstructor
@Transactional
@Slf4j
public class AdvertiseAdminUseCaseImpl {

    private int[][] board;
    private final int SIZE = 10; // 10x10 격자
    private int score = 0;

    // 1. 보드 초기화 (1~9까지 랜덤 숫자 채우기)
    public void initBoard() {
        board = new int[SIZE][SIZE];
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = rand.nextInt(9) + 1;
            }
        }
    }

    // 2. 연속된 3개 이상의 숫자 체크 및 제거 로직
    public int checkMatches() {
        boolean[][] toRemove = new boolean[SIZE][SIZE];
        int matchesFound = 0;

        // 가로 체크
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - 2; j++) {
                if (board[i][j] != 0 && board[i][j] == board[i][j+1] && board[i][j] == board[i][j+2]) {
                    toRemove[i][j] = toRemove[i][j+1] = toRemove[i][j+2] = true;
                }
            }
        }

        // 세로 체크
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE - 2; i++) {
                if (board[i][j] != 0 && board[i][j] == board[i+1][j] && board[i][j] == board[i+2][j]) {
                    toRemove[i][j] = toRemove[i+1][j] = toRemove[i+2][j] = true;
                }
            }
        }

        // 제거 및 점수 계산
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (toRemove[i][j]) {
                    board[i][j] = 0; // 0은 비어있음을 의미
                    matchesFound++;
                }
            }
        }

        score += matchesFound * 10; // 터진 사과 하나당 10점
        return matchesFound;
    }

    // 보드 상태 보기 (디버깅용)
    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("현재 점수: " + score);
    }
}

