import java.util.*;

public class ListSetDupliOrden {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Marco");
        nombres.add("Pedro");
        nombres.add("Lucas");
        nombres.add("Marco");
        nombres.add("Pedro");

        System.out.println("LISTA SIN ORDENAR Y CON NOMBRES REPETIDOS");
        for(String nombres1 : nombres){
            System.out.println(nombres1);
        }

        //Convierte a set para eliminar repetidos
        Set<String> sinRepetir = new HashSet<>(nombres);

        //Pasamos de nuevo a list para poder ordenar
        List<String> listaSinRepetir = new ArrayList<>(sinRepetir);

        //Ordena la colección por orden alfabético
        Collections.sort(listaSinRepetir);

        System.out.println();
        System.out.println("LISTA ORDENADA SIN REPETIDOS");
        for (String nombres1 : listaSinRepetir) {
            System.out.println(nombres1);
        }

        //Ordena la colección por orden alfabético inverso
        listaSinRepetir.sort(Collections.reverseOrder());

        System.out.println();
        System.out.println("LISTA ORDENADA EN ORDEN INVERSO");
        for (String nombres1 : listaSinRepetir) {
            System.out.println(nombres1);
        }

    }
}