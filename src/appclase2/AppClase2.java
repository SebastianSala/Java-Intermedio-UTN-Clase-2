package appclase2;

import appclase2.Interfaces.ITransformador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppClase2 {

  public static void main(String[] args) {

    String[] cargadorDeListado = {"uno", "dos", "tres"};

    List<String> listado = new ArrayList<>();
    Arrays.stream(cargadorDeListado).forEach(word -> listado.add(word));
//    List<String> listado = Arrays.asList(cargadorDeListado);

    ITransformador trans = (aTranformar) -> aTranformar.stream().map((palabra) -> palabra.toUpperCase()).toList();

    List<String> listadoTransformado = metodoTransformador(listado, trans);

    System.out.println("Antes de tranformar: ");
    System.out.println(listado);
    System.out.println("--------");
    System.out.println();

    System.out.println("Después de tranformar: ");
    System.out.println(listadoTransformado);
    System.out.println("--------");

    listadoTransformado.forEach(System.out::println);

  }

  public static List<String> metodoTransformador(List<String> aTransformar, ITransformador transformador) {

    return (transformador.toUppercase(aTransformar));

  }

}
