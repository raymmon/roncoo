package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 菜单列表
 *
 * @author lei.xu
 * 2021/12/24 9:54 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Menus extends SuperModel {

    /**
     * 菜单自增id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 父级ID
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单图标
     */
    private String menuIcon;

}
