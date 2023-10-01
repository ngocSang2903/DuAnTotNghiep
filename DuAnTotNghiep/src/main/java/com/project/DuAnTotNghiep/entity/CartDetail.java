package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CartDetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CartDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "productDetailId")
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    private int quantity;
    private Date createDate;
    private Date updateDate;
}