package com.firstprojectsb.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//quando usamos record nao eh necessario utilizar getters e setters - cria  automaticamente
record Person (String name, int age, Address address){}
record Address (String firstLine, String city){}

@Configuration
public class HelloWorldConfiguration {

    //beans eh o nome do que sera configurado pelo spring
    @Bean
    public String name(){
        return "Karen";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean //Spring Bean esta gerenciando o objeto "person"
    public Person person(){
        return new Person("Karina", 30, new Address("Henry Street", "London"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean //ao inves de chamar diretamente o metodo, adicionamos parametros
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);  //os parametros sao os nomes dos beans
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("2, Manor Street", "Dublin");
    }

    @Bean(name = "address3")
    public Address address3(){
        return new Address("Baker Street", "London");
    }
}
