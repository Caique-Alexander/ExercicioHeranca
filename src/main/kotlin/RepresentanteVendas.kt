open class RepresentanteVendas(nome:String, sobrenome:String,
matricula:Int, idade:Int, diasTrabalhados:Int, feriasDiasTirados:Int,
salario:Double, anosTrabalhados:Int, var vendasFeitas: Double) :
    Empregado(nome, sobrenome, matricula, idade, diasTrabalhados,
        feriasDiasTirados, salario, anosTrabalhados) {

    var comissaoRepresentante: Double = 0.0
    fun calculaComissaoRepresentante(): Int {
        comissaoRepresentante = 0.1 * vendasFeitas
        println("Você receberá R$ $comissaoRepresentante de comissão.")
        return 0
    }

}