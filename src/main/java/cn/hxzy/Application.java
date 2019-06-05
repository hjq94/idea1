package cn.hxzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.hxzy.mapper")//启动类上添加扫描包注解
public class Application {
     //访问的图片等静态页面(js/css/图片/)都放在/resources/static之下   添加进去访问的时候需要重新启动Idea才可以访问
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
