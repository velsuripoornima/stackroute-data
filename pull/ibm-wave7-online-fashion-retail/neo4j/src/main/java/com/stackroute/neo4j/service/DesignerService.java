package com.stackroute.neo4j.service;

import com.stackroute.neo4j.entity.Designer;
import com.stackroute.neo4j.entity.Manufacturer;
import com.stackroute.neo4j.entity.Order;
import com.stackroute.neo4j.entity.Supplier;
import com.stackroute.neo4j.repository.DesignerRepository;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class DesignerService {
    private DesignerRepository designerRepository;

    public DesignerService(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    }

    public Designer create(Designer designer) {
        return designerRepository.save(designer);
    }

    public void delete(Long id) {
        designerRepository.deleteById(id);
    }

    public Iterable<Designer> getAllDesigners() {
        return designerRepository.findAll();
    }

    public Designer update(Designer designer)
    {
        designer.setName(designer.getName());
        designer.setEmail(designer.getEmail());
        designer.setContactNumber(designer.getContactNumber());
        designer.setCity(designer.getCity());
        return designerRepository.save(designer);
      }
    public List<Supplier> match1() {
        return designerRepository.match1();
    }
    public List<Manufacturer> match2() {
        return designerRepository.match2();
    }
    public List<Order> match3(String name) {
        return designerRepository.match3(name);
    }

}
