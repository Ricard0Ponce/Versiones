package com.version1.proyecto.negocio.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id; 
private String nombre; 
private String Apellidos; 
private int edad; 
private String telefono;  
private String servicio; 

public Usuario(int id, String nombre, String apellidos, int edad, String telefono, String servicio) {
	super();
	this.id = id;
	this.nombre = nombre;
	Apellidos = apellidos;
	this.edad = edad;
	this.telefono = telefono;
	this.servicio = servicio;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return Apellidos;
}

public void setApellidos(String apellidos) {
	Apellidos = apellidos;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getServicio() {
	return servicio;
}

public void setServicio(String servicio) {
	this.servicio = servicio;
}
}

