package com.shsxt.crm.biz.service;


import com.shsxt.crm.core.common.util.Result;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    public Result userLogin (String userName,String userPwd) ;


}
