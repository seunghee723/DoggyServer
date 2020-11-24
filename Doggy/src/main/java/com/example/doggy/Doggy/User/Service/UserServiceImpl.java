package com.example.doggy.Doggy.User.Service;

import com.example.doggy.Doggy.User.Dto.UserDto;
import com.example.doggy.Doggy.User.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public ArrayList<UserDto> getTest(){
        ArrayList<UserDto> user = userMapper.getTest();
        return user;
    }


}
