package co.baron.data;

import co.baron.domain.Student;

/**
 * Created by asad on 05/03/19.
 */

public class StudentRepository {
    private LocalSource localSource;
    private RemoteSource remoteSource;

    public StudentRepository(LocalSource localSource, RemoteSource remoteSource) {
        this.localSource = localSource;
        this.remoteSource = remoteSource;
    }


    public Student getLocalStudent() {
        return localSource.getFromDataBase();
    }

    public Student getServerStudent() {
        return remoteSource.getFromServer();
    }
}
