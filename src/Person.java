public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return this.getAge() > 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void increaseAge(int incremenr) {
        if (incremenr < 0) {
            throw new IllegalArgumentException("Инкремент не может быть отрицательным");
        }
        this.age = age + incremenr;
    }

    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }
}
