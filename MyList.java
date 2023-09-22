import java.util.ArrayList;
public class MyList<T> {

    private ArrayList<T> list;

    public MyList(T [] numbers){
        list = new ArrayList<>();

        for(T val: numbers){
            list.add(val);

        }
    }

    @Override
    public String toString()
    {
        String str = "[";
        for (int i = 0; i < list.size()-1; i++)
            str += list.get(i) + ",";

        str += list.get(list.size() - 1);
        return str + "]";
    }
}
