package UseeCase;

public interface TaskService {
    void createTask(String id, String description);
    void completTask(String id);
}
