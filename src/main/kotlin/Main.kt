import java.util.Scanner

fun calcularValorDeMercat(preuInicial: Double, quilometratge: Double): Double {
    val porcentajePerdido = 0.00001
    val perdidaPorKilometro = preuInicial * porcentajePerdido * quilometratge
    val valorDeMercat = preuInicial - perdidaPorKilometro
    return valorDeMercat
}

fun main() {

    val scanner = Scanner(System.`in`)

    var preuInicial = 73490.0


    do {
        println("Tu Volkswagen es la version Camper Full Equip?")
        println("1. Si")
        println("2. No")
        val camperFullEquip = scanner.nextInt()

        if (camperFullEquip == 1) {
            preuInicial = 73490.0 + 20000.0
        }
    }   while (camperFullEquip < 1 || camperFullEquip > 2)

    println("Quants quilometres te el Volkwagen?")
    val quilometratge = scanner.nextDouble()

    val valorDeMercat = calcularValorDeMercat(preuInicial, quilometratge)

    println("El valor del Volksvagen es $valorDeMercat€ amb $quilometratge quilòmetres.")
}