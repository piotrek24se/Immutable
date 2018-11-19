package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class User {

    private final String name;

    private List<String> friends = new ArrayList();

    public User(String name) {
        this.name = name;
    }

    public void addFriend(String name) {
        friends.add(name);
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends(){
        return Collections.unmodifiableList(friends);
    }

}
