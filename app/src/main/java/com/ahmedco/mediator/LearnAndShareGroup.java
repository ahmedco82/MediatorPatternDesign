package com.ahmedco.mediator;

import java.util.ArrayList;
import java.util.List;

public class LearnAndShareGroup implements SocialMediaGroup{

    private List<Subscriber> subscribers;

    public LearnAndShareGroup(){

        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    @Override
    public void sendMessage(String msg, Subscriber senderSubscriber) {
       for(Subscriber subscriber:this.subscribers){
         /*
         * Sender should not receive message.
         */
         if(subscriber != senderSubscriber) {
               subscriber.receive(msg);
           }
        }
    }
}
