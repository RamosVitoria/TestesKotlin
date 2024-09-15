fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Escolha uma operação:")
    println("1. Adição")
    println("2. Subtração")
    println("3. Multiplicação")
    println("4. Divisão")
    print("Digite o número da operação desejada (1/2/3/4): ")
    val escolha = scanner.nextInt()

    print("Digite o primeiro número: ")
    val num1 = scanner.nextDouble()
    print("Digite o segundo número: ")
    val num2 = scanner.nextDouble()

    val resultado = when (escolha) {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> {
            if (num2 != 0.0) num1 / num2 else {
                println("Erro: Divisão por zero não é permitida.")
                return
            }
        }
        else -> {
            println("Opção inválida.")
            return
        }
    }

    println("O resultado é: %.2f".format(resultado))
}
