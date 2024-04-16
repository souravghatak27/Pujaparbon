package com.pujaparbon.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pujaparbon.location.entity.LocationEntity;



public interface LocationRepository extends JpaRepository<LocationEntity, Integer>{

}
