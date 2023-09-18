package com.geekster.URLHitCounter.Service;

import com.geekster.URLHitCounter.Entity.URLHitCounterEntity;
import com.geekster.URLHitCounter.Repositry.URLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class URLService {
    @Autowired
    URLRepo urlRepo;

    public List<URLHitCounterEntity> getAllVisitors(){
        return urlRepo.getUrlList();
    }

    public String addUser(URLHitCounterEntity user){
        List<URLHitCounterEntity> visitorsList = getAllVisitors();
        for (URLHitCounterEntity urlHitCounterEntity : visitorsList) {
            if (urlHitCounterEntity.getUserName().equals(user.getUserName())) {
                urlHitCounterEntity.setCounter(urlHitCounterEntity.getCounter() + 1);
                return "Cannot add the same visitor count updated";
            }
        }
        visitorsList.add(user);
        return "welcome to our website.";
    }

    public String getCountOfVisitors() {

        List<URLHitCounterEntity> li = getAllVisitors();

        return "Visitors: "+li.size();
    }

    public URLHitCounterEntity getAVisitor(String username) {
        List<URLHitCounterEntity> visitorlist = getAllVisitors();
        for(URLHitCounterEntity u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                return u;

            }
        }
        throw new IllegalStateException("UserName not found");
    }

    public String countUpdated(String username) {
        List<URLHitCounterEntity> visitorlist = getAllVisitors();
        for(URLHitCounterEntity u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                u.setCounter(u.getCounter()+1);
                return "Welcome Back";
            }
        }
        return "User not found new User";
    }
}
