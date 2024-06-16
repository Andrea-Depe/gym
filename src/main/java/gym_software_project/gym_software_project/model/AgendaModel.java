package gym_software_project.gym_software_project.model;

public class AgendaModel {
    private String time;
    private int ID;

    public AgendaModel(String time, int ID) {
        this.time = time;
        this.ID = ID;
    }

    public String getTime() {
        return time;
    }

    public int getID() {
        return ID;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
