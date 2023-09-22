public class MyClient {
    public static void main(String[] args) {
        MyStack<String> stackString = new MyStack<String>();
        stackString.push("Mario");
        stackString.push("Park");
        stackString.push("Jalil");
        stackString.push("Jaden");
        //for (int i = 11; i < 20; i++)
            //stackString.push(Integer.toString(i)); not sure if you wanted us to leave the integers
                            //^ this is what you would do to keep the int and string with no errors
        //stackString.pop(); to pop remove comment
        //String MyGuy = stackString.pop(); to pop then save
        stackString.display();

    }
}
