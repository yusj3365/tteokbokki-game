package com.tteokbokki.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    /**
     * 에러코드 규약
     * HTTP Status Code는 에러에 가장 유사한 코드를 부여한다.(Swagger에서 구분하여 Response Example로 출력된다.)
     * 사용자정의 에러코드는 음수를 사용한다.
     * 사용자정의 에러코드는 중복되지 않게 배정한다.
     * 사용자정의 에러코드는 각 카테고리 별로 100단위씩 끊어서 배정한다. 단, Common 카테고리는 -100 단위를 고정으로 가져간다.
     */


    /**
     * 401 : 미승인 403 : 권한의 문제가 있을때 406 : 객체가 조회되지 않을 때 409 : 현재 데이터와 값이 충돌날 때(ex. 아이디 중복) 412 : 파라미터
     * 값이 뭔가 누락됐거나 잘못 왔을 때 422 : 파라미터 문법 오류 424 : 뭔가 단계가 꼬였을때, 1번안하고 2번하고 그런경우
     */

    //Common
    SERVER_UNTRACKED_ERROR(-100, "미등록 서버 에러입니다. 서버 팀에 연락주세요.", 500),
    OBJECT_NOT_FOUND(-101, "조회된 객체가 없습니다.", 404),
    INVALID_PARAMETER(-102, "잘못된 파라미터입니다.", 422),
    PARAMETER_VALIDATION_ERROR(-103, "파라미터 검증 에러입니다.", 422),
    PARAMETER_GRAMMAR_ERROR(-104, "파라미터 문법 에러입니다.", 422),
    INVALID_ORDER_PARAMETER(-105, "잘못된 정렬 조건 파라미터입니다.", 422),
    INVALID_TYPE_PARAMETER(-106, "잘못된 타입 파라미터입니다.", 422),
    OBJECT_DELETE_ERROR(-107, "객체 삭제 에러입니다.", 422),
    NOT_FOUND_PATH(-108, "존재하지 않는 API 경로입니다.", 404),
    ERROR_FIREBASE_KEY_NOT_FOUND(-109, "파이어베이스 서비스 키에 대한 json 을 찾지 못 했습니다.", 422),
    ERROR_GOOGLE_CREDENTIAL(-110, "구글 크레덴셜 생성 에러가 발생하였습니다.", 422),
    ERROR_MTONET(-111, "안심번호 서비스 에러가 발생했습니다.", 422),
    EXCEL_EXPORT_FAIL(-112, "엑셀 추출 중 에러가 발생했습니다.", 422),
    CONTENT_TYPE_NOT_VALID(-113, "지원하지 않는 ContentType 입니다.", 400),
    INVALID_INPUT(-114, "유효하지 않는 형식의 입력값입니다.", 400),
    JSON_PROCESSING_ERROR(-115, "JSON 처리 중 문제가 발생했습니다.", 500),
    OBJECT_DELETE_ALREADY(-116, "삭제된 객체입니다.", 404),
    SOCIAL_PASSWORD(-117, "소셜회원 발급불가", 500),
    ALREADY_EXIST_OBJECT(-118, "이미 존재하는 객체입니다", 500),
    SUPER_ADMIN_OBJECT(-119, "최고관리자는 수정 불가", 500),
    EXCEED_DRLEFT_LIMIT(-120, "파일 다운로드 잔여횟수가 0입니다.", 401),
    DB_ERROR(-121, "DB 에러", 401),
    EXCEL_UPLOAD_FAIL(-122, "엑셀 업로드 중 에러가 발생했습니다.", 422),
    PROHIBIT_WORD(-123, "금칙어가 포함되어있습니다.", 422),
    EXCEL_DATA_EXCEED(-124, "엑셀 데이터가 10만 건을 초과합니다. 검색 조건을 추가하거나 구간을 나눠서 다운로드해주세요.", 400),
    INVALID_STATE(-125, "처리 불가능한 상태입니다.", 401),
    INVALID_ITEM_TYPE(-126, "유효하지 않은 상품 타입입니다.", 400),
    EMPTY_BIRTH(-127, "생년월일이 없습니다.", 400),

    //Auth
    UNAUTHORIZED(-200, "인증 자격이 없습니다.", 401),
    FORBIDDEN(-201, "권한이 없습니다.", 403),
    JWT_ERROR_TOKEN(-202, "잘못된 토큰입니다.", 401),
    JWT_EXPIRE_TOKEN(-203, "만료된 토큰입니다.", 401),
    AUTHORIZED_ERROR(-204, "인증 과정 중 에러가 발생했습니다.", 500),
    JWT_EXPIRE_REFRESH_TOKEN(-205, "관리하고 있지 않은 리프레시 토큰입니다", 401),
    JWT_UNMATCHED_CLAIMS(-206, "토큰 인증 정보가 일치하지 않습니다", 401),
    AUTHENTICATION_SETTING_FAIL(-207, "인증정보 처리에 실패했습니다.", 500),
    INVALID_REFRESH_TOKEN(-208, "리프레시 토큰이 잘못되었거나 30일 이상 경과한 토큰입니다.", 400),
    INVALID_CSRF_TOKEN(-209, "CSRF 토큰이 잘못되었거나 30일 이상 경과한 토큰입니다.", 400),

    USER_DELETE(-240, "탈퇴회원", 401),
    USER_REST(-250, "휴면회원", 401),
    USER_STOP(-260, "정지회원", 401),
    NOT_IMPLEMENTED(-270, "기능 구현 중입니다.", 406),


    //Util
    FILE_CREATE_ERROR(-300, "파일 생성 에러입니다..", 500),
    MAIL_SEND_ERROR(-301, "이메일 발송 에러입니다.", 500),
    MAIL_SEND_CREATE_HTML_ERROR(-302, "이메일 발송 HTML 생성 중 문제가 발생했습니다.", 500),
    SMS_SEND_ERROR(-303, "SMS 문자 발송 에러입니다.", 500),
    FCM_SEND_ERROR(-304, "FCM 푸쉬 알림 발송 에러입니다.", 500),
    MAIL_SEND_FILE_ERROR(-305, "이메일 발송 중 파일 관련 에러입니다.", 500),
    FILE_CREATE_PARAMETER_ERROR(-306, "파일 생성에 필요한 서버 내부 파라미터 값 에러입니다.", 500),
    SMS_RESULT_PARSING_ERROR(-307, "SMS 문자 결과 파싱 서버 에러입니다.", 500),
    SMS_SEND_FAIL(-308, "SMS 문자 발송에 실패했습니다.", 500),
    CODE_GENERATOR_ERROR(-309, "코드 데이터 생성 에러입니다.", 500),
    REST_SEND_ERROR(-310, "다른 rest api로 요청 발송 중 에러가 발생했습니다.", 500),
    EXCEL_UPLOAD_ERROR(-311, "유효한 엑셀 파일이 아닙니다.", 400),
    INTERNATIONAL_AGE_ERROR(-312, "올바른 형식의 주민등록번호를 입력하세요 (예: YYYYMMDD-SXXXXXX)", 400),
    EXCEL_CREATE_FAIL(-313, "엑셀 파일 생성에 실패하였습니다.", 500),
    MIME_NOT_CORRECT(-314, "업로드 MimeType이 일치하지 않습니다.", 400),
    INVALID_CONTENT_TYPE(-315, "유효한 ContentType를 입력하세요", 400),
    FILE_URL_CREATE_ERROR(-316, "파일 URL 생성 에러입니다.", 500),
    S3_FILE_UPLOAD_ERROR(-1200, "S3 업로드가 실패되었습니다", 500),
    S3_FILE_DELETE_ERROR(-1200, "S3 삭제가 실패되었습니다", 500),


    AWS_MEDIA_PACKAGE_ERROR(-317, "AWS MediaPackage Error", 500),
    AWS_MEDIA_LIVE_ERROR(-318, "AWS MediaLive Error", 500),
    AWS_MEDIA_TAILOR_ERROR(-319, "AWS MediaTailor Error", 500),


    //홈초이스
    HOMECHOICE_RESULT_ERROR(-320, "홈초이스 실패", 500),
    HOMECHOICE_UPDATE_ERROR(-321, "홈초이스 비밀번호 수정 실패", 500),
    HOMECHOICE_DELETE_ERROR(-322, "홈초이스 탈퇴 실패", 500),
    HOMECHOICE_CHK_ID(-322, "홈초이스 아이디 중복", 500),

    //Event(Alarm)
    ALARM_EVENT_ERROR(-400, "알람 발송 중 에러가 발생했습니다.", 500),
    ALARM_EMAIL_TARGET_HISTORY_ERROR(-401, "이메일을 대상으로한 알람 요청은 히스토리에 저장할 수 없습니다.", 400),
    ALARM_CREATE_TARGET_ERROR(-402, "알람 타겟 생성 에러입니다. 알람 메일 타겟을 확인해주세요.", 500),
    ALARM_READING_JSON_FILE_ERROR(-403, "알람 JSON 파일을 읽는데 실패하였습니다.", 500),
    ALARM_DTO_SERIALIZER_ERROR(-404, "알람 데이터 객체 변환 문제. 알람 타입에 맞지 않는 데이터가 알람 JSON 파일에 있는지 확인해주세요.",
        500),
    ALARM_JSON_PARAMETER_ERROR(-405, "알람 JSON 파라미터 변환 에러입니다.", 500),
    PHONE_AUTHENTICATION_FAILED(-406, "휴대폰 인증에 실패하였습니다.", 409),
    PHONE_AUTHENTICATION_EXPIRED(-407, "인증번호가 만료되었습니다.", 409),

    //Auth
    NICE_CLIENT_ERROR(-500, "나이스 인증 토큰 요청이 실패하였습니다.", 500),
    NICE_AUTHENTICATION_FAILED(-501, "나이스 인증완료 후 검증이 실패하였습니다", 500),
    INVALID_ID_TOKEN(-502, "잘못된 인증 토큰입니다.", 401),

    //Member
    MEMBER_ALREADY_ID(-600, "아이디 중복입니다.", 409),
    MEMBER_ALREADY_HP(-616, "이미 가입된 휴대폰 번호입니다.", 409),
    MEMBER_SAME_HP(-617, "현재 휴대폰번호와 동일합니다.", 400),
    MEMBER_NOT_FOUND(-601, "회원이 없습니다.", 406),
    MEMBER_PASSWORD_WRONG(-602, "잘못된 비밀번호 입니다.", 406),
    MEMBER_CERTIFICATION_CODE_NOT_MATCH(-603, "인증 코드가 일치하지 않습니다.", 406),
    MEMBER_NOT_MATCH(-604, "회원이 일치하지 않습니다.", 406),
    MEMBER_WORKER_ALREADY_EMPLOYEE_NUMBER(-605, "중복된 사원번호 입니다.", 406),
    MEMBER_CHK_PASSWORD(-606, "비밀번호를 확인해주세요.", 406),
    ALREADY_REGISTERED_DEVICE_TOKEN(-607, "이미 등록된 디바이스 토큰입니다.", 409),
    DUPLICATED_NICKNAME(-608, "이미 사용중인 닉네임입니다.", 409),
    DUPLICATED_PHONE_NUMBER(-609, "핸드폰 번호가 중복되었습니다.", 409),
    DUPLICATED_EMAIL(-610, "이미 사용중인 이메일입니다.", 409),
    PASSWORD_NOT_VALID(-611, "비밀번호가 일치하지 않습니다.", 406),
    MEMBER_CERTIFICATION_FAIL(-612, "인증 확인 실패.", 406),
    NOT_VALID_SOCIAL_TYPE(-613, "소셜 타입이 일치하지 않습니다. 다른 로그인 방식을 사용해주세요.", 406),
    MEMBER_ALREADY_SOCIAL_COMPLETE(-614, "이미 소셜 정보 입력 완료된 회원입니다.", 409),
    MEMBER_DELETE(-615, "탈퇴회원", 409),
    ADMIN_LOGIN_DENY(-616, "관리자회원 로그인 불가", 409),
    NEED_AUTH(-617, "최초 로그인시 본인인증이 필요합니다", 409),
    MEMBER_DORMANCY(-618, "휴면회원", 409),
    MEMBER_STOP(-619, "정지회원", 409),
    MEMBER_CERT_EXPIRED(-11, "본인 인증이 1년 지난 회원입니다\n본인 인증 후 이용해 주세요.", 409),
    TV_AUTH_ERROR_SETTOP(-620, "tv 본인인증 에러 - settop", 409),
    TV_AUTH_ERROR(-621, "tv 본인인증 에러", 409),
    NON_SOCIAL(-622, "지원되지 않는 회원 유형", 409),
    BIRTH_CHECK(-623, "주민등록번호를 다시 확인해주세요", 409),
    AGE_CHECK(-624, "만 14세 이상이 아닙니다", 409),
    NON_RECOMMEND(-625, "없는 추천코드", 409),
    REGISTER_RECOMMEND(-626, "등록인 코드로 추천인을 등록할수없음", 409),
    ALREADY_RECOMMEND(-627, "이미 등록된 추천인 존재", 409),
    SOCIAL_DENY(-628, "소셜회원은 단체회원 안됨", 409),
    DELIVERY_LIMIT(-629, "추가 배송지는 최대 3개까지 가능", 406),
    DELIVERY_MEMBER_MISMATCH(-630, "배송지 등록자와 일치하지 않음", 406),
    NOT_LEADER(-631, "리더 회원이 아님", 406),
    MISSING_MEMBER_NO(-632, "회원 번호는 필수입니다.", 406),
    ALREADY_REGISTER(-633, "이미 등록한 등록인입니다.", 409),
    RECOMMENDER_REGISTER_SAME(-634, "등록인과 추천인이 동일할수 없습니다.", 409),
    MEMBER_PRESENT_PASSWORD_NOT_MATCH(-635, "현재 비밀번호가 일치하지 않습니다..", 406),
    ALREADY_SMART_TV_STATUS_SAME(-636, "이미 수정된 값입니다", 406),
    MEMBER_PARTNER_STATUS_REASON(-637, "사유가 존재하지 않습니다.", 406),
    DELIVERY_ALREADY(-638, "기본 배송지 존재합니다", 406),
    MEMBER_PARTNER_DUPLICATE(-610, "이미 추가된 파트너유형입니다.", 409),
    APPLE_SOCIAL_REFRESH_TOKEN_IS_NULL(-639, "애플 소셜회원 리프레쉬 토큰이 존재하지 않습니다.", 404),
    APPLE_SERVER_ERROR(-640, "애플 API 호출 에러", 401),
    MEMBER_BIRTH_OR_SEX_EMPTY(-641, "회원정보에 생년월일 또는 성별을 입력해주세요.", 404),
    APPLE_TOKEN_ISSUANCE_FAILED(-642, "Apple 토큰 발급에 실패했습니다.", 401),
    APPLE_INVALID_AUTHORIZATION_CODE(-643, "유효하지 않은 Apple Authorization Code입니다.", 401),
    APPLE_ID_TOKEN_PARSING_FAILED(-644, "Apple ID Token 파싱에 실패했습니다.", 401),
    APPLE_PRIVATE_KEY_LOAD_FAILED(-645, "Apple Private Key 로드에 실패했습니다.", 500),
    APPLE_INVALID_USER_INFO(-646, "Apple 사용자 정보가 유효하지 않습니다.", 401),
    MEMBER_NOT_FOUND_BY_HP(-647, "해당 휴대폰번호로 가입된 회원이 없습니다.", 404),
    MEMBER_PHONE_NOT_MATCH(-648, "회원정보의 휴대폰번호가 일치하지 않습니다.", 400),
    MEMBER_CANNOT_RESET_PASSWORD(-649, "소셜 로그인 회원은 비밀번호를 재설정할 수 없습니다.", 400),
    MEMBER_ONLY(-650, "관리자는 유저 API를 호출할 수 없습니다.", 403),
    MEMBER_SO_INFO_MISSING(-651, "회원의 SO 정보가 존재하지 않습니다.", 404),
    MEMBER_TOKEN_EXPIRED(-652, "유효하지 않은 토큰입니다.", 400),
    ALREADY_QR_CONFIRM(-653, "이미 인증 완료 QR", 400),
    QR_EXPIRED(-654, "QR 인증 시간 초과", 400),
    QR_NOT_FOUND(-20, "QR 데이터 미존재", 404),
    QR_NOT_CONFIRMED(-23, "인증 미완료 QR", 400),
    QR_LOGIN_EXPIRED(-21, "인증시간 초과", 400),
    AUTO_LOGIN_REQUIRED(-655, "자동 로그인이 필요합니다.", 401),
    DEVICE_TOKEN_TOO_LONG(-656, "디바이스 토큰 길이가 허용 범위를 초과했습니다.", 400),
    ADULT_PASSWORD_NOT_FOUND(-657, "성인 인증 비밀번호가 설정되지 않았습니다.", 404),
    ADULT_PASSWORD_NOT_MATCH(-658, "성인 인증 비밀번호가 일치하지 않습니다.", 400),
    MEMBER_PARTNER_NOT_FOUND(-652, "파트너 권한이 없습니다", 401),
    MEMBER_STOPPED(-653, "관리자한테 정지 당한 회원", 409),
    ADDRESS_GU_DATA_REQUIRED(-653, "구 데이터는 필수값입니다.", 409),
    // NICE 본인인증
    NICE_DECRYPTION_FAILED(-650, "NICE 본인인증 복호화에 실패했습니다.", 500),
    NICE_AGE_UNDER_14(-651, "만 14세 미만은 가입할 수 없습니다.", 403),
    NICE_AGE_UNDER_19(-652, "만 19세 미만은 이용할 수 없습니다.", 403),
    NICE_NAME_MISMATCH(-653, "본인 명의의 휴대폰이 아닙니다.", 403),
    NICE_PHONE_DUPLICATE(-654, "이미 가입된 휴대폰 번호입니다.", 409),
    NICE_AUTH_CODE_EXPIRED(-655, "인증 코드가 만료되었습니다.", 401),
    NICE_AUTH_CODE_INVALID(-656, "잘못된 인증 코드입니다.", 401),
    NICE_AUTH_DATA_NOT_FOUND(-657, "인증 정보를 찾을 수 없습니다.", 404),
    NICE_MEMBER_NO_REQUIRED(-658, "회원번호가 필요한 인증 유형입니다.", 400),
    MEMBER_ALREADY_COMPLETED(-659, "이미 가입이 완료된 회원입니다.", 409),
    MEMBER_INVALID_CUSTOMER_NUMBER(-660, "이미 사용 중인 고객번호입니다.", 409),
    MEMBER_RNUM_GENERATION_FAILED(-661, "고객번호 생성에 실패했습니다. 잠시 후 다시 시도해주세요.", 500),
    AREA_NOT_FOUND(-661, "해당 지역 정보를 찾을 수 없습니다.", 404),
    DEVICE_SESSION_EXPIRED(-670, "디바이스 세션이 만료되었습니다.", 200),

    // 인앱 영수증
    GOOGLE_BILL_FAIL(-1300, "인앱 구글 영수증 실패", 403),
    GOOGLE_TOKEN_FAIL(-1301, "구글 토큰 발급 실패", 403),
    SUBSCRIBE_STOP(-1302, "구독 중지", 403),
    EXPIRED_ORDER(-1304, "만료된 거래", 409),
    ORDERING(-1305, "구매중", 401),
    GOOGLE_NOT_ORDER(-1306, "구매안됌", 403),
    INAPP_NOT_ALLOW(-1307, "승인 안된 인앱 상품", 403),
    APPLE_TOKEN_FAIL(-1308, "애플 토큰 발급 실패", 403),
    APPLE_BILL_FAIL(-1309, "인앱 애플 영수증 실패", 403),
    APPLE_BUNDLE_ID(-1310, "애플 번들아이디 잘못됨", 403),


    //Admin
    ADMIN_NOT_MATCH(-5100, "비밀번호가 일치하지 않습니다.", 406),
    SUPER_ADMIN_IP_ERROR(-5101, "접속 가능한 IP가 아님.", 406),

    //IP
    NON_IP(-5200, "미 등록 IP", 406),
    EXIST_IP(-5201, "등록된 IP", 409),
    CAN_NOT_READ_IP(-5202, "슈퍼관리자만 IP를 조회할 수 있습니다", 409),

    // Attachment
    ATTACHMENT_DELETE_FAILED(-6300, "첨부파일 삭제 실패", 424),
    ATTACHMENT_URL_ERROR(-6301, "이미지 URL 생성 실패", 409),


    // PROMOTION && PRIZE
    PROMOTION_POINT_AMOUNT_VALID(-7000, "포인트가 1보다 작을수 없습니다.", 406),
    PROMOTION_POINT_REQUIRED(-7001, "프로모션 타입이 포인트 일때 포인트 값이 null 이 될수 없습니다.", 406),
    PROMOTION_END_BEFORE_START(-7002, "종료일이 시작일보다 이전입니다.", 406),
    PROMOTION_DURATION_TOO_SHORT(-7003, "기간이 하루 미만입니다.", 406),
    PROMOTION_START_DATE_IN_PAST(-7004, "시작일은 현재보다 과거로 설정이 불가합니다.", 406),
    PROMOTION_OUTSIDE_PRIZE_PERIOD(-7005, "프로모션 종료일이 경품 판매 종료일보다 늦으면 안됩니다.", 406),
    PRIZE_NOT_AVAILABLE_NOW(-7006, "경품 판매기간에 속해있지 않는 경품입니다.", 406),
    PRIZE_NOT_ACTIVE(-7007, "미사용중인 경품입니다.", 406),
    PROMOTION_NOT_EDITABLE(-7008, "대기중인 프로모션만 수정이 가능합니다.", 406),
    PROMOTION_PRIZE_REQUIRED(-7009, "프로모션 타입이 경품 일때 경품 값이 null 이 될수 없습니다.", 406),
    DELETED_PROMOTION(-7010, "삭제된 프로모션입니다.", 406),
    PROMOTION_IS_NOT_PROGRESSING(-7011, "진행중인 프로모션만 종료가 가능합니다.", 406),
    NOT_EDITABLE_CANCEL_PRIZE(-7012, "취소된 경품은 수정이 불가합니다", 406),
    ALREADY_CANCEL_TRADE_PRIZE(-7013, "이미 취소된 경품입니다.", 406),
    PRIZE_PRICE_INCORRECT(-7014, "코인 가격을 재설정해주세요", 406),
    PRIZE_PRICE_NOT_MATCH_WITH_CATEGORY(-7015, "코인 가격과 카테고리가 일치하지 않습니다.", 406),
    PRIZE_PERIOD_INCORRECT(-7016, "게시 기간 설정 값이 잘못되었습니다.", 406),
    PRIZE_PROMOTION_IS_NOT_END(-7017, "종료된 프로모션이 아닙니다.", 406),
    PRIZE_DETAIL_DESCRIPTION_SIZE_EXCEED(-7018, "경품의 상세 설명/이미지는 최대 5개까지 등록할 수 있습니다.", 406),
    PRIZE_INFO_LENGTH_EXCEED(-7019, "상품 안내는 100자 내로 작성해야합니다.", 406),
    PRIZE_DETAIL_DESCRIPTION_SEQUENCE_DUPLICATE(-7020, "경품의 상세 설명의 순서가 중복되어 있습니다.", 406),
    PRIZE_DETAIL_DESCRIPTION_SEQUENCE_INVALID(-7021, "경품의 상세 설명의 순서가 잘못되어 있습니다.", 406),
    PRIZE_DETAIL_DESCRIPTION_CONTENT_LENGTH_EXCEED(-7022, "경품의 상세 설명 텍스트는 500자 내로 작성해야합니다.", 406),
    PRIZE_SOLD_OUT(-7023, "품절된 경품입니다.", 406),
    PRIZE_ADULT_PRODUCT(-7024, "연령 제한 경품입니다.", 406),
    PROMOTION_DID_NOT_STARTED(-7025, "아직 프로모션이 시작되지 않았습니다.", 401),
    PROMOTION_IS_END(-7026, "종료된 프로모션 입니다..", 401),
    PRIZE_CATEGORY_HAS_PRIZES(-7027, "해당 카테고리에 등록된 경품이 존재하여 삭제할 수 없습니다.", 409),
    CANNOT_UPDATE_PRIZE(-7028, "수정 불가능한 상품", 406),

    //QNA
    QNA_ALREADY_WRITE_ANSWER(-8000, "이미 답변이 작성된 문의글", 409),

    //Report
    REPORT_CATEGORY_NOT_FOUND(-8500, "신고 카테고리가 존재하지 않습니다.", 404),
    REPORT_ALREADY_EXISTS(-8501, "이미 신고한 내용입니다.", 409),
    REPORT_TARGET_NOT_FOUND(-8502, "신고 대상이 존재하지 않습니다.", 404),
    REPORT_SELF_NOT_ALLOWED(-8503, "자신의 게시물/댓글/쪽지는 신고할 수 없습니다.", 400),
    REPORT_MEDIA_TYPE_NOT_ALLOWED(-8504, "VOD/우클/쇼츠 제외 콘텐츠는 신고할 수 없습니다.", 400),
    REPORT_SHOP_TYPE_NOT_ALLOWED(-8505, "쇼핑 콘텐츠만 신고할 수 있습니다.", 400),

    // COUPON
    COUPON_START_DATE_AFTER_END(-9000, "쿠폰 시작일이 종료일보다 미래일 수 없습니다.", 409),
    COUPON_START_DATE_BEFORE_PRESENT(-9001, "쿠폰 시작일이 현재일보다 작을 수 없습니다.", 409),
    COUPON_SCHEDULE_DATE_VALIDATE(-9002, "쿠폰 예약발송일이 현재일보다 미래일 수 없습니다.", 409),
    COUPON_REGISTER_ITEM_MIXED(-9003, "쿠폰에 연결된 상품 유형이 혼합되었습니다.", 409),
    COUPON_SALE_PRICE_EXCEED(-9004, "가격할인 초과", 409),
    COUPON_ALREADY_DELETED(-9005, "이미 회수된 쿠폰입니다.", 409),
    COUPON_IS_NOT_PENDING(-9006, "미진행중인 쿠폰만 수정 가능합니다.", 409),
    COUPON_ALREADY_SEND(-9007, "이미 발송된 쿠폰은 예약으로 수정이 불가합니다.", 409),
    COUPON_SCHEDULE_TIME_IS_NOT_FASTER_THAN_COUPON_START(-9008, "쿠폰 예약일은 시작일보다 미래일수는 없습니다.", 409),
    COUPON_SALE_NUMBER_REQUIRED(-9009, "할인방법이 숫자일때 할인율은 필수값입니다.", 409),
    COUPON_ITEM_TYPE_MISMATCH(-9010, "상품유형 혼합.", 409),
    REQUIRED_FIELD_MISSING(-9011, "필수값 없음.", 409),
    COUPON_DISCOUNT_EXCEEDS_ITEM_PRICE(-9012, "가격할인 초과", 409),
    REQUIRED_PARAMETER_MEMBER_FOR_COUPON(-9013, "대상 고객은 필수값입니다.", 409),
    CANNOT_COUPON(-9014, "사용 불가 쿠폰 포함", 409),
    COUPON_LEAK(-9015, "쿠폰 사용 금액 부족", 409),

    //SERIAL
    SERIAL_DUPLICATE_USID_NUMBER(-10000, "이미 등록된 usid 번호입니다.", 409),
    SERIAL_DUPLICATE_SERIAL_NUMBER(-10001, "이미 등록된 시리얼 번호입니다.", 409),
    SERIAL_SAME_STATUS_VALUE(-10002, "동일한 시리얼 상태값으로 상태변경 불가합니다.", 409),
    SERIAL_CONNECT_EXISTS(-10003, "이미 연결된 시리얼이 존재합니다.", 409),
    SERIAL_DELETED(-10004, "삭제된 시리얼 입니다.", 409),
    SERIAL_IS_USING(-10005, "사용중인 셋톱이라 연결이 불가합니다.", 409),
    SERIAL_APPLY_ALREADY_HAS_SERIAL(-10006, "이미 단말을 보유중입니다.", 409),
    SERIAL_APPLY_ALREADY_APPLIED(-10007, "이미 단말 신청한 회원입니다.", 409),
    SERIAL_APPLY_NOT_OWNED(-10008, "본인의 신청건이 아닙니다.", 403),
    SERIAL_APPLY_ALREADY_SHIPPED(-10009, "이미 단말 발송완료 상태입니다.", 409),
    SERIAL_APPLY_ALREADY_CANCELLED(-10010, "이미 취소처리된 신청입니다.", 409),

    //AUTHORITY
    AUTHORITY_FORMAT_NAME_EXISTS(-11000, "이미 등록된 포맷명입니다.", 409),
    AUTHORITY_NOT_EXISTS(-11001, "so 혹은 menu 권한이 존재하지 않습니다.", 409),

    //CONFIG
    CONFIG_CATEGORY_CAN_NOT_DELETE_FIX(-12000, "삭제 불가한 카테고리입니다.", 409),
    CONFIG_NOT_MATCH_PLATFORM(-12001, "카테고리와 약관의 플랫폼이 불일치합니다.", 409),

    //ORDER
    ORDER_CANCEL(-12100, "환불 불가 상태.", 409),
    REFUND_PRICE(-12101, "환불 금액이 결제 금액과 다름.", 409),
    ALREADY_REFUND(-12102, "이미 처리 완료", 409),
    SUBSCRIPTION_STATUS_MISMATCH(-12103, "구독 상태 잘못", 409),
    ALREADY_ADVERTISE(-12104, "등록된 광고 세트 있음", 409),
    NOT_MINE(-12105, "내 주문 아님", 409),
    NOT_PART_REFUND(-12106, "부분환불이 불가능한 주문", 409),
    REFUND_OVER(-12107, "환불 가능한 금액이 초과", 409),
    NOT_ORDER_STATUS(-12208, "유효한 주문상태 아님", 409),
    ORDER_STATUS_NOT_MATCH(-12210, "현재 주문상태가 올바르지 않습니다..", 409),
    ORDER_CART_EXPRESS_NOT_EXISTS(-12211, "해당 주문의 배송기록이 존재하지 않습니다.", 409),
    MISMATCH_PRICE(-12212, "상품가격과 결제 예정금액이 일치하지 않습니다.", 409),
    NOT_DISPLAY(-12213, "아이템 진열 안함", 409),
    NOT_USE(-12214, "아이템 사용 안함", 409),
    ITEM_DELETE(-12215, "아이템 삭제", 409),
    STOCK_OFF(-12216, "아이템 품절", 409),
    NOT_MY_ORDER(-12217, "본인 주문건 아님", 409),
    DEPOSIT_PARAMETER(-12218, "무통장 입금시 환불 관련 필수값 없음", 409),
    ALREADY_PAID(-12219, "이미 결제함", 409),
    DIFFERENT_ITEM(-12220, "다른 상품", 409),
    NOT_DELIVERY(-12221, "잘못된 배송 정보", 409),
    MISMATCH_TYPE(-12222, "관리자는 광고만 결제 가능", 409),
    NOT_FAST(-12223, "FAST 아님", 409),
    INIS_ERROR(-12224, "이니시스 에러", 409),
    ADVERTISE_ALREADY(-12225, "중복된 acd_seq", 409),
    INIS_VBANK_ERROR(-12226, "이니시스 무통장 입금 에러", 409),
    INIS_PAY_FAIL1(-12227, "이니시스 결제 실패1", 409),
    INIS_PAY_FAIL2(-12228, "이니시스 결제 실패2", 409),
    RELAY_SALE(-12229, "직접 판매 유형만 구매 가능", 409),

    // KAKAOPAY
    KAKAOPAY_READY_FAILED(-12229, "카카오페이 결제 준비에 실패했습니다.", 500),
    KAKAOPAY_APPROVE_FAILED(-12230, "카카오페이 결제 승인에 실패했습니다.", 500),
    KAKAOPAY_CANCEL_FAILED(-12231, "카카오페이 결제 취소에 실패했습니다.", 500),
    KAKAOPAY_ORDER_NOT_FOUND(-12232, "카카오페이 주문 정보를 찾을 수 없습니다.", 404),
    KAKAOPAY_PAYMENT_NOT_FOUND(-12233, "카카오페이 결제 정보를 찾을 수 없습니다.", 404),
    KAKAOPAY_PAYMENT_NOT_OWNED(-12234, "본인의 결제 건이 아닙니다.", 403),
    KAKAOPAY_SUBSCRIPTION_REQUEST_FAILED(-12235, "카카오페이 정기결제 요청에 실패했습니다.", 500),
    KAKAOPAY_SUBSCRIPTION_INACTIVE_FAILED(-12236, "카카오페이 정기결제 비활성화에 실패했습니다.", 500),
    KAKAOPAY_SUBSCRIPTION_NOT_FOUND(-12237, "카카오페이 정기결제 정보를 찾을 수 없습니다.", 404),
    KAKAOPAY_SUBSCRIPTION_NOT_OWNED(-12238, "본인의 정기결제 건이 아닙니다.", 403),
    KAKAOPAY_CANCEL_AMOUNT_EXCEEDED(-12239, "취소 가능 금액을 초과했습니다.", 400),
    KAKAOPAY_API_ERROR(-12240, "카카오페이 API 통신 중 오류가 발생했습니다.", 500),
    KAKAOPAY_INVALID_RESPONSE(-12241, "카카오페이 API 응답이 올바르지 않습니다.", 500),
    KAKAOPAY_ALREADY_CANCELLED(-12242, "이미 취소된 결제입니다.", 409),
    KAKAOPAY_SUBSCRIPTION_ALREADY_INACTIVE(-12243, "이미 비활성화된 정기결제입니다.", 409),

    //CALCULATE
    CALCULATE_REFUND(-12200, "환불 완료.", 409),
    CALCULATE_FEE(-12201, "지원하지 않는 수수료 방식", 409),
    CALCULATE_NOT_STATUS(-12202, "정산 진행중이 아님.", 409),


    //SUBSCRIPTION
    SUBSCRIPTION_DELETE_ONGOING(-12300, "해지 예정중", 409),
    SUBSCRIPTION_DELETE_DONE(-12301, "해지 완료", 409),
    SUBSCRIPTION_EXIST_ACTIVE_CHANNEL(-12302, "구독중인 채널 존재", 409),
    SUBSCRIPTION_NOTICE_REQUIRED_PRICE(-12303, "변경될 가격은 필수값입니다.(snPrice)", 409),
    SUBSCRIPTION_NOTICE_REQUIRED_CONTEXT(-12304, "구성변경내용은 필수값입니다.(snContext)", 409),
    SUBSCRIPTION_NOTICE_EXISTS_CONFIG_IN_PERIOD(-12305, "기간내 정책 존재", 409),
    SUBSCRIPTION_NOT_MATCH_WITH_ITEM(-12306, "아이템 유형 불일치 ", 409),
    SUBSCRIPTION_NOTICE_ALREADY_END_STATUS(-12307, "이미 종료된 정책입니다. ", 409),
    SUBSCRIPTION_NOTICE_ALREADY_STARTED(-12308, "시행된 정책 입니다.", 409),
    SUBSCRIPTION_EXIST(-12309, "이미 구독중인 아이템", 409),
    ITEM_NOT_CONNECTION(-12310, "상품에 연결안된 채널", 409),
    NOT_SUBSCRIPTION(-12311, "해당회원구독아님", 409),
    SUBSCRIPTION_NOTICE_ALREADY_CONFIRMED(-12312, "이미 확인 완료한 공지입니다.", 409),
    SUBSCRIPTION_NOTICE_NOT_TARGET(-12313, "확인 대상이 아닙니다.", 409),
    SUBSCRIPTION_EXIST_ACTIVE_ITEM(-12314, "구독중인 사용자가 존재하여 삭제할 수 없습니다.", 409),
    EXISTS_UUID(-12315, "uuid값이 이미 있음", 403),

    //POINT
    ADMIN_MINUS_NEED_MINUS_QUANTITY(-13000, "관리자 차감일경우 차감에 대한 값은 음수만 가능합니다.", 409),
    ADMIN_PLUS_NEED_PLUS_QUANTITY(-13001, "관리자 지급일경우 지급에 대한 값은 양수만 가능합니다.", 409),
    NOT_ENOUGH_BALANCE(-13002, "현재 차감할 양보다 보유량이 작습니다.", 409),
    EXISTS_POINT_RATE_DUPLICATED(-13003, "현재 동일 기간 등록된 포인트 비율이 존재합니다.", 409),
    POINT_RATE_PAST_PERIOD(-13004, "현재보다 이전의 기간으로 설정불가합니다.", 409),
    POINT_RATE_INVALID_RANGE(-13005, "시작일이 종료일과 동일하거나 클수없습니다.", 409),
    POINT_RATE_VALIDATE_FAIL(-13006, "포인트 비율을 다시 설정해주세요", 409),
    POINT_RATE_NOT_WAITING(-13007, "대기중인 포인트 비율이 아닙니다.", 409),
    POINT_MISSION_NOT_REGISTER_CATEGORY(-13008, "등록 불가 미션입니다.", 409),
    POINT_MISSION_1ST_REQUIRED(-13009, "해당 정책미션은 지급 1조건에 대해서 필수값입니다.", 409),
    POINT_MISSION_DUPLICATED_OPTION(-13010, "중복된 옵션입니다.", 409),
    POINT_MISSION_DUPLICATED_PERIOD(-13011, "정책일이 중복되었습니다.", 409),
    POINT_MISSION_NOT_ALLOW_DUPLICATED(-13012, "중복 추가 불가능한 정책입니다", 409),
    POINT_DAILY_MAX_TRANSFER_ERROR(-13013, "일 최대 한도를 초과했습니다", 409),
    POINT_DAILY_MIX_TRANSFER_ERROR(-13014, "일 최소 한도보다 적은 값입니다.", 409),
    POINT_RATE_VALIDATE_ERROR(-13015, "비율 적용된 코인 가격을 확인해주세요.", 409),
    POINT_DEFINE_NOT_FOUND(-13016, "포인트 정책을 찾을 수 없습니다.", 404),
    ROULETTE_SPIN_FAILED(-13017, "룰렛 돌리기에 실패했습니다.", 500),
    ROULETTE_ALREADY_SPIN_TODAY(-13018, "이미 오늘 포인트 다받음", 409),
    ROULETTE_DAILY_MISSION_NOT_COMPLETED(-13019, "데일리미션 아직 다 안함", 409),
    MISSION_ADMIN_NOT_ALLOWED(-13020, "관리자는 미션 포인트 접근 불가", 403),

    //DOWNLOAD
    DOWNLOAD_REQUEST_DELETE_NOT_MATCH_ACTOR(-14000, "엑셀 다운로드 요청에 대한 삭제시 최고관리자 혹은 본인만 삭제가 가능합니다.",
        409),
    APPROVED_DOWNLOAD_REQUEST(-14001, "엑셀 다운로드 요청에 대한 삭제시 대기 상태의 객체만 삭제가 가능합니다.", 409),

    //SNS CHANNEL
    SNS_CHANNEL_NAME_DUPLICATED(-15001, "SNS 채널 명이 이미 존재합니다.", 409),
    SNS_CHANNEL_NAME_INVALID_LENGTH(-15002, "SNS 채널명 입력값은 최대 30자까지 허용됩니다.", 409),
    SNS_CHANNEL_LINK_DUPLICATED(-15003, "중복된 채널 링크입니다.", 409),


    // PARTNER BOARD
    PARTNER_BOARD_TYPE_NOT_MATCH(-16000, "해당 객체의 타입이 불일치 합니다.", 409),
    NOT_NEIGHBOR_PARTNER(-16001, "이웃파트너가 아닙니다.", 403),
    PARTNER_BOARD_NOT_OWNER(-16002, "작성자만 수정/삭제할 수 있습니다.", 403),
    PARTNER_BOARD_PARENT_NOT_FOUND(-16003, "원글을 찾을 수 없습니다.", 404),


    //Media
    MISMATCH_LPTYPE(-17000, "관리자가 미디어 등록시 플랫폼 cms가 아닐 경우.", 409),
    ADMIN_NOT_AUTH(-17001, "관리자 권한 없음.", 409),
    MISMATCH_CATEGORY(-17002, "카테고리 불일치", 409),
    MISMATCH_GENRE(-17003, "장르 카테고리 불일치", 409),
    ALREADY_CREATE(-17004, "이미 등록된 콘텐츠", 409),
    DELETED_MEDIA(-17005, "삭제된 콘텐츠", 409),
    NOT_ALL_DISPLAY_AREA(-17006, "노출지역이 전체가 아님", 409),
    MISMATCH_MEDIA_CATEGORY(-17007, "카테고리에 맞지 않는 콘텐츠", 409),
    COUNT_OVER(-17008, "콘텐츠 등록 개수 초과", 409),
    ALREADY_EPISODE(-17009, "같은 시리즈에 이미 해당 회차가 존재합니다.", 409),
    EPISODE_EXISTS(-17010, "구성 콘텐츠가 있는 시리즈는 삭제 불가", 409),
    ALREADY_APPROVAL(-17011, "이미 승인된 영상", 409),
    DUPLICATED_MEDIA_CATEGORY_NAME(-17012, "카테고리명 중복", 409),
    EXISTS_MEDIA_CATEGORY_CONNECTED(-17013, "연결된 카테고리 있음", 409),
    EXISTS_MEDIA_CONNECTED(-17014, "연결된 미디어 있음", 409),
    EXISTS_MEDIA_CATEGORY_GENRE_NAME(-17015, "동일 장르명 존재", 409),
    EXISTS_MEDIA_WITH_MEDIA_GENRE(-17016, "연결 장르 콘텐츠 존재, 삭제 불가", 409),
    NOT_SHOP_PARAMETER(-17017, "쇼핑 파람값이 없음", 409),
    CHK_PRICE(-17018, "가격을 확인해 주세요", 409),
    CHK_SALE_PRICE(-17019, "할인가격을 확인해 주세요", 409),
    DISABLED_UPDATE_CATEGORY(-17020, "유형은 수정이 불가합니다", 409),
    PENDING_MEDIA_INVALID_ALLOWS(-17021,
        "승인 대기 영상 목록에서는 허용 값(meIsAllows) 0(미승인) 또는 2(반려) 중 하나를 반드시 포함해야 합니다", 412),
    CHECK_TIME(-17022, "게시 기간이 중첩되지 않아 등록 불가", 409),
    NOT_ALLOW_MEDIA_CATEGORY(-17023, "허용되지 않는 카테고리입니다.", 406),
    MCO_TYPE_NOT_MATCH(-17023, "해당 객체의 타입이 불일치 합니다.", 409),
    MEDIA_STATUS(-17024, "인코딩이 안된 영상", 409),
    MEDIA_POST_TIME(-17025, "게시기간이 아닙니다.", 409),
    DUPLICATE_EPISODE_IN_REQUEST(-17026, "요청 데이터에 중복된 에피소드 번호가 있습니다.", 409),
    BATCH_MEDIA_NOT_FOUND(-17027, "일부 미디어를 찾을 수 없습니다.", 404),
    NO_EPISODES_IN_SERIES(-17036, "시리즈 콘텐츠에 에피소드가 없습니다.", 409),
    SERIES_CONTENT_CANNOT_BE_PAID(-17040, "시리즈 영상은 유료로 등록/수정할 수 없습니다.", 409),
    CLEARANCE_COULD_BE_SHOP(-17037, "떨이몰 등록은 미디어 에피소드만 가능합니다.", 409),
    ATTRIBUTE_IS_NOT_MATCHED(-17038, "카테고리의 속성과, 타입이 매치 되지 않습니다", 409),
    SHOP_ATTRIBUTE_IS_NULL(-17039, "SHOP 카테고리 일 때, mcAttribute(유형)가 null 일 수 없습니다.", 409),
    NOT_COMMENT(-17040, "댓글 불가", 409),
    NOT_EXISTS_COMMENT(-17041, "글리뷰에 댓글이 없음", 409),
    EXISTS_COMMENT(-17042, "이미 댓글 있음", 409),
    NOT_EXISTS_ORDER(-17043, "직접판매 콘텐츠 구매 이력 없음", 409),
    DIFFERENT_MEMBER(-17044, "작성자 다름", 409),
    //media move
    CHECK_TYPE(-17126, "이동 영상 타입 체크", 409),
    VOD_PARAMETER(-17127, "vod 필수파라미터가 없습니다.", 409),
    CLASS_PARAMETER(-17128, "클래스 필수파라미터가 없습니다.", 409),
    SHOP_PARAMETER(-17129, "쇼핑 필수파라미터가 없습니다.", 409),
    FAST_PARAMETER(-17130, "기타콘텐츠 필수파라미터가 없습니다.", 409),
    NOT_ALLOW_TYPE(-17131, "다른 타입은 이동 불가능", 409),
    MEDIA_PARAMETER(-17132, "영상,쇼핑콘텐츠 필수파라미터가 없습니다.", 409),
    STATUS_NOT_DONE(-17133, "변환이 완료된 영상만 이동가능", 409),
    VOD_NOT_MOVE(-17134, "유료vod는 이동 불가", 409),

    // Media Detail Validation
    MEDIA_ADULT_CONTENT(-17501, "성인 프로그램", 403),
    MEDIA_AREA_EXCLUDED(-17502, "노출 지역 제외 콘텐츠", 403),
    MEDIA_PLATFORM_EXCLUDED(-17503, "플랫폼 노출 제외 콘텐츠", 403),

    //FAQ
    FAQ_EXISTS(-18000, "카레고리와 연결된 faq가 존재합니다.", 409),
    FAQ_BOARD_TYPE_REQUIRED_CONTENT(-18001, "faq 타입이 게시판일때 내용은 필수값입니다.", 409),

    //Channel (LIVE)
    DUPLICATE_EPG(-18000, "중복된 EPG 편성 채널키", 409),
    OBJECT_NOT_FOUND_CHANNEL_GENRE(-18001, "채널 장르 키 미존재", 404),
    OBJECT_NOT_FOUND_LIVE_CHANNEL(-18002, "채널 키 미존재", 404),
    NOT_AVAILABLE_ADMIN(-18003, "관리자 선택 불가", 409),
    OBJECT_NOT_FOUND_LIVE(-18004, "채널 키 미존재", 404),
    NOT_ALLOW_MEDIA(-18005, "편성 불가능한 영상 등록", 409),
    CHANNEL_GENRE_DUPLICATED(-18006, "채널 장르 중복", 409),
    CHANNEL_GENRE_CONNECTED(-18007, "장르 채널에 연결 중", 409),
    FAST_PROGRAM(-18008, "FAST 프로그램 소속", 409),
    ALREADY_ADSET(-18009, "이미 fast channel에 등록된 광고", 409),
    IMPASSIBLE_TIME(-18010, "시작시간이 종료시간보다 큽니다", 409),
    IMPASSIBLE_START_TIME(-18011, "시간 설정은 현재 시간 기준 1시간 이후로 가능합니다", 409),
    ALREADY_TIME(-18012, "이미 설정된 시간대가 존재합니다", 409),
    NOT_DELETE_TIME(-18012, "삭제 불가 시간대", 409),
    OBJECT_NOT_FOUND_CHANNEL_CATEGORY(-18013, "채널 카테고리 키 미존재", 404),
    OBJECT_NOT_FOUND_CHANNEL_PROGRAM(-18014, "채널 프로그램 미존재", 404),
    CAN_NOT_DELETE_EXIST_CONTENT_CATEGORY(-18015, "채널이 존재하는 카테고리는 삭제할 수 없습니다.", 409),
    ALREADY_LINK(-18016, "이미 링크가 생성된 콘텐츠", 409),

    // ADMIN ALARM
    NOT_DISPLAY_OBJECT(-19000, "미노출중인 객체입니다.", 404),
    NOT_EXISTS_POST(-19001, "게시글이 존재 하지 않습니다.", 404),
    ALARM_DELETE_NOT_OWNED(-19002, "삭제 권한이 없는 알림입니다.", 403),

    //APP MENU
    CLASS_AREA_ALREADY_REGISTERED(-20000, "우리동네 클래스 지역에 이미 등록된 지역입니다.", 409),
    MEDIA_CLASS_CONNECTED(-20001, "연결된 콘텐츠가 있어 삭제가 불가능합니다.", 409),
    CAN_NOT_DELETE_DEFAULT(-20002, "해당 메뉴는 기본메뉴로 삭제 불가합니다.", 409),
    GAME_NAME_REQUIRED_WHEN_CLASS_IS_TEXT(-20003, "g_class 가 텍스트일때(1) 메뉴명은(gaName) 필수값입니다.", 409),

    //PRODUCT
    PRODUCT_SUBSCRIBE_PARAMETER_REQUIRED(-21000, "구독 상품 등록시 isType 은 필수값입니다. ", 409),
    PRODUCT_ALACARTE_CHANNEL_PRICE_NOT_MATCH(-21001, "알라카르테 비용 상이", 409),
    CHANNEL_BY_BUNDLE_NOT_FOUND(-21002, "묶음채널과 연결된 채널이 조회되지 않습니다.", 409),

    //CONTENT
    CONTENT_RECOMMEND_MENU_NAME_DUPLICATED(-22000, "중복된 추천 메뉴명입니다.", 409),
    CONTENT_RECOMMEND_EXISTS(-22001, "추천된 영상이 존재합니다.", 409),
    CONTENT_RECOMMEND_ALREADY_REGISTER_WITH_MEDIA(-22002, "이미 등록된 추천 영상입니다.", 409),
    CONTENT_RECOMMEND_MANAGEMENT_PERIOD_IS_NOT_PROCESSING(-22003, "게시중인 콘텐츠가 아닙니다.", 409),

    //FAST_MEDIA
    MISSING_FM_USE(-23000, "엑셀 다운로드 시 fmUse 는 필수값입니다.", 409),

    // ADVERTISE
    CAN_NOT_UPDATE_BANNER_LINK(-24000, "광고 연결 링크는 슈퍼관리자만 수정할 수 있습니다.", 406),
    CAN_NOT_UPDATE_BANNER_LINK_ENABLED(-24001, "광고 연결 활성화 여부는 슈퍼관리자만 수정할 수 있습니다.", 406),
    CAN_NOT_CREATE_BANNER_LINK_ENABLED(-24002, "광고 연결 활성화 슈퍼관리자만 등록할 수 있습니다.", 406),
    ADVERTISE_COUNT_DUPLICATION(-24003, "중복 카운트", 406),

    // EVENT TAP
    CAN_NOT_UPDATE_EVENT_TAP(-25000, "이벤트 텝 수정은 슈퍼관리자만 가능합니다.", 406),

    //TOP10
    NOT_ALLOW_TOP10_PLATFORM(-26000, "허용되지 않는 플랫폼 입니다.", 406),
    NOT_FOUND_TOP10_CATEGORY(-26001, "Top10 카테고리를 찾을 수 없습니다.", 406),
    TOP10_CATEGORY_NAME_LENGTH(-26002, "카테고리명은 20자 이내여야합니다.", 406),
    TOP10_WATCH_TIME_NOT_ENOUGH(-26003, "시청 시간이 30초 이상이어야 합니다.", 400),
    TOP10_DATA_NOT_FOUND(-26004, "해당 지역의 Top10 데이터가 없습니다.", 404),
    TOP10_MEDIA_NOT_IN_TOP10(-26005, "Top10 영상이 아닙니다.", 400),
    TOP10_SERIES_NOT_FOUND(-26006, "에피소드의 부모 시리즈를 찾을 수 없습니다.", 404),
    TOP10_PARENT_SERIES_NOT_IN_TOP10(-26007, "부모 시리즈도 Top10 영상이 아닙니다.", 400),
    // NOTE
    NOTEBOX_ALREADY_EXISTS(-27000, "이미 해당 회원과의 쪽지함이 존재합니다.", 409),

    // lg-feed
    CAN_NOT_CREATE_LG_FEED_CONTENT(-28001, "LG Feed Content 관리는 슈퍼, 일반관리자만 가능합니다.", 406),
    LG_FEED_CONTENT_LIMIT(-28002, "LG Feed Content는 최대 15개까지만 등록 가능합니다.", 409),
    CAN_NOT_REGISTER_LGFEED(-28003, "미디어에 대한 이미지 정보가 존재하지 않습니다", 409),
    COIN_SAME_CATEGORY(29000, "동일한 유형의 코인으로는 변환이 불가합니다.", 409),
    COIN_BALANCE_EMPTY(29001, "코인 잔액이 부족합니다.", 409),
    COIN_EXPIRED_DATE_IS_NULL(29002, "코인교환시 이전 코인의 만료일이 존재하지 않습니다.", 409),
    COIN_DAILY_EXCHANGE_LIMIT_EXCEEDED(29003, "일일 교환 한도를 초과했습니다.", 409),

    // hashtag
    HASHTAG_CREATE_FAILED(30000, "해시태그 생성 중 오류가 발생했습니다.", 409),
    HASHTAG_ATTACH_FAILED(30001, "해시태그 연결 중 오류가 발생했습니다.", 409),
    HASHTAG_NAME_TOO_LONG(30002, "해시태그 이름이 너무 깁니다. 최대 50자까지 입력 가능합니다.", 400),
    DUPLICATE_KEYWORD(30003, "중복된 키워드가 존재합니다.", 409),

    // media
    INVALID_POST_TIME_RANGE(17100, "게시 시작일이 종료일보다 늦을 수 없습니다.", 400),
    MEDIA_CREATE_FAILED(17101, "미디어 생성 중 오류가 발생했습니다.", 500),
    MEDIA_SHOP_CREATE_FAILED(17102, "미디어 쇼핑 정보 생성 중 오류가 발생했습니다.", 500),
    MEDIA_SHOP_DETAIL_CREATE_FAILED(17103, "미디어 쇼핑 상세 정보 생성 중 오류가 발생했습니다.", 500),
    MEDIA_CATEGORY_NOT_FOUND(17104, "미디어 카테고리를 찾을 수 없습니다.", 404),
    CLEARANCE_COULD_BE_RELAY_SALE(17105, "떨이몰은 중계판매로만 등록이 가능합니다.", 409),
    DIFFERENT_CHANNEL(17106, "다른 채널이 있음", 409),
    EPISODE_EXIST(17107, "에피소드 미디어 있음", 409),
    NOT_GENRE(17108, "쇼핑채널은 장르 없음", 409),
    MEDIA_SHOP_NOT_ON_SALE(17105, "판매중인 상품이 아닙니다.", 400),
    MEDIA_SHOP_NOT_RELAY_SALE(17106, "중계판매 상품만 교환 가능합니다.", 400),
    MEDIA_SHOP_ADULT_PRODUCT(17107, "19세 이상만 구매 가능한 상품입니다.", 403),
    IS_NOT_WAITING_STATE(17108, "배송 대기 상태일 경우에만 구매 취소가 가능합니다", 409),
    MEDIA_VOD_ADULT_CONTENT(17109, "19세 이상만 구매 가능한 콘텐츠입니다.", 403),
    

    // NaverPay
    NAVERPAY_REGISTRATION_FAILED(31000, "네이버페이 자동결제 등록에 실패했습니다.", 500),
    NAVERPAY_RESERVATION_FAILED(31001, "네이버페이 결제 예약에 실패했습니다.", 500),
    NAVERPAY_SUBSCRIBE_FAILED(31002, "네이버페이 결제 승인에 실패했습니다.", 500),
    NAVERPAY_SUBSCRIPTION_NOT_FOUND(31003, "네이버페이 자동결제 정보를 찾을 수 없습니다.", 404),
    NAVERPAY_SUBSCRIPTION_NOT_OWNED(31004, "본인의 자동결제 정보가 아닙니다.", 403),
    NAVERPAY_SUBSCRIPTION_ALREADY_INACTIVE(31005, "이미 해지된 자동결제입니다.", 409),
    NAVERPAY_SUBSCRIPTION_INACTIVE_FAILED(31006, "네이버페이 자동결제 해지에 실패했습니다.", 500),
    NAVERPAY_CANCEL_FAILED(31007, "네이버페이 결제 취소에 실패했습니다.", 500),
    NAVERPAY_MIN_AMOUNT_ERROR(31008, "네이버페이 최소 결제 금액은 10원입니다.", 400),

    // Block
    BLOCK_SELF_NOT_ALLOWED(-32000, "자신은 차단할 수 없습니다.", 400),
    BLOCK_ALREADY_EXISTS(-32001, "이미 차단한 회원입니다.", 409),
    BLOCK_NOT_FOUND(-32002, "차단 정보를 찾을 수 없습니다.", 404),

    // BankCode
    BANK_CODE_LIST_NOT_FOUND(32000, "은행 코드 목록 조회 실패", 404),
    BANK_CODE_MAPPING_ERROR(32001, "은행 코드 매핑 실패", 500),
    BANK_CODE_FETCH_ERROR(32002, "은행 코드 목록 조회 중 오류 발생", 500),

    //Item
    MEDIA_LINKED_ITEM(-34001, "연결된 미디어가 있습니다.", 409);

    private final int errorCode;
    private final String message;
    private final int httpCode;

}
