package com.zou.monster.enums;

/**
 * 语言枚举
 *
 * @author zou
 * @date 2020-01-13 11:25 下午
 */
public enum LangEnums {
    /**
     * 国际化语言类型
     */
    UNKNOWN(-1,"未知"),
    LANG_EN(0, "英文"),
    LANG_ZH(1, "中文");
    private Integer type;
    private String name;


    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    LangEnums(Integer type, String name) {
        this.type = type;
        this.name = name;
    }
}
