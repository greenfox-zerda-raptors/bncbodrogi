import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.ArrayList;

class MainFrame extends JFrame {

    private JPanel container, textPane, buttonPane, datePane;
    private JButton newTask, checkTask, deleteTask, listTasks;
    private TextArea displayArea;
    private TextField year, month, day, field1, field2, field3, field4, field5;

    MainFrame(){

        this.setTitle("Todo List");
        this.setVisible(true);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int posX = (dim.width / 2) - (this.getWidth() / 2);
        int posY = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(posX, posY);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        container = new JPanel();
        container.setVisible(true);
        container.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));
        this.add(container);

        textPane = new JPanel();
        textPane.setVisible(true);
        textPane.setLayout(new BoxLayout(textPane, BoxLayout.PAGE_AXIS));
        container.add(textPane);

        buttonPane = new JPanel();
        buttonPane.setVisible(true);
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.PAGE_AXIS));
        container.add(buttonPane);

        displayArea = new TextArea();
        displayArea.setVisible(true);
        displayArea.setEditable(false);
        displayArea.setFocusable(false);
        displayArea.setText("Todo-s for the day: ");
        textPane.add(displayArea);

        datePane = new JPanel();
        datePane.setVisible(true);
        datePane.setLayout(new BoxLayout(datePane, BoxLayout.LINE_AXIS));
        textPane.add(datePane);

        newTask = new JButton();
        newTask.setVisible(true);
        newTask.setText("      New Task     ");
        newTask.addActionListener(
                new newTaskActionListener()
        );
        buttonPane.add(newTask);

        checkTask = new JButton();
        checkTask.setVisible(true);
        checkTask.addActionListener(
                new checkTaskActionListener()
        );
        checkTask.setText("Mark as \"done\"");
        buttonPane.add(checkTask);

        deleteTask = new JButton();
        deleteTask.setVisible(true);
        deleteTask.addActionListener(
                new deleteTaskActionListener()
        );
        deleteTask.setText("  Remove Task  ");
        buttonPane.add(deleteTask);

        listTasks = new JButton();
        listTasks.setVisible(true);
        listTasks.addActionListener(
                new listTaskActionListener()
        );
        listTasks.setText("     List Tasks     ");
        buttonPane.add(listTasks);

        year = new TextField();
        year.setText("YY");
        year.addFocusListener(
                new dateFieldFocusListener()
        );
        datePane.add(year);
        month = new TextField();
        month.setText("MM");
        month.addFocusListener(
                new dateFieldFocusListener()
        );
        datePane.add(month);
        day = new TextField();
        day.setText("DD");
        day.addFocusListener(
                new dateFieldFocusListener()
        );
        datePane.add(day);

        field1 = new TextField();
        textPane.add(field1);

        field2 = new TextField();
        textPane.add(field2);

        field3 = new TextField();
        textPane.add(field3);

        field4 = new TextField();
        textPane.add(field4);

        field5 = new TextField();
        textPane.add(field5);

        pack();

    }

    private void saveToMySql(ArrayList<Todo> todoList) throws SQLException{
        String databaseUrl = "jdbc:mysql://localhost:3306/todo?user=bncbodrogi&password=bodri666&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Todo.class);

        Dao<Todo, String> todoDao = DaoManager.createDao(connectionSource, Todo.class);

        for(Todo todo : todoList){
            createNewToDo(todoDao, todo);
        }

    }

    private void setDisplayAreaContent() throws SQLException{
        String databaseUrl = "jdbc:mysql://localhost:3306/todo?user=bncbodrogi&password=bodri666&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Todo.class);

        Dao<Todo, String> todoDao = DaoManager.createDao(connectionSource, Todo.class);

        todoDao.deleteById("");
        displayArea.setText(todoDao.queryForAll().toString());
    }

    private void removeSingleTask() throws SQLException{
        String databaseUrl = "jdbc:mysql://localhost:3306/todo?user=bncbodrogi&password=bodri666&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Todo.class);

        Dao<Todo, String> todoDao = DaoManager.createDao(connectionSource, Todo.class);

        todoDao.deleteById(field1.getText());

        setDisplayAreaContent();
    }

    private void checkSingleTask() throws SQLException{
        String databaseUrl = "jdbc:mysql://localhost:3306/todo?user=bncbodrogi&password=bodri666&serverTimezone=UTC";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Todo.class);

        Dao<Todo, String> todoDao = DaoManager.createDao(connectionSource, Todo.class);

        Todo tempTodo = todoDao.queryForId(field1.getText());
        todoDao.deleteById(field1.getText());
        tempTodo.setDone(true);
        todoDao.create(tempTodo);

        setDisplayAreaContent();
    }

    private static void createNewToDo(Dao<Todo, String> todoDao, Todo todo) throws SQLException {
        if(todoDao.queryForId(todo.getDate()) == null) {
            todoDao.create(todo);
        }
    }

    private void clearPresetInAllDateFields(){
        if(year.getText().equals("YY")) {
            year.setText(" ");
            month.setText(" ");
            day.setText(" ");
        }
    }

    private void setTodoList(){
        StringBuilder fullDateFormat = new StringBuilder();
        fullDateFormat.append(year.getText() + "/" + month.getText() + "/" + day.getText());
        String date = new String(fullDateFormat.toString());
        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo(date, field1.getText()));
        todoList.add(new Todo(date, field2.getText()));
        todoList.add(new Todo(date, field3.getText()));
        todoList.add(new Todo(date, field4.getText()));
        todoList.add(new Todo(date, field5.getText()));

        System.out.println(field1.getText());
        System.out.println(year.getText());
        System.out.println("todolist created");
        try {
            saveToMySql(todoList);
        }catch (SQLException e){
            System.out.println("Summing wrong with the accountant mate!");
        }
    }


    private class dateFieldFocusListener implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
            clearPresetInAllDateFields();
        }

        @Override
        public void focusLost(FocusEvent e) {

        }
    }

    private class newTaskActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            setTodoList();
        }
    }

    private class listTaskActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                setDisplayAreaContent();
            }catch (SQLException e2){
                System.out.println("Handling exceptions all day like a boss");
            }
        }
    }

    private class deleteTaskActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                removeSingleTask();
            }catch(SQLException e2){
                System.out.println("target not found");
            }
        }
    }

    private class checkTaskActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                checkSingleTask();
            }catch(SQLException e3){
                System.out.println("target not found");
            }
        }
    }
}
