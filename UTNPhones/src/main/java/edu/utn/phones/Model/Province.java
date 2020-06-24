package edu.utn.phones.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import edu.utn.phones.Interfaces.IUriInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Province implements IUriInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProvince;


    @NotNull
    String nameProvince;


    @Override
    @JsonIgnore
    public Integer getId() {
        return idProvince;
    }
}
