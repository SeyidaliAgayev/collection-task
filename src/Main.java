public class Main {
    public static void main(String[] args) {

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("a");
        customLinkedList.add("b");
        customLinkedList.add("c");

        System.out.println(customLinkedList);
        System.out.println(customLinkedList.peek());

        customLinkedList.addFirst("d");

        System.out.println(customLinkedList);

        customLinkedList.addFirst("w");

        System.out.println(customLinkedList);
        System.out.println(customLinkedList.peek());

//        CustomArrayList<String> customArrayList = new CustomArrayList<>();
//        customArrayList.add("a");
//        customArrayList.add("b");
//        customArrayList.add("c");
//
//        System.out.println(customArrayList);
//
//        customArrayList.add(0, "d");
//
//        System.out.println(customArrayList);
    }
}