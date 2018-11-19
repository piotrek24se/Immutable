package immutable;

import java.util.List;

public class App {

    public static void main(String[] args) {

        User user1 = new User("ALA");
        user1.addFriend("KRZYSIEK");
        user1.addFriend("JANEK");
        user1.addFriend("KASIA");

        List<String> friends = user1.getFriends();

        System.out.println(friends);

        friends.add("JOLA");
        System.out.println(user1.getFriends());

    }

}
