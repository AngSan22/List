package uaslp.objetos.list.linkedlist;

public class LinkedListIterator {

    private Node currentNode;

    LinkedListIterator(Node starNode){
        currentNode = starNode;
    }

    public boolean hasNext(){
        return currentNode != null;
    }

    public String next(){
        String data = currentNode.data;
        currentNode = currentNode.next;

        return data;
    }
}
