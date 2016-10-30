package com.lsrcb.action;

import com.lsnsh.bean.User;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 2016-10-30.
 */
@Controller

public class Login {
    @RequestMapping("/views/index.do")
    public User Login( User user)
    {
        System.out.print(user.getPassword());
        return user;
    }

}
