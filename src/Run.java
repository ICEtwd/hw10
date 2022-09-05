public class Run {
    public static void main(String[] args) {

        Author john = new Author("John", "Johnson");
        Author nate = new Author("Nate", "Denver");
        Book jungle = new Book("Jungle", "Johnson", 2012);
        Book island = new Book("Island", "Denver", 2014);

        jungle.setYear(2016);

        System.out.println("John = " + john.getName() + john.getSurname());
        System.out.println("Nate = " + nate.getName() + nate.getSurname());
        System.out.println("Jungle = " + jungle.getName() + john.getSurname() + jungle.getYear());
        System.out.println("Island = " + island.getName() + nate.getSurname() + island.getYear());
    }
}
