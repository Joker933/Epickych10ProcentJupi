package cz.educanet.webik;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsersManager {

    private ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> dostanJmenos(){ return userList; }

    public boolean create(User user) {
        user.setId(userList.size());
        return userList.add(user);
    }

    public User dostanJmenos (int id){
        return userList.stream()
                .filter(userListStream -> id == userListStream.getID())
                .findAny()
                .orElse(null);
    }

    public boolean odstranJmenos(int id){
        return  userList.remove(dostanJmenos(id));
    }

}
