package seminar6;

import java.util.Scanner;

public class InputFromConsole extends Order {
   
    public  InputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
    }
   
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
