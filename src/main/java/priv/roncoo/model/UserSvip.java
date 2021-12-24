package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户的SVIP身份表
 *
 * @author lei.xu
 * 2021/12/24 2:05 下午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserSvip extends SuperModel {

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
     * 会员等级
     */
    private String svipLevel;

    /**
     * 会员过期时间
     */
    private Date svipTimeout;

    /**
     * 会员身份, 同{@link priv.roncoo.enums.SvipIdentityEnum}
     */
    private Integer svipIdentity;

}
