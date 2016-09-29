package com.mll.operation.core2.entity;

/**
 * 
 * @author jason
 */
public class Tblstudent {
	/**
	 *  
	 */
	private String stuId;
	/**
	 *  
	 */
	private String stuName;
	/**
	 *  
	 */
	private Integer stuAge;
	/**
	 *  
	 */
	private String stuSex;
	/**
	 *  
	 */
	private String stuPass;
	/**
	 *  
	 */
	private String cid;
	/**
	 * 
	 * @param stuId
	 */
	public void setStuId(String stuId){
		this.stuId = stuId;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuId(){
    	return stuId;
    }
	/**
	 * 
	 * @param stuName
	 */
	public void setStuName(String stuName){
		this.stuName = stuName;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuName(){
    	return stuName;
    }
	/**
	 * 
	 * @param stuAge
	 */
	public void setStuAge(Integer stuAge){
		this.stuAge = stuAge;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getStuAge(){
    	return stuAge;
    }
	/**
	 * 
	 * @param stuSex
	 */
	public void setStuSex(String stuSex){
		this.stuSex = stuSex;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuSex(){
    	return stuSex;
    }
	/**
	 * 
	 * @param stuPass
	 */
	public void setStuPass(String stuPass){
		this.stuPass = stuPass;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuPass(){
    	return stuPass;
    }
	/**
	 * 
	 * @param cid
	 */
	public void setCid(String cid){
		this.cid = cid;
	}
	
    /**
     * 
     * @return
     */	
    public String getCid(){
    	return cid;
    }
}