package com.example.demo.pojo;

import java.io.Serializable;

/**
 * Employee的POJO类
 *
 * @author Administrator 
 * @date 2018-02-05 17:46:04
 */

public class Employee implements Serializable {

    /** 
     * serialVersionUID
     */
	private static final long serialVersionUID = -7768637914227571159L;

    /** 
     * id
     */
    private String id ;
    
    /** 
     * 部门ID
     */
    private String depid ;
    
    /** 
     * 员工姓名
     */
    private String name ;
    
    /** 
     * 员工编号
     */
    private String num ;
    
    /** 
     * 年龄
     */
    private Integer age ;
    
    /** 
     * 性别
     */
    private Integer sex ;
    
    /** 
     * 地址
     */
    private String address ;
    
    /** 
     * 电话
     */
    private String tel ;
    
    /** 
     * 入职时间
     */
    private String inductiontime ;
    
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
     * 部门ID的get方法
     * @return depid
     */
    public String getDepid(){
        return depid;
    }
    /**
     * 部门ID的set方法
     * @param depid
     */
    public void setDepid(String depid){
		this.depid = depid;
	} 
    /**
     * 员工姓名的get方法
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * 员工姓名的set方法
     * @param name
     */
    public void setName(String name){
		this.name = name;
	} 
    /**
     * 员工编号的get方法
     * @return num
     */
    public String getNum(){
        return num;
    }
    /**
     * 员工编号的set方法
     * @param num
     */
    public void setNum(String num){
		this.num = num;
	} 
    /**
     * 年龄的get方法
     * @return age
     */
    public Integer getAge(){
        return age;
    }
    /**
     * 年龄的set方法
     * @param age
     */
    public void setAge(Integer age){
		this.age = age;
	} 
    /**
     * 性别的get方法
     * @return sex
     */
    public Integer getSex(){
        return sex;
    }
    /**
     * 性别的set方法
     * @param sex
     */
    public void setSex(Integer sex){
		this.sex = sex;
	} 
    /**
     * 地址的get方法
     * @return address
     */
    public String getAddress(){
        return address;
    }
    /**
     * 地址的set方法
     * @param address
     */
    public void setAddress(String address){
		this.address = address;
	} 
    /**
     * 电话的get方法
     * @return tel
     */
    public String getTel(){
        return tel;
    }
    /**
     * 电话的set方法
     * @param tel
     */
    public void setTel(String tel){
		this.tel = tel;
	} 
    /**
     * 入职时间的get方法
     * @return inductiontime
     */
    public String getInductiontime(){
        return inductiontime;
    }
    /**
     * 入职时间的set方法
     * @param inductiontime
     */
    public void setInductiontime(String inductiontime){
		this.inductiontime = inductiontime;
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
		
        if (obj == null || !(obj instanceof Employee))
	        return false; 
	        
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (depid == null) {
			if (other.depid != null) {
				return false;
			}
		} else if (!depid.equals(other.depid)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (num == null) {
			if (other.num != null) {
				return false;
			}
		} else if (!num.equals(other.num)) {
			return false;
		}
		if (age == null) {
			if (other.age != null) {
				return false;
			}
		} else if (!age.equals(other.age)) {
			return false;
		}
		if (sex == null) {
			if (other.sex != null) {
				return false;
			}
		} else if (!sex.equals(other.sex)) {
			return false;
		}
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (tel == null) {
			if (other.tel != null) {
				return false;
			}
		} else if (!tel.equals(other.tel)) {
			return false;
		}
		if (inductiontime == null) {
			if (other.inductiontime != null) {
				return false;
			}
		} else if (!inductiontime.equals(other.inductiontime)) {
			return false;
		}
		return true;
	}
    
    /**
     * toString方法
     * @return String
     */
	public String toString(){
		return "Employee ["
			+ ", id=" + id
			+ ", depid=" + depid
			+ ", name=" + name
			+ ", num=" + num
			+ ", age=" + age
			+ ", sex=" + sex
			+ ", address=" + address
			+ ", tel=" + tel
			+ ", inductiontime=" + inductiontime;
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