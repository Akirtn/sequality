package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void test_Cum_sum(){
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.cum_sum(1, 10));
  }

  @Test
  public void test_Average(){
    Calculate calculate = new Calculate();
    double expected2 = 5.5;
    assertEquals(expected2, calculate.average(55,10),0);
  }

  @Test
  public void test_OddSum(){
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd_sum(1,10));
  }
  @Test
  public void test_EvenSum(){
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even_sum(1,10));
  }
}
