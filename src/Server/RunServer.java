package Server;

public class RunServer {

    public static void main(String[] args) {
        Server s = new Server(9000);
        s.startServer();
    }
}
