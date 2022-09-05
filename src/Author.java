import java.util.Objects;

public class Author {
    private String surname;

    private String name;

    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return surname.equals(author.surname) && name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }


    public String getName () {return this.name;}

    public String getSurname () {return this.surname;}

    public String toString() {
        return "Имя " + this.name + " Фамилия  " + this.surname;
    }
}
