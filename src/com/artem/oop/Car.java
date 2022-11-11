package com.artem.oop;

import java.util.Objects;

/**
 * Car: id, Марка, Модель, Рік випуску, Колір, Ціна, Реєстраційний номер.
 */
public class Car {

    private Long id;
    private Brand brand;
    private String model;
    private Integer releaseYear;
    private Color color;
    private Integer price;
    private Integer registrationNumber;

    public Car(Long id, Brand brand, Color color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public Car(Long id,
               Brand brand,
               String model,
               Integer releaseYear,
               Color color,
               Integer price,
               Integer registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(id, car.id) && brand == car.brand && Objects.equals(model, car.model)
            && Objects.equals(releaseYear, car.releaseYear) && color == car.color && Objects.equals(
            price, car.price) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, releaseYear, color, price, registrationNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", brand=" + brand +
            ", model='" + model + '\'' +
            ", releaseYear=" + releaseYear +
            ", color=" + color +
            ", price=" + price +
            ", registrationNumber=" + registrationNumber +
            '}';
    }
}
