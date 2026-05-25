package com.gleb.swimshop.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GenericErrorCode implements ErrorCode {
    public static final GenericErrorCode INTERNAL_ERROR =
            new GenericErrorCode("core-001", "internal-error");

    public static final GenericErrorCode INVALID_INPUT =
            new GenericErrorCode("core-002", "invalid-input");

    public static final GenericErrorCode NOT_FOUND =
            new GenericErrorCode("core-003", "not-found");

    public static final GenericErrorCode ALREADY_EXISTS =
            new GenericErrorCode("core-004", "already-exists");

    private final String code;
    private final String title;

    public GenericErrorCode(String code, String title) {
        this.code = code;
        this.title = title;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
