package com.zskhousing.zskhousing.controller;

import com.zskhousing.zskhousing.dto.ApartmentDTO;
import com.zskhousing.zskhousing.dto.SuppliesConsumptionDTO;
import com.zskhousing.zskhousing.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping(value = "/{id}")
    public UserDTO getUserById(@PathVariable("id") long id) {
        //fix me
        return null;
    }


}
