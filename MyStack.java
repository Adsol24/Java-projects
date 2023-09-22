public class MyStack<T> {
    private Node<T> top;
    public MyStack()
    {
        top = null;
    }
    public void push(T data)
    {
        Node<T> node = new Node<>(data, top);
        top = node;
    }
    public T pop()
    {
        if (top == null)
            return null;
        T element = top.getData();
        top = top.getNext();
        return element;
    }
    public void display()
    {
        Node<T> curr = top;
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
    public boolean empty()
    {
        return top == null;
    }
}
