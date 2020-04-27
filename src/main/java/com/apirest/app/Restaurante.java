package com.apirest.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

//------------------------------Creación del modelo de la entidad (restaurante)------------------


@Data  //Lombok annotation, create getters, setters, hash, etc...
@Entity // This tells Hibernate to make a table out of this class
public class Restaurante {
	
	private @Id @GeneratedValue(strategy=GenerationType.AUTO) Long id;
	private String nombre;
	private String descripcion;
	private String telefono;
	private String url_img;
	private String url_tri;
	private long id_ubicaciones; //many to one
	
	Restaurante(){
		
	}
	
	Restaurante(String nombre, String descripcion, String telefono, String url_img, String url_tri, long id_ubicaciones){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.url_img = url_img;
		this.url_tri = url_tri;
		this.id_ubicaciones = id_ubicaciones;
	}
	
}
