package com.example.doggy.Doggy.User.Mapper;

import com.example.doggy.Doggy.User.Dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserMapper {

    public ArrayList<UserDto> getTest();
}
