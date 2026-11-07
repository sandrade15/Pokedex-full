package com.regi.poketeste.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {
    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "id")
    private Integer id;

    @Column(name = "form")
    private String form;

    @Column(name = "type1")
    private String type1;

    @Column(name = "type2")
    private String type2;

    @Column(name = "total")
    private Integer total;

    @Column(name = "hp")
    private Integer hp;

    @Column(name = "attack")
    private Integer attack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "sp_atk")
    private Integer spAtk;

    @Column(name = "sp_def")
    private Integer spDef;

    @Column(name = "speed")
    private Integer speed;

    @Column(name = "generation")
    private Integer generation;






//tem que ter isso aqui V
    public Pokemon() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType1() {
        return type1;
    }

    public String getForm(){
        return form;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(Integer spAtk) {
        this.spAtk = spAtk;
    }

    public Integer getSpDef() {
        return spDef;
    }

    public void setSpDef(Integer spDef) {
        this.spDef = spDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    // Getters e Setters
}