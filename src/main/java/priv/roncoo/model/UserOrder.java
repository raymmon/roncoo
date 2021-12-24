package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户订单
 *
 * @author lei.xu
 * 2021/12/24 11:44 上午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserOrder extends SuperModel {

    /**
     * 订单唯一id
     */
    @TableId(type = IdType.ASSIGN_UUID)
    private String uuid;

    /**
     * 用户唯一id
     */
    private String userUid;

    /**
     * 订单类型, 同{@link priv.roncoo.enums.UserOrderTypeEnum}
     */
    private Integer orderType;

    /**
     * 如果是课程订单, 需要绑定课程uuid
     */
    private String courseUid;

    /**
     * 订单状态, 同{@link priv.roncoo.enums.UserOrderStatusEnum}
     */
    private Integer orderStatus;

    /**
     * 用户支付的时间
     */
    private Date payedTime;

    /**
     * 是否因超时被取消, 如果{@link this#orderStatus}为{@link priv.roncoo.enums.UserOrderStatusEnum#cancel},
     * 则需要判断是否是因为超时而被取消, 默认为0
     */
    private Integer isTimeout;

}
