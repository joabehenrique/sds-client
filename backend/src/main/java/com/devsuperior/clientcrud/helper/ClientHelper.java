package com.devsuperior.clientcrud.helper;

import com.devsuperior.clientcrud.dto.ClientDTO;
import com.devsuperior.clientcrud.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientHelper {

    public void convertDTOtoEntity(Client entity, ClientDTO dto){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setChildren(dto.getChildren());
        entity.setBirthDate(dto.getBirthDate());
    }

}
