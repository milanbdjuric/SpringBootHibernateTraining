package com.milanbdjuric.cruddemo.dao;

import com.milanbdjuric.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
