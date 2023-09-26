package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Bill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int quantity;
    private double price;
    private double promotionprice;
    private Date createdate;
    private Date updatedate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;
}