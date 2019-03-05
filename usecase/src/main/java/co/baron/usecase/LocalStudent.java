package co.baron.usecase;

import co.baron.data.StudentRepository;
import co.baron.domain.Student;

/**
 * Created by asad on 05/03/19.
 */

public class LocalStudent {
    private StudentRepository studentRepository;

    public LocalStudent(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getLocalStd() {
        return studentRepository.getLocalStudent();
    }
}
