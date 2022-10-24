import java.awt.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;







import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your age is " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + " cm tall");
    }
}


