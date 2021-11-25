package test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @author: yyx
 * @Title: DaliyTest
 * @ProjectName: Joker_LeetCode
 * @Description:
 * @date: 2021/9/27 17:42
 */
public class DaliyTest {
    public static void main(String[] args) {

        String fieldRange = "BASIC_INFO";
        String regex = "(?:\"" + fieldRange + "\":((\\{([^\\}]*)\\})|(\\[\\{.*?\\}\\])))";

        System.out.println(regex);

//        printHellow();

    }

    public void serve(int port) throws IOException {
        final ServerSocket socket = new ServerSocket(port);     //1
        try {
            for (; ; ) {
                final Socket clientSocket = socket.accept();    //2
                System.out.println("Accepted connection from " + clientSocket);

                new Thread(new Runnable() {                        //3
                    @Override
                    public void run() {
                        OutputStream out;
                        try {
                            out = clientSocket.getOutputStream();
                            out.write("Hi!\r\n".getBytes(Charset.forName("UTF-8"))); //4
                            out.flush();
                            clientSocket.close();                //5

                        } catch (IOException e) {
                            e.printStackTrace();
                            try {
                                clientSocket.close();
                            } catch (IOException ex) {
                                // ignore on close
                            }
                        }
                    }
                }).start();                                        //6
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
