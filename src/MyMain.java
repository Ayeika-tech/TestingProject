import java.util.ArrayList;

public class MyMain 
{
    public static void main(String[] args) {
        Neighbors n = new Neighbors("Mary", "Thomas", "469-579-6649","14139 fall harvest Dr");
        Neighbors n1 = new Neighbors("Luis","Jimenez", "214-697-8224", "14114 Fall Harvest Dr");
        Neighbors n2 = new Neighbors("Jacky", "Ng", "817-480-3370", "13654 Fall Harvest Dr");
        Neighbors n3 = new Neighbors("George", "Harper", "972-658-2604", "14193 Fall Harvest Dr");
        Neighbors n4 = new Neighbors("Jeniffer", "Kim", "972-800-7744", "14221 Fall Harvest Dr");
        Neighbors n5 = new Neighbors("Nidia", "Carmona", "480-345-4323", "342 W Elm St");
        Neighbors n6 = new Neighbors("Victor", "Gomez", "214-636-7698", "6001 Orinda Dr");
        Neighbors n7 = new Neighbors("Liza", "Martinez", "484-332-9009", "47 S Main St");
        Neighbors n8 = new Neighbors("Ayrah", "Hoque", "123-456-7890", "12 Baby Rd");
        Neighbors n9 = new Neighbors("Oliver", "Torres", "555-555-5555", "742 Cedar Ln");
        
        ArrayList<Neighbors> myList = new ArrayList<Neighbors>();
        myList.add(n);
        myList.add(n1);
        myList.add(n2);
        myList.add(n3);
        myList.add(n4);
        myList.add(n5);
        myList.add(n6);
        myList.add(n7);
        myList.add(n8);
        myList.add(n9);      

        for (Neighbors data : myList) {
            System.out.println("Name: "+ data.getName()+" "+data.getLast());
            System.out.println("Phone#: "+ data.getNumber());
            System.out.println("Address: "+data.getAddress());
            System.out.println("-----------------------------");
        }        
    }
}
