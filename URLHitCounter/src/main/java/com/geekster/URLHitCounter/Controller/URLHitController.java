package com.geekster.URLHitCounter.Controller;

import com.geekster.URLHitCounter.Entity.URLHitCounterEntity;
import com.geekster.URLHitCounter.Service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class URLHitController {
    @Autowired
    URLService urlService;
    @PostMapping("visitor")
    public String addAVisitor(@RequestBody URLHitCounterEntity user)
    {
        return urlService.addUser(user);
    }

    @GetMapping("visitors") //get all Visitors
    public List<URLHitCounterEntity> getAllVisitors()
    {
        return urlService.getAllVisitors();
    }

    @GetMapping("visitor/count") //Visitor Count
    public String getTheNumberOfVisitors()
    {
        return urlService.getCountOfVisitors();
    }

    @GetMapping("api/v1/visitor-count-app/username/{username}") //get specific user
    public URLHitCounterEntity getAVisitor(@PathVariable String username)
    {
        return urlService.getAVisitor(username);
    }

    @PutMapping("api/v1/count_update/username/{username}")
    public String countUpdated(@PathVariable  String username)
    {
        return urlService.countUpdated(username);
    }
}
