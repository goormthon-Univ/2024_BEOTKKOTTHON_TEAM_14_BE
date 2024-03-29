package com.example.demo.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessCode {
    /**
     * 200 OK
     */
    GET_SUCCESS(HttpStatus.OK, "성공적으로 조회했습니다."),
    RE_ISSUE_TOKEN_SUCCESS(HttpStatus.OK, "토큰 재발급을 성공했습니다."),
    GET_USER_INFO_SUCCESS(HttpStatus.OK, "사용자 정보 조회에 성공했습니다."),
    UNLINK_USER_SUCCESS(HttpStatus.OK, "사용자 탈퇴에 성공했습니다."),


    /**
     * 201 CREATED
     */
    LOGIN_SUCCESS(HttpStatus.OK, "로그인에 성공했습니다."),
    SIGNIN_SUCCESS(HttpStatus.CREATED, "회원가입이 완료됐습니다."),
    SIGNOUT_SUCCESS(HttpStatus.CREATED, "로그아웃이 완료됐습니다."),
    CREATE_COMPLETE_SUCCESS(HttpStatus.CREATED, "성공적으로 글을 작성했습니다."),
    UPDATE_COMPLETE_SUCCESS(HttpStatus.CREATED, "성공적으로 수정을 완료했습니다."),
    CREATE_GHOSTTYPE_SUCCESS(HttpStatus.CREATED, "결과 페이지로 넘어갑니다."),
    GET_MESSAGE_SUCCESS(HttpStatus.OK, "사용자가 작성한 모든 메세지를 가져왔습니다"),


    /**
     * 204 CREATED
     */
    DELETE_SUCCESS(HttpStatus.NO_CONTENT, "성공적으로 삭제했습니다.");


    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}


