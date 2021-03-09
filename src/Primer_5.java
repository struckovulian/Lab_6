import java.io.*;

public class Primer_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Users\\Sergeeva\\IdeaProjects\\Lab6\\Myfile1.txt"), "cp1251"));
            out = new PrintWriter("C:\\Users\\Sergeeva\\IdeaProjects\\Lab6\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
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

