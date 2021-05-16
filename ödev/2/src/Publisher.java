import java.util.ArrayList;

public class Publisher implements ISubject{

    private ArrayList<IObserver> subscribers=new ArrayList<>();

    @Override
    public void attach(IObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(IObserver observer:subscribers)
            observer.update(message);
    }
}
