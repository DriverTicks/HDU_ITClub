package com.litesky.service.impl;

import com.litesky.dao.EmailConfigDao;
import com.litesky.model.EmailConfig;
import com.litesky.service.EmailConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by finefine.com on 2017/10/1.
 */

@Service
public class EmailConfigServiceImpl implements EmailConfigService {

    @Resource
    private EmailConfigDao emailConfigDao;

    @Override
    public EmailConfig getConfig() {
        return emailConfigDao.getConfig();
    }

    @Override
    public int updateConfig(EmailConfig emailConfig) {
        return emailConfigDao.updateConfig(emailConfig);
    }

    @Override
    public int addConfig(EmailConfig emailConfig) {
        return emailConfigDao.addConfig(emailConfig);
    }

    @Override
    public int deleteConfig(int id) {
        return emailConfigDao.deleteConfig(id);
    }
}
