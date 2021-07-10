public class Myclass {
    public static void main(String[] args) {
        Computer c1 = Computer.getInstance();
        Computer c2 = Computer.getInstance();
        System.out.println(c1 == c2);
    }
}
