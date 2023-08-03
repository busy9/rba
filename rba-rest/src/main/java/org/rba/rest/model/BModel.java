package org.rba.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("rba:B")
public class BModel implements Serializable {

    @Id
    private String id;
    private String value;

    public BModel(String value) {
        this.value = value;
    }

}
