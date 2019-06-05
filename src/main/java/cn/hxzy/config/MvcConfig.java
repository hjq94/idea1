package cn.hxzy.config;

import cn.hxzy.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration   //表名是配置文件
public class MvcConfig implements WebMvcConfigurer {//WebMvcConfigurer是一个接口类型

    @Bean //产生对象
    public LoginInterceptor loginInterceptor(){
        LoginInterceptor loginInterceptor = new LoginInterceptor();

        return loginInterceptor;
    }


    @Override   //添加拦截器
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(this.loginInterceptor()).addPathPatterns("/**");//只要符合/之后的,都需要经过拦截器,这边是设置路径


    }
}
