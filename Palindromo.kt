fun main(){
    val scanner = java.util.Scanner(System.`in`)

    print("Digite uma palavra/frase para verificar se ela é um palindromo: ")
    val entrada = scanner.nextLine()

    val resultado = verificarPalindromo(entrada)

    if(resultado){
        println("A palavra/frase é um palindromo")
    }else{
        println("A palavra/frase não é um palindromo")
    }
}

fun verificarPalindromo(texto : String) : Boolean{
    val textoLimpo = texto
        .filter { it.isLetterOrDigit() }
        .toLowerCase()

    return textoLimpo == textoLimpo.reversed()
}