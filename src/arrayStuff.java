import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayStuff {
    public static ArrayList<String> al = new ArrayList<>();

    public static void main(String[] args){
    }

    public static void arrayF(){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("a"); list1.add("b");
        list2.add("b"); list2.add("c"); list2.add("d");
        list1.addAll(list2);
        // This will cause an error, use list1.removeAll("b"); list1.removeAll(Collections.singleton(b)); instead
        System.out.println(list1);
    }

    public static void arrayE(){
        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>();
        list1.add("a"); list1.add("b");
        list2.add("b"); list2.add("c"); list2.add("d");
        list1.addAll(list2);
        System.out.println(list1);
        list1.remove("b");
        System.out.println(list1);
    }
    public static void arrayD(){
        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>();
        list1.add("a"); list1.add("b");
        list2.add("b"); list2.add("c"); list2.add("d");
        list1.addAll(list2);
        list1.remove("b");
        System.out.println(list1);
    }

    public static void arrayC(){
        al.add("a");
        al.add("b");
        al.add(al.size(), "x");
        System.out.println(al);
    }

    public static void array(){
        ArrayList<String> al = new ArrayList<>();
        al.add("Bob");
        al.add("Vanessa");
        al.add("Josue");
        al.add(2, "Aaron");

        for(Object i : al){
            String name = (String) i;
            System.out.println(name + " " + name.length());
        }
        System.out.println("All names: " + al);
    }

    public static void arrayB(){
        if(al.add("a")){
            if(al.contains("a")){
                al.add(al.indexOf("a"), "b");
            }
        }
        System.out.println(al);
    }
}
