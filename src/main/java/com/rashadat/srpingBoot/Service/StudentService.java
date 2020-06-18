package com.rashadat.srpingBoot.Service;

import com.rashadat.srpingBoot.Dao.StudentDao;
import com.rashadat.srpingBoot.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;


    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();

    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
    studentDao.insertStudentToDb(student);
    }
}
