package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.awt.geom.Arc2D;


public class TesteTriangulo {

    @Test
    public void TestaTipoTriangulo_TestaSeEquilatero_TrianguloEquilatero(){
        Triangulo equilatero = new Triangulo(3,3,3);
        Assert.assertTrue(equilatero.TestaTipoTriangulo().equals("Triangulo Equilatero"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeIsosceles_TrianguloIsosceles(){
        Triangulo isosceles = new Triangulo(4,3,3);
        Assert.assertTrue(isosceles.TestaTipoTriangulo().equals("Triangulo Isosceles"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeEscaleno_TrianguloEscaleno(){
        Triangulo escaleno = new Triangulo(4,7,9);
        Assert.assertTrue(escaleno.TestaTipoTriangulo().equals("Triangulo Escaleno"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeIsosceles_TrianguloIsosceles2(){
        Triangulo isosceles_teste2 = new Triangulo(3,3,4);
        Assert.assertTrue(isosceles_teste2.TestaTipoTriangulo().equals("Triangulo Isosceles"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeIsosceles_TrianguloIsosceles3(){
        Triangulo isosceles_teste3 = new Triangulo(3,4,3);
        Assert.assertTrue(isosceles_teste3.TestaTipoTriangulo().equals("Triangulo Isosceles"));
    }


    @Test
    public void TestaTipo_TestaSeIsoscelesErro_QuandoAmaisBmenorQueC(){
        Triangulo isosceles_erro = new Triangulo(2,2,4);
        Assert.assertTrue(isosceles_erro.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipo_TestaSeErro_QuandoAmaisBmenorQueC(){
        Triangulo erro = new Triangulo(12,15,30);
        Assert.assertTrue(erro.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_TrianguloInvalido(){
        Triangulo invalido = new Triangulo(1,2,3);
        Assert.assertTrue(invalido.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoTemValor0(){
        Triangulo invalido_teste2 = new Triangulo(0,1,2);
        Assert.assertTrue(invalido_teste2.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoTemValorNegativo(){
        Triangulo invalido_teste3 = new Triangulo(2,-1,3);
        Assert.assertTrue(invalido_teste3.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoCmaiorAmaisC(){
        Triangulo invalido_teste4 = new Triangulo(2,1,3);
        Assert.assertTrue(invalido_teste4.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoAmaiorBmaisC(){
        Triangulo invalido_teste5 = new Triangulo(3,1,2);
        Assert.assertTrue(invalido_teste5.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoTudo0(){
        Triangulo invalido_teste6 = new Triangulo(0,0,0);
        Assert.assertTrue(invalido_teste6.TestaTipoTriangulo().equals("Triangulo invalido"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoValorFloat(){
        float a = 2.5f ,b =3.5f, c = 5.5f;
        Triangulo invalido_float = new Triangulo(a,b,c);
        Assert.assertTrue(invalido_float.TestaTipoTriangulo().equals("Valores Invalidos"));
    }

    @Test
    public void TestaTipoTriangulo_TestaSeInvalido_QuandoValorIncompleto(){
        int a = 2 ,b =3;
        Triangulo invalido_float = new Triangulo(a,b);
        Assert.assertTrue(invalido_float.TestaTipoTriangulo().equals("Valor Incompleto"));
    }


}
