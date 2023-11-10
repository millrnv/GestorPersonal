import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GestorPersonal {

    private List<Persona> personas;


    public GestorPersonal(Persona persona){

        this.personas = new ArrayList<>();


    }

    public boolean personaExiste(Persona persona){

        for (Persona p : this.personas){
            if (persona.getRut().equals(p.getRut())){
                return true;
            }
        }

        return false;

    }

    public boolean correoExiste(Persona persona){

        for (Persona p : this.personas){
            if (persona.getCorreosElectronicos().equals(p.getCorreosElectronicos())){
                return true;
            }

        }
        return false;

    }

    public boolean automovilExiste(Persona persona){

        for (Persona p : this.personas){
            if (persona.getAutomoviles().equals(p.getAutomoviles())){
                return true;
            }
        }

        return false;

    }



    public void agregarPersonas(Persona persona){
        if (!personaExiste(persona)){
            this.personas.add(persona);
        }
    }

    public void agregarAutomovilPersona(String rut, Automovil automovil){

        Persona persona = obtenerPersonaPorRut(rut);

        if(personaExiste(persona)){
            persona.agregarAutomovil(automovil);

        }
    }

    public void agregarCorreoPersona(String rut, CorreoElectronico correoElectronico){

        Persona persona = obtenerPersonaPorRut(rut);

        if(personaExiste(persona)){
            persona.agregarCorreo(correoElectronico);
        }
    }

    public List<Persona> obtenerPersonasPorMarcaAutomovil(String marca){

        List <Persona> personasPorMarcaAutomovil = new ArrayList<>();

        for (Persona p : personas){
            if(p.automovilMarca(marca)){
                personasPorMarcaAutomovil.add(p);

            }

        } return personasPorMarcaAutomovil;

    }

    public List<Persona> obtenerPersonasPorNombre(String nombre){

        List <Persona> personasPorNombre = new ArrayList<>();

        for (Persona p : personas){
             if (p.getNombre().equals(nombre)){
                 personasPorNombre.add(p);
             }

        }

        return personasPorNombre;

    }

    public Persona obtenerPersonaPorRut(String rut){

        for (Persona persona : personas){
            if(persona.getRut().equals(rut)){
                return persona;
            }

        }
        return null;
    }

}
