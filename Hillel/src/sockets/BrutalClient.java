package sockets;

import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by RMysholovka on 26.11.2015.
 */
public class BrutalClient {
    public static void main(String[] args) throws IOException {
        new BrutalClient().start();

    }

    private void start() throws IOException {
        Socket socket = new Socket("192.168.1.157", 3111);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            writer.println(line);
            writer.flush();
        }
    }
}
