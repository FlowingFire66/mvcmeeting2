package com.example.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.UserInfo;
import com.example.repository.UserInfoRepository;
import com.example.service.UserInfoService;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
    private UserInfoRepository userInfoRepository;

    @Transactional(readOnly=true)
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
    @Override
    public void deleteByUsername(Long id){
     userInfoRepository.delete(id);
    }

    @Override
    public void register(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }
    @Transactional
    @Override
    public UserInfo login(String username, String password) {
        UserInfo byUsername = userInfoRepository.findByUsername(username);
        if(byUsername.getPassword().equals(password)){
            return byUsername;
        }
        return null;
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }
}