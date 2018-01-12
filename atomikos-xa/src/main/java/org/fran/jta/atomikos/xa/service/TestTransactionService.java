package org.fran.jta.atomikos.xa.service;

import org.fran.jta.atomikos.xa.dao.SysDao;
import org.fran.jta.atomikos.xa.dao.TestDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by fran on 2018/1/5.
 */
@Service
public class TestTransactionService {
    @Resource
    SysDao sysdao;
    @Resource
    TestDao testdao;

    @Transactional(rollbackFor = RuntimeException.class)
    public void save(boolean error){
        sysdao.save();
        testdao.save();
        if(error)
            throw new RuntimeException();
    }
}
