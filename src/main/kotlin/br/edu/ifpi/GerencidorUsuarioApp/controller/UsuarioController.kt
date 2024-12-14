package br.edu.ifpi.GerencidorUsuarioApp.controller
import org.springframework.stereotype.Controller

@Controller
class UsuarioController {

    @Autowired
    lateinit var repositorio: UsuarioRepository

    @GetMapping("/formulario/cadastro")
    fun abrirFormularioCadastro(model: Model): String {

        val usuario = Usuario()

        model.addAttribute("usuario", usuario)

        return "formulario-cadastro"   
    }

    @PostMapping("/cadastrar")
    fun cadastrarUsuario(@Validated usuario: Usuario, result: BindingResult): String{

        if(result.hasErrors()){
            return "formulario-cadastro"
        }

        println(usuario)
        repositorio.save(usuario)

        return "redirect:/home"
    }

    @GetMapping("/home")
    fun abrirHome(model: Model): String{

        val usuarios = repositorio.findAll()
        model.addAttribute("usuarios", usuarios)
        return "home"
    }

    @GetMapping("/formulario/edicao")
    fun abrirFormularioCadastro(model: Model): String{

        val usuarios = repositorio.findAll()
        model.addAttribute("usuarios", usuarios)
        return "formulario-edicao"
    }
}