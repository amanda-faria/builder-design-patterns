package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroBuilderTest {
    @Test
    void deveRetornarExcecaoParaCarroSemMarca() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setCor("Cinza")
                    .setModelo("Mobi")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCarroSemModelo() {
        try {
            CarroBuilder carroBuilder = new CarroBuilder();
            Carro carro = carroBuilder
                    .setAno(1)
                    .setMarca("Palio")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCarroValido() {
        CarroBuilder carroBuilder = new CarroBuilder();
        Carro carro = carroBuilder
                .setAno(2020)
                .setModelo("Uno")
                .setMarca("Fiat")
                .build();

        assertNotNull(carro);
    }

}