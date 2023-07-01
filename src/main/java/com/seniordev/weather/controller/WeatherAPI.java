package com.seniordev.weather.controller;

import com.seniordev.weather.dto.WeatherDto;
import com.seniordev.weather.service.WeatherService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/weather")
public class WeatherAPI {

    private final WeatherService weatherService;

    public WeatherAPI(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public ResponseEntity<WeatherDto> getWeather(@PathVariable("city") @NotBlank String city) {
        return ResponseEntity.ok(weatherService.getWeatherByCityName(city));
    }
}
