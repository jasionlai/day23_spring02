package com.mll.operation.core2.entity;

/**
 * 
 * @author jason
 */
public class Tblclass {
	/**
	 *  
	 */
	private Integer cid;
	/**
	 *  
	 */
	private String cname;
	/**
	 *  
	 */
	private String cteacherId;
	/**
	 * 
	 * @param cid
	 */
	public void setCid(Integer cid){
		this.cid = cid;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getCid(){
    	return cid;
    }
	/**
	 * 
	 * @param cname
	 */
	public void setCname(String cname){
		this.cname = cname;
	}
	
    /**
     * 
     * @return
     */	
    public String getCname(){
    	return cname;
    }
	/**
	 * 
	 * @param cteacherId
	 */
	public void setCteacherId(String cteacherId){
		this.cteacherId = cteacherId;
	}
	
    /**
     * 
     * @return
     */	
    public String getCteacherId(){
    	return cteacherId;
    }
}