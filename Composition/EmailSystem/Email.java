//6610450951 ต้นตะวัน จันทร์ไทย
public class Email {
    private User sender;
    private User receiver;
    private String content;

    public Email(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    //Getter
    public User getSender() {
        return this.sender;
    }

    public User getReceiver() {
        return this.receiver;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String toString() {
        return "From: " + this.sender.getUsername() + "\n" + 
               "To: " + this.receiver.getUsername() + "\n" + 
               this.content;
    }
}
