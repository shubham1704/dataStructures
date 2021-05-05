package com.practice.PracticeQuestion.model;

public class Data {

  private String address;
  private String contact;

  public Data(String address, String contact) {
    this.address = address;
    this.contact = contact;
  }

  public String getAddress() {
    return address;
  }

  public String getContact() {
    return contact;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  @Override
  public String toString() {
    return "{" +
           "address='" + address + '\'' +
           ", contact='" + contact + '\'' +
           '}';
  }
}
