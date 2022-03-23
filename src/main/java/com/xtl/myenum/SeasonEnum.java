package com.xtl.myenum;

/**
 * 季节枚举
 *
 * @author 31925
 */

public enum SeasonEnum {
    /**
     * 1代表春天，2代表夏天
     */
    SPRING(1), SUMMER(2),
    /**
     * 3代表秋天，4代表冬天
     */
    AUTUMN(3), WINTER(4);

    private Integer seq;

    SeasonEnum(Integer seq) {
        this.seq = seq;
    }

    public Integer getSeq() {
        return seq;
    }
}
