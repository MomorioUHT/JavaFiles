//6610450951 ต้นตะวัน จันทร์ไทย
public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    //Setter
    public void setUsername(String username) {
        this.username = username;
    }
    //Getter
    public String getUsername() {
        return this.username;
    }

    //Checks
    public boolean isUsername(String check) {
        return check.equals(this.username);
    }
}
