package pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.response;

import pe.edu.i202223516.EF_HILARIOTRINIDAD_CARLOSEDUARDO.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
