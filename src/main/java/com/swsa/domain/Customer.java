package com.swsa.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "Customer")
@ToString
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Customer {

    @Id
    @ToString.Exclude
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customerId")
    private Long customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "mobileNo")
    private Long mobileNo;

    @Column(name = "address")
    private String address;

    @ToString.Exclude
    private String email;

    @Column(name = "aadhaarNo")
    private Long aadhaarNo;

    @ToString.Exclude
    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdTime;

    @Column(nullable = false)
    @CreatedDate
    @LastModifiedDate
    private LocalDateTime updatedTime;

    public Customer(Long customerId,String name,Long mobileNo, String address, String email,Long aadhaarNo)
    {
        this.customerId=customerId;
        this.name=name;
        this.mobileNo=mobileNo;
        this.address = address;
        this.email = email;
        this.aadhaarNo=aadhaarNo;
    }
}
