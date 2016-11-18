package app.todolist;

import java.util.ArrayList;


public class Lists {


    public static ArrayList<String> setHelpList(){
        ArrayList <String> help = new ArrayList<>();
        help.add("CLI Todo application");
        help.add("====================");
        help.add("Available commands:");
        help.add("list       Lists all the tasks");
        help.add("l          shorthand for list");
        help.add("add        Adds a new task");
        help.add("a          shorthand for add");
        help.add("remove     Removes an task");
        help.add("r          shorthand for remove");
        help.add("complete   Completes an task");
        help.add("c          shorthand for complete");
        help.add("help       Print out this list again");
        help.add("h          shorthand for help");
        return help;
    }

    public static void getHelpList() {
        for (String listElement : Lists.setHelpList()){
            System.out.println(listElement);
        }
    }

    public static ArrayList<Task> setTodoList() {
        ArrayList<Task> todoList = new ArrayList<>();
        return todoList;
    }

    public static ArrayList<Task> addToTodoList(ArrayList<Task> todoList, Task task){
        todoList.add(task);
        return todoList;
    }

    public static void getTodoList(ArrayList<Task> todoList) {
        for (Task taskElement : todoList) {
            System.out.println(taskElement.toString());
        }
    }


    public static void controlTaskList(ArrayList<Task> todoList) {
        boolean control = true;
        do{
            String userInput = UserInput.getUserInput();
            if(userInput.substring(0, userInput.length()).contains("add") || userInput.substring(0, 1).contains("a")) {
                System.out.println("Enter a new task:");
                Task task = new Task(UserInput.getUserInput());
                addToTodoList(todoList, task);
            }else if(userInput.substring(0, userInput.length()).contains("list") || userInput.substring(0, 1).contains("l")) {
                getTodoList(todoList);
            }else if(userInput.substring(0, userInput.length()).contains("remove") || userInput.substring(0, 1).contains("r")) {
                System.out.println("Enter the number of the task you wish to remove:");
                todoList.remove(Integer.parseInt(UserInput.getUserInput()));
            }else if(userInput.substring(0, userInput.length()).contains("complete") || userInput.substring(0, 1).contains("c")) {
                System.out.println("Enter the number of the task you wish to mark as complete:");
                todoList.get(Integer.parseInt(UserInput.getUserInput())-1).setDone();
            }else if(userInput.substring(0, userInput.length()).contains("help") || userInput.substring(0, 1).contains("h")) {
                getHelpList();
            }else if(userInput.substring(0, userInput.length()).contains("quit") || userInput.substring(0, 1).contains("q")){
                control = false;
            }
        }while(control == true);
    }
}

