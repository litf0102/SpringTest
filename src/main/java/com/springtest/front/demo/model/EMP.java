package com.springtest.front.demo.model;

import java.sql.Timestamp;

public class EMP {
	
    private String id;
    private String name;
    private String sex;
    private Timestamp createDate;
    private String deptCd;
    private String deptName;

    public EMP() {
    	
    }
    
    public EMP(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex= sex;
    }
    
    public EMP(String id, String name, String sex, Timestamp createDate) {
        this.id = id;
        this.name = name;
        this.sex= sex;
        this.createDate = createDate;
    }
    
    public EMP(String id, String name, String sex, Timestamp createDate, String deptName) {
        this.id = id;
        this.name = name;
        this.sex= sex;
        this.createDate = createDate;
    }
    
    public EMP(String id, String name, String sex, Timestamp createDate, String deptCd, String deptName) {
        this.id = id;
        this.name = name;
        this.sex= sex;
        this.createDate = createDate;
        this.deptCd = deptCd;
        this.deptName = deptName; 
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getSex() {
        return sex;
    }    

    public Timestamp getCreateDate() {
        return createDate;
    }    

    public String getDeptCd() {
        return deptCd;
    }
    
    public String getDeptName() {
        return deptName;
    }
}
