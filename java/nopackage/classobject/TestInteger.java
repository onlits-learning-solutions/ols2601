class TestInteger {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(20);

        Integer c = a.plus(b);

        System.out.println("c = " + c.get());
    }
}