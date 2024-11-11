public class Post {
    private String content;
    private User author;
    private int likes;

    public Post(String content, User author) {
        this.content = content;
        this.author = author;
        this.likes = 0; //always starts at 0
    }



    public void like(User user) {
        System.out.println(user + " liked a post!");
       likes++;
    }

    public void getPost() {
        System.out.println("---- [ POST ] ----");
        System.out.println("Likes: " + likes);
        System.out.println("Author: " + author);
        System.out.println(content);
        System.out.println("-------------------");
    }

    @Override
    public String toString() {
        return "\n---- [ POST ] ----" +
                "\nLikes: " + likes +
                "\nAuthor: " + author+
                "\n" + content +
                "\n-------------------";

    }

}
