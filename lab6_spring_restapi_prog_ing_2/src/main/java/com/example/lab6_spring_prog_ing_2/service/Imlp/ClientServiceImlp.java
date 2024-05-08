package com.example.lab6_spring_prog_ing_2.service.Imlp;




import com.example.lab6_spring_prog_ing_2.entity.Client;
import com.example.lab6_spring_prog_ing_2.repository.ClientRepository;
import com.example.lab6_spring_prog_ing_2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImlp implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAllClient(){
        return clientRepository.findAll();
    }
}
