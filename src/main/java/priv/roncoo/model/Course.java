package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 课程信息
 *
 * @author lei.xu
 * 2021/12/23 6:37 下午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Course extends SuperModel {

    /**
     * 课程唯一ID
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String uuid;

    /**
     * 教师唯一ID
     */
    private String teacherUid;

    /**
     * 课程标题
     */
    private String courseTitle;

    /**
     * 课程首页背景图片链接
     */
    private String courseBackImg;

    /**
     * 课程介绍(富文本)
     */
    private String courseIntroduce;

    /**
     * 是否是付费课程
     */
    private Integer isPay;

    /**
     * 课程价格(单位: 分), 默认免费
     */
    private Integer coursePrice;

    /**
     * 课程标签, {@link priv.roncoo.enums.CourseLabelEnum}
     */
    private Integer courseLabel;

    /**
     * 课程分类ID
     */
    private Integer categoryId;

}
