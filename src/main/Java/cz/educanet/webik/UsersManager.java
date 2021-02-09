package cz.educanet.webik;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class UsersManager {

    private ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> dostanJmenos(){ return userList; }

    public boolean create(User userList) {
        if(userList.getCode() < 0 || userList.getCode() > 100)
            return false;
        int generujID = (int) (Math.random()*(100 +1));
        if (kontrolac(generujID)){
            userList.setId(generujID);
        }
        return true;
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
    public boolean kontrolac(int id) {
        for (int i = 0; i < 100; i++){
            if (id != userList.get(id).id) {
                return false;
            }
        }
        return true;
    }
}
