package freeMarket.shop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
@Getter
@Setter
public class Cloth extends Item {

    private String Size;
    private String Color;
}
