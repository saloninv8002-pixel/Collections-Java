import java.util.HashSet;

class Hashset{
    public static void main(String args[]){
        HashSet<String> Movie=new HashSet<>();
        Movie.add("Harry Potter");
        Movie.add("Avatar");
        Movie.add("Interstellar");
        Movie.add("Inception");
        Movie.add("Titanic");
        System.out.println(Movie);
        Movie.remove("Avatar");
        System.out.println(Movie);
        System.out.println("Harry Potter Exists? : "+ Movie.contains("Harry Potter"));

        HashSet<String> Book_shelf=new HashSet<>();
        Book_shelf.add("A Nation Of Idiots");
        Book_shelf.add("Belonging");
        Book_shelf.add("Secret Garden");
        Book_shelf.add("Gita for Teens");
        System.out.println(Book_shelf);
        Book_shelf.add("The Alchemist");
        System.out.println(Book_shelf);
        Book_shelf.clear();
        System.out.println(Book_shelf);
        System.out.println("Is Empty? : "+Book_shelf.isEmpty());

        HashSet<String> Food_Order=new HashSet<>();
        Food_Order.add("Pizza");
        Food_Order.add("Burger");
        Food_Order.add("Pasta");
        System.out.println(Food_Order.size());
        Food_Order.forEach(food->System.out.println(food));

    }
}