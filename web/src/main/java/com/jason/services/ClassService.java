package com.jason.services;

import com.mll.operation.core2.entity.Tblclass;
import com.mll.operation.core2.mapper.TblclassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */
@Service
public class ClassService {
    @Autowired
    private TblclassMapper tblclassMapper;

    public List<Tblclass> showList(){
        return tblclassMapper.searchTblclassByParams(null);
    }
}
