

public class User implements Observer {
    private String name;

    public void follow(Subject s) {
        s.addObserver(this);
    }

    @Override
    public void update(String data) {
        System.out.println("Message: " + data);
    }

    //Optional
    public String getUsername() {
        return name;
    }
}
