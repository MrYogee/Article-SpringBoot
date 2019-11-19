package com.hackerrank.weather.repository;

import java.util.Date;

import com.hackerrank.weather.model.Weather;

public interface WeatherRepository {
	
	public void addWeather(Weather weather);

	public void addWeather(Long id, Date dateRecorded, Float[] temperature);
}
