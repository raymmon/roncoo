package priv.roncoo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 会员身份
 *
 * @author lei.xu
 * 2021/12/24 2:08 下午
 */
@Getter
@AllArgsConstructor
public enum SvipIdentityEnum {

    /**
     * 普通会员、年度会员(享受折上折)
     */
    public_svip(0),
    year_svip(1);

    private Integer code;

}
