
class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        int a = 250, b = 25, c = 25, x;

        try {
        x = a / (b - c);
        System.out.println("x = " + x);
        } catch(ArithmeticException ex){
            System.out.println(ex.toString());
        }

        System.out.println("Aal is well!");
    }
}
