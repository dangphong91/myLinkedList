public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        System.out.println(myLinkedList);
        myLinkedList.addFirst(11);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList);
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.remove(1));
        System.out.println(myLinkedList);
        myLinkedList.add(1,11);
        System.out.println(myLinkedList);
    }
}
