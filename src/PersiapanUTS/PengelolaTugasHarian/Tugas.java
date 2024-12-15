package PersiapanUTS.PengelolaTugasHarian;

public class Tugas {
    private String nama;
    private PrioritasTugas proritas;

    public Tugas(String nama, PrioritasTugas proritas){
        this.nama = nama;
        this.proritas = proritas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public PrioritasTugas getProritas() {
        return proritas;
    }

    public void setProritas(PrioritasTugas proritas) {
        this.proritas = proritas;
    }

    @Override
    public String toString() {
        return ("* " + nama + " (Prioritas : " + proritas + ")") ;
    }
}
