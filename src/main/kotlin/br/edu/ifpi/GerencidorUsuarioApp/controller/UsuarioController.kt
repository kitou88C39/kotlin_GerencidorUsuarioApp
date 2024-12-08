package br.edu.ifpi.GerencidorUsuarioApp.controller
import org.springframework.stereotype.Controller

@Controller
class UsuarioController {

    @GetMapping("/formulario/cadastro")
    fun abrirFormularioCadastro(model: Model): String {

        val usuario = Usuario()

        model.addAttribute("usuario", usuario)

        return "formulario-cadastro"   
    }
}