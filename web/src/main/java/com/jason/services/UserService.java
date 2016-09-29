package com.jason.services;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.mll.operation.core2.entity.Tblstudent;
import com.mll.operation.core2.mapper.TblstudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26.
 */
@Service
public class UserService {
    @Autowired
    TblstudentMapper tblstudentMapper;

    public UserService(){
        System.out.println("UserService构造方法");
    }

    public List<Tblstudent> show(){
        return tblstudentMapper.searchTblstudentByParams(null);
    }

    /**
     * 传递一个页数显示行数，进行分页查询
     * */
    public Page<Tblstudent> showmap(int page,int rowcount){

        PageRequest pg=new PageRequest(page,rowcount);
        Page<Tblstudent> data=tblstudentMapper.searchTblstudentByParams(null,pg);
        return data;
    }
    /**
     * 新增
     * */

    public boolean add(Tblstudent tblstudent){
        try{
            tblstudentMapper.insertTblstudent(tblstudent);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
    /**
     * 删除
     * */

    public int deletet(String  stuId){
        int mun=tblstudentMapper.deleteTblstudentByStuId(stuId);
        return mun;
    }

    /**
     * 获取当前id的详细信息
     * */

    public Tblstudent updateshow(String stuId){
        Map map=new HashMap();
        map.put("stuId",stuId);
        List<Tblstudent> list=tblstudentMapper.searchTblstudentByParams(map);
        if(list.size()==1){
            return list.get(0);
        }else{
            return null;
        }
    }
    /**
     * 修改
     * */

    public int update(Tblstudent tblstudent){
        try{
            int m=tblstudentMapper.updateTblstudent(tblstudent);
            if(m==1){
                return 1;
            }else{
                return -1;
            }
        }catch (Exception ex){
//            ex.printStackTrace();
            return -1;
        }


    }
 }
