package com.example.demo.batch;

import com.example.demo.model.Student;
import org.springframework.batch.item.*;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.MultiResourceItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Processor implements ItemProcessor<Student,Student> {

    @Autowired
    MultiResourceItemReader multiResourceItemReader;

    @Autowired
    FlatFileItemReader flatFileItemReader;

    @Override
    public Student process(Student student) throws Exception {
        System.out.println("Do your process "+student.getId());
        return student;
    }


}
