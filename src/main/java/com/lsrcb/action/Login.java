package com.lsrcb.action;

import com.lsnsh.bean.User;
import com.lsnsh.dao.TestDao;
import com.lsnsh.dao.TestDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 2016-10-30.
 */
@Controller
@ResponseBody
public class Login {


    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public TestDao getTestDao() {
        return testDao;
    }

    @Autowired

    private TestDao testDao;
    @RequestMapping("/views/index.do")
    public User Login( User user)
    {


        System.out.print(testDao.selectAcctByNo());
        return user;
    }

}
