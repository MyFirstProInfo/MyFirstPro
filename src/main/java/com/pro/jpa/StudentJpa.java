package com.pro.jpa;

import com.pro.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by wangjinyu on 2018/11/16 17:54.
 */
@Repository
public interface StudentJpa extends JpaRepository<StudentEntity,Long>,
        JpaSpecificationExecutor<StudentEntity>,Serializable {

}
