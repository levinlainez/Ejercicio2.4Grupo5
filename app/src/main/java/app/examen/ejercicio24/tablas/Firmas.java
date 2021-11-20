package app.examen.ejercicio24.tablas;

public class Firmas {
    private  Integer id;
    private String video;

    //contructor de clase
    public Firmas(Integer id, String video) {
        this.id = id;
        this.video = video;

    }
    //Segundo Constructor de clase:
    public Firmas(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }





}
