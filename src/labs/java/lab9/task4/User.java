package labs.java.lab9.task4;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (name == null) {
            if (user.name != null) {
                return false;
            }
        } else {
            if (!name.equals(user.name)) {
                return false;
            }
        } return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = 31 * result + name.hashCode();
        } else {
            result = 31 * result + 0;
        } return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
