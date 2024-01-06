package session16.pubsub;

import session16.pubsub.manager.PubSubManager;
import session16.pubsub.manager.Publisher;
import session16.pubsub.manager.Subscriber;

public class PubSubTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("pubsub:");

        Subscriber s1 = PubSubManager.getInstance("Alison", Subscriber.class.getName());
        Thread.sleep(1000);
        Subscriber s2 = PubSubManager.getInstance("Minerva", Subscriber.class.getName());
        Thread.sleep(1000);
        Subscriber s3 = PubSubManager.getInstance("Tom", Subscriber.class.getName());
        Thread.sleep(1000);
        Subscriber s4 = PubSubManager.getInstance("Sam", Subscriber.class.getName());
        Thread.sleep(1000);

        Publisher p1 = PubSubManager.getInstance("Google", Publisher.class.getName());
        Thread.sleep(1000);
        Publisher p2 = PubSubManager.getInstance("Microsoft", Publisher.class.getName());
        Thread.sleep(1000);
        Publisher p3 = PubSubManager.getInstance("Apple", Publisher.class.getName());
        Thread.sleep(1000);

        s1.subscribe("Pixar");
        Thread.sleep(1000);
        s1.subscribe("Google");
        Thread.sleep(1000);


        s2.subscribe("Google");
        Thread.sleep(1000);
        s2.subscribe("Microsoft");
        Thread.sleep(1000);

        p1.publish("we are now in the market");
        Thread.sleep(1000);

        p3.publish("Apple makes you live easier1");
        Thread.sleep(1000);

        s3.subscribe("Google");
        Thread.sleep(1000);
        s3.subscribe("Microsoft");
        Thread.sleep(1000);
        s3.subscribe("Apple");
        Thread.sleep(1000);
        s4.subscribe("Apple");
        Thread.sleep(1000);

        p1.publish("merry christmas");
        Thread.sleep(1000);

        p2.publish("have a good day google fans");
        Thread.sleep(1000);

        p3.publish("Apple makes you live easier2");
        Thread.sleep(1000);

        p1.showSubscribers();
        Thread.sleep(1000);
        p2.showSubscribers();
        Thread.sleep(1000);
        p3.showSubscribers();
        Thread.sleep(1000);

        s1.showPublishers();
        Thread.sleep(1000);
        s2.showPublishers();
        Thread.sleep(1000);
        s3.showPublishers();
        Thread.sleep(1000);
        s4.showPublishers();
        Thread.sleep(1000);



    }
}
