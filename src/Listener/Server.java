package Listener;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

    private ServerSocket server;

    public Server(int port) throws IOException {
        this.server = new ServerSocket(port);
    }

    public void listen() throws IOException {

        while (true) {
            Socket client = this.server.accept();
            int port = client.getPort();
            System.out.println(port);
            client.close();
        }

    }

    public void run() {
        try {
            this.listen();
        } catch (Exception e) {

        }
    }
}
