package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.ContactDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContacApi {
    @GetMapping(value = "/contact")
    public ContactDto getContact(){
        return new ContactDto(10L, "HermenEsteban", "TMartinez", "+57 310 821 21 21", "hermen@gmail.com");
    }
}
