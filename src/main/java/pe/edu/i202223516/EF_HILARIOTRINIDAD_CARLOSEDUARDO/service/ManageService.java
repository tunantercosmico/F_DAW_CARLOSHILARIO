package pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.service;

import pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.dto.CarDetailDto;
import pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.dto.CarDto;
import pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;
}
