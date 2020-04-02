package ServiceTest;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sumeng.zhang.controller.UserController;
import sumeng.zhang.vo.User;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class UserServiceTest {

   @Autowired
    UserController userController;

   @Test
   public void insert(){
       User user = new User();
       user.setuEmail("admin@qq.com");
       user.setuName("admin");
       user.setuPwd("123123");
       user.setuPhone("13270709770");
       user.setCreateTime(new Date());

       userController.insertUser(user);

   }




}
