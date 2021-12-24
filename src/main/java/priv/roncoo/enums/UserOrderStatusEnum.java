package priv.roncoo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户订单状态
 *
 * @author lei.xu
 * 2021/12/24 11:55 上午
 */
@Getter
@AllArgsConstructor
public enum UserOrderStatusEnum {

    /**
     * 创建订单(待支付)、取消订单、已支付、已删除
     */
    create(0),
    cancel(1),
    payed(2),
    delete(3);

    private int code;

}
