package app.todolist;

public class Task {

    String description;
    boolean done;
    int lineNumber;
    static int counter = 0;

    public Task() {
        this.description = getClass().getName();
        done = false;
        counter++;
        lineNumber = counter;
        System.out.println("task has been created");
    }

    public Task (int lineNumber, String description){
        this.description =description;
        this.lineNumber = lineNumber;
        done=false;
    }

    public Task(String description) {
        this.description = description;
        done = false;
        counter++;
        lineNumber = counter;
        System.out.println("task " + description + " has been created");
    }

    public String toString(){
        if (done == true){
            return lineNumber + " - [X] " + description;
        }else{
            return lineNumber + " - [ ] " + description;
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone() {
        done = true;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }
}

