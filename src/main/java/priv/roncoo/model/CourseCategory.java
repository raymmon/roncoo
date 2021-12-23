package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 课程分类
 *
 * @author lei.xu
 * 2021/12/23 3:46 下午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CourseCategory extends SuperModel {

    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 父级ID
     */
    private Integer parentId;

    /**
     * 课程类型名称
     */
    private String categoryName;

}
