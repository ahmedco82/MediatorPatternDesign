package com.ahmedco.mediator;

public abstract class Subscriber {

    protected SocialMediaGroup mediator;

    protected String name;

    public Subscriber(SocialMediaGroup med, String name){
        this.mediator=med;
        this.name=name;
    }
    /*
     * Contract method to send notification message.
     */
    public abstract void send(String msg);
    /*
     * Contract method to receive new notification message.
     */
    public abstract void receive(String msg);
}