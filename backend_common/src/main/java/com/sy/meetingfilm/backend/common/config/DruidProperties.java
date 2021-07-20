package com.sy.meetingfilm.backend.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.sy.meetingfilm.backend.common.properties.DruidDataSourceProperties;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

@Data
@Configuration
public class DruidProperties {

    @Autowired
    private DruidDataSourceProperties properties;

    public DataSource druid() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setInitialSize(properties.getInitialSize());
        druidDataSource.setMinIdle(properties.getMinIdle());
        druidDataSource.setMaxActive(properties.getMaxActive());
        druidDataSource.setMaxWait(properties.getMaxWait());

        //如果需要增加其他配置，则在DruidDataSourceProperties和yml进行添加配置
        
        return druidDataSource;
    }

}
