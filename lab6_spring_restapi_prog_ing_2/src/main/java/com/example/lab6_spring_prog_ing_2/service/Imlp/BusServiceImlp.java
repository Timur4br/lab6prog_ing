package com.example.lab6_spring_prog_ing_2.service.Imlp;

import com.example.lab6_spring_prog_ing_2.entity.Bus;
import com.example.lab6_spring_prog_ing_2.repository.BusRepository;
import com.example.lab6_spring_prog_ing_2.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImlp implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Override
    public List<Bus> findAllBus() {
        return busRepository.findAll();
    }

}
