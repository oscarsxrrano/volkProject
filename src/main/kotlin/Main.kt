import java.util.Scanner

fun calcularValorDeMercat(preuInicial: Double, quilometratge: Double): Double {
    val depreciacioPercentatgePerQuilometre = 0.00001
    val perdidaPorKilometro = preuInicial * depreciacioPercentatgePerQuilometre * quilometratge
    val valorDeMercat = preuInicial - perdidaPorKilometro
    return valorDeMercat
}

fun main() {

    val scanner = Scanner(System.`in`)

    println("Quants quilometres te el Volkwagen?")
    val quilometratge = scanner.nextDouble()

    val preuInicial = 73490.0
    val valorDeMercat = calcularValorDeMercat(preuInicial, quilometratge)

    println("El valor del Volksvagen es $valorDeMercat€ amb $quilometratge quilòmetres.")
}