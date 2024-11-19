package com.oussama.BatchProcessing.Config;

import com.oussama.BatchProcessing.Student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {
        // All the business logic goes here
        student.setId(null);
        return student;
    }
}
