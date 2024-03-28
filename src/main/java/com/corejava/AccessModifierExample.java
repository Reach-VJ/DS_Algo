package com.corejava;

public class AccessModifierExample {
    public static void main(String [] args) {
        Member member = new Member();
        //member.x = 10; //Error
        member.setX(10);
        System.out.println(member.getX());

    }
}

class Member {
    private int x;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
