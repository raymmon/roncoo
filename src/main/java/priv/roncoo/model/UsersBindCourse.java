package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户&课程关系
 *
 * @author lei.xu
 * 2021/12/24 11:14 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UsersBindCourse extends SuperModel {

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
     * 是否收藏
     */
    private Integer isCollect;

}
