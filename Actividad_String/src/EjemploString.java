public class EjemploString {
    public static void main(String[] args) {
        System.out.println("=== 1. STRING POOL VS NUEVA INSTANCIA (new) ===");
        String texto1 = "Hola Java";
        String texto2 = "Hola Java";

        String texto3 = new String("Hola Java");

        System.out.println("texto1 == texto2 (Misma referencia en String Pool): " + (texto1 == texto2));
        System.out.println("texto1 == texto3 (Diferente ubicación en memoria): " + (texto1 == texto3));

        System.out.println("texto1.equals(texto3) (Mismo contenido): " + texto1.equals(texto3));


        System.out.println("\n=== 2. INMUTABILIDAD DE STRING ===");
        String original = "Hola";
        System.out.println("String original: " + original);

        original.concat(" Mundo");
        System.out.println("String después de concat() sin reasignar: " + original);

        String modificado = original.concat(" Mundo");
        System.out.println("Nuevo String reasignado: " + modificado);


        System.out.println("\n=== 3. MÉTODOS ÚTILES DE LA CLASE STRING ===");
        String frase = "  Programación Orientada a Objetos  ";

        System.out.println("Longitud (length()): " + frase.length());
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("Sin espacios al inicio/final (trim()): '" + frase.trim() + "'");
        System.out.println("Reemplazar caracteres: " + frase.replace("a", "@"));
        System.out.println("Contiene la palabra 'Orientada': " + frase.contains("Orientada"));
    }
}