fun main(){
    val scanner = java.util.Scanner(System.`in`)

    print("Digite o seu peso em kg: ")
    val peso = scanner.nextDouble()

    print("Digite a sua altura em metros: ")
    val altura = scanner.nextDouble()

    val imc = calcularIMC(peso,altura)

    println("O seu IMC é de %.2f".format(imc))

    val categoria = classificarIMC(imc)
    println("Categoria: $categoria")

}

fun calcularIMC(peso : Double, altura : Double): Double{
    return peso /(altura * altura)
}

fun classificarIMC(imc: Double): String {
    return when {
        imc < 18.5 -> "Abaixo do peso"
        imc in 18.5..24.9 -> "Peso normal"
        imc in 25.0..29.9 -> "Sobrepeso"
        else -> "Obesidade"
    }
}