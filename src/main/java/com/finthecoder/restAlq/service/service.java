package com.finthecoder.restAlq.service;

import com.finthecoder.restAlq.model.Pos;
import com.finthecoder.restAlq.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class service {
@Autowired
private Repo repo;



public Pos addOrder(Pos pos){
   return repo.save(pos);
}

public Pos updateOrder(Pos pos1, long id){
   Pos pos = repo.getOne(id);
   if (pos1.getName()!=null){
       pos.setName(pos1.getName());
   }if (pos1.getDate()!=null){
       pos.setDate(pos1.getDate());
    }if (pos1.getItems()!=null){
       pos.setItems(pos1.getItems());
    }if (pos1.getNotes()!=null){
        pos.setNotes(pos1.getNotes());
    }if (pos1.getPaymentType()!=null){
       pos.setPaymentType(pos1.getPaymentType());
    }if(pos1.getTotalPrice()<=00.00) {
       pos.setTotalPrice(pos1.getTotalPrice());
    }if (pos1.getPosId()!=null){
       pos.setPosId(pos1.getPosId());
        }
        return repo.save(pos);
    }


}
