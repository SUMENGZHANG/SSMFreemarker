package sumeng.zhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sumeng.zhang.service.UserService;
import sumeng.zhang.vo.User;

@Controller

public class PageController {

    @Autowired
    private UserService userService;

    /**
     * 返回主页面的同时，返回博客主人名称；
     * @return
     */
    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        User user = userService.queryUserByUserId(1);
        mv.addObject("user",user.getuName());
        mv.setViewName("index");
        return mv;

    }



}
