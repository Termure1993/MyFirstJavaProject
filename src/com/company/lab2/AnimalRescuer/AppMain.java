package com.company.lab2.AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println(myDog.age);
        System.out.println(myDog.name);
        Rescuer myRescuer = new Rescuer();
        System.out.println(myRescuer.name);
        Food  myFood = new Food ();
        System.out.println(myFood.price);
        Recreations myRecreations = new Recreations();
        System.out.println(myRecreations.favoriteRecreation);
        Girl myGirl = new Girl();
        System.out.println(myGirl.city);

    }
}
