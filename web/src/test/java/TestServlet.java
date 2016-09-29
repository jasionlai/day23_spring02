import com.fc.platform.commons.page.Page;
import com.jason.services.UserService;
import com.jason.sta;
import com.mll.operation.core2.entity.Tblstudent;
import com.mll.operation.core2.mapper.TblstudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/9/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(sta.class)
public class TestServlet {

    @Autowired
    private UserService userService;
    private TblstudentMapper tblstudentMapper;

    @Test
        public void show(){
        System.out.println(tblstudentMapper.searchTblstudentByParams(null)+"111111111111111111111111");
//             List<Tblstudent> list=tblstudentMapper.searchTblstudentByParams(null);
//            for (Tblstudent t: list){
//                System.out.println(t.getStuName());
//            }
        }


    @Test
    public void show1(){

            System.out.println("你好测试");

    }
    @Test
    public void tset1(){
        List<Tblstudent> list=userService.show();
        System.out.print(list+"11111111111111111111111111111111111111111");
        for(Tblstudent t:list){
            System.out.print(t.getStuName());
        }
//        System.out.print(tblstudentMapper+"11111111111111111111111111111111111111111");
    }


    @Test
    public void tset2(){
        Page<Tblstudent> ps=userService.showmap(0,5);
        List<Tblstudent> list=ps.getContent();//内容
        for(Tblstudent t:list){
            System.out.println(t.getStuName());

        }
        System.out.println("行数："+ps.getTotalElements());
        System.out.println("总页数"+ps.getTotalPages());
    }

    @Test
    public void tset3(){
        int m=userService.deletet("8777");
        System.out.println(m);
    }
    @Test
    public void tset4(){
        Tblstudent t=userService.updateshow("8888");
        System.out.print(t.getStuName());
    }

    @Test
    public void tset5(){
        Tblstudent t=new Tblstudent();
        t.setStuId("8888");
        t.setStuName("123");
        t.setStuSex("女");
        int m=userService.update(t);
        System.out.print(m+"==================================");
    }
}
