package com.ricardo.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Indica que esta classe é um componente gerenciado pelo Spring e pode ser injetada em outros lugares do projeto.
public class MyApp implements CommandLineRunner {

    @Autowired // Injeta automaticamente uma instância da classe Calculadora gerenciada pelo Spring.
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: " + calculadora.somar(10, 12));
    }
}
