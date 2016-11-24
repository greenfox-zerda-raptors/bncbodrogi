package ws01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HelloWorld extends JFrame{

    public HelloWorld(){

        this.setSize(400,400);
        this.setVisible(true);
        this.setTitle("Hello World");

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos);
        this.setResizable(true);

        JLabel label1 = new JLabel("this is a label");
        JPanel thePanel = new JPanel();
        thePanel.add(label1);

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

        label1.setText(addNewGreeting(hellos));
        this.add(thePanel);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public String addNewGreeting(String[] hellos){
        StringBuilder manyHellos = new StringBuilder();
        for(String hello : hellos){
            manyHellos.append(hello);
            manyHellos.append("\n");
        }
        return String.valueOf(manyHellos);
    }
}

