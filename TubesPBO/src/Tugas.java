/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Lalu Oldi Alfitra
 */
public class Tugas {
    private Programmer pelaksana;
    private String JudulTugas;
    private boolean Status;

    public Tugas(Programmer pelaksana, String JudulTugas, boolean Status) {
        this.pelaksana = pelaksana;
        this.JudulTugas = JudulTugas;
        this.Status = Status;
    }

    public Programmer getPelaksana() {
        return pelaksana;
    }

    public void setPelaksana(Programmer pelaksana) {
        this.pelaksana = pelaksana;
    }
    
    public void Display() {
        System.out.println("Pelaksana: "+getPelaksana());
    }
}
