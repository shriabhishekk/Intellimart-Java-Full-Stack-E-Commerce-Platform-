package com.telusko.ecom_proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

//we will use Lombok for boiler-plate codes for getters, setters and constructors

@Entity                 //To create it as a table (h2)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id                 // To make id as primary-key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Below annotation for auto-generated ID
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;


    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;

    //We will use jackson to change the format of the date. jackson helps in object to json and also othe conversions

//    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")

    private Date releaseDate;
    private boolean productAvailable;
    private int quantity;

    public Product(Integer id, String name, String description, String brand, BigDecimal price, String category, String imageName, String imageType, byte[] imageData, Date releaseDate, boolean productAvailable, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.imageName = imageName;
        this.imageType = imageType;
        this.imageData = imageData;
        this.releaseDate = releaseDate;
        this.productAvailable = productAvailable;
        this.quantity = quantity;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isproductAvailable() {
        return productAvailable;
    }

    public void setproductAvailable(boolean productAvailable) {
        this.productAvailable = productAvailable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public Product() {
    }

}
