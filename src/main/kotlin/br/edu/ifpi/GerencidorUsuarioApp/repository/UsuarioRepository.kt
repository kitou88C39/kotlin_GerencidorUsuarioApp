package br.edu.ifpi.GerencidorUsuarioApp.repository

import br.edu.ifpi.GerencidorUsuarioApp.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long>{}