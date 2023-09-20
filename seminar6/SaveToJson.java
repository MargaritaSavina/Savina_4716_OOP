package seminar6;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson extends Order{
    String fileName = "order.json";


   public SaveToJson(){
        
   }

   public  SaveToJson(Order order){
    
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


   public String getFileName(){
    return fileName;
   }

}
