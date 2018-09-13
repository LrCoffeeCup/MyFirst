package com.services;


import com.dao.StudentDao;
import com.entity.StudentEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    StudentDao studentDao;
    public StudentEntity  find(int id){
        return  studentDao.find(id);
    }

}
