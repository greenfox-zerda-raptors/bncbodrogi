
public class Person {
    private int age;
    private String name;

    public Person(){
        name = "Jozsi";
        age = 20;
    }


    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "My name is " + name + " and I'm " + age + " years old";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

