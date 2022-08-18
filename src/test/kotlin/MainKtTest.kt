import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun maestroPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = MAESTRO
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(29600, result)
    }

    @Test
    fun masterPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = MASTER
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(29600, result)
    }

    @Test
    fun mirPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = MIR
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(34500, result)
    }

    @Test
    fun visaPercentageTest() {
        val sumLastMonth = 76000_00
        val payMethod = VISA
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(34500, result)
    }

    @Test
    fun maestroZeroTest() {
        val sumLastMonth = 75000_00
        val payMethod = MAESTRO
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0, result)
    }

    @Test
    fun masterZeroTest() {
        val sumLastMonth = 75000_00
        val payMethod = MASTER
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0, result)
    }

    @Test
    fun mrMinimalTest() {
        val sumLastMonth = 76000_00
        val payMethod = MIR
        val transferValue = 4000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(3500, result)
    }

    @Test
    fun visaMinimalTest() {
        val sumLastMonth = 76000_00
        val payMethod = VISA
        val transferValue = 4000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(3500, result)
    }

    @Test
    fun feeVkTest() {
        val sumLastMonth = 76000_00
        val payMethod = VK
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0, result)
    }

    @Test
    fun defaultTest() {
        val sumLastMonth = 76000_00
        val transferValue = 46000_00

        val result = fee(
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0, result)
    }

    @Test
    fun emptyStringPaymentMethodTest() {
        val sumLastMonth = 76000_00
        val payMethod = ""
        val transferValue = 46000_00

        val result = fee(
            method = payMethod,
            lastSum = sumLastMonth,
            value = transferValue
        )
        assertEquals(0, result)
    }
}