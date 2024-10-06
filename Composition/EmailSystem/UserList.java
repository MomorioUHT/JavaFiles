//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;

public class UserList {
    private ArrayList<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public User findUserByUsername(String username) {
        for (User x: users) {
            if (x.isUsername(username)) {
                return x;
            }
        }
        return null;
    }

    public void addUser(User x) {
        User exist = findUserByUsername(x.getUsername());
        if (exist == null) {
            users.add(x);
        }
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }
}