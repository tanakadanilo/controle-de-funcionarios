package controleFuncionarios.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import controleFuncionarios.dao.AdressDao;
import controleFuncionarios.entity.auxiliary.Adress;

@Repository
public class AdressControl {

	@Autowired
	private AdressDao adressDao;

	private Adress adress = new Adress();

	private List<Adress> adresses = new ArrayList<>();

	public AdressControl() {
	}

	public AdressDao getAdressDao() {
		return adressDao;
	}

	public void setAdressDao(AdressDao adressDao) {
		this.adressDao = adressDao;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public List<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}

	@PostConstruct
	private void init() {
		list();
	}

	private void list() {
		this.adresses = adressDao.findAll();
	}
}
