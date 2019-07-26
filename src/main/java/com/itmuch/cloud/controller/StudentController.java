package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.Student;
import com.itmuch.cloud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: StudentController <br/>
 * Description: <br/>
 * date: 2019/7/6 15:04<br/>
 *
 * @author yugan<br />
 * @since JDK 1.8
 */
@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    private Long id;

    /**
     * 根据用户ID获取一个用户entity
     * @param id 用户id
     * @return 返回一个student
     */
    @GetMapping("/simple/{id}")
    public Student findById(@PathVariable Long id){
        this.id = id;
        return studentRepository.findOne(id);
     }
}
