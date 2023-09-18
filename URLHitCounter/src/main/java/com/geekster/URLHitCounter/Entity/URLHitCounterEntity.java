package com.geekster.URLHitCounter.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class URLHitCounterEntity {
    private String userName;
    private Integer count;

    public Integer getCounter() {
        return count;
    }

    public String getUserName() {
        return userName;
    }

    public void setCounter(Integer count) {
        this.count=count;
    }
}
