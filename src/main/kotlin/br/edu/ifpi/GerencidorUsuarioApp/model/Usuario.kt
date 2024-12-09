package br.edu.ifpi.GerencidorUsuarioApp.model

data class Usuario (

    @field:NotBlank(message = "Nome e obrigatorio")
    var nome: String = "",

    @field:NotBlank(message = "Email e obrigatorio")
    @field:Email(message = "Email invalido")
    var email: String = "",

    @field:NotBlank(message = "Cpf e obrigatorio")
    @field:Email(message = "Cpf invalido")
    var cpf: String = "",


    var senha: String = "",
    var papel: String = ""
){

}