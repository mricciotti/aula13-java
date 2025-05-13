package Dominio;

public class Task {
    private String id;
    private String description;
    private boolean completed;

    public Task(String id, String description){
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public void markAsCompleted(){
        this.completed = true;
    }

    //getters e setters

}
