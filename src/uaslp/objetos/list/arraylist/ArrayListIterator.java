package uaslp.objetos.list.arraylist;


public class ArrayListIterator {
    private final ArrayList arrayList;
    private int currentItem;

    ArrayListIterator(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }

    public String next(){
        String data = arrayList.getAt(currentItem);
        currentItem++;

        return data;
    }
}
