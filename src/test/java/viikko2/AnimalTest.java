import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AnimalTest {
    // Write your tests here.

    @Test
     public void testAnimalGetAge(){
        int age = 10;
        Animal animal = new Animal("nimi", age);
        int expected = age;
        int actual = animal.getAge();
        assertEquals(expected, actual);

     }
     
     @Test
     public void testAnimalGetName(){
        String name = "nimi";
        Animal animal = new Animal(name, 10);
        String expected = name;
        String actual = animal.getName();
        assertEquals(expected, actual);
     }

     @Test
     public void testAnimalShout(){
        String expected = "<default shout>";
        Animal animal = new Animal("nimi", 10);
        String actual = animal.shout();
        assertEquals(expected, actual);
     }

      @Test
     public void testAnimalInvalidAge(){
        Animal animal = new Animal("nimi", 10);
        int expected = 10;
        int actual = animal.getAge();

        if (actual < 0) {
            actual = 0;
        }
        assertEquals(expected, actual);

     }

     @Test
        public void testAnimalInvalidName(){
        String name = null;
        Animal animal = new Animal(name, 10);
        String expected = "Undefined";
        String actual = animal.getName();
        assertEquals(expected, actual);
    
        }
}