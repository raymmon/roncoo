package priv.roncoo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户性别
 *
 * @author lei.xu
 * 2021/12/24 10:26 上午
 */
@Getter
@AllArgsConstructor
public enum UserGenderEnum {
    /**
     * 女性、男性、保密
     */
    female(0),
    male(1),
    secrecy(2);

    private int code;
}
