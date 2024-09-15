fun main(){
    val tabuleiro = Array(3){Array(3) {' '} }
    var jogadorAtual = 'X'
    var jogoEmAndamento = true

    while (jogoEmAndamento){
        imprimirTabuleiro(tabuleiro)
        println("Jogador $jogadorAtual, faça sua jogada (linha e coluna): ")
        val linha = readLine()!!.toInt()
        val coluna = readLine()!!.toInt()

        if (linha !in 0..2 || coluna !in 0..2){
            println("Jogada inválida. Tente novamente")
            continue
        }

        if (tabuleiro[linha][coluna] != ' ') {
            println("A célula já está ocupada. Tente novamente.")
            continue
        }

        tabuleiro[linha][coluna] = jogadorAtual
        if (verificarVencedor(tabuleiro, jogadorAtual)) {
            imprimirTabuleiro(tabuleiro)
            println("Parabéns! Jogador $jogadorAtual venceu!")
            jogoEmAndamento = false
        } else if (tabuleiro.all { linha -> linha.all { it != ' ' } }) {
            imprimirTabuleiro(tabuleiro)
            println("Empate!")
            jogoEmAndamento = false
        } else {
            jogadorAtual = if (jogadorAtual == 'X') 'O' else 'X'
        }
    }
}

fun imprimirTabuleiro(tabuleiro: Array<Array<Char>>) {
    println("  0 1 2")
    for (i in tabuleiro.indices) {
        print("$i ")
        for (j in tabuleiro[i].indices) {
            print("${tabuleiro[i][j]} ")
        }
        println()
    }
}

fun verificarVencedor(tabuleiro: Array<Array<Char>>, jogador: Char): Boolean {
    for (i in 0..2) {
        if (tabuleiro[i].all { it == jogador } || tabuleiro.all { it[i] == jogador }) {
            return true
        }
    }

    if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
        return true
    }
    if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
        return true
    }

    return false
}