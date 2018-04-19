package me.soulyana.carrental.Repository;

import me.soulyana.carrental.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
