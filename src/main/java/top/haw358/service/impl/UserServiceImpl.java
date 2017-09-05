package top.haw358.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.haw358.mapper.UserMapper;
import top.haw358.model.User;
import top.haw358.service.UserService;

/**
 * Created by haw on 17-8-30.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
