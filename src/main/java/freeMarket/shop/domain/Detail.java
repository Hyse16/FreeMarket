package freeMarket.shop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Detail {

    private String street;
    private String PhoneNum;

    public Detail() {
    }

    public Detail(String street, String phoneNum) {
        this.street = street;
        PhoneNum = phoneNum;
    }
}
