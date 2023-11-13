package com.daveproject.carddatabase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand, model, color, registrationNumber;
    private int modelYear, price;
    //Muchos carros pueden pertenecer a un dueño LAZY para que se actualice cada vez que se realice alguna operacion que afecte la relacion
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;

//    @ManyToMany(mappedBy = "cars")
//    private Set<Owner> owners = new HashSet<Owner>();
    public Car (String brand,String model,String color,String registrationNumber,int modelYear,int price,Owner owner){
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;
        this.modelYear = modelYear;
        this.price = price;
        this.owner = owner;
    }
}
