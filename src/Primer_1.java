import java.io.*;

public class Primer_1{
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\Users\\Sergeeva\\IdeaProjects\\Lab6\\MyFile1.txt");
            out = new FileWriter("C:\\Users\\Sergeeva\\IdeaProjects\\Lab6\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte=in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!");
        }
        finally {
            in.close();
            assert out != null;
            out.close();
        }
    }
}
