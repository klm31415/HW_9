import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        readFile("INFO");
   }

    static String path = "C:\\Users\\klm\\IdeaProjects\\HW_9\\src\\textLog.log";
    public static void readFile(String logLevel) throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String line;
        while ((line = reader.readLine()) != null) {
            if(line.contains(logLevel)) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        System.out.println("Результат запроса:");
        System.out.println(resultStringBuilder.toString());
    }
}