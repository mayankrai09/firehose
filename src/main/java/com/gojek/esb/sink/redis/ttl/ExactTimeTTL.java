package com.gojek.esb.sink.redis.ttl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import redis.clients.jedis.Pipeline;


@AllArgsConstructor
@Getter
public class ExactTimeTTL implements RedisTTL {
    private long unixTime;

    @Override
    public void setTTL(Pipeline jedisPipelined, String key) {
        jedisPipelined.expireAt(key, unixTime);
    }
}