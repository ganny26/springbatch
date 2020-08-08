package com.example.demo.batch;

import com.example.demo.model.Student;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Writer implements ItemWriter<Student> {

    @Override
    public void write(List<? extends Student> students) throws Exception {
        for (Student item : students) {
            System.out.println("Current Student "+item.getName());
        }
    }
}
