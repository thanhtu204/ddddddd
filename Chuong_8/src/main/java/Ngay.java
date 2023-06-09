
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOACNTT
 */
public class Ngay {
     private int day;
	    private int month;
	    private int year;
	    Scanner s = new Scanner(System.in);

	    public Ngay() {
	    }

	    public int getDay() {
	        return day;
	    }

	    public void setDay() {
	   
	    }

	    public int getMonth() {
	        return month;
	    }

	    public void setMonth() {
	        
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear() {

	    }

	    @Override
	    public int hashCode() {
	        int hash = 3;
	        return hash;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Ngay other = (Ngay) obj;
	        if (this.day != other.day) {
	            return false;
	        }
	        if (this.month != other.month) {
	            return false;
	        }
	        if (this.year != other.year) {
	            return false;
	        }
	        return true;
	    }
}
