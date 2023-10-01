package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PaymentMethod")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentMethod implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private int status;
}