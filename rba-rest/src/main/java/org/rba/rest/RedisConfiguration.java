package org.rba.rest;

import org.rba.rest.model.RbaModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {

    @Bean
    RedisConnectionFactory connectionFactory() {
        return new LettuceConnectionFactory("redis", 6379);
    }

    @Bean
    public RedisTemplate<String, RbaModel> redisTemplate() {
        RedisTemplate<String, RbaModel> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory());
        return template;
    }

}
