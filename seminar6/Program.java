package seminar6;

public class Program {

    /**
     * TODO: Переработать приложение в рамках принципа SRP
     * @param args
     */
    public static void main(String[] args) {

        
        InputFromConsole console = new InputFromConsole();
        Order order = console;
        SaveToJson file1 = new SaveToJson(console);
        SaveToTxt file2 = new SaveToTxt(console);
         
        
        

    }

}
