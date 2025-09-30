package org.aehan.common.execption;

import lombok.Getter;
import org.aehan.common.dto.response.ApiErrorData;

import java.util.List;

@Getter
public class ForifException extends RuntimeException {

    private final ErrorCode errorCode;
    private final List<ApiErrorData> errorDataList;

    // 기본 생성자
    public ForifException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.errorDataList = null;
    }

    public ForifException(ErrorCode errorCode, String message) {
        super(errorCode.getMessage() + " - " + message);
        this.errorCode = errorCode;
        this.errorDataList = null;
    }

    public ForifException(ErrorCode errorCode, List<ApiErrorData> errorDataList) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.errorDataList = errorDataList;
    }
}