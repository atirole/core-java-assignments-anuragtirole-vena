package Level_9_collectors_and_summarization;


// 47. From a list of comments, count the number of comments by each user.

import java.util.*;
import java.util.stream.*;

public class Problem47
{
    static class Comment
    {
        private String user;
        private String text;

        public Comment(String user, String text)
        {
            this.user = user;
            this.text = text;
        }

        public String getUser()
        {
            return user;
        }
    }

    public static void main(String[] args)
    {
        List<Comment> comments = Arrays.asList(
                new Comment("Anurag", "Nice post!"),
                new Comment("Sandeep", "Thanks for sharing."),
                new Comment("Anurag", "Very helpful."),
                new Comment("Ayushi", "Great explanation."),
                new Comment("Anurag", "Loved it!")
        );

        Map<String, Long> commentCount = comments.stream()
                .collect(Collectors.groupingBy(Comment::getUser, Collectors.counting()));

        commentCount.forEach((user, count) -> System.out.println(user + " → " + count));
    }
}

