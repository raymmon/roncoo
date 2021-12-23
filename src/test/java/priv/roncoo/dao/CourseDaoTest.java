package priv.roncoo.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import priv.roncoo.model.Course;

@SpringBootTest
@DisplayName("DAO测试: 课程信息")
class CourseDaoTest {

    @Autowired
    private CourseDao courseDao;

    @Test
    @DisplayName("测试插入数据时自动补充")
    void insert() {
        Course course = new Course();
        course.setTeacherUid("1");
        course.setCourseTitle("测试课程");
        course.setCategoryId(1);
        this.courseDao.insert(course);
    }
}