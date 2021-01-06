package com.fastus.mappers;

import com.fastus.domain.UserCommand;
import com.fastus.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userCommand(User user);

    User user(UserCommand userCommand);
}
