package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private List<Subscriber> observers;
    private String message;

    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void subscribe(Subscriber obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unsubscribe(Subscriber obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Subscriber::update);
    }

    @Override
    public Object getUpdate(Subscriber obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        this.message = msg;
        notifyObservers();
    }
}
