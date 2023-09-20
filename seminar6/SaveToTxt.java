package seminar6;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToTxt extends Order{
    String fileName = "order.txt";


   public SaveToTxt(){
        
   }

   public  SaveToTxt(Order order){
    
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
}
}
