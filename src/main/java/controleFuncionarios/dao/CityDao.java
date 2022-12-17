package controleFuncionarios.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controleFuncionarios.entity.auxiliary.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {

}
