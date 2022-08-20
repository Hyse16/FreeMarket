package freeMarket.shop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("I")
@Getter
@Setter
public class Instrument extends Item {

    private String type;
    private String color;
}
