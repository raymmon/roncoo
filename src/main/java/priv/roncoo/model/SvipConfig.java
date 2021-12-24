package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 会员配置
 *
 * @author lei.xu
 * 2021/12/24 2:14 下午
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SvipConfig extends SuperModel {

    /**
     * 自增id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 会员等级
     */
    private Integer svipLevel;

    /**
     * 会员享受折扣
     */
    private BigDecimal discount;

    /**
     * 年度会员享受折扣(与会员折扣累加)
     */
    private BigDecimal yearSvipDiscount;

}
