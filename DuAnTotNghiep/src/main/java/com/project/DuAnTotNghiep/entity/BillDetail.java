package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "BillDetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BillDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paymentmethodid")
    private PaymentMethod paymentMethod;

    private String code;
    private Date confirmDate;
    private Date deliveryDate;
    private Date completionDate;
    private Date expectedDate;
    private double shipPrice;
    private double total;
    private String status;
    private Date updateDate;
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
}
