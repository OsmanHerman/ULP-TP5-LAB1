package tpo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 * @author Nicolas Dominguez
 * @author Nahuel Alegre
 * @author Ulises Perez 
 * @author Osman Herman
 */

public class Directorio {
    private TreeMap<Long, Cliente> contactos;

    public Directorio() {
        contactos = new TreeMap<>();
    }

    public void agregarContacto(Long telefono, Cliente cliente) {
        contactos.put(telefono, cliente);
    }

    public Cliente buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        
        for (Long telefono : contactos.keySet()) {
            Cliente cliente = contactos.get(telefono);
            if (cliente.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(telefono);
            }
        }
        return telefonos;
    }

    public ArrayList<Cliente> buscarContactos(String ciudad) {
        ArrayList<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : contactos.values()) {
            if (cliente.getCiudad().equals(ciudad)) {
                resultado.add(cliente);
            }
        }
        return resultado;
    }

    public void borrarContacto(Long telefono) {
        contactos.remove(telefono);
    }
    
    public static void limpiarCampos(javax.swing.JTextField jtDNI, javax.swing.JTextField jtNombre, 
            javax.swing.JTextField jtApellido, javax.swing.JTextField jtDireccion, 
            javax.swing.JTextField jtCiudad, javax.swing.JTextField jtTelefono) {
        
        jtDNI.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtDireccion.setText("");
        jtCiudad.setText("");
        jtTelefono.setText("");
    }
}
