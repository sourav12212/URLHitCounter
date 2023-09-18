package com.geekster.URLHitCounter.Bean;

import com.geekster.URLHitCounter.Entity.URLHitCounterEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {
    @Bean
    public List<URLHitCounterEntity> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}
