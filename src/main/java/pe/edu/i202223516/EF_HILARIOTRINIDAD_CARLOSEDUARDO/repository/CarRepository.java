package pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
