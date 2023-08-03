package org.rba.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("rba:RBA")
public class RbaModel implements Serializable {

    @Id
    private String id;
    private String value;

    public RbaModel(String value) {
        this.value = value;
    }

}
