package priv.roncoo.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 实体类Base
 *
 * @author lei.xu
 * 2021/12/23 3:46 下午
 */
@Getter
@Setter
public class SuperModel {

    @TableField(fill = FieldFill.INSERT)
    protected String createBy;

    @TableField(fill = FieldFill.INSERT)
    protected Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    protected String lastUpdateBy;

    @TableField(fill = FieldFill.UPDATE)
    protected Date lastUpdateTime;

}
