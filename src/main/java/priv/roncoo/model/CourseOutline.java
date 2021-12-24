package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程大纲
 *
 * @author lei.xu
 * 2021/12/24 9:34 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseOutline extends SuperModel {

    /**
     * 章节唯一id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程唯一ID
     */
    private String courseUid;

    /**
     * 父级章节ID
     */
    private Integer parentId;

    /**
     * 章节序号, 例如第x章、第x讲
     */
    private String serialNumber;

    /**
     * 章节名称
     */
    private String sectionName;

    /**
     * 章节时长
     */
    private String sectionDuration;

    /**
     * 章节的视频链接
     */
    private String sectionLink;

    /**
     * 是否为试看章节(不需要付费)
     */
    private Integer isTypeSee;

}
