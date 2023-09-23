package usuarios;

public class Becas {
    private int tipo;
    private String carrera1;
    private String carrera2;
    private String carrera3;
    private String comentarios;

    public Becas() { }
    public Becas(int tipo, String carrera1, String carrera2, String carrera3, String comentarios) {
        this.tipo = tipo;
        this.carrera1 = carrera1;
        this.carrera2 = carrera2;
        this.carrera3 = carrera3;
        this.comentarios = comentarios;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCarrera1() {
        return carrera1;
    }
    public void setCarrera1(String carrera1) {
        this.carrera1 = carrera1;
    }

    public String getCarrera2() {
        return carrera2;
    }
    public void setCarrera2(String carrera2) {
        this.carrera2 = carrera2;
    }

    public String getCarrera3() {
        return carrera3;
    }
    public void setCarrera3(String carrera3) {
        this.carrera3 = carrera3;
    }

    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
