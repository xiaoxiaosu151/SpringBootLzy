package cn.lzy;

import cn.lzy.controller.ChapterController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xs
 * @creat 2023/6/7-17:26
 **/
@RunWith(SpringRunner.class) //测试运行器，并加载spring boot 测试注解
@SpringBootTest //标记单元测试类，并加载项目的上下文环境ApplicationContext
public class ChapterTestApplication {

    @Autowired //Autowired注入ChapterController类
    ChapterController chapterController;

    @Test
    public void getHello() {
        System.out.println("单元测试返回的数据---" + chapterController.sayHello());
    }
}
