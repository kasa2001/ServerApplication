import Listener.Server;

public class Main {

    public static void main(String[] args) {
        try {
            Server server = new Server(1025);
            server.listen();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
