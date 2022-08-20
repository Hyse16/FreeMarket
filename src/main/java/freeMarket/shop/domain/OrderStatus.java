package freeMarket.shop.domain;

import javax.persistence.Embeddable;

@Embeddable
public enum OrderStatus {
    ORDER, CANCEL
}
