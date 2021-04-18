package pgo.repository;

public class User {
    private String name;
    private String surname;
    private String email;
    private String pass;

    private boolean isGuest = true;

    public User(String email) {
        this.email = email;
    }

    public User(String name, String surname, String email, String pass, boolean isGuest) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pass = pass;
        this.isGuest = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest(boolean guest) {
        isGuest = guest;
    }
}
