package com.edu.controller;

import com.edu.entity.User;
import com.edu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


/**
 * Created by wuxiaolong on 2017/2/27.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository  userRepository;

    @GetMapping("/home")
    public Object home(){
        return "home";
    }

    @GetMapping("/findone")    //http://localhost:8080/user/findone?id=13
    public Object findOne(Integer id){
        return userRepository.findOne(id);
    }
    @GetMapping("/findall")
    public Object findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/displayone1") //http://localhost:8080/user/displayone1?id=2
    public Object display1(@RequestParam("id") User user){
        return user;
    }

    @GetMapping("/displayone2/{id}")//http://localhost:8080/user/displayone2/6
    public Object display2(@PathVariable("id") User user){
        return user;
    }
//分页
    @GetMapping("/page")
    //http://localhost:8080/user/page
    //http://localhost:8080/user/page?size=5&page=2
    //http://localhost:8080/user/page?size=5&page=1&sort=age,desc
    public Object page(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    @GetMapping("/modifydefaultpage")
    //http://localhost:8080/user/modifydefaultpage
    //http://localhost:8080/user/modifydefaultpage?size=6&page=0
    public Object modifyDefaultPage(@PageableDefault(size=3,page=1) Pageable pageable){
        return userRepository.findAll(pageable);
    }

//排序
    @GetMapping("/sort")
    //http://localhost:8080/user/sort?sort=age,desc&sort=name,desc
    public Object sort(Pageable pageable){
        return userRepository.findAll(pageable);
    }
 //以上的分页使用的是findAll(),还可以自定义分页的方法
    @GetMapping("/mymethod")
    //http://localhost:8080/user/mymethod?gender=2&size=3&page=1
    public Object findByMyMethod(@RequestParam("gender") Integer gender, Pageable pageable){
        int a=1;
        if(a == 1) {
           // throw new MyDefinationException("这是测试的异常");
        }
        return userRepository.queryByGender(gender,pageable);
    }

//    @ExceptionHandler(MyDefinationException.class)
//    public JsonResultResponse myDefinationException(MyDefinationException e){
//        e.printStackTrace();
//        return new JsonResultResponse(e);
//    }
}
