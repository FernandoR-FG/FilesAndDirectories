package filesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileReadRunner2 {

	public static void main(String[] args) throws IOException {
		//Con esto podemos obtener todos los directorios en la carpeta raiz
		Path pathFileRead = Paths.get("./resourcers/data.txt");
		
		//Este devulve una lista de strings
		List<String> lines = Files.readAllLines(pathFileRead);
		System.out.print(lines);
		
		System.out.println("\n\nArriba metodo 1 abajo metodo 2\n");
		
		//Este devuelve un stream de lineas
		Files.lines(pathFileRead).forEach(System.out::println);
	}

}
