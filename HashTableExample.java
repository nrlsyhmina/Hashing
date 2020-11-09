import java.util.*;
public class HashTableExample
{
    public static void main(String[] args)
    {
        Hashtable<Student, Integer> myHTable = new Hashtable<>();
        Student taeyeon1 = new Student("Taeyon", "Kim", "Jane", null);
        Student jessica = new Student("Jessica", "Jung", "Kyle", new Date(1985, 02-1, 28));//date not exists
        myHTable.put(jessica,1);
        myHTable.put(taeyeon1,0);
        System.out.print(myHTable.get(jessica));
        System.out.print(myHTable.isEmpty());
        System.out.print(myHTable.size());
        System.out.print(myHTable.contains(1));
        myHTable.remove(jessica);
        System.out.print(myHTable.contains(0));
        System.out.print(myHTable.contains(1));
        System.out.print(myHTable.containsKey(taeyeon1));
    }
}
