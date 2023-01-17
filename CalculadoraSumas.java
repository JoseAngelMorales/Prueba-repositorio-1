import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraSumas {
    public static int suma(int n1, int n2) {
        int sum = 0;
        sum = n1+n2;
        return sum;
    }

    @Test
    public void pruebasumas(){
        assertEquals(10, suma(6, 4));
    }

}

