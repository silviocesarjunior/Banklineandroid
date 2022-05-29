package me.dio.bankline_android.domain

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    // TODO Mapear "IdConta -> idCorrentista"
    val idCorrentista: Int
)
