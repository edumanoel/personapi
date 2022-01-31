package com.dio.personapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.dio.personapi.dto.request.PersonDTO;
import com.dio.personapi.entities.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

	@Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
	Person toModel(PersonDTO dto);

	PersonDTO toDTO(Person dto);
}
