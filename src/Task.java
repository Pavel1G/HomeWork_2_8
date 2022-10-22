import java.util.Objects;

public class Task {
    private int num1;
    private int num2;

    public Task() {
        this.num1 = (int) (Math.random() * 10);
        this.num2 = (int) (Math.random() * 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (num1 == task.num1 && num2 == task.num2) || (num2 == task.num1 && num1 == task.num2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }

    @Override
    public String toString() {
        return num1 + " * " + num2 + " = " + num1 * num2 + "\n";
    }
}
