package UseeCase;

import Dominio.Task;

public interface TaskRepository {
    void save(Task Task);
    Task finById(String id);
}
