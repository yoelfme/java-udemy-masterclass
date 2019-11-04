package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.setAge(0);
            return;
        }

        this .age = age;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        String fullName = "";

        if (!this.firstName.isEmpty()) {
            fullName += this.firstName;
        }

        if (!this.lastName.isEmpty()) {
            if (fullName.isEmpty()) {
                fullName += this.lastName;
            } else {
                fullName += " "  + this.lastName;
            }
        }

        return fullName;
    }
}
