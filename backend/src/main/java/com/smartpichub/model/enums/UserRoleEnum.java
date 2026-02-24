package com.smartpichub.model.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public enum UserRoleEnum {

    USER("用户", "user"),
    ADMIN("管理员", "admin");

    private final String text;
    private final String value;

    // 1. 静态缓存：提前构造 Map，查找复杂度从 O(n) 降到 O(1)
    private static final Map<String, UserRoleEnum> VALUE_MAP = Arrays.stream(UserRoleEnum.values())
            .collect(Collectors.toMap(UserRoleEnum::getValue, e -> e));

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     */
    public static UserRoleEnum getEnumByValue(String value) {
        // 直接从 Map 获取，逻辑更简洁
        return VALUE_MAP.get(value);
    }

//    /**
//     * 可选：如果希望更安全，可以提供一个带默认值的方法
//     */
//    public static UserRoleEnum getEnumByValueOrDefault(String value, UserRoleEnum defaultEnum) {
//        UserRoleEnum result = VALUE_MAP.get(value);
//        return result != null ? result : defaultEnum;
//    }
}