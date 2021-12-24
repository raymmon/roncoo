package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lei.xu
 * 2021/12/24 9:56 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Roles extends SuperModel {

    /**
     * 角色自增id
     */
    @TableId(type = IdType.AUTO)
    private int id;

    /**
     * 角色名称
     */
    private String role;

    /**
     * 角色可以操作的菜单列表
     * 存储格式: [权限id, 权限id, ...]
     */
    private String menuList;

}
