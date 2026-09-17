import java.util.LinkedList;
class Linkedlist{
    public static void main(String args[]){
        LinkedList<String> Cart=new LinkedList<>();
        Cart.add("Laptop");
        Cart.add("Mouse");
        Cart.add("Keyboard");
        System.out.println(Cart);

        Cart.addLast("Headphones");
        Cart.addFirst("USB Cable");
        Cart.add(2,"Webcam");
        System.out.println(Cart);

        LinkedList<String> Student=new LinkedList<>();
        Student.add("Saloni");
        Student.add("Monisha");
        Student.add("Lokamatri");
        System.out.println(Student);

        Student.addFirst("Darshana");
        Student.addLast("Tanav");
        Student.add(3,"Monikka");
        System.out.println(Student);

        LinkedList<String> Songs=new LinkedList<>();
        Songs.add("Hangova");
        Songs.add("Pavazha Mall");
        Songs.add("Alaakaa Loova");
        Songs.add("Vaama Vaama");
        System.out.println(Songs);
        System.out.println(Songs.get(2));
        System.out.println(Songs.getFirst());
        System.out.println(Songs.getLast());


        LinkedList<String> Books=new LinkedList<>();
        Books.add("Stars will Guide You Home");
        Books.add("Harry Potter");
        Books.add("The Mountain Is You");
        Books.add("The Secret Garden");
        Books.add("The Wind On Haunted Hill");
        Books.add("Harry Potter");
        System.out.println("Last Index Of HarryPotter : "+Books.lastIndexOf("Harry Potter"));
        System.out.println(Books);
        Books.removeLastOccurrence("Harry Potter");
        System.out.println(Books);
        Books.removeFirstOccurrence("Harry Potter");
        System.out.println(Books);
        Books.remove(2);
        System.out.println(Books);
        Books.removeFirst();
        System.out.println(Books);
        Books.removeLast();
        System.out.println(Books);

        LinkedList<Integer> marks=new LinkedList<>();
        marks.add(90);
        marks.add(85);
        marks.add(95);
        marks.add(89);
        marks.add(91);
        System.out.println(marks.size());
        System.out.println(marks);
        marks.set(2,100);
        System.out.println(marks);
        System.out.println(marks.indexOf(50));
        marks.clear();
        System.out.println(marks);

    }
}