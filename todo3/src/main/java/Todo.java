import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;

@DatabaseTable
class Todo {

    @DatabaseField(id = true)
    private String name;
    @DatabaseField
    private String date;
    @DatabaseField
    private boolean isDone;

    Todo(){
    }

    Todo (String date, String name){
        this.name = name;
        this.date = date;
        isDone = false;
    }

    String getDate(){
        return this.date;
    }

    String getName(){
        return this.name;
    }

    public String toString() {

        if (isDone) {
            return "[X] " + this.name + " due on:   " + this.date + "\n";
        } else {
            return "[ ] " + this.name + " due on:   " + this.date + "\n";
        }
    }

    void setDone(boolean done) {
        isDone = done;
    }

    public static ArrayList createTodoList(String date, String ... todos){
        ArrayList<Todo> todoList = new ArrayList<>();
        for(String todo : todos){
            todoList.add(new Todo(date, todo));
        }
        return todoList;
    }
}
