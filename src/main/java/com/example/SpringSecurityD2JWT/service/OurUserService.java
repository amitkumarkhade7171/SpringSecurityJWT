package com.example.SpringSecurityD2JWT.service;

import com.example.SpringSecurityD2JWT.model.OurUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OurUserService {
    private List<OurUser> ourUserList = new ArrayList<>();

    public OurUserService() {
        ourUserList.add(new OurUser(UUID.randomUUID().toString(),"amit","amit@x.com"));
        ourUserList.add(new OurUser(UUID.randomUUID().toString(),"khade","khade@x.com"));
        ourUserList.add(new OurUser(UUID.randomUUID().toString(),"harsh","harsh@x.com"));
        ourUserList.add(new OurUser(UUID.randomUUID().toString(),"ankit","ankit@x.com"));
    }

    public List<OurUser> getOurUserList(){
        return this.ourUserList;
    }



}
