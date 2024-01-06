package session16.pubsub.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Publisher {
    private String name;
    private List<Subscriber> subscribers = new ArrayList();

    Publisher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private List<String> getSubscribers() {
        return subscribers.stream().map(subscriber -> subscriber.getName()).collect(Collectors.toList());
    }

    public void showSubscribers(){
        PubSubManager.customLogger(this.name + " subscribers: " + getSubscribers());
    }
    void AddSubscriber(Subscriber s){
        subscribers.add(s);
    }
    public void publish(String message){
        PubSubManager.customLogger(this.name+" published: " + message);
        subscribers.stream().forEach((Subscriber s) -> {s.showPublishedMessage(message, this.name);});
    }
}
