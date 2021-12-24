package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户
 *
 * @author lei.xu
 * 2021/12/24 10:10 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Users extends SuperModel {

    /**
     * 用户唯一id
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String uuid;

    /**
     * 用户名(账号), 如果为空, 则默认为注册第一选项
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 绑定手机号(具有唯一性, 允许为注册选项)
     */
    private Long bindPhone;

    /**
     * 绑定邮箱(具有唯一性, 允许为注册选项)
     */
    private String bindEmail;

    /**
     * 用户昵称, 默认为{@link this#userAccount}
     */
    private String nickName;

    /**
     * 性别, 同{@link priv.roncoo.enums.UserGenderEnum}
     */
    private Integer gender;

    /**
     * 用户所在地区
     */
    private String area;

    /**
     * 用户生日
     */
    private Date birthday;

    /**
     * 头像链接
     */
    private String headPortrait;

    /**
     * 是否是svip用户
     */
    private Integer isSvip;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 允许操作的菜单列表, 这是角色之外的, 比如当这个账户允许开放一个特殊的权限的时候使用, 存储格式: [权限id, 权限id...]
     */
    private String menuList;

}
