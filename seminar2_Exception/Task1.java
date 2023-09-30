package seminar2_Exception;
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.println("Введите число: ");
            String str = scanner.nextLine();
            float num = Float.parseFloat(str);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Данные некорректны, попробуйте еще раз.");
            String str = scanner.nextLine();
            float num = Float.parseFloat(str);
            System.out.println(num);
           
        } 
    
    
        
    



}
//     public static float NumInput (){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Введите число: ");
//         String str = scanner.nextLine();
//         float num = Float.parseFloat(str);
//         return num;
//         }

}