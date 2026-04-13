package level11;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Book book)) return false; // если obj не является экзмепляром Book
        return this.year == book.year && Objects.equals(this.author, book.author) && Objects.equals(this.title, book.title);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }


    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Булгаков", 1967);
        Book book2 = new Book("Мастер и Маргарита", "Булгаков", 1967);
        Book book3 = new Book("Война и мир", "Толстой", 1869);

        System.out.println("Книги 1 и 2 одинаковые? " + book1.equals(book2)); // Должно быть true
        System.out.println("Книги 1 и 3 одинаковые? " + book1.equals(book3)); // Должно быть false
    }
}
