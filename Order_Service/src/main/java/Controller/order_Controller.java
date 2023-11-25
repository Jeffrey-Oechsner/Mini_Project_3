package Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class order_Controller {
    private final order_Service service;
    @Autowired
    public order_Controller(order_Service service) {
        this.service = service;
    }

    @PostMapping(value = "/createorder")
    public void createorder(@Valid @RequestBody order_DTO order){
        service.create();
    }

}
