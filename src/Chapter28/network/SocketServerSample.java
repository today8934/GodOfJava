package Chapter28.network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {

    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startReplyServer();
    }

    public void startReplyServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999);
            while(true) {
                System.out.println("Server:Waiting for request.");
                client = server.accept();
                System.out.println("Server:Accepted.");
                OutputStream stream = client.getOutputStream();

                BufferedOutputStream out = new BufferedOutputStream(stream);
                out.write("OK".getBytes());
                out.close();
                stream.close();
                client.close();
                System.out.println("----------");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if(server != null) {
                try {
                    server.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
