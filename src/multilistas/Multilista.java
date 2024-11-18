package multilistas;

public class Multilista {

    private NodoMedico PTR = null;
    private NodoMedico FINAL = null;

    public void agregarMedico(String nombreMedico) {
        NodoMedico nodo = new NodoMedico(nombreMedico);
        if (PTR == null) {
            PTR = nodo;
            FINAL = nodo;
        } else {
            FINAL.setSig(nodo);
            nodo.setAnt(FINAL);
            FINAL = nodo;
        }
    }

    public NodoMedico buscarMedico(String nombreMedico) {
        NodoMedico x = PTR;
        while (x != null) {
            if (x.getNombreMedico().equals(nombreMedico)) {
                return x;
            }
            x = x.getSig();
        }
        return null;
    }

    public void registrarPaciente(String nombreMedico, String nombrePaciente) {
        if (PTR != null) {
            NodoMedico padre = buscarMedico(nombreMedico);
            if (padre != null) {
                NodoPaciente nodo = new NodoPaciente(nombrePaciente);
                NodoPaciente nodoAbajo = padre.getAbajo();
                if (nodoAbajo == null) {
                    padre.setAbajo(nodo);
                } else {
                    while (nodoAbajo.getAbajo() != null) {
                        nodoAbajo = nodoAbajo.getAbajo();
                    }
                    nodoAbajo.setAbajo(nodo);
                }
            } else {
                System.out.println("Medico no existe en la lista");
            }
        } else {
            System.out.println("Lista Vacia");
        }
    }
    
    public void mostrarMultilista(){
        if(PTR != null) {
            NodoMedico x = PTR;
            while(x != null){
                System.out.println("--------------------------");
                System.out.println(x.toString());
                NodoPaciente xPaciente = x.getAbajo();
                while(xPaciente != null){
                    System.out.println(xPaciente.toString());
                    xPaciente = xPaciente.getAbajo();
                }
                x = x.getSig();
            }
        }else{
            System.out.println("Lista vacia");
        }
    }
    
}
