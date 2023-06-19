package cn.lzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xs
 * @creat 2023/6/7-17:09
 **/

@RestController //控制类所在的包必须是@SpringBootApplication注解标识的类所在的包或者其包的子类
public class ChapterController {

    @RequestMapping(value = "/hello")
    @ResponseBody //该注释的作用是把返回的对象转化成json格式数据客户端

    public String sayHello(){
        System.out.println("hello spring boot!!");
        return "大家晚上好 hello spring boot!!";
    }
}
