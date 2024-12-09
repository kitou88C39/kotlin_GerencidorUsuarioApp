package br.edu.ifpi.GerencidorUsuarioApp.model

data class Usuario (

    @field:NotBlank(message = "Nome e obrigatorio")
    var nome: String = "",
    @field:NotBlank(message = "Email e obrigatorio")
    var email: String = "",
    var cpf: String = "",
    var senha: String = "",
    var papel: String = ""
){

}