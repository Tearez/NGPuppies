package com.strangengpuppies.strangengpuppies.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table (name = "roles")
public class Role {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column (name = "roleID")
  private int id;
  
  @NotNull
  @Size (min = 1)
  @Column (name = "name")
  private String name;
  
  @OneToMany (cascade = CascadeType.ALL,
		fetch = FetchType.EAGER,
		mappedBy = "role")
  @JsonIgnore
  private List<User> users;
  
  public Role() {
  }
  
  public Role(@NotNull @Size (min = 1) String name) {
    this.name = name;
  }
  
  public Role(String name, List<User> users) {
    this.name = name;
    this.users = users;
  }
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
