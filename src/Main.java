import Frame.ServerFrame;
import Listener.Server;

public class Main {

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new ServerFrame());

            thread.start();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
