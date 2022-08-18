const val MASTER = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "МИР"
const val VK = "VK Pay"

fun main() {
    val sumLastMonth = 15000_00
    val payMethod = MIR
    val transferValue = 500000_00
    println("Перевод суммы: $transferValue копеек")
    println("Комиссия: ${fee(payMethod, sumLastMonth, transferValue)} копеек")
    println("Сумма после вычета комиссии: ${transferValue - fee(payMethod, sumLastMonth, transferValue)} копеек")
}

fun fee(method: String = "VK Pay", lastSum: Int = 0, value: Int): Int {
    when (method) {
        MASTER, MAESTRO -> {
            when {
                lastSum <= 75000_00 -> return 0
                else -> return value / 1000 * 6 + 20_00
            }
        }

        VISA, MIR -> {
            when {
                value / 10000 * 75 < 35_00 -> return 35_00
                else -> return value / 10000 * 75
            }
        }

        VK -> return 0
    }
    return 0
}