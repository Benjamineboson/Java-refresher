package se.lexicon.model;

public class Todo {
    private final int todold;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(int todold, String description) {
        this.todold = todold;
        this.description = description;
    }

    public int getTodold() {
        return todold;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
