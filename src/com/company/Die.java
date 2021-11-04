package com.company;

public class Die {
    private int dots;
    public void roll(){
        dots = (int)(Math.random() * 6 + 1);
    }
    public int getNumDots(){
        return dots;
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Die die = new Die();
        die.roll();
        System.out.println(die.getNumDots());
    }
}
