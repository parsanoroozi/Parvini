package session16.pubsub.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subscriber {

    private String name;
    private List<Publisher> publishers = new ArrayList<>();

    Subscriber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private List<String> getPublishers() {
        return publishers.stream().map(publisher -> publisher.getName()).collect(Collectors.toList());
    }

    public void showPublishers(){
        PubSubManager.customLogger(this.name + " followings: " + getPublishers());
    }
    void addPublisher(Publisher p){
        publishers.add(p);
    }
    public void subscribe(String PublisherName){
        PubSubManager.customLogger(PubSubManager.subscribeManager(PublisherName, this.name));
    }
    void showPublishedMessage(String message, String publisherName){
        PubSubManager.customLogger(this.name+" gets: "+ message + " (by " + publisherName + ")");
    }

}
