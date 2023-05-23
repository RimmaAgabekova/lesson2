package Task1;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void write(){
        String str = createString();
        System.out.println(str.length());
        try(FileWriter writer = new FileWriter("work.txt");) {
            writer.write(str);
        } catch (IOException e) {
            throw new FileWriteException(e.getMessage());
        }
    }
    private static String createString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append("TEST");
        }
        return builder.toString();
    }
}
