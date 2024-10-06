//6610450951 ต้นตะวัน จันทร์ไทย
public class SWConEmailSystem {
    private UserList users;
    private EmailList emails;
    private User currentUser;

    //FilePaths
    private String userFilename;
    private String emailFilename;

    public SWConEmailSystem(String userFileName, String emailFilename) {
        this.userFilename = userFileName;
        this.emailFilename = emailFilename;

        loadUserData();
        loadEmailData();
    }

    public void loadUserData() {
        UserListFileDataSource userReader1 = new UserListFileDataSource(userFilename);
        users = userReader1.readData();
    }

    public void loadEmailData() {
        EmailListFileDataSource emailReader1 = new EmailListFileDataSource(emailFilename);
        emails = emailReader1.readData();
    }

    public User getCurrentUser() {
        return this.currentUser;
    }

    public void login(String username) {
        User exist = users.findUserByUsername(username);
        if (exist == null) {
            UserListFileDataSource userWriter1 = new UserListFileDataSource(userFilename);

            User newUser = new User(username);
            users.addUser(newUser);
            
            currentUser = newUser;
            userWriter1.writeData(users);
        } else {
            currentUser = users.findUserByUsername(username);
        }
    }

    public void logout() {
        this.currentUser = null;
    }

    public void sendEmail(String receiverName, String text) {
        if (users.findUserByUsername(receiverName) == null) {
            UserListFileDataSource userWriter1 = new UserListFileDataSource(userFilename);

            User newUser = new User(receiverName);
            users.addUser(newUser);

            userWriter1.writeData(users);
        }

        loadUserData();

        User receiver = users.findUserByUsername(receiverName); 
        Email newEmail = new Email(currentUser, receiver, text);

        emails.addEmail(newEmail);

        EmailListFileDataSource emailWriter1 = new EmailListFileDataSource(emailFilename);
        emailWriter1.writeData(emails);
        System.out.println("Email to " + receiverName + " is Sent");
    }

    public void readEmails() {
        //Current user should not be null
        for (Email x: emails.getEmails()) {
            if (x.getReceiver().getUsername().equals(currentUser.getUsername())) { 
                System.out.println("************");
                System.out.println(x);
            }
        }   
        System.out.println("************");
    }
}