import kotlin.math.min

open class Empregado(var nome: String, var sobrenome: String, var matricula: Int,
                     var idade: Int, var diasTrabalhados: Int, var feriasDiasTirados: Int,
                     var salario: Double, var anosTrabalhados: Int) {

    fun tempoParaAposentadoria() {
        var aposentadoria = min(60 - idade, 40 - anosTrabalhados)
        return println("Faltam $aposentadoria anos para poder se aposentar.")
    }

    fun tempoParaTirarFerias() {
        var tempoDeFerias = (diasTrabalhados/360)*(30 - feriasDiasTirados)
        return println("Tempo de férias é $tempoDeFerias.")
    }

    fun calculaBonus() {
        var bonus = 2.2*salario
        return println("O bonus é de ${bonus.toInt()}.")
    }



}
