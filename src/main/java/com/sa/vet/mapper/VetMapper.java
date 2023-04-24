package com.sa.vet.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.sa.vet.controller.dto.VetDto;
import com.sa.vet.entities.Vet;

@Mapper
public interface VetMapper {

	@Mapping(source = "vet.npiNo", target = "npiNo")
	@Mapping(source = "vet.userName", target = "userName")
	@Mapping(source = "vet.department", target = "department")
	@Mapping(source = "vet.clinic", target = "clinic")
	public VetDto convertToDto(Vet vet);

	@Mapping(source = "vetDto.npiNo", target = "npiNo")
	@Mapping(source = "vetDto.userName", target = "userName")
	@Mapping(source = "vetDto.firstName", target = "firstName")
	@Mapping(source = "vetDto.lastName", target = "lastName")
	@Mapping(source = "vetDto.avatar", target = "avatar")
	@Mapping(source = "vetDto.dob", target = "dob")
	@Mapping(source = "vetDto.gender", target = "gender")
	@Mapping(source = "vetDto.clinic", target = "clinic")
	@Mapping(source = "vetDto.mobileNo", target = "mobileNo")
	@Mapping(source = "vetDto.email", target = "email")
	@Mapping(source = "vetDto.address", target = "address")
	@Mapping(source = "vetDto.city", target = "city")
	@Mapping(source = "vetDto.state", target = "state")
	@Mapping(source = "vetDto.country", target = "country")
	@Mapping(source = "vetDto.status", target = "status")
	@Mapping(source = "vetDto.shortBiography", target = "shortBiography")
	@Mapping(source = "vetDto.departmentId", target = "departmentId")
	public Vet convertToEntity(VetDto vetDto);

}
