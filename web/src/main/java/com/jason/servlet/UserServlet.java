package com.jason.servlet;

import com.fc.platform.commons.page.Page;
import com.jason.services.ClassService;
import com.jason.services.UserService;
import com.mll.operation.core2.entity.Tblclass;
import com.mll.operation.core2.entity.Tblstudent;
import com.mll.operation.core2.mapper.TblclassMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/26.
 */
@Controller
public class UserServlet {
    @Autowired
    private UserService userService;
    @Autowired
    private ClassService classService ;



    public UserServlet(){
        System.out.println("UserServlet构造方法");
//        userService.show();
    }

    @RequestMapping("/show")
    @ResponseBody
    public Object tset1(){
            List<Tblstudent> list=userService.show();
            return list;
    }
@RequestMapping("/map")
    public String getMyMap(@RequestParam(name="page",defaultValue = "0") Integer page,ModelMap modelMap){
    //ModelMap一个在控制器中用来存储值的对象
    //存储值以后可以再页面中用el表达式显示出来
    Page<Tblstudent> lists=userService.showmap(page,4);
    if(page<1) {
        page = 1;
    }
//    }else if(page>=lists.getTotalPages()){
//        page=lists.getTotalPages();
//        System.out.println(page+"11111111111111111111");
//    }
    modelMap.put("lists",lists);
    modelMap.put("countpage",page);
    return "ok";
    }

    @RequestMapping("/add")
    @ResponseBody
    public boolean addServlet(Tblstudent tblstudent,ModelMap modelMap){
        boolean b=userService.add(tblstudent);
        return b;
    }

    @RequestMapping("/took")
    public Object took(ModelMap modelMap){
        //调用业务逻辑，查询所有的年级列表，并保存在Mode中
        List<Tblclass> glist=classService.showList();
        modelMap.put("glist",glist);
        return "inser";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public boolean delete(String stuId){
        try{
           int m= userService.deletet(stuId);
            if(m==1){
                return true;
            }else {
                return false;
            }

        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
    @RequestMapping("/toupdatey")
    public String  updateshow(String stuId,ModelMap modelMap ){
        List<Tblclass> glist=classService.showList();

            Tblstudent tblstudent=userService.updateshow(stuId);
            modelMap.put("tblstudent",tblstudent);
        modelMap.put("glist",glist);
           return "update";
    }

    @RequestMapping("/doupdatey")
    @ResponseBody
    public int  update(Tblstudent tblstudent){
        try{
            int m=userService.update(tblstudent);
            if(m==1){
                return 1;
            }
            return -1;
        }catch (Exception ex){
//            ex.printStackTrace();
            return -1;
        }

    }


//@RequestMapping("/add")
//控制器里面被@Autowired的含有该属性的方法不能是void
//@ResponseBody
//    public Object add(User user){
//        System.out.println(user.getName() + user.getPwd()+user.getAge());
////        userService.show();
//        List list=new ArrayList();
//        list.add("广州");
//        list.add("上海");
//        list.add("杭州");
//        return list;
//    }

//    @RequestMapping("/add1")
////控制器里面被@Autowired的含有该属性的方法不能是void
////    @ResponseBody
//    public Object add1(User user){
//        System.out.println(user.getName() + user.getPwd()+user.getAge());
////        userService.show();
//        List list=new ArrayList();
//        list.add("广州");
//        list.add("上海");
//        list.add("杭州");
//        return "hehe";
//    }
}
