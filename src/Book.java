import java.util.Objects;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book (String name,String author, int year) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName () {return this.name;}
    public String getAuthor () {
        return this.author;}
    public int getYear () {return this.year;}

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && author.equals(book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, year);
    }

    public String toString() {
        return "Автор" + this.author + " Название  " + this.name + " Год издания " + year;}

}
