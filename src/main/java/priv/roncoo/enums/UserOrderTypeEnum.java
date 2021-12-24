package priv.roncoo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lei.xu
 * 2021/12/24 11:52 上午
 */
@Getter
@AllArgsConstructor
public enum UserOrderTypeEnum {

    /**
     * 课程订单、svip订单
     */
    course_order(0),
    svip_order(1);

    private int code;

}
