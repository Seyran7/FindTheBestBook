package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        books.add(new Book("Savaş və Sülh", "Lev Tolstoy", "Roman", 59.99, 4.8));
        books.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", "Roman", 39.99, 4.7));
        books.add(new Book("İnce Memed", "Yaşar Kemal", "Roman", 49.99, 4.6));
        books.add(new Book("Yüzyıllık Yalnızlık", "Gabriel García Márquez", "Roman", 69.99, 4.9));
        books.add(new Book("Suç ve Cezə", "Fyodor Dostoyevski", "Roman", 54.99, 4.8));
        books.add(new Book("Karamazov Qardaşları", "Fyodor Dostoyevski", "Roman", 64.99, 4.7));
        books.add(new Book("Shantaram", "Gregory David Roberts", "Macəra", 79.99, 4.6));
        books.add(new Book("1984", "George Orwell", "Distopiya", 34.99, 4.9));
        books.add(new Book("Alchemist", "Paulo Coelho", "Fəlsəfi", 44.99, 4.7));
        books.add(new Book("Küçük Prens", "Antoine de Saint-Exupéry", "Nağıl", 29.99, 4.8));


        books.stream().filter(element->element.getPrice()>10.00).forEach(System.err::println);
        books.stream().sorted((b1,b2)->Double.compare(b2.getPrice(),b1.getPrice())).forEach(System.err::println);
    }
}
