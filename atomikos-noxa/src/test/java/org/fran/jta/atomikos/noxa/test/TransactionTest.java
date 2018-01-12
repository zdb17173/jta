package org.fran.jta.atomikos.noxa.test;

/**
 * Created by fran on 2018/1/5.
 */

import org.fran.jta.atomikos.noxa.service.TestTransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-jdbc.xml"})
public class TransactionTest {
    @Resource
    TestTransactionService testTransactionService;

    @Test
    public void test(){
        testTransactionService.save(true);
    }
}
