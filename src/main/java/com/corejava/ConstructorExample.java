package com.corejava;

public class ConstructorExample {

    public static void main(String [] args) {
        //Player player = new Player(); It will throw compile time exception
    }

}

class Player {
    int x,y;
    Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("X is : "+x+" Y is : "+y);
    }
}
