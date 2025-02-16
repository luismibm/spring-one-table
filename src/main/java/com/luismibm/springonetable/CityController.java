package com.luismibm.springonetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController @RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public List<City> getCities() {
        return (List<City>) cityRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(value = "id") Long id) {
        Optional<City> c = cityRepository.findById(id);
        if (c.isPresent()) {
            return ResponseEntity.ok().body(c.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public City createCity(@RequestBody City c) {
        return cityRepository.save(c);
    }

    @PutMapping("/{id}")
    public ResponseEntity<City> updateCity(@PathVariable Long id, @RequestBody City updatedCity) {
        Optional<City> optionalCity = cityRepository.findById(id);
        if (optionalCity.isPresent()) {
            City city = optionalCity.get();
            city.setCity_name(updatedCity.getCity_name());
            return ResponseEntity.ok().body(cityRepository.save(city));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityRepository.deleteById(id);
    }

}