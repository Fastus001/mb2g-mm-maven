package fastus.springframework.controllers;

import com.fastus.domain.UserCommand;
import com.fastus.entities.User;

/**
 * Created by Tom - 06.01.2021
 */
public class UserController {

    User saveUser(UserCommand command){
        //fake impl
        return new User();
    }
}
