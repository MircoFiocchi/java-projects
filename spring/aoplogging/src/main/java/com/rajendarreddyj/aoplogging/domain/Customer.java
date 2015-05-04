package com.rajendarreddyj.aoplogging.domain;

public class Customer
{
  private final String fullName;
  private final String address;
  
  public Customer(String fullName, String address)
  {
    this.fullName = fullName;
    this.address = address;
  }
  
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("Customer");
    sb.append("{fullName='").append(this.fullName).append('\'');
    sb.append(", address='").append(this.address).append('\'');
    sb.append('}');
    return sb.toString();
  }
}