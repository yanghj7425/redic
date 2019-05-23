package com.robert.redis.redic.config;

import com.robert.redis.redic.core.Redic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource(value = "classpath:redic.properties")
public class RedicConfig {

    @Value("${redic.cache.node.conn1}")
    private String connConfigStr;


    @Bean
    public Redic redic() {
        List<String> connPool = new ArrayList<>();
        connPool.addAll(Arrays.asList(connConfigStr.split(",")));
        return new Redic(connPool);
    }

}
