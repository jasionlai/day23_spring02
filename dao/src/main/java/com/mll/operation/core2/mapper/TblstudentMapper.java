package com.mll.operation.core2.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.mll.operation.core2.entity.Tblstudent;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface TblstudentMapper {

	boolean insertTblstudent(Tblstudent tblstudent);

	int deleteTblstudentByStuId(String stuId);

	int updateTblstudent(Tblstudent tblstudent);

	Page<Tblstudent> searchTblstudentByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Tblstudent> searchTblstudentByParams(@Param("map") Map<String, String> map);

} 
