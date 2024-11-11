import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> friends;
    private ArrayList<Post> post;

    public User(String username){
        this.username = username;
        friends = new ArrayList<>(); //every user has a friend list
        post = new ArrayList<>(); //same as above just with post
    }

    //add friend to array (friendlist) if users is not already friends
    public void addFriend (User user){
        if (!friends.contains(user) && user != this) {
            friends.add(user);
            System.out.println(username + " is now friends with " + user.getUsername());
        } else {
            System.out.println("You're already friends with " + user.getUsername());
        }
    }

    //method to create post
    public void createPost (String content){
        Post newPost = new Post(content, this); //makes a new post with given content
        post.add(newPost); //adds post to post list
        System.out.println(username + " created a new post!");
    }

    public ArrayList<Post> getPost(){
        return post;
    }

    public ArrayList<User> getFriends(){
        return friends;
    }

    public String getUsername(){
        return username;
    }

@Override
    public String toString(){
        return username;
}

}
