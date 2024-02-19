package org.example;




public class Triangulo{

    Object a, b, c;
    public Triangulo(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangulo(int a,int b){
        this.a = a;
        this.b = b;
    }

    public Triangulo(float a,float b,float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public String TestaTipoTriangulo(){
        String result = "";
        if(c == null){
            return "Valor Incompleto";
        }
        else if(a instanceof Float || b instanceof Float || c instanceof Float){
            return "Valores Invalidos";
        }else {
            int a = (int) this.a;
            int b = (int) this.b;
            int c = (int) this.c;


            if (((Math.abs(b - c) < a) && (a < (b + c))) || (((Math.abs(a - c) < b) && (b < (a + c)))) || (((Math.abs(a - b) < c) && (c < (a + b))))) {

                if (a == b && a == c) {
                    result = "Triangulo Equilatero";
                } else if (a == b && a != c || b == c && b != a || a == c && a != b) {
                    result = "Triangulo Isosceles";
                } else if (a != b && a != c && b != c) {
                    result = "Triangulo Escaleno";
                }
            } else {
                result = "Triangulo invalido";
            }
            return result;
        }
    }
}
