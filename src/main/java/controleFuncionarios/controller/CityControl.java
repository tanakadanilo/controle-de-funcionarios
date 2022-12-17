package controleFuncionarios.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import controleFuncionarios.dao.CityDao;
import controleFuncionarios.entity.auxiliary.City;

@Component
@ViewScoped
public class CityControl {

	@Autowired
	private CityDao cityDao;

	private City city = new City();

	private List<City> cities = new ArrayList<>();

	public CityControl() {
	}

	public CityDao getCityDao() {
		return cityDao;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@PostConstruct
	private void init() {
		list();
	}

	private void list() {
		this.cities = cityDao.findAll();
	}
}
