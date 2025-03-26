public class corpoHumano {
    private float massa;
    private float densidade;
    private float volume;

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void calcularDensidade() {
        densidade = massa/volume;
    }

    public float getDensidade() {
        return this.densidade;
    }
}
