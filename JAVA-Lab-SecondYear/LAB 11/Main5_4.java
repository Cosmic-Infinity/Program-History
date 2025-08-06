/*
 * 5.4. Write a Java program to simulate a simple chat system, where one thread is the sender 
 * and another is the receiver, using wait() and notify().
 */
public class Main5_4 {
    public static void main(String[] args) {
        Chat chat = new Chat();
        // Sender thread
        Thread sender = new Thread(() -> chat.send(), "Sender");
        // Receiver thread
        Thread receiver = new Thread(() -> chat.receive(), "Receiver");

        sender.start();
        receiver.start();
    }
}

class Chat {
    private boolean messageSent = false; // Indicates if a message has been sent

    public synchronized void send() {
        String[] messages = { "Hi!", "How are you?", "I'm doing great!", "Bye!" };

        for (String message : messages) {
            while (messageSent) {
                try {
                    wait(); // Wait if the previous message has not been received
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " says: " + message);
            messageSent = true;
            notify(); // Notify the receiver
        }
    }

    public synchronized void receive() {
        for (int i = 0; i < 4; i++) { // Assuming the sender sends 4 messages
            while (!messageSent) {
                try {
                    wait(); // Wait if no new message is available
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " received the message.");
            messageSent = false;
            notify(); // Notify the sender
        }
    }
}
