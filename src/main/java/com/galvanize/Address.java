package com.galvanize;

public class Address{

 private String state;
 private String city;
 private String zip;
 private String street;

 public Address(String street,String city,String state,String zip)
 {
   this.state = state;
   this.city = city;
   this.street = street;
   this.zip = zip;
 }

 public String getState()
 {
   return state;
 }

 public String getStreet()
 {
   return street;
 }

 public String getZip()
 {
   return zip;
 }

 public String getCity()
 {
   return city;
 }

 public void setState(String state)
 {
   this.state = state;
 }

 public void setCity(String city)
 {
   this.city = city;
 }

 public void setZip(String zip)
 {
   this.zip = zip;
 }

 public void setStreet(String street)
 {
   this.street = street;
 }

 public String toString()
 {
   return this.street + ", "+this.city+", "+this.state+" "+this.zip;
 }




}
