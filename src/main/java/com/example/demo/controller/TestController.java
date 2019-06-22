package com.example.demo.controller;

import com.example.demo.entity.test.UserInfoPO;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/queryDataById")
    public List<Object> test(String name) throws Exception {
        System.out.println(name);
        List<Object> query = testService.query();
        System.out.println(query);
        return query;
    }

    @PostMapping(value = "/testPost")
    public UserInfoPO testPost(HttpServletRequest request) {
        System.out.println(request);
        UserInfoPO userInfoPO = new UserInfoPO();
        userInfoPO.setCode("23");
        userInfoPO.setName("23");
        return userInfoPO;
    }

    @PostMapping(value = "/insert")
    public int insertModel() throws Exception {
        int insert = testService.insert();
        return insert;

    }
}
