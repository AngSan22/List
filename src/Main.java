import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.arraylist.ArrayListIterator;


public class Main {


    public static void main(String[] Args) {
        ArrayList team1 = new ArrayList(2);
        ArrayList team2 = new ArrayList();
        ArrayList team3 = new ArrayList();

        team1.addAtTail("Jesus");
        team1.addAtTail("Salomon");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        ArrayListIterator iterator;

        iterator = team1.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();

        iterator = team2.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println();
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println();
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");

        iterator = team2.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        team3.remove(0);
        team3.remove(0);

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println();
        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");

        iterator = team3.getIterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        if (team1.getAt(1).equals("Salomon")){
            team1.setAt(1,"Luis");
        }

        System.out.println();
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
