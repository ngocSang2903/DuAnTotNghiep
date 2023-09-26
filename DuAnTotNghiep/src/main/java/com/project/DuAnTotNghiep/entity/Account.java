package com.project.DuAnTotNghiep.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private Date birthDay;
    private String phoneNumber;
    private String email;
    private String password;
    private Date createDate;
    private Date updateDate;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role roleId;
}