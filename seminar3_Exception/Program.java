package seminar3_Exception;

import java.beans.IntrospectionException;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запись в формате: \n ФИО дд.мм.гггг номер телефона пол \n");
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        if (strings.length != 6) {
            System.out.println("Код ошибки : -1 \n Данные введены не по образцу.");
        } else {
            try (FileWriter writer = new FileWriter(new File(strings[0]))){
                String surname = strings[0];
                String name = strings[1];
                String patronymic = strings[2];
                String data = strings[3];
                int phone = Integer.parseInt(strings[4]);
                String gender = strings[5];

                if (!(gender.equals("f") ||  gender.equals("m"))) throw new RuntimeException("Пол введен некорректно.");

                writer.write(str);
            } catch(NumberFormatException e) {
                System.out.println("Номер телефона ввден некорректно.");
                e.printStackTrace();
            }
            catch(RuntimeException e) {
                e.getMessage();
                e.printStackTrace();
            }
            catch(Exception e) {
                e.printStackTrace();
            }



        }
    }
    
}
