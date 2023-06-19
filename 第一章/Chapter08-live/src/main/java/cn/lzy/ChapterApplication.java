package cn.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author xs
 * @creat 2023/6/7-17:08
 **/

@SpringBootApplication  //用注解标识的类作为springboot的入口类（启动类）
public class ChapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChapterApplication.class,args);
    }
}


