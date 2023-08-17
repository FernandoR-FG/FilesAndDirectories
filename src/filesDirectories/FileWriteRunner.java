package filesDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		//Con esto podemos obtener todos los directorios en la carpeta raiz
		Path pathFileRead = Paths.get("./resourcers/fileWritten.txt");
		
		List<String> list = List.of("UN ","NUEVO","ARCHIVO","A","YUDA");
		Files.write(pathFileRead, list);
	}

}
