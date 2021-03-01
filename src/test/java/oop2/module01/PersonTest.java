package oop2.module01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author George Rowlands
 */
public class PersonTest {

    @Test
    public void testPersonInitialization(){
        Person person = new Person(20, 63.5, 185.0);
        assertEquals(20, person.getAge(), 0.01);
        assertEquals(63.5, person.getWeight(), 0.01);
        assertEquals(185.0, person.getHeight(), 0.01);
    }

    @Test
    public void testBMICalculation(){
        Person person = new Person(20, 63.5, 185.0);
        // Formula for BMI is weight / (height * height)
        assertEquals(person.getWeight() / (person.getHeight() * person.getHeight() ), person.getBMI(), 0.01);
    }

    @Test
    void testInitFriends() {
        //given
        Person p = new Person(45, 90.0, 1.75);

        //when
        int numberOfFriends = p.getNumberOfFriends();

        //then
        assertEquals(0, numberOfFriends);
    }

    @Test
    void testNewFriend(){
        //given
        Person stuart = new Person(45, 90.0, 1.75);
        Person kevin  = new Person(47, 79.0, 1.78);
        assertEquals(0, stuart.getNumberOfFriends());
        assertEquals(0, kevin.getNumberOfFriends());
        //when
        stuart.addFriend(kevin);

        //then
        assertEquals(1, stuart.getNumberOfFriends());
        assertEquals(1, kevin.getNumberOfFriends());
        assertTrue(stuart.hasFriend(kevin));
        assertTrue(kevin.hasFriend(stuart));
    }

    @Test
    void testAddFriendTwice(){
        //given
        Person stuart = new Person(45, 90.0, 1.75);
        Person kevin  = new Person(47, 79.0, 1.78);
        stuart.addFriend(kevin);
        assertEquals(1, stuart.getNumberOfFriends());
        assertEquals(1, kevin.getNumberOfFriends());

        //when
        stuart.addFriend(kevin);

        //then
        assertEquals(1, stuart.getNumberOfFriends());
        assertEquals(1, kevin.getNumberOfFriends());
        assertTrue(stuart.hasFriend(kevin));
        assertTrue(kevin.hasFriend(stuart));
    }

    @Test
    void testNotAFriendAnymore(){
        //given
        Person stuart = new Person(45, 90.0, 1.75);
        Person kevin  = new Person(47, 79.0, 1.78);
        stuart.addFriend(kevin);
        assertEquals(1, stuart.getNumberOfFriends());
        assertEquals(1, kevin.getNumberOfFriends());

        //when
        stuart.removeFriend(kevin);

        //then
        assertEquals(0, stuart.getNumberOfFriends());
        assertEquals(0, kevin.getNumberOfFriends());
        assertFalse(stuart.hasFriend(kevin));
        assertFalse(kevin.hasFriend(stuart));
    }
}
