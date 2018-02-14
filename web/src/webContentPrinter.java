import java.io.*;
import java.net.Socket;

public class webContentPrinter {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("www.baidu.com",80); //connect to this port, receive and send
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        pw.println("GET / HTTP/1.1");
        pw.println("HOST: www.baidu.com");
        pw.println("Content-Type: text/html");
        pw.println();
        pw.flush(); //Empty the buffer
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = "";
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
        pw.close();
        s.close();
    }
}
