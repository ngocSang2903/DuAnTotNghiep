package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
    private double promotionPrice;
    private Date createDate;
    private Date updateDate;
    private int status;
    private int invoiceType;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Account account;

    @OneToMany
    private List<BillDetail> billDetailList;
}