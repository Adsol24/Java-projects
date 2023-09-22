import java.util.ArrayList;
import java.util.Iterator;


public class Client{

    public static void main(String [] arg){
        Integer [] nums1 = {1, 3, 4, 5, 8};
        MyList<Integer> list1 = new MyList<Integer>(nums1);
        System.out.println("List1:" + list1);

        Integer [] nums2 = {9, 31, 42, 53, 81};
        MyList<Integer> list3 = new MyList<Integer>(nums2);
        System.out.println("List3:" + list3);

        String [] strs = {"Joe", "Sam", "AD"};

        MyList<String> list2 = new MyList<String>(strs);
        System.out.println("List2:" + list2);

        ArrayList<MyList<Integer>> ll = new ArrayList<MyList<Integer>>();
        ll.add(list1);
        ll.add(list3);

       // for(MyList<Integer> list: ll)
          //  System.out.println(list);

        Iterator<MyList<Integer>> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }






    }
}