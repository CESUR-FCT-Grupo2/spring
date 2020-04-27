package com.apirest.app;

import org.springframework.data.repository.CrudRepository;

import com.apirest.app.Restaurante;

//------------------Repositorio donde se guardan los registros del modelo (restaurante)-----------------


//This will be AUTO IMPLEMENTED by Spring into a Bean called restauranteRepository
//CRUD refers Create, Read, Update, Delete

public interface RestauranteRepository extends CrudRepository<Restaurante, Integer>{

}

// Spring automatically implements this repository interface in a bean that has the same name 
// (with a change in the case — it is called restauranteRepository).