package com.pro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by wangjinyu on 2018/11/16 17:45.
 */
@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {
    private static final long serialVersionUID = 1765448038504284337L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "stuName")
    private String stuName;

    @Column(name = "stuNUm")
    private String stuNUm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNUm() {
        return stuNUm;
    }

    public void setStuNUm(String stuNUm) {
        this.stuNUm = stuNUm;
    }
}
