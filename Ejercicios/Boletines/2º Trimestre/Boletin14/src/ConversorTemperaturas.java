package com.company;

public class ConversorTemperaturas {
    final float gradosMinima = 80f;

    public float gradosCaF(float temperatura) throws TemperaturaErroneaExcepcion{
        if(temperatura < gradosMinima)
            throw new TemperaturaErroneaExcepcion("La temperatura no puede ser inferior a 80");
        float f=(float) ((temperatura * 9 / 5) + 32.4);
        return f;
    }

    public float gradosCaK(float temperatura) {
        return (float) (temperatura + 273.15);

    }
}
