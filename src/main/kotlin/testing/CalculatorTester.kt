

import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import testing.Calculator

internal class CalculatorTester {


    /*
    * 1 - amount > 0 , headcount > 0
    * 2 - amount = 0 , headcount > 0 <- amount is Zero
    * 3 - amount > 0 , headcount = 0 <- headcount is Zero
    * 4 - amount > 0 , headcount < 0 <- headcount is Less than Zero
    * 5 - amount < 0 , headcount > 0 <- amount is Less than Zero
    * 6 - amount = 0 , headcount = 0 <- amount is Zero, headcount is Zero
    * 7 - amount < 0 , headcount < 0 <-
    * 8 - amount = 0 , headcount < 0 <- amount is Zero
    * 9 - amount < 0 , headcount = 0 <- headcount is Zero
    * */

    @Test
    fun amountisZero() {
        val calculator: Calculator = Calculator()

        assertEquals(0.0, calculator.computeContribution(0.0, 10))
        assertEquals(0.0, calculator.computeContribution(0.0, 0))
        assertEquals(0.0, calculator.computeContribution(0.0, -10))

    }

    @Test
    fun headcountisZero() {
        val calculator: Calculator = Calculator()


    }

    @Test
    fun amountIslessthanZero() {
        val calculator: Calculator = Calculator()

        assertEquals(0.0, calculator.computeContribution(-10_000.0, -10))
//        assertNull(0.0, calculator.computeContribution(-10_000.0, -10))
        assertEquals(0.0, calculator.computeContribution(-10_000.0, -10))


    }

    @Test
    fun headcountIslessthanZero() {
        val calculator: Calculator = Calculator()

        assertEquals(0.0, calculator.computeContribution(10_000.0, -10))
//        assertNull(0.0, calculator.computeContribution(-10_000.0, -10))
        assertEquals(0.0, calculator.computeContribution(0.0, -10))


    }

    @Test
    fun successComputation() {
        val calculator: Calculator = Calculator()

        assertEquals(1_000.0, calculator.computeContribution(10_000.0, 10))
        assertEquals(0.0, calculator.computeContribution(0.25, 10))

        assertEquals(0.0, calculator.computeContribution(1_000.0, 51))
        assertEquals(0.0, calculator.computeContribution(1_000_000_000_000_000_000_000_000_000_000_000_000_000_000.0, 10))
    }


}