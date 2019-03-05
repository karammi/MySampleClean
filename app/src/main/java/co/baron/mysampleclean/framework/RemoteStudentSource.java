package co.baron.mysampleclean.framework;

import co.baron.data.LocalSource;
import co.baron.data.RemoteSource;
import co.baron.domain.Student;

/**
 * Created by asad on 05/03/19.
 */

public class RemoteStudentSource implements RemoteSource {

    @Override
    public Student getFromServer() {
        return new Student(120,"bill","gates");
    }
}
