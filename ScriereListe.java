import java.util.ArrayList;
import java.util.List;


public class ScriereListe{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        addnumbers(list);
        //list.add(new Integer(6));
        System.out.println(list);
    }
    public static void addnumbers(List list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

}
