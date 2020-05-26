package teach.homework.hw4;

public class Post {
    String authorOfPost;
    String text;
    Comment [] comment = new Comment[3];

    public Post(String authorOfPost, String text) {
        this.authorOfPost = authorOfPost;
        this.text = text;
    }
    public void printPostInfo(){
        System.out.println(authorOfPost + text);
    }
}
