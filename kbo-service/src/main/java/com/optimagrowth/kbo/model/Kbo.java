package com.optimagrowth.kbo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Getter
@Setter
@Table(name="kbo")
public class Kbo {
    @Id
    private Integer id;

    private String playerNum;
    private String name;
    private String position;
    private String teamName;
    private String birthday;
    private String career;
    private Integer height;
    private Integer weight;
}
