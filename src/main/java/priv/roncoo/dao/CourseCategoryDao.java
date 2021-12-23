package priv.roncoo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import priv.roncoo.model.CourseCategory;

import java.util.List;

/**
 * 课程级别
 *
 * @author lei.xu
 * 2021/12/23 5:16 下午
 */
public interface CourseCategoryDao extends BaseMapper<CourseCategory> {

    /**
     * 查询全部数据
     *
     * @return 查询结果
     */
    List<CourseCategory> selectAll();

    /**
     * 随机获取一个小可爱
     *
     * @return 查询结果
     */
    CourseCategory findOne();

}
