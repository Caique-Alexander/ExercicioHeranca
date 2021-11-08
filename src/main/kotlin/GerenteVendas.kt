class GerenteVendas(nome:String, sobrenome:String,
                          matricula:Int, idade:Int, diasTrabalhados:Int, feriasDiasTirados:Int,
                          salario:Double, anosTrabalhados:Int, var totalVendas: Double) : Empregado(nome, sobrenome, matricula,
                idade, diasTrabalhados, feriasDiasTirados, salario, anosTrabalhados) {

    val listaEquipe = hashMapOf<Int, RepresentanteVendas>()


    fun calculaComissaoGerente() {
        var comissaoGerente: Double = 0.0

        for(representante in listaEquipe){
            totalVendas += representante.value.vendasFeitas
        }
        comissaoGerente = 0.03 * totalVendas
        println("Você receberá R$ $comissaoGerente de comissão.")

    }



}