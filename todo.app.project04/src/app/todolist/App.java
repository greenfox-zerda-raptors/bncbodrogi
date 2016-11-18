package app.todolist;

import java.util.ArrayList;

public class App {


    public static void main(String[] args) {

        ArrayList list = Lists.setTodoList();
        Lists.getHelpList();
        Lists.controlTaskList(list);



    }
}
