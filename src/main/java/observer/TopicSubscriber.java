package observer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TopicSubscriber implements Subscriber {
    private final String name;
    private final Subject topic;
    private String notification;

    @Override
    public void update() {
        this.notification = (String) topic.getUpdate(this);
    }

    public String getNotification() {
        if (notification.isEmpty()) {
            throw new IllegalStateException("There isn't any notification!");
        }

        return this.notification;
    }
}
