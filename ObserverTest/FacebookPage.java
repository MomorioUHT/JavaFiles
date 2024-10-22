import java.util.ArrayList;

public class FacebookPage implements Subject {
    private String pageName;
    private ArrayList<Observer> observers;
    private ArrayList<String> posts;

    public FacebookPage(String name) {
        observers = new ArrayList<Observer>();
        posts = new ArrayList<String>();
        this.pageName = name;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String data) {
        for (Observer o : observers) {
            o.update(data);
        }
    }

    public void post(String message) {
        posts.add(message);
        notifyObservers(message);
    }

    //Optional
    public String getPageName() {
        return pageName;
    }
}
