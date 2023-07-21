package com.example.EjemploModelMapper;

import com.example.EjemploModelMapper.DTO.Request.UserRequestDTO;
import com.example.EjemploModelMapper.Model.User;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploModelMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploModelMapperApplication.class, args);

		ModelMapper modelMapper = new ModelMapper();

		//User user = new User();

		// Creamos una instancia de UserRequestDTO con datos de ejemplo
		UserRequestDTO userRequestDTO = new UserRequestDTO();
		userRequestDTO.setEmail("pepito@gmail.com");
		userRequestDTO.setPassword("pepito");
		userRequestDTO.setName("Jorgelin");

		// Convertimos el objeto UserRequestDTO a un objeto User
		User user = modelMapper.map(userRequestDTO, User.class);

		// Ahora podemos trabajar con el objeto User
		System.out.println("Email: " + user.getEmail());
		System.out.println("Contraseña: " + user.getPassword());
		System.out.println("Nombre: " + user.getName());
	}

}
