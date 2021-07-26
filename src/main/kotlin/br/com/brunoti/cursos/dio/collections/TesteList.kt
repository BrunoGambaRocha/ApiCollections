package br.com.brunoti.cursos.dio.collections

fun main() {
    val joao = Funcionario("João", 1000.0,"CLT")
    val pedro = Funcionario("Pedro", 2000.0,"PJ")
    val maria = Funcionario("Maria", 4000.0,"CLT")

    val funcionarios = listOf(joao, pedro, maria)

    println("--Funcionarios-----------")
    funcionarios.forEach { println(it) }

    println("--find---Maria--------")
    println(funcionarios.find { it.nome == "Maria" })

    println("--sortedBy---salario--------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("--groupBy---tipoContratacao--------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome =  $nome
            Salário = $salario
        """.trimIndent()
}