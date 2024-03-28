package com.cip.java.lib.map;

import java.util.HashMap;

public class EWalletDS {
    public static void main(String [] args) {
        UserList userList = new UserList();
        userList.set(1,100);
        userList.set(2,200);
        System.out.println(userList.get(1));
        userList.set(1,5000);
        System.out.println(userList.get(1));
    }

}

class UserList {
    HashMap<Integer,Integer> map;
    UserList () {
        map = new HashMap<>();
    }
    int get(int id) {
        return map.get(id);
    }
    void set(int id, int bal) {
        map.put(id,bal);
    }
}
