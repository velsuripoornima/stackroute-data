package com.stackroute.onlinefashionretail.consumer.domain;

import java.util.List;

public class Supplier
{
    private String id;
    private String name;
    private String city;
    private float rating;
    private String email;
    private List<SupplierOrder> supplierOrders;

    public Supplier() {
    }

    public Supplier(String id, String name, String city, float rating, String email, List<SupplierOrder> supplierOrders) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rating = rating;
        this.email = email;
        this.supplierOrders = supplierOrders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SupplierOrder> getSupplierOrders() {
        return supplierOrders;
    }

    public void setSupplierOrders(List<SupplierOrder> supplierOrders) {
        this.supplierOrders = supplierOrders;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", email='" + email + '\'' +
                ", supplierOrders=" + supplierOrders +
                '}';
    }
}
