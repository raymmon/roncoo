package priv.roncoo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.roncoo.core.Result;
import priv.roncoo.dao.CourseCategoryDao;
import priv.roncoo.model.CourseCategory;

/**
 * 测试控制器
 *
 * @author lei.xu
 * 2021/12/23 2:33 下午
 */
@Api(tags = "测试相关 REST API")
@RestController
@AllArgsConstructor
public class TestController {

    private final CourseCategoryDao courseCategoryDao;

    @GetMapping("/test-01")
    @ApiOperation("01_初始化")
    public Result test01() {
        return Result.ok();
    }

    @PostMapping("test-02")
    @ApiOperation("02_读写mysql")
    public Result setAndGetMysql() {
        CourseCategory result = this.courseCategoryDao.findOne();
        return Result.ok(result);
    }

}
