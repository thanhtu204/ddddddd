/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinh_c21th1.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author KHOACNTT
 */
public class Baitaptonghop {
	 public static void main(String[] args) {
		  int n;
		   
	        Scanner S = new Scanner(System.in);
	        System.out.println("1.Giai phuong trinh bac 1");
	        System.out.println("2.Giai phuong trinh bac 2");
	        System.out.println("3.Giai bai tap ngay thang");
	        System.out.println("4.Thoat");
	        System.out.print("Vui long chon lua chon : ");
	        n=S.nextInt();
	    
	        switch (n) {
			case 2: {
				 Phuongtrinhbac2();
				break;
			}
			case 1:{
				Phuongtrinhbac1();
				break;
			}
                        case 3:
                              Ngaynam();
                              break;
                        case 4:
                         System.exit(0) ;
                             break;
			
			default:
                            System.out.print("Khong co lua chon nay vui long nhap lai");
                            
				break;
			}
	 }
	 public static void Phuongtrinhbac2() {
		 
	
	    int a,b,c,delta;
        double x1,x2;
		 Scanner S=new Scanner(System.in);
	        System.out.print("Nhap he so a:");
	        a=S.nextInt();
	        System.out.print("Nhap he so b:");
	        b=S.nextInt();
	        System.out.print("Nhap he so c:");
	        c=S.nextInt();
	        if(a==0){
	        	heso(a,b);
	        }
	        else{
	            delta =b * b -4*a*c;
	            if(delta <0){
	                System.out.println(" Phuong trinh vo nghiem:");
	            }
	            if(delta==0){
	                x1 = -(double)b/(2*a);
	                System.out.printf("Phuong trinh co nghiem kep X=%.2f",x1);
	                
	                
	            }
	            if (delta>0){
	                x1 = (-b+ Math.sqrt(delta))/(2*a);
	                 x2 = (-b - Math.sqrt(delta))/(2*a);
	                 System.out.printf("Phuong trinh co nghiem la:x1=%.2f, x2=%.2f",x1,x2);

	            }
	        }
	 }
	        public static void heso(int a ,int b){
	        	
	            if(a==0){
	                if(b==0){
	                    System.out.println("Phuong trrinh vo so nghiem");
	                } else{
	                    System.out.println("Phuong trinh vo nghiem");
	                    
	                }

	 }
	        }
	        
	        public static void Phuongtrinhbac1() {
	        	   int a,b;
	               float x;
	                Scanner  S=new Scanner(System.in);
	               System.out.print("Nhap he so a: ");
	               a=S.nextInt();
	               System.out.print("Nhap he so b: ");
	               b=S.nextInt();
	               if(a==0){
	                   if(b==0){
	                       System.out.println("Phuong trrinh vo so nghiem");
	                   } else{
	                       System.out.println("Phuong trinh vo nghiem");
	                       
	                   }
	               } else{
	                   x=-(float)b/a;
	                   System.out.printf("Phuong trinh co nghiem x=%.2f",x);
	               }
	        }
                public static void Ngaynam(){ 
                     int thang,nam;
        Scanner s = new Scanner (System.in);
        System.out.print(" Nhap thang:");
        thang = s.nextInt();
        System.out.println("Nhap nam:");
        nam = s.nextInt();
        if(thang==1 || thang==3 || thang==5|| thang==7|| thang==8 ||thang==10||thang==12 ){
            System.out.println("Thang co 31 ngay:");
        }else if( thang==4 ||thang==6||thang==9||thang==11){
            System.out.println("Thang co 30  ngay:");
        }else if(thang==2){
             if((nam % 4 == 0 && nam% 100!=0 )|| (nam %400==0))
                 System.out.println("Thang co 29 ngay ");
             else 
                 System.out.println("Thang co 28 ngay");
        }
                }
                
}
