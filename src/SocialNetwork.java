import java.util.ArrayList;

public class SocialNetwork {
    private ArrayList<User> users;

    public SocialNetwork() {
        users = new ArrayList<>();
    }

    //adds user to network
    public String addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            return user.getUsername() + " has joined the social network.";
        } else {
            return user.getUsername() + " is already in the network.";
        }
    }

    public void showFriendsPosts(User user) {
        for (User friend : user.getFriends()) {
            for (Post post : friend.getPost()) {
               post.getPost();
            }
        }
    }
}




