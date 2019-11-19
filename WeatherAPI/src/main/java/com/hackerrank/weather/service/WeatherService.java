package com.hackerrank.weather.service;

import java.util.List;

import com.hackerrank.weather.model.CityWeather;
import com.hackerrank.weather.model.Weather;

public interface WeatherService {

	void addWeather(Weather weather);

	boolean deleteWeather();

	void deleteWeather(String startDate, String endDate, String latitude, String longitude);

	List<Weather> getWeather();

	List<Weather> getWeather(String latitude, String longitude);

	List<CityWeather> getCityWeather(String startDate, String endDate);
}
