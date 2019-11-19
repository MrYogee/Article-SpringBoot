package com.hackerrank.weather.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerrank.weather.model.CityWeather;
import com.hackerrank.weather.model.Weather;
import com.hackerrank.weather.repository.LocationRepository;
import com.hackerrank.weather.repository.WeatherRepository;
import com.hackerrank.weather.service.WeatherService;;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private WeatherRepository weatherRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public void addWeather(Weather weather) {
		weatherRepository.addWeather(weather.getId(),weather.getDateRecorded(),weather.getTemperature());
		locationRepository.addLocation(weather.getId(),weather.getLocation());
	}

	@Override
	public boolean deleteWeather() {
		return true;
	}

	@Override
	public void deleteWeather(String startDate, String endDate, String latitude, String longitude) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Weather> getWeather() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Weather> getWeather(String latitude, String longitude) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CityWeather> getCityWeather(String startDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}
}
