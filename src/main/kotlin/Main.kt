fun main(args: Array<String>) {

    val caique: Empregado = Empregado("Caique", "Carvalho", 54545,
    28, 360, 30, 3500.0, 1)

    val representante: RepresentanteVendas = RepresentanteVendas("Henrique",
        "Lanzoni", 74657, 22, 720, 60,
    4000.0, 2, 32.0)

    val gerente = GerenteVendas("Felipe", "Alves", 38495, 22,
    1080, 90, 5000.0, 3, 42.0)

    gerente.tempoParaAposentadoria()
    gerente.tempoParaTirarFerias()
    gerente.calculaBonus()
    gerente.listaEquipe.put(1, representante)
    gerente.calculaComissaoGerente()

    representante.tempoParaAposentadoria()
    representante.tempoParaTirarFerias()
    representante.calculaBonus()
    representante.calculaComissaoRepresentante()

    caique.tempoParaAposentadoria()
    caique.tempoParaTirarFerias()
    caique.calculaBonus()





}