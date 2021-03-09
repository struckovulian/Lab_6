import java.io.*;

public class Variant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\Sergeeva\\IdeaProjects\\Lab6\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("C:\\Users\\Sergeeva\\IdeaProjects\\Lab6\\MyFile2.txt"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                String[] splitted = s.split("\\s+");
                for (String word: splitted) {
                    if ((word.charAt(word.length() - 1)) == (word.charAt(0))) {
                        out.write(word);
                    }
                }
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}