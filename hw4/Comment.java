package teach.homework.hw4;

public class Comment {
    String comment;
    String author;

    public Comment(String comment, String author) {
        this.comment = comment;
        this.author = author;
    }
    public void printCommentInfo(){
        System.out.println(comment + author);
    }
}
