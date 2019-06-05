package cn.hxzy.controller;

import cn.hxzy.pojo.User;
import cn.hxzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


import java.util.List;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("user/{id}") //id只是一个占位符,没有实际的意思
    @ResponseBody  //执行后返回的是     @RequestBody是作用在形参列表上，用于将前台发送过来固定格式的数据【xml 格式或者 json等】
    // 封装为对应的 JavaBean 对象，封装时使用到的一个对象是系统默认配置的 HttpMessageConverter进行解析，然后封装到形参上。
    public User queryUserById(@PathVariable("id") Long userId){

        User user = userService.queryUserById(userId);

        if(user!=null){
            return user;
        }
        return null;
    }

    @GetMapping("deleteUserById/{id}") //id只是一个占位符,没有实际的意思
    @ResponseBody
    public String deleteUserById(@PathVariable("id") Long userId){

        userService.deleteUserById(userId);
        return "ok";
    }


    @GetMapping("/all")
    public String all(Model model){
        //查询所有用户
        List<User> users=userService.queryAll();
        model.addAttribute("users",users);
        //json users.html
        return  "users";
    }



}
