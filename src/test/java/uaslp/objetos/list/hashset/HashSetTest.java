package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotSuchElementException;


public class HashSetTest {
    @Test
    public void givenANewSet_whenSize_thenResultIsZero(){
        //Given
        HashSet<String> hash = new HashSet<>();

        //When
        int size = hash.size();
        //Then
        Assertions.assertEquals(0, size, "size of hashset after creation must be zero");
    }


    @Test
    public void givenANewSet_whenAddAnElement_thenSizeIsOne(){
        //Given
        HashSet<String> hash = new HashSet<>();

        //When
        hash.add("Hola");

        //Then
        int size = hash.size();
        Assertions.assertEquals(1, size, "size of hashset after creation must be one");
        Assertions.assertTrue(hash.contains("Hola"));
    }

    @Test
    public void givenASetWithOneElement_whenAddAnElement_thenSizeIsTwo(){
        //Given
        HashSet<String> hash = new HashSet<>(1);
        hash.add("Hola");
        //When
        hash.add("Mundo");

        //Then
        int size = hash.size();
        Assertions.assertEquals(2, size, "size of hashset after creation must be two");
        Assertions.assertTrue(hash.contains("Mundo"));
    }

    @Test
    public void givenASetWithOneElement_whenRemove_thenSizeIsZero() {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");

        //When
        hash.remove("Hola");
        //Then
        int size = hash.size();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenASetWithThreeElement_whenFindTheElement_thenResultIsTrue() {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");
        hash.add("Mundo");
        hash.add("Cruel");

        //When
        boolean result = hash.contains("Mundo");

        //Then

        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenASetWithThreeElement_whenNotFindTheElement_thenResultIsFalse() {
        //Given
        HashSet<String> hash = new HashSet<>();
        hash.add("Hola");
        hash.add("Mundo");
        hash.add("Cruel");

        //When
        boolean result = hash.contains("Bello");

        //Then

        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenASetWithFiveElement_whenAddAnElement_thenHashSetIsReorganize() {
        //Given
        HashSet<String> hash = new HashSet<>(1);
        hash.add("Hola");
        hash.add("Mundo");
        hash.add("Cruel");
        hash.add("Y");
        hash.add("Adios");
        //When
        hash.add("Bye");

        //Then
        int size = hash.size();
        Assertions.assertEquals(6, size);
        Assertions.assertTrue(hash.contains("Hola"));
        Assertions.assertTrue(hash.contains("Mundo"));
        Assertions.assertTrue(hash.contains("Cruel"));
        Assertions.assertTrue(hash.contains("Y"));
        Assertions.assertTrue(hash.contains("Adios"));
        Assertions.assertTrue(hash.contains("Bye"));
    }

    @Test
    public void givenASetWithThreeElement_whenGetIterator_thenIteratorWorksOverAllThreeElements() {
        //Given
        HashSet<String> hash = new HashSet<>(1);

        hash.add("Hola");
        hash.add("Mundo");
        hash.add("Cruel");

        //When
        Iterator<String> iterator = hash.iterator();
        //Then
        int size = hash.size();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Hola", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    public void givenANewSet_whenGetNextIterator_thenNotSuchElementExceptionIsThrown(){
        //Given
        HashSet<String> hash = new HashSet<>();
        Iterator<String> iterator = hash.iterator();

        //When

        //Then
        Assertions.assertThrows(NotSuchElementException.class, () -> iterator.next());
    }
}
