/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package username;

import java.util.Scanner;

/**
 *
 * @author Ekiw
 */
public class Username {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String username, password;
       System.out.println("Masukkan Username : ");
        username = scan.nextLine();
       System.out.println("Masukkan Password : ");
        password = scan.nextLine();
       switch(password){
        case "terbaikselalu":
        System.out.println("************** HALLO " + username+"**************");
        System.out.println("Selamat Datang Diaplikasi Ini");
        break;
        default:
        System.out.println("Opppsssttt, Username atau password Salah !!!!");
        }
    }
}
