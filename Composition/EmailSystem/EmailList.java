//6610450951 ต้นตะวัน จันทร์ไทย
import java.util.ArrayList;

public class EmailList {
    private ArrayList<Email> emails;

    public EmailList() {
        emails = new ArrayList<>();
    }

    //Emails can duplicates
    public void addEmail(Email x) {
        emails.add(x);
    }

    public ArrayList<Email> getEmails() {
        return this.emails;
    }
}
