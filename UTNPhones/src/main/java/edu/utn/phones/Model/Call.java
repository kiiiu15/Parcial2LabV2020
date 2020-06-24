package edu.utn.phones.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import edu.utn.phones.Interfaces.IUriInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Call implements IUriInterface {

    @Id
    @GeneratedValue
    Integer idCall;


    @ManyToOne(fetch = FetchType.EAGER)
    Bill billCall;

    @NotNull
    String  numberOriginCall;
    @NotNull
    String  numberDestinationCall;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    City cityOriginCall;
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    City cityDestinationCall;
    @NotNull
    Float   priceMinuteCall;
    @NotNull
    Integer durationSegCall;

    @NotNull
    Float   priceTotalCall;

    @NotNull
    Date dateCall;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    PhoneLine lineCall;

    @Override
    @JsonIgnore
    public Integer getId() {
        return idCall;
    }
}
