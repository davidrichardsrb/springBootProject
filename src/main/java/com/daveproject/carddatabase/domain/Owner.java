package com.daveproject.carddatabase.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerId;
    private String firstName, lastName;
//    //Un dueño puede tener un solo auto
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private List<Car> cars;
//    @ManyToMany(cascade = CascadeType.PERSIST)
//    @JoinTable(name = "car_owner",joinColumns={
//            @JoinColumn(name = "ownerid")},
//            inverseJoinColumns =
//            {
//                @JoinColumn(name = "id")
//    })
//    private Set<Car> cars = new HashSet<Car>();
    public Owner (String firstName, String lastname){
        super();
        this.firstName = firstName;
        this.lastName = lastname;
    }

}
