package com.project.myApplication.DAO;

import com.project.myApplication.DTO.Client;
import com.project.myApplication.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ClientDAO {

    private final ClientRepository clres;

    @Autowired
    public ClientDAO(ClientRepository clres) {
        this.clres = clres;
    }

    public Client saveClient(Client c) {
        return clres.save(c);
    }

    public String getByName(String name) {
        List<Client> list = clres.findByName(name);
        return "Records are: " + list;
    }

    public List<Client> findClientsByName(String name) {
        List<Client> list = clres.findByName(name);
        return list == null ? Collections.emptyList() : list;
    }

    public Client deleteById(int id) {
        Optional<Client> op = clres.findById(id);
        if(op.isPresent()) {
            return op.get();
        }
        return null;
    }

    public Client findById(int id) {
        Optional<Client> op = clres.findById(id);
        if(op.isPresent()) {
            return op.get();
        }
        return null;
    }

    public Client updateById(int id, Client updatedClient) {
        Optional<Client> optional = clres.findById(id);

        if (optional.isPresent()) {
            Client ex = optional.get();

            ex.setName(updatedClient.getName());
            ex.setEmail(updatedClient.getEmail());
            ex.setAge(updatedClient.getAge());

            return clres.save(ex);
        }

        return null;
    }

    public List<Client> updateByName(String name, Client updatedClient) {
        List<Client> clients = clres.findByName(name);

        if (clients != null && !clients.isEmpty()) {
            for (Client c : clients) {
                c.setName(updatedClient.getName());
                c.setEmail(updatedClient.getEmail());
                c.setAge(updatedClient.getAge());
            }

            return clres.saveAll(clients);
        }

        return Collections.emptyList();
    }

    public List<Client> findByAge(int age) {
        return clres.findByAge(age);
    }

    public List<Client> updateByAge(int age, Client updatedClient) {
        List<Client> clients = clres.findByAge(age);

        if (clients != null && !clients.isEmpty()) {
            for (Client c : clients) {
                c.setName(updatedClient.getName());
                c.setEmail(updatedClient.getEmail());
                c.setAge(updatedClient.getAge());
            }

            return clres.saveAll(clients);
        }

        return Collections.emptyList();
    }
}
