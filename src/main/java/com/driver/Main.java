package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly obj=new RWOnly();
//      obj.name="manav";
//      System.out.print(obj.name);
//      'name' has private access in 'com.driver.RWOnly'
//      'name' has private access in 'com.driver.RWOnly'/
      obj.setName("manav");
      System.out.print(obj.getName());
  }
}