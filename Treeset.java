import java.util.TreeSet;

class Treeset{
    public static void main(String args[]){
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);
        numbers.remove(10);
        numbers.forEach(num->System.out.println(num));
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.contains(20));
        numbers.clear();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.first());
        System.out.println(numbers.last());
    }
}