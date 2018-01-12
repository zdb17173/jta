package org.fran.jta.atomikos.noxa.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestDao {

    @Resource(name="jdbcTemplateA")
    private JdbcTemplate jdbcTemplate;

    public void save(){
        jdbcTemplate.update("insert into t_test(name) values('db1-name')");
    }
}
