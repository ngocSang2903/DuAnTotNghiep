package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ProductDetail")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sizeId")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "colorId")
    private Color color;

    private int quantity;
    private double price;
    private Date createDate;
    private Date updateDate;
    private int status;

    @ManyToOne
    @JoinColumn(name = "imageId")
    private Image image;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
}
