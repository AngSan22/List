package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;

public interface Set <T>{
    void add(T data) throws NotValidIndexException, NotNullValuesAllowedException;
    void remove(T data) throws NotValidIndexException;
    boolean contains(T data) throws NotValidIndexException;
    Iterator<T> iterator();
    int size();
}
