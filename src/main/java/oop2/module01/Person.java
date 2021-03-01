package oop2.module01;

import java.util.Arrays;

/**
 * @author Dieter Holz
 */
public class Person {
    private int age;
    private double weight;
    private double height;
    private Person[] friends = new Person[0];

    public Person(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    //alle Getter und Setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person[] getFriends() {
        return friends;
    }

    public int getNumberOfFriends() {
        return friends.length;
    }

    public void addFriend(Person friend) {
        // Extend array by one
        friends = Arrays.copyOf(friends, friends.length + 1);
        // Add friend
        friends[friends.length - 1] = friend;
    }

    public boolean hasFriend(Person friend) {
        for (Person p: friends){
            if (p.equals(friend))
                return true;
        }
        return false;
    }
}
