package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Information")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Information implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String address;
    private String ward;
    private String district;
    private String city;
    private String country;
    private Date createDate;
    private Date updateDate;
    private int status;
    @JoinColumn(name = "accountId")
    @ManyToOne
    private Account accountId;
}