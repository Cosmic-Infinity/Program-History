/*
 * 5.8. Write a program that simulates a server-client interaction where the server thread 
 * waits for the client to send a message before responding, using wait() and notify().
 */
public class Main5_8 {
    public static void main(String[] args) {
        ServerClient serverClient = new ServerClient();

        // Client thread
        Thread client = new Thread(() -> serverClient.sendMessage("Hello, Server!"), "Client");

        // Server thread
        Thread server = new Thread(() -> serverClient.respondMessage(), "Server");

        client.start();
        server.start();
    }
}

class ServerClient {
    private String message = null;

    // Client sends a message to the server
    public synchronized void sendMessage(String msg) {
        System.out.println(Thread.currentThread().getName() + " is sending a message...");
        message = msg;
        System.out.println(Thread.currentThread().getName() + " sent: " + msg);
        notify(); // Notify the server that a message is available
    }

    // Server responds to the message
    public synchronized void respondMessage() {
        while (message == null) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting for a message...");
                wait(); // Wait until the client sends a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " received the message and is responding...");
        System.out.println(Thread.currentThread().getName() + " response: Message received!");
    }
}
