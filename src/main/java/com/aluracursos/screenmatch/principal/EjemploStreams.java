package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo() {
        List<String> nombres = Arrays.asList("Evelyn","Omar","Alex","Ender");

        nombres.stream()
                .sorted()
                .limit(10)
                .filter(n -> n.startsWith("E"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
