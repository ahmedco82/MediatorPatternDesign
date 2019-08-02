package com.ahmedco.mediator;

public interface SocialMediaGroup {
    /*
   * Contract method for sending notification message
   */
    public void sendMessage(String msg, Subscriber user);
    /*
     * Contract method for add Subscriber
     */
    void addSubscriber(Subscriber user);
}
