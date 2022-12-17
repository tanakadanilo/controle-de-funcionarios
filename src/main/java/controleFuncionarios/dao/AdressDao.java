package controleFuncionarios.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import controleFuncionarios.entity.auxiliary.Adress;


public interface AdressDao extends JpaRepository<Adress, Integer> {

}
