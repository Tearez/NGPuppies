package com.strangengpuppies.strangengpuppies.repository.base;

<<<<<<< HEAD
=======

>>>>>>> branch-ivelin
import com.strangengpuppies.strangengpuppies.model.Service;

import java.util.List;

public interface ServiceRepository {
<<<<<<< HEAD
    Service getById(int id);
    List<Service> getAll();
=======
  List<Service> getAllService();
  
  Service getServiceByID(int id);
  
  void createService(String name);
  
  void updateService(int id, String name);
  
  void deleteService(int id);
  
>>>>>>> branch-ivelin
}
