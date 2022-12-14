package com.spring.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entities.Student;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    // save student
    @Transactional
    public int saveStudent(Student student) {
        Integer id = (Integer) this.hibernateTemplate.save(student);
        return id;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
