package com.luv2code.springboot.demo.mycoolapp;

import java.util.Objects;

public class customer {
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public customer(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
        public customer() {

    }
        public Integer getId(){
            return id;
        }
        public void setId(Integer id){
            this.id=id;
        }
        public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        customer Customer = (customer) o;
        return Objects.equals(id,Customer.id) && Objects.equals(name,Customer.age);

    }
    @Override
    public int hashCode(){
        return Objects.hash(id,name,email,age);
    }
     @Override
     public String toString(){
        return "customer{" +
                "id=" + id +
                ", name=' " + name + '\'' +
                ", email=' " + email + '\'' +
                ", age=" + age +
                '}';
     }

}
