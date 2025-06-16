package btree;

public class Main {
    public static void main(String[] args) {
        BTree<Integer> arbol = new BTree<>(4); 

        int[] datos = {52, 10, 20, 30, 60, 70, 80, 90, 100, 110};
        for (int d : datos) {
            arbol.insert(d);
        }

        System.out.println("Árbol B generado:");
        System.out.println(arbol);


        System.out.println("Buscar 52:");
        boolean encontrado1 = arbol.search(52);
        System.out.println("Resultado: " + encontrado1);

        System.out.println("Buscar 30:");
        boolean encontrado2 = arbol.search(30);
        System.out.println("Resultado: " + encontrado2);

        System.out.println("Buscar 999:");
        boolean encontrado3 = arbol.search(999);
        System.out.println("Resultado: " + encontrado3);
    }
}