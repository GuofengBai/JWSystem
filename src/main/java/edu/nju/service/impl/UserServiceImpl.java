package edu.nju.service.impl;

import edu.nju.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */
@Service
public class UserServiceImpl implements UserService {
    public List<String> getAllUsernames() {
        List<String> users = new ArrayList<String>();
        users.add("Luke");
        users.add("Ben");
        users.add("Han Solo");
        return users;
    }

}
