package edu.utn.phones.Model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.utn.phones.Iterfaces.IUriInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@Table(name = "provinces")
public class Province implements IUriInterface {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProvince;


    @NotNull
    @Column
    String nameProvince;


    @Override
    @JsonIgnore
    public Integer getId() {
        return idProvince;
    }
}
