class Integer {

    private int i;

    public Integer() {  // No argument constructor
    }

    public Integer(int i) {     // Parameterized constructor
        this.i = i;
    }

    int get() {
        return i;
    }

    Integer plus(Integer x) {
        Integer c = new Integer();
        c.i = i + x.i;
        return c;
    }
}
