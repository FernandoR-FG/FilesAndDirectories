package filesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScannRunner {

	public static void main(String[] args) throws IOException {
		//Con esto podemos obtener todos los directorios en la carpeta raiz
		Path currentDirectory = Paths.get("");
		//Files.list(Paths.get(".")).forEach(System.out::println);
		
		//Variable local para buscar en la string del directorio
		Predicate<? super Path> predicate = path->String.valueOf(path).contains(".java");
		//Con esto podemos movernos para ver directorios dentro de directorios
		Files.walk(currentDirectory, 4)
					.filter(predicate) //Aplicamos un filtro 
					.forEach(System.out::println); //Imprimir
		
		
		//Se crea otra variable Bipredicate
		BiPredicate<Path, BasicFileAttributes> matcher = (path,attributes)-> String.valueOf(path).contains(".java");
		//Otro metodo para estar dentro de directorios
		Files.find(currentDirectory, 4, matcher);
		
		
		//Otra forma de hacerlo con atributos
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path,attributes)-> attributes.isDirectory();
	
	}

}
