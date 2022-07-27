package kg.itacademy.OnlineOrderClient.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@Getter
@Setter
public class Booking {

    @Id
    private Long id;

    @Column(name = "table_number")
    private String tableNumber;
}
