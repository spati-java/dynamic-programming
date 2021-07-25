import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CanSumTest {

    CanSum canSum;
    @BeforeEach
    public void init(){
        canSum = new CanSum();
    }

    @Test
    public void testCanSum(){

        boolean expected = true;

        int [] numbers = new int[]{5,2,3,7};

        boolean actual = canSum.canSum(7, numbers);

        assertEquals(expected, actual);

    }

}