package kg.itacademy.OnlineOrderClient.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
@Getter
@Setter
public class Delivery {

    @Id
    private Long id;

    @OneToOne
    @Column(name = "food_name")
    private String foodName;

    @OneToMany
    @Column(name = "schedule_time")
    private String scheduleTime;


    @Column(name = "order_address")
    private String orderAddress;
}
