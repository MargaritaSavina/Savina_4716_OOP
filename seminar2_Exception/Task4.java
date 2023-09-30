package seminar2_Exception;
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
           
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println(str);
        if (str == "") throw new RuntimeException("Пустую строку вводить нельзя.");
}      
}
