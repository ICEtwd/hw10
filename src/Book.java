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
    public String getAuthor () {return this.author;}
    public int getYear () {return this.year;}

    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Автор" + this.author + " Название  " + this.name + " Год издания " + year;
    }
}
