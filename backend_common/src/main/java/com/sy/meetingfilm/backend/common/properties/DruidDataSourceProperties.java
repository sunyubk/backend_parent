package com.sy.meetingfilm.backend.common.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidDataSourceProperties {
    /**
     * 初始化数量
     */
    private Integer initialSize = 2;

    /**
     * 最小数量
     */
    private Integer minIdle = 1;

    /**
     * 最大活跃数
     */
    private Integer maxActive = 20;

    /**
     * 获取连接等待超时的最大时间
     */
    private Integer maxWait = 60000;




}
