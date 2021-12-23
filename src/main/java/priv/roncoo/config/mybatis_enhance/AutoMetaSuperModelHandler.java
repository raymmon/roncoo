package priv.roncoo.config.mybatis_enhance;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import priv.roncoo.consts.ProjectDefaultConst;
import priv.roncoo.model.SuperModel;

import java.util.Date;

/**
 * 模型基类{@link SuperModel}元数据自动填充
 *
 * @author lei.xu
 * 2021/12/23 4:26 下午
 */
@Component
public class AutoMetaSuperModelHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createBy", ProjectDefaultConst.DEFAULT_USER, metaObject);
        this.setFieldValByName("createTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateBy", ProjectDefaultConst.DEFAULT_USER, metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

}
