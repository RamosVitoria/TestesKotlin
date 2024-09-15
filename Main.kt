fun main() {
    // Cria um Scanner para ler a entrada do usuário
    val scanner = java.util.Scanner(System.`in`)

    // Solicita ao usuário o número de notas
    print("Digite o número de notas: ")
    val numNotas = scanner.nextInt()

    // Cria uma lista para armazenar as notas
    val notas = mutableListOf<Double>()

    // Solicita as notas ao usuário
    for (i in 1..numNotas) {
        print("Digite a nota $i: ")
        val nota = scanner.nextDouble()
        notas.add(nota)
    }

    // Calcula a média
    val media = notas.average()

    // Exibe o resultado
    println("A média das notas é: $media")
}
