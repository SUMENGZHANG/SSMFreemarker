package sumeng.zhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sumeng.zhang.dao.UserMapper;
import sumeng.zhang.vo.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void insertUser(User user){
        userMapper.insert(user);
    }

    public User queryUserByUserId(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }


}
