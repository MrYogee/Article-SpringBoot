package com.hackerrank.weather.model;

public class CityWeather {

	private String city;

	private String state;

	private Float lat;

	private Float lon;

	private Float lowest;

	private Float highest;

	/**
	 * @param city
	 * @param state
	 * @param lat
	 * @param lon
	 * @param lowest
	 * @param highest
	 */
	public CityWeather(String city, String state, Float lat, Float lon, Float lowest, Float highest) {
		super();
		this.city = city;
		this.state = state;
		this.lat = lat;
		this.lon = lon;
		this.lowest = lowest;
		this.highest = highest;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Float getLat() {
		return lat;
	}

	public void setLat(Float lat) {
		this.lat = lat;
	}

	public Float getLon() {
		return lon;
	}

	public void setLon(Float lon) {
		this.lon = lon;
	}

	public Float getLowest() {
		return lowest;
	}

	public void setLowest(Float lowest) {
		this.lowest = lowest;
	}

	public Float getHighest() {
		return highest;
	}

	public void setHighest(Float highest) {
		this.highest = highest;
	}

}
