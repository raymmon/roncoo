package priv.roncoo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关注的教师
 *
 * @author lei.xu
 * 2021/12/24 11:35 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CollectTeachers extends SuperModel {

    /**
     * 自增id
     */
    private Integer id;

    /**
     * 用户唯一id
     */
    private String userUid;

    /**
     * 教师(用户角色)唯一id
     */
    private String teacherUid;

}
