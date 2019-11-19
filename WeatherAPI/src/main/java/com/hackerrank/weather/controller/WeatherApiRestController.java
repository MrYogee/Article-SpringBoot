package com.hackerrank.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.weather.model.CityWeather;
import com.hackerrank.weather.model.Weather;
import com.hackerrank.weather.service.WeatherService;

@RestController
public class WeatherApiRestController {

	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(WeatherApiRestController.class);

	/**
	 * <code>WeatherService</code> instance.
	 */

	@Autowired
	private WeatherService weatherService;

	/**
	 * This method is exposing a REST API add whether
	 * 
	 * @return @
	 */
	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	@PostMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> addWeather(@RequestBody Weather weather) {

		weatherService.addWeather(weather);
		boolean duplicate = false;
		if (duplicate) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}

		// LOGGER.debug("Successfully added weather");
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	/**
	 * This method is exposing a REST API add whether delete
	 * 
	 * @return @
	 */
	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	// @DeleteMapping(value = "/erase", produces =
	// MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteWeather() {

		boolean isError = weatherService.deleteWeather();
		if (isError) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		// LOGGER.debug("Successfully added weather");
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	/**
	 * This method is exposing a REST API add whether delete
	 * 
	 * @return @
	 */
	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	@DeleteMapping(value = "/erase", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteWeatherByRange(@PathVariable(name = "start", required = true) String startDate,
		@PathVariable(name = "end", required = false) String endDate,
		@PathVariable(name = "lat", required = false) String latitude,
		@PathVariable(name = "long", required = false) String longitude) {
		boolean isError;
		if (startDate != null && startDate != null && latitude != null && longitude != null) {
			isError = weatherService.deleteWeather();
		}
		weatherService.deleteWeather(startDate, endDate, latitude, longitude);
		boolean error = false;
		if (error) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		// LOGGER.debug("Successfully added weather");
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	/**
	 * This method is exposing a REST API to get whether delete
	 * 
	 * @return @
	 */
	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	@GetMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Weather>> getAllWeather(@PathVariable(name = "lat", required = false) String latitude,
		@PathVariable(name = "long", required = false) String longitude) {
		List<Weather> weathers;
		if (latitude != null && longitude != null) {
			weathers = weatherService.getWeather();
		}
		weathers = weatherService.getWeather(latitude, longitude);
//		if (error) {
//			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}

		// LOGGER.debug("Successfully added weather");
		return new ResponseEntity<List<Weather>>(weathers, HttpStatus.OK);
	}

	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	//@GetMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Weather>> getAllWeather() {

		List<Weather> weathers = weatherService.getWeather();
//			if (error) {
//				return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
//			}
		// LOGGER.debug("Successfully added weather");
		return new ResponseEntity<List<Weather>>(weathers, HttpStatus.OK);
	}

	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	@GetMapping(value = "/weather/temperature", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CityWeather>> getCityWeather(@PathVariable(name = "start") String startDate,
		@PathVariable(name = "end") String endDate) {

		List<CityWeather> cityWeather = weatherService.getCityWeather(startDate, endDate);
		// LOGGER.debug("Successfully added weather");
		return new ResponseEntity<List<CityWeather>>(cityWeather, HttpStatus.OK);
	}
}
