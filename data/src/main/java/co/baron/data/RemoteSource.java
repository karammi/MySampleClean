package co.baron.data;

import co.baron.domain.Student;

/**
 * Created by asad on 05/03/19.
 */

public interface RemoteSource {

    Student getFromServer();
}
