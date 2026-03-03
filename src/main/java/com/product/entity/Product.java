package com.product.entity;

import javax.persistence.*;

@Entity
@Table(name = "Skill2")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    // Change to AUTO or SEQUENCE to test different strategies
    private int pid;

    @Column(name = "pname")
    private String pname;

    @Column(name = "pdescription")
    private String pdescription;

    @Column(name = "price")
    private int price;

    @Column(name = "pquantity")
    private int quantity;

    public Product() {}

    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }

    public String getPdescription() { return pdescription; }
    public void setPdescription(String pdescription) { this.pdescription = pdescription; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}