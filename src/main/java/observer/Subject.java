package observer;

public interface Subject {
    void subscribe(Subscriber obj);
    void unsubscribe(Subscriber obj);
    void notifyObservers();
    Object getUpdate(Subscriber obj);
}
