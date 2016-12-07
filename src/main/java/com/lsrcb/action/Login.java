package com.lsrcb.action;

import com.lsnsh.bean.User;
import com.lsnsh.dao.testdao;
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
    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Autowired
    private SqlSessionTemplate sqlSession;
    @RequestMapping("/views/index.do")
    public User Login( User user)
    {

        testdao ts =sqlSession.getMapper(testdao.class);
        System.out.print(ts.selectAcctByNo());
        return user;
    }

}
