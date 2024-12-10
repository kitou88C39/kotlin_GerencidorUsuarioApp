package br.edu.ifpi.GerencidorUsuarioApp.model

import jakarta.Validation.constraints.NotBlank
import jakarta.Validation.constraints.Size
import org.hibernate.Validator.constraints.br.CPF

@Entity
data class Usuario (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @field:NotBlank(message = "Nome e obrigatorio")
    var nome: String = "",

    @field:NotBlank(message = "Email e obrigatorio")
    @field:Email(message = "Email invalido")
    var email: String = "",

    @field:NotBlank(message = "Cpf e obrigatorio")
    @field:CPF(message = "Cpf invalido")
    var cpf: String = "",

    @field:NotBlank(message = "senha e obrigatorio")
    @field:Size(min=6, max=12, message = "A senha deve ter entre 6 e 12 caracteres")
    var senha: String = "",

    var papel: String = ""
){

}
