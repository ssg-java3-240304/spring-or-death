package com.sh.sod.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto<T> {
    private int code;  // 1, -1,
    private String msg;  // 사유
    private T data;  // 제네릭 사용으로 여러 오브젝트를 받을수 있다
}
