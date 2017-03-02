package com.garson.model.entity;
// Generated Dec 7, 2016 1:03:25 AM by Hibernate Tools 4.3.1

/**
 * Restaurantimage generated by hbm2java
 */
public class RestaurantImage implements java.io.Serializable
{

    private Long id;
    private long restaurantid;
    private String imagestring;

    public RestaurantImage()
    {
    }

    public RestaurantImage(long restaurantid, String imagestring)
    {
        this.restaurantid = restaurantid;
        this.imagestring = imagestring;
    }

    public Long getId()
    {
        return this.id;
    }

    public RestaurantImage setId(Long id)
    {
        this.id = id;
        return this;

    }

    public long getRestaurantid()
    {
        return this.restaurantid;
    }

    public RestaurantImage setRestaurantid(long restaurantid)
    {
        this.restaurantid = restaurantid;
        return this;

    }

    public String getImagestring()
    {
        return this.imagestring;
    }

    public RestaurantImage setImagestring(String imagestring)
    {
        this.imagestring = imagestring;
        return this;
    }

}