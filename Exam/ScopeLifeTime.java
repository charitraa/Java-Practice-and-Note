package Day1;

public class ScopeLifeTime {
    public static void main(String[] args) {
        f1(10);
    }

    public static void f1(int x) {
        System.out.println(x);
    }
}
