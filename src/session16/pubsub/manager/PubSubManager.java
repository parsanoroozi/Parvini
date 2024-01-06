package session16.pubsub.manager;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PubSubManager {

    private final static Map<String, Publisher> publishers = new HashMap<>();
    private final static Map<String, Subscriber> subscribers = new HashMap<>();

    public static <T> T getInstance(String name, String type) {
        if (type.equals(Publisher.class.getName())) {
            if (!publishers.containsKey(name)) publishers.put(name, new Publisher(name));
            customLogger("welcome to the market " + name);
            return (T) publishers.get(name);
        }
        if (type.equals(Subscriber.class.getName())) {
            if (!subscribers.containsKey(name)) subscribers.put(name, new Subscriber(name));
            customLogger("hello " + name);
            return (T) subscribers.get(name);
        }
        return null;
    }

    public static String subscribeManager(String publisherName, String subscriberName) {
        if (publishers.containsKey(publisherName)) {
            publishers.get(publisherName).AddSubscriber(subscribers.get(subscriberName));
            subscribers.get(subscriberName).addPublisher(publishers.get(publisherName));
            return publisherName + " has been added to "+subscriberName+"'s subscription list!";
        }
        return "publisher " +  publisherName + " doesn't exist";
    }

    static void customLogger(String message){
        System.out.println(new Date() + ": " + message);
    }
}


