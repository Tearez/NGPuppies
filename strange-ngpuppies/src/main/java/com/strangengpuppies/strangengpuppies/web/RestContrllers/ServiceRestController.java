package com.strangengpuppies.strangengpuppies.web.RestContrllers;


import com.strangengpuppies.strangengpuppies.model.Service;
import com.strangengpuppies.strangengpuppies.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/service")
public class ServiceRestController {
    private final ServicesService servicesService;

    @Autowired
    public ServiceRestController(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @GetMapping("/allservices")
    public List<Service> allServices() {
        return servicesService.listAll();
    }

    @GetMapping("/byId/{id}")
    public Service byId(@PathVariable("id") String id) {
        int intID = Integer.parseInt(id);
        return servicesService.getById(intID);
    }
}
