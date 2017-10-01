package com.litesky.dao.impl;

import com.litesky.dao.EmailConfigDao;
import com.litesky.model.EmailConfig;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by finefine.com on 2017/10/1.
 */

@Repository
public class EmailConfigDaoImpl implements EmailConfigDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public EmailConfig getConfig() {
        return sqlSessionTemplate.selectOne("com.litesky.mapper.EmailConfigMapper.getConfig");
    }

    @Override
    public int updateConfig(EmailConfig emailConfig) {
        return sqlSessionTemplate.update("com.litesky.mapper.EmailConfigMapper.updateConfig",emailConfig);
    }

    @Override
    public int addConfig(EmailConfig emailConfig) {
        return sqlSessionTemplate.insert("com.litesky.mapper.EmailConfigMapper.addConfig",emailConfig);
    }

    @Override
    public int deleteConfig(int id) {
        return sqlSessionTemplate.delete("com.litesky.mapper.EmailConfigMapper.deleteConfig",id);
    }
}
