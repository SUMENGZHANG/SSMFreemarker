package sumeng.zhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sumeng.zhang.service.UserService;
import sumeng.zhang.vo.User;

@Controller

public class UserController {
   @Autowired
    private UserService userService;

    /**
     * 添加新用户啊
     * @param user
     */
    @RequestMapping("/insertUser")
   public void insertUser(User user){
       userService.insertUser(user);
   }

    /**
     * 请求映射地址 /hello.do * @return
     */
    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("hello", "hello spring mvc");
        mv.setViewName("login");
        return mv;
    }






}
