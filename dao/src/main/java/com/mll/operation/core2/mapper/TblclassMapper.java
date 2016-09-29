package com.mll.operation.core2.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.mll.operation.core2.entity.Tblclass;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface TblclassMapper {

	void insertTblclass(Tblclass tblclass);

	void deleteTblclassByCid(Integer cid);

	void updateTblclass(Tblclass tblclass);

	Page<Tblclass> searchTblclassByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Tblclass> searchTblclassByParams(@Param("map") Map<String, String> map);

} 
