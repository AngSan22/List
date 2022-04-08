package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;


public class ArrayListTest {
    @Test
    public void givenANewArray_whenGetSize_thenResultIsZero(){
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When
        int size = list.getSize();
        //Then
        Assertions.assertEquals(0, size, "size of list after creation must be zero");
    }

    @Test
    public void givenANewArrayWithSizeOne_whenGetSize_thenResultIsZero(){
        //Given
        ArrayList<String> list = new ArrayList<>(1);

        //When
        int size = list.getSize();
        //Then
        Assertions.assertEquals(0, size, "size of list after creation must be one");
    }

    @Test
    public void givenANewArray_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When
        list.addAtFront("Hola");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenAArrayWithTwoElement_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When
        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> list.addAtFront(null));
    }

    @Test
    public void givenANewArray_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When
        list.addAtTail("Hola");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenAArrayWithTwoElement_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When
        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> list.addAtTail(null));
    }

    @Test
    public void givenAArrayWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        //When
        list.remove(0);
        //Then
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAArrayWithTwoElement_whenRemoveIndex3_thenNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When
        //Then
        Assertions.assertThrows(NotValidIndexException.class, () -> list.remove(3));
    }

    @Test
    public void givenAArrayWithThreeElement_whenRemoveAll_thenSizeIsZero() throws  NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");
        list.addAtTail("Cruel");

        //When
        list.removeAll();
        //Then
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAArrayWithTwoElement_whenSetAtZero_thenElementIsModified() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        //When
        list.setAt(0,"Hola");
        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenAArrayWithTwoElement_whenSetAtThree_thenNotNotValidIndexExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");

        //When
        //Then
        Assertions.assertThrows(NotValidIndexException.class, () -> list.setAt(3,"Cruel"));
    }

    @Test
    public void givenAArrayWithTwoElement_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When
        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> list.setAt(0,null));
    }

    @Test
    public void givenAArrayWithThreeElement_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When
        Iterator<String> iterator = list.getIterator();
        //Then
        int size = list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
