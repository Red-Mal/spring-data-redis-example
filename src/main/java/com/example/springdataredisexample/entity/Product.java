package com.example.springdataredisexample.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
@ToString
public class Product implements Serializable {
    @Id
    private int id;
    private String name;
    private int qty;
    private long price;
}