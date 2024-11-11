public class Main {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        User lærke = new User("laerks32");
        User marcus = new User("marcus50");

        network.addUser(lærke);
        network.addUser(marcus);


        lærke.addFriend(marcus);
        marcus.addFriend(lærke);

        lærke.createPost("det her er mit første post");
        marcus.createPost("whattttts up");

        System.out.println("Lærkes opslag: " + lærke.getPost());
        System.out.println("Lærkes venner: " + lærke.getFriends());

        lærke.getPost().get(0).like(marcus);

        System.out.println("Showing posts from " + lærke + "'s friends:");
        network.showFriendsPosts(lærke);

        //udskriver post igen, da det har fået et like
        System.out.println("Lærkes opslag: " + lærke.getPost());

    }
}
