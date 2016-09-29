package com.mll.operation.core2.vo;

/**
 * 
 * @author jason
 */
public class TblclassVo {
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
     * @return Integer
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
     * @return String
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
     * @return String
     */	
    public String getCteacherId(){
    	return cteacherId;
    }
}