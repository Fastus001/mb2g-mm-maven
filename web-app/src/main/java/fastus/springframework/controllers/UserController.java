package fastus.springframework.controllers;

import com.fastus.domain.UserCommand;
import com.fastus.entities.User;
import com.fastus.mappers.UserMapper;

/**
 * Created by Tom - 06.01.2021
 */
public class UserController {

    User saveUser(UserCommand command){
        //fake impl
        return UserMapper.INSTANCE.user(command);
    }
}
