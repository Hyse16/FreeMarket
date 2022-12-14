package freeMarket.shop.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Delivery {


    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Detail detail;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;
}
