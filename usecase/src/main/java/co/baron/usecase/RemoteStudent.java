package co.baron.usecase;

import co.baron.data.StudentRepository;
import co.baron.domain.Student;

/**
 * Created by asad on 05/03/19.
 */

public class RemoteStudent {
    private StudentRepository studentRepository;

    public RemoteStudent(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getServerStd() {
        return studentRepository.getServerStudent();
    }
}
