package UseeCase;

public class ConsoleApp {
    public static void  main(String[] args){
        TaskRepository repo = new InMemoryTaskRepository();
        TaskService service = new TaskServiceImpl(repo);

        service.createTask("1", "estudar arquitetura exagonal");
        service.completTask("1");

        Task task = repo.finById("1");
        System.out.println("Tarefa: " + task.getDescription() + "  I Concluida: " + task.isCompleted());
    }
}
