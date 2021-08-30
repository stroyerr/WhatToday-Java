package com.stroyer.WhatToday.Methods.Feed.Data;

import com.stroyer.WhatToday.Alerts.Alert;
import com.stroyer.WhatToday.Methods.User.User;

import java.util.ArrayList;
import java.util.List;

public class FeedPost {
    int id;
    public static String msg;
    public static User user;

    public static List<User> users = new ArrayList<User>();
    public static List<String> msgs = new ArrayList<String>();

    public static List<FeedPost> posts = new ArrayList<FeedPost>();

    public static List<FeedPost> fps = new ArrayList<FeedPost>();

    public static List<FeedPost> createList(){
        for (int i = 0; i < users.size(); i ++){
            FeedPost f = new FeedPost(users.get(i), msgs.get(i), 1);
            posts.add(f);
        }
        return posts;
    }

    public FeedPost(User user, String msg, int id){
        this.user = user;
        this.msg = msg;
        this.id = id;
    }

    public static void addFeedPost(User user, String msg){
        fps.set(fps.size(), new FeedPost(user, msg, 1));
    }
}
