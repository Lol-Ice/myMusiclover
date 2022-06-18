val discountRegularCustomers = true //true если пришёл постоянный клиент, иначе не постоянный
val sumDiscountRegularCustomers = 0.99 //скидка 1% для постоянного клиента

fun main() {

    val totalPrice = 10001.00 //общая сумма покупки
    val minDiscountStart100 = 1_000 //минимальная сумма для скидки 100руб
    val discountStart5 = 10_001 //минимальная сумма для скидки 5%
    val discount100 = 100 //стандартная скидка 100руб при сумме заказа 1_000-10_001руб
    val discount5 = 0.95 //скидка 5% при сумме заказа от 10_001руб


    val result = if (totalPrice >= discountStart5) totalPrice * discount5
    else if (totalPrice > minDiscountStart100 && totalPrice < discountStart5) totalPrice - discount100
    else totalPrice
    val resultFormat = String.format("%.2f", result) //отформатированный вывод конечной суммы заказа

    val discountResult = if (discountRegularCustomers && totalPrice >= discountStart5) totalPrice * discount5 * sumDiscountRegularCustomers
    else if (discountRegularCustomers && totalPrice >= minDiscountStart100 && totalPrice <= discountStart5) (totalPrice - discount100) * sumDiscountRegularCustomers
    else totalPrice * sumDiscountRegularCustomers
    val discountResultFormat = String.format("%.2f", discountResult) //отформатированный вывод конечной суммы заказа со скидкой постоянного клиента


    println("Покупка на сумму: " + totalPrice + " руб.")
    println("После применения скидки: " + resultFormat + " руб.")
    println("После применения 1% скидки для постоянного клиента: " + discountResultFormat + " руб.")

}