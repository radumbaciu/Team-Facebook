package com.facebook;

import com.facebook.comms.CommRepository;
import com.facebook.comms.Comment;
import com.facebook.generic.GenericEntity;
import com.facebook.generic.GenericRepository;
import com.facebook.posts.Post;
import com.facebook.posts.PostsRepository;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        newsFeed();
    }

    public static void newsFeed() throws IOException {
        int n = 5;
        PostsRepository postsRepository = new PostsRepository();
        List<GenericEntity> newsFeed = postsRepository.get(n, Post.POST_REPOSITORY_PATH);

        int i = 1;
        for (GenericEntity post : newsFeed) {
            System.out.print(i + ". ");
            System.out.println(post);
            System.out.println("Like or Comment");

            List<Comment> postComments = CommRepository.getCommentsForPost(post.getId());
            for (Comment c : postComments) {
                System.out.println("\t -" + c);
            }
            System.out.println();
            i++;
        }

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("In order to Like Or Comment a post, please indicate first the number of the Post that you wish to Like or Comment: ");
        int postNr = in.nextInt();
        System.out.println("Now please choose which action you want to perform for the selected post: 1 for Like, 2 for Comment: ");
        int actionNr = in.nextInt();

        if (postNr < 1 || postNr > n) return;

        Post post = (Post) newsFeed.get(postNr-1);
        if (actionNr == 1) {
            post.like();
            GenericRepository.updateEntity(post);
            newsFeed();
        } else if (actionNr == 2) {
            post.comm();
            System.out.println("Please type your comment: ");
            String comm = in.next();
            int commId = GenericRepository.count(Comment.COMM_REPOSITORY_PATH);

            Comment comment = new Comment(commId, post.getId(), comm);
            GenericRepository.saveEntity(comment);
            GenericRepository.updateEntity(post);
            newsFeed();
        }
    }
}
