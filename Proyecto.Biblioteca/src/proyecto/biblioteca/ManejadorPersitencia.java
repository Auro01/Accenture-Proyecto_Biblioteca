import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class ManejadorPersitencia {

    static Gestor_Estado cargarDatos() {

        System.out.println("Cargando de JSON");
        System.out.println("--------------------------------------------------------");
        try (FileReader reader = new FileReader("Output.json")){
            Gson gson = new Gson();
            Scanner scanner = new Scanner(reader);
            String sJsonLectura = scanner.useDelimiter("\\A").next();
            System.out.println(sJsonLectura);
            Gestor_Estado geEstadosGuardados =  gson.fromJson(sJsonLectura, Gestor_Estado.class);
            return geEstadosGuardados;
        } catch (Exception e) {
            System.out.println("Error no se pudo cargar el objecto json");
        }
        finally {
            return null;
        }
    }

    static void guardarDatos(Gestor_Estado geEstEstadosaGuardar) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter("Output.json")) {
            Gson gsonBuilder = new GsonBuilder().create();
            gson.toJson(geEstEstadosaGuardar, writer);
        } catch (Exception e) {
            System.out.println("Error no se pudo guardar el objecto json");
        }
    }
}
