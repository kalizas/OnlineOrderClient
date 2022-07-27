package kg.itacademy.OnlineOrderClient.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
@Getter
@Setter
public class Company {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;
}
