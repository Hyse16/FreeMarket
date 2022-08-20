package freeMarket.shop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Detail {

    private String street;
    private String PhoneNum;
}
