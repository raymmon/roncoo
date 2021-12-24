package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Time;

/**
 * 课程学习历史
 *
 * @author lei.xu
 * 2021/12/24 11:20 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseLearnHistory extends SuperModel {

    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户唯一id
     */
    private String userUid;

    /**
     * 课程唯一id
     */
    private String courseUid;

    /**
     * 章节id
     */
    private Integer sectionId;

    /**
     * 最后一次观看截止的时间点
     */
    private Time endTimePoint;

    /**
     * 是否已完成
     */
    private Integer isCompleted;

}
