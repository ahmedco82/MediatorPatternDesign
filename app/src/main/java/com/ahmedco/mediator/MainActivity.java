package com.ahmedco.mediator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.mediator.test1.User;
/*
import com.ahmedco.mediator.test2.ChatRoom;
import com.ahmedco.mediator.test2.ChatUser;
import com.ahmedco.mediator.test2.IChatRoom;
import com.ahmedco.mediator.test2.User;
*/


// MainActivity is MediatorPatternDemo

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  Test2();
        //  Test1();
        Test3();
    }

    private void Test3() {
        // https://www.codenuclear.com/mediator-design-pattern-in-java/
        SocialMediaGroup mediator = new LearnAndShareGroup();
        /*
         * Creating a Subscribers
         */
        Subscriber subscriber1 = new SubscriberImpl(mediator, "John");
        Subscriber subscriber2 = new SubscriberImpl(mediator, "Smith");
        Subscriber subscriber3 = new SubscriberImpl(mediator, "Greg");
        Subscriber subscriber4 = new SubscriberImpl(mediator, "Devin");
        mediator.addSubscriber(subscriber1);
        mediator.addSubscriber(subscriber2);
        mediator.addSubscriber(subscriber3);
        mediator.addSubscriber(subscriber4);
        subscriber1.send("Learn Design Patterns.");
    }


    private void Test1(){
        
        //https://www.tutorialspoint.com/design_pattern/mediator_pattern
        /*
        multiple users can send message to chat room
        and it is the responsibility of chat room
        to show the messages to all users
        */
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }


    private void Test2(){
        // https://howtodoinjava.com/design-patterns/behavioral/mediator-pattern/
        /*
        IChatRoom chatroom = new ChatRoom();
        User user1 = new ChatUser(chatroom,"1","Alex");
        User user2 = new ChatUser(chatroom,"2", "Brian");
        User user3 = new ChatUser(chatroom,"3", "Charles");
        User user4 = new ChatUser(chatroom,"4", "David");
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);
        user1.send("Hello brian","2");
        user2.send("Hey buddy","1");
        */
    }
}
