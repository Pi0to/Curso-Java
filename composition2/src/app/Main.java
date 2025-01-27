package app;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country!";
        int likes = 12;

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(title, content, sdf.parse("21/06/2018 13:05:44"), likes);
        post1.addComment(c1);
        post1.addComment(c2);



        String title2 = "Good night guys";
        String content2 = "See you tomorrow";
        int likes2 = 5;

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post post2 = new Post(title2, content2, sdf.parse("28/07/2018 23:14:19"), likes2);
        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post1);
        System.out.println(post2);
    }
}