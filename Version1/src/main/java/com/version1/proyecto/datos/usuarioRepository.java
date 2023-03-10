package com.version1.proyecto.datos;

import org.springframework.data.repository.CrudRepository;

import com.version1.proyecto.negocio.modelo.Usuario;

public interface usuarioRepository extends CrudRepository<Usuario, Integer>{

}
