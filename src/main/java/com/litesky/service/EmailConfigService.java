package com.litesky.service;

import com.litesky.model.EmailConfig;

/**
 * Created by finefine.com on 2017/10/1.
 */
public interface EmailConfigService {
    public EmailConfig getConfig();
    public int updateConfig(EmailConfig emailConfig);
    public int addConfig(EmailConfig emailConfig);
    public int deleteConfig(int id);
}
