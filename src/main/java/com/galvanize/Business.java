package com.galvanize;
import java.util.*;

public class Business implements Addressable {

   public Business(String name)
   {
     this.name = name;
   }

   public String getName()
   {
     return name;
   }

   private String name;
   private List<Address> addresses = new ArrayList<Address>();

    public List<Address> getAddresses(){
       return this.addresses;
    }

    public void addAddress(Address address){
       this.addresses.add(address);
    }
}
