package com.geekster.URLHitCounter.Repositry;

import com.geekster.URLHitCounter.Entity.URLHitCounterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class URLRepo {
    @Autowired
    List<URLHitCounterEntity> urlList;

    public List<URLHitCounterEntity> getUrlList() {
        return urlList;
    }
}
