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
public class ManagerProyek extends Orang {
    private Proyek[] proyek = new Proyek[5];
    private String idMP;
    private String deadline;
    
    public ManagerProyek(String Nama, String TanggalLahir, double NoHP, String JenisKelamin) {
        super(Nama, TanggalLahir, NoHP, JenisKelamin);
    }
    
    public void createProyek(String deadline) {
        int i = 0;
        this.proyek[i] = new Proyek(judul, deadline);
        i++;
    }
    
    public void setIdMP(String idMP) {
        this.idMP = idMP;
    }
    
    public String getIdMP() {
        return idMP;
    }
    
    public Proyek getProyek(int index) {
        return proyek;
    }
    
    public void deleteProyek(proyek P, int i) {
        if((i>P.length) && (i<0)) {
            P[i] = null;
            System.out.println("Proyek ke-"+(i+1)+" telah dihapus");
        } else {
            System.out.println("Proyek tidak dapat dihapus");
        }
    }
    public void Display() {
        System.out.println("ID Manager Proyek: "+getIdMP());
        System.out.println("Nama: " + super.getNama());
        System.out.println("Tanggal Lahir: " + super.getTanggalLahir());
        System.out.println("No HP: " + super.getNpHP());
        System.out.println("Jenis Kelamin: " + super.getJenisKelamin());
        System.out.println("Proyek: " + getProyek());
    }
}
