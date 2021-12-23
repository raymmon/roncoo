package priv.roncoo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 课程标签
 *
 * @author lei.xu
 * 2021/12/23 6:45 下午
 */
@Getter
@AllArgsConstructor
public enum CourseLabelEnum {

    /**
     * 精品课程
     */
    quality_course(0),

    /**
     * 热门课程
     */
    hot_course(1);

    private Integer label;

}
