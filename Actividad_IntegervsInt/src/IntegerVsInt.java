public class IntegerVsInt {
    public static void main(String[] args) {
        System.out.println("=== 1. TIPO PRIMITIVO: int ===");
        int numeroPrimitivo = 10;
        int otroPrimitivo = 10;

        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("¿numeroPrimitivo == otroPrimitivo?: " + (numeroPrimitivo == otroPrimitivo));

        System.out.println("\n=== 2. CLASE OBJETO: Integer ===");
        Integer numeroObjeto1 = Integer.valueOf(100);
        Integer numeroObjeto2 = Integer.valueOf(100);

        System.out.println("Valor objeto: " + numeroObjeto1);

        Integer autoBoxed = 50;
        int unBoxed = autoBoxed;

        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Unboxed int: " + unBoxed);

        Integer valorNulo = null;
        System.out.println("Integer con valor null: " + valorNulo);

        String texto = numeroObjeto1.toString();
        int comparacion = numeroObjeto1.compareTo(200);

        System.out.println("Convertido a String: " + texto);
        System.out.println("Resultado de compareTo(200): " + comparacion);
        
        System.out.println("¿numeroObjeto1.equals(numeroObjeto2)?: " + numeroObjeto1.equals(numeroObjeto2));
    }
}