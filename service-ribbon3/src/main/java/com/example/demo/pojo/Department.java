package com.example.demo.pojo;

import java.io.Serializable;

/**
 * Department的POJO类
 *
 * @author Administrator 
 * @date 2018-02-05 17:45:09
 */
public class Department implements Serializable {

    /** 
     * serialVersionUID
     */
	private static final long serialVersionUID = -7768637914227571159L;

    /** 
     * id
     */
    private String id ;
    
    /** 
     * 部门名称
     */
    private String depname ;
    
    /** 
     * 父ID
     */
    private String depparentid ;
    
    /** 
     * 描述
     */
    private String depdesc ;
    
	/**虚拟主键*/
	private String mxVirtualId;
    /**
     * id的get方法
     * @return id
     */
    public String getId(){
        return id;
    }
    /**
     * id的set方法
     * @param id
     */
    public void setId(String id){
        if(id != null && id.trim().length() == 0){
        	this.id = null;
        }else{
        	this.id = id;
        }
	} 
    /**
     * 部门名称的get方法
     * @return depname
     */
    public String getDepname(){
        return depname;
    }
    /**
     * 部门名称的set方法
     * @param depname
     */
    public void setDepname(String depname){
		this.depname = depname;
	} 
    /**
     * 父ID的get方法
     * @return depparentid
     */
    public String getDepparentid(){
        return depparentid;
    }
    /**
     * 父ID的set方法
     * @param depparentid
     */
    public void setDepparentid(String depparentid){
		this.depparentid = depparentid;
	} 
    /**
     * 描述的get方法
     * @return depdesc
     */
    public String getDepdesc(){
        return depdesc;
    }
    /**
     * 描述的set方法
     * @param depdesc
     */
    public void setDepdesc(String depdesc){
		this.depdesc = depdesc;
	} 
	public String getMxVirtualId() {
        return this.mxVirtualId;
    }
    
    public void setMxVirtualId(String mxVirtualId) {
        this.mxVirtualId = mxVirtualId;
    } 
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object obj) {
        if (this == obj)
			return true;
		
        if (obj == null || !(obj instanceof Department))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		Department other = (Department) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (depname == null) {
			if (other.depname != null) {
				return false;
			}
		} else if (!depname.equals(other.depname)) {
			return false;
		}
		if (depparentid == null) {
			if (other.depparentid != null) {
				return false;
			}
		} else if (!depparentid.equals(other.depparentid)) {
			return false;
		}
		if (depdesc == null) {
			if (other.depdesc != null) {
				return false;
			}
		} else if (!depdesc.equals(other.depdesc)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "Department ["
			+ ", id=" + id
			+ ", depname=" + depname
			+ ", depparentid=" + depparentid
			+ ", depdesc=" + depdesc;
	}
   
    
    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}
}