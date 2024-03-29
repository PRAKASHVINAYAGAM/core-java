public class instance {
    int a=100,b=200;
    int c=a+b;
    void print()
    {
        System.out.println(c);
    }

public static void main(String[] args) {

    instance d = new instance();
    System.out.println(d.c);
    d.print();
}

}
