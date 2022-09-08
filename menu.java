
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET
 */
public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan cottage : (Duku/Jeruk/Alpukat/Jambu air/Durian/Melon/Belimbing/Mangga/Kedondong/Barrack) ");
        String cottage = input.next();
        System.out.println("Masukkan paket : (Weekday/Weekend/Holiday)");
        String paket = input.next();
        int harga = 0;
        int jumlah = 0;
        
        if (cottage.equals("Duku")){
            if (paket.equals("Weekday")){
                harga = 950000;
            } else if (paket.equals("Weekend")){
                harga = 1025000;
            } else if (paket.equals("Holiday")){
                harga = 1225000;
            }
            else{
                harga = 0;
            } 
            
        }else if (cottage.equals("Jeruk")){
            if (paket.equals("Weekday")){
                harga = 950000;
            }else if (paket.equals("Weekend")){
                harga = 1025000;
            }else if (paket.equals("Holiday")){
                harga = 1225000;
            }
            else {
                harga = 0;
            }
            
        }else if (cottage.equals("Alpukat")){
            if (paket.equals("Weekday")){
                harga = 575000;
            }else if (paket.equals("Weekend")){
                harga = 695000;
            }else if (paket.equals("Holiday")){
                harga = 8950000;
            }
            else{
                harga = 0;
            }
        }else if (cottage.equals("Jambu air")){
            if (paket.equals("Weekday")){
                harga = 575000;
            }else if (paket.equals("Weekend")){
                harga = 695000;
            }else if (paket.equals("Holiday")){
                harga = 8950000;
            }
            else{
                harga = 0;
            }   
        }else if (cottage.equals("Durian")){
            if (paket.equals("Weekday")){
                harga = 595000;
            }else if (paket.equals("Weekend")){
                harga = 715000;
            }else if (paket.equals("Holiday")){
                harga = 9150000;
            }
            else{
                harga = 0;
                
            }
    }else if (cottage.equals("Melon")){
            if (paket.equals("Weekday")){
                harga = 595000;
            }else if (paket.equals("Weekend")){
                harga = 715000;
            }else if (paket.equals("Holiday")){
                harga = 9150000;
            }
            else{
                harga = 0;
            }
    }else if (cottage.equals("Belimbing")){
            if (paket.equals("Weekday")){
                harga = 495000;
            }else if (paket.equals("Weekend")){
                harga = 575000;
            }else if (paket.equals("Holiday")){
                harga = 7550000;
            }
            else{
                harga = 0;
            }
    }else if (cottage.equals("Kedondong")){
            if (paket.equals("Weekday")){
                harga = 595000;
            }else if (paket.equals("Weekend")){
                harga = 575000;
            }else if (paket.equals("Holiday")){
                harga = 7550000;
            }
            else{
                harga = 0;}
    }else if (cottage.equals("Barrack")){
            if (paket.equals("Weekday")){
                harga = 25000;
            }else if (paket.equals("Weekend")){
                harga = 25000;
            }else if (paket.equals("Holiday")){
                harga = 35000;
            }
            else{
                harga = 0;}
            System.out.println("Masukkan jumlah orang :");
            jumlah = input.nextInt();
    }
        System.out.printf("Harga cottage yg dipesan Rp.%s,-",cottage.equals("Barrack") ? harga*jumlah : harga);
                    
    }
}