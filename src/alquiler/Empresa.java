/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

import java.time.LocalDate;

public class Empresa {

    //Atributos
    private String cif;
    private String nombre;
    private String paginaWeb;

    /*Atributos para almacenar el total de clientes que tiene la empresa y array
    de almacenamiento para los objetos Cliente*/
    private int totalClientes;
    private Cliente[] clientes;

    /*Atributos para controlar el total de vehiculos disponibles para alquilar en
    la empresa y array de almacenamiento para los objetos Vehiculo*/
    private int totalVehiculos;
    private Vehiculo[] vehiculos;

    /*Atributos para controJose", "Juan", "Hector", "Daniel", "Alejandro", "Victor", "Ana", "Maria", "Paula", "Roberta", "Lucia", "Lidia"};
        String[] apellido={"Ramirez", "Rios", "Glar el histórico de alquileres: total de alquileres
    realizados y array de almacenamiento para los objetos VehiculoAlquilado*/
    private int totalAlquileres;
    private VehiculoAlquilado[] alquileres;

    //Metodos
    /*Constructor parametrizado */
    public Empresa(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;

        //Inicialmente la empresa no tiene clientes
        this.totalClientes = 0;
        this.clientes = new Cliente[50];

        //Inicialmente la empresa no tiene vehiculos
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50];

        //Inicialmente la empresa no tiene alquileres
        this.totalAlquileres = 0;
        this.alquileres = new VehiculoAlquilado[100];
    }

    //Método para registrar un cliente
    public void registrarCliente(Cliente nuevo) {
        this.clientes[this.totalClientes] = nuevo;
        this.totalClientes++;
    }

    //Método para registrar un vehiculo
    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos[this.totalVehiculos] = nuevo;
        this.totalVehiculos++;
    }

    //Método para mostrar los datos de un cliente de la empresa
    public void imprimirClientes() {
        for (int x = 0; x < this.totalClientes; x++) {
            System.out.println("NIF: " + clientes[x].getNif() + "\tNombre: " + clientes[x].getNombre()
                    + "\tApellidos: " + clientes[x].getApellidos());
        }
    }

    //Método para mostrar los vehiculos de la empresa
    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
        for (int x = 0; x < this.totalVehiculos; x++) {
            System.out.println("Matricula: " + vehiculos[x].getMatricula() + "\tModelo: " + vehiculos[x].getModelo()
                    + "\tColor: " + vehiculos[x].getColor() + "\tImporte: " + vehiculos[x].getTarifa() + "\tDisponible: " + vehiculos[x].isDisponible());
        }
    }

    //Metodo para obtener el cliente
    private Cliente getCliente(String nif) {
        for (int i = 0; i < this.getTotalClientes(); i++) {
            if (this.clientes[i].getNif().equals(nif)) {
                return this.clientes[i];
            }
        }
        return null;
    }

    //Metodo para obtener el vehiculo
    private Vehiculo getVehiculo(String matricula) {
        for (int i = 0; i < this.getTotalVehiculos(); i++) {
            if (this.vehiculos[i].getMatricula().equals(matricula)) {
                return this.vehiculos[i];
            }
        }
        return null;
    }

    //Método para alquilar un vehiculo
    public void alquilarVehiculo(String matricula, String nif, int dias) {
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
            this.alquileres[this.totalAlquileres] = new VehiculoAlquilado(cliente, vehiculo, diaHoy(),
                    mesHoy(), anioHoy(), dias);
            this.totalAlquileres++;
        }
    }

    //Metodo para poner un vehiculo a estado disponible para alquilar
    public void recibirVehiculo(String matricula) {
        // busca el vehículo con la matrícula dada en el
        // array vehiculos y modifica su disponibilidad
        // para que se pueda alquilar de nuevo
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo != null) {
            vehiculo.setDisponible(true);
        }
    }

    public void generarVehiculosAlea() {
        for (int x = 0; x < 50; x++) {
            this.vehiculos[x] = new Vehiculo();
        }
        this.totalVehiculos = 50;
    }

    public void generarClientesAlea() {
        for (int x = 0; x < 50; x++) {
            this.clientes[x] = new Cliente();
        }
        this.totalClientes = 50;
    }

    //Getters y setters
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(int totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setTotalVehiculos(int totalVehiculos) {
        this.totalVehiculos = totalVehiculos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getTotalAlquileres() {
        return totalAlquileres;
    }

    public void setTotalAlquileres(int totalAlquileres) {
        this.totalAlquileres = totalAlquileres;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(VehiculoAlquilado[] alquileres) {
        this.alquileres = alquileres;
    }

    public LocalDate diaHoy() {
        LocalDate hoy = LocalDate.now();
        hoy.getDayOfMonth();
        return hoy;
    }

    public LocalDate mesHoy() {
        LocalDate mes = LocalDate.now();
        mes.getMonth();
        return mes;
    }

    public LocalDate anioHoy() {
        LocalDate anio = LocalDate.now();
        anio.getYear();
        return anio;
    }

    public void ordenarClientes() {
        int valor = 0;
        Cliente tmp = new Cliente("09082192K", "josé", "rodriguez");
        System.out.println("-----------------");
        System.out.println(clientes.length);
        System.out.println(totalClientes);
        for (int i = 0; i < totalClientes - 1; i++) {
            for (int j = i + 1; i < totalClientes; i++) {
                if (clientes[i].getNif().compareTo(clientes[j].getNif()) > 0) {
                    tmp = clientes[i];
                    clientes[j] = clientes[i];
                    clientes[j] = tmp;
                }

            }
        }

    }

    public void ordenarVehiculos() {
        int valor = 0;
        Vehiculo tmp = new Vehiculo("4080 TUR", "VW", "GTI", "Azul", 110.0, false);
        System.out.println("-----------------");
        System.out.println(vehiculos.length);
        System.out.println(totalVehiculos);
        for (int i = 0; i < totalVehiculos - 1; i++) {
            for (int j = i + 1; i < totalVehiculos; i++) {
                if (vehiculos[i].getMatricula().compareTo(vehiculos[j].getMatricula()) > 0) {
                    tmp = vehiculos[i];
                    vehiculos[j] = vehiculos[i];
                    vehiculos[j] = tmp;
                }

            }
        }

    }

    public int busquedaNif(String nif) {
        int posicion=0, inicio=0;
        int end=nif.length();
        while (inicio <= end) {
            posicion = (inicio + end) / 2;
            if (this.clientes[posicion].getNif().compareTo(nif)==0 ) {
                return posicion;
            } else if (this.clientes[posicion].getNif().compareTo(nif) < 0) {
                inicio = posicion + 1;
            } else {
                end = posicion - 1;
            }
        }
        return -1;
    }
    
    public int busquedaMatrícula(String matricula) {
        int posicion=0, inicio=0;
        int end=matricula.length();
        while (inicio <= end) {
            posicion = (inicio + end) / 2;
            if (this.clientes[posicion].getNif().compareTo(matricula)==0 ) {
                return posicion;
            } else if (this.clientes[posicion].getNif().compareTo(matricula) < 0) {
                inicio = posicion + 1;
            } else {
                end = posicion - 1;
            }
        }
        return -1;
    }
}

