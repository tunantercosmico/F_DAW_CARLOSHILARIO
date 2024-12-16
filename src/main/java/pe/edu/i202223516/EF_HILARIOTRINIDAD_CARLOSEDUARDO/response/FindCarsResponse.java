package pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.response;

import pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
