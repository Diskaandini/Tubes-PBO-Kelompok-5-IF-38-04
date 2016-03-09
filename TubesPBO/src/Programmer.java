/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VELIA
 */
public class Programmer extends Orang {
    private long idProgrammer;
    
    public Programmer (String Nama, String TanggalLahir, double NoHP, String JenisKelamin){
        super(Nama, TanggalLahir, NoHP, JenisKelamin);  
    }
    public void setId(long idProgrammer){
        this.idProgrammer = idProgrammer;
    }
    public long getId(){
        return idProgrammer;
    }
    
    @Override
    public void Display() {
        System.out.println("ID Programmer: "+ getId());
        System.out.println("Nama: " + super.getNama());
        System.out.println("Tanggal Lahir: "+ super.getTanggalLahir());
        System.out.println("No HP: "+ super.getNoHP());
        System.out.println("Jenis Kelamin: "+ super.getJenisKelamin());   
    }
}
