/*package app.todolist;


import java.io.File;
import java.util.Scanner;


public class FileReader {

    private Scanner fileInput;

    public void openFile(){
        try{
            fileInput = new Scanner(new File("todolist.txt"));
        }
        catch (Exception e){
            System.out.println("No such file!");
        }
    }

    public void readFile(){
        while(fileInput.hasNext()){
            String  = fileInput.next();
            String empty = fileInput.next();
            String done = fileInput.next();
            String description = fileInput.next();

            Task task = new Task(UserInput.getUserInput());

            Lists.addToTodoList(Lists.setTodoList(), task);

        }
    }



}
*/