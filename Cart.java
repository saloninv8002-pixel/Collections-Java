import java.lang.reflect.Array;
import java.util.ArrayList;
class Cart{
    public static void main (String args[]){
        ArrayList<String> Cart=new ArrayList<String>();
        Cart.add("Laptop");
        Cart.add("Mouse");
        Cart.add("Keyboard");
        System.out.println(Cart);
        Cart.add("Headphones");
        Cart.forEach(product->System.out.println(product));
        System.out.println();

        ArrayList<String> Student=new ArrayList<>();
        Student.add("Saloni");
        Student.add("Monisha");
        Student.add("Lokamatri");
        Student.add("Darshana");
        System.out.println(Student);
        System.out.println(Student.get(3));

        ArrayList<String> Movie=new ArrayList<>();
        Movie.add("Luca");
        Movie.add("Tangled");
        Movie.add("Avatar");
        Movie.add("Fantastic Beasts And Secrets of Dumbeldore");
        System.out.println(Movie.indexOf("Avatar"));

        ArrayList<String> Food_Order=new ArrayList<>();
        Food_Order.add("Pizza");
        Food_Order.add("Burger");
        Food_Order.add("Pasta");
        System.out.println(Food_Order);

        Food_Order.add(2,"Sandwich");
        System.out.println(Food_Order);

        Food_Order.clear();
        System.out.println(Food_Order);
        System.out.println("Is Empty ? :"+Food_Order.isEmpty());

        ArrayList<String> electronics=new ArrayList<>();
        electronics.add("Laptop");
        electronics.add("Mobile");
        electronics.add("Tablet");
        System.out.println(electronics);

        ArrayList<String> accessories=new ArrayList<>();
        accessories.add("Mouse");
        accessories.add("Keyboard");
        accessories.add("Charger");
        System.out.println(accessories);

        electronics.addAll(accessories);
        System.out.println(electronics);
        System.out.println(accessories);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);

        System.out.println(numbers);
        System.out.println(numbers.lastIndexOf(10));
        numbers.remove(1);//index
        System.out.println(numbers);
        numbers.removeIf(n->n%2!=0);
        System.out.println(numbers);

        ArrayList<String> Exam=new ArrayList<>();
        Exam.add("Maths");
        Exam.add("Physics");
        Exam.add("Chemistry");
        Exam.add("Computer Science");

        System.out.println(Exam);
        Exam.replaceAll(subject->subject.toUpperCase());
        System.out.println(Exam);
        Exam.replaceAll(sub->sub.toLowerCase());
        System.out.println(Exam);

        Exam.set(1,"English");
        System.out.println(Exam);

        System.out.println("Length : "+Exam.size());

        for(String n:Exam){
            System.out.println(n);
        }

    }
}