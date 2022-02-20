package com.devsuperior.clientcrud.service;

import com.devsuperior.clientcrud.dto.ClientDTO;
import com.devsuperior.clientcrud.entity.Client;
import com.devsuperior.clientcrud.helper.ClientHelper;
import com.devsuperior.clientcrud.repository.ClientRepository;
import com.devsuperior.clientcrud.service.exception.ClientNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    @Autowired
    private ClientHelper helper;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable page) {
        Page<Client> result = repository.findAll(page);
        return result.map(ClientDTO::new);
    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> client = repository.findById(id);
        Client entity = client.orElseThrow(() -> new ClientNotFoundException("ID Client not found: "+id));
        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO insert(ClientDTO clientBody) {
        Client clientEntity = new Client();
        helper.convertDTOtoEntity(clientEntity, clientBody);
        clientEntity = repository.save(clientEntity);
        return new ClientDTO(clientEntity);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO clientDTO) {
        try {
            Optional<Client> clientEntity = repository.findById(id);
            Client entity = clientEntity.orElseThrow(() -> new ClientNotFoundException("ID Client not found: "+id));
            helper.convertDTOtoEntity(entity, clientDTO);
            entity = repository.save(entity);
            return new ClientDTO(entity);
        }catch (EntityNotFoundException e){
            throw new ClientNotFoundException("ID Client not found: "+id);
        }
    }

    @Transactional
    public void delete(Long id) {
        try{
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ClientNotFoundException("ID Client not found: "+id);
        }
    }
}
