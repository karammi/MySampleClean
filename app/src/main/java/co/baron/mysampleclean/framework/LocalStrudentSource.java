package co.baron.mysampleclean.framework;

import co.baron.data.LocalSource;
import co.baron.domain.Student;

/**
 * Created by asad on 05/03/19.
 */

public class LocalStrudentSource implements LocalSource {

    @Override
    public Student getFromDataBase() {
        return new Student(210, "ali", "Daie");
    }
}
