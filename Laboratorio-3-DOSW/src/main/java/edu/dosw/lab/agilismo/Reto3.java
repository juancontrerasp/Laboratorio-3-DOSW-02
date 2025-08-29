import java.util.*;

public class Reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> historias = new ArrayList<>();
        System.out.println("Ingrese el número de historias:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Historia " + (i + 1) + ":");
            historias.add(sc.nextLine());
        }
        System.out.println("Ingrese el número de integrantes del equipo:");
        int integrantes = Integer.parseInt(sc.nextLine());
        Map<String, Integer> estimaciones = new LinkedHashMap<>();
        List<Integer> fibonacci = Arrays.asList(1, 2, 3, 5, 8, 13);
        for (String historia : historias) {
            boolean consenso = false;
            int valor = 0;
            while (!consenso) {
                List<Integer> votos = new ArrayList<>();
                for (int i = 0; i < integrantes; i++) {
                    System.out.println("Integrante " + (i + 1) + " vote para '" + historia + "' (1,2,3,5,8,13):");
                    int voto = Integer.parseInt(sc.nextLine());
                    if (!fibonacci.contains(voto)) {
                        System.out.println("Voto inválido, use la secuencia de Fibonacci.");
                        i--;
                    } else {
                        votos.add(voto);
                    }
                }
                consenso = votos.stream().allMatch(v -> v.equals(votos.get(0)));
                if (consenso) {
                    System.out.println("Excelente, se llegó al conseso de: " + votos.get(0));
                    valor = votos.get(0);
                } else {
                    System.out.println("Votos divergentes – Discutan y vuelvan a votar");
                    System.out.println("Votos: " + votos);
                }
            }
            estimaciones.put(historia, valor);
        }
        System.out.println("\nResumen final:");
        for (Map.Entry<String, Integer> e : estimaciones.entrySet()) {
            System.out.println(e.getKey() + " quedó con: " + e.getValue());
        }
    }
}