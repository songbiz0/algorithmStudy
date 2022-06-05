package old.Test;

public class Test {
    private int field;

    public void method(final int arg1, int arg2) {
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        Calcul cal = new Calcul() {
            @Override
            public int sum() {
                int result = arg1 + arg2;
                return 0;
            }
        };
    }
}

interface Calcul {
    public int sum();
}