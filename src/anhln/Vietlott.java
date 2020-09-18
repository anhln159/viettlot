/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anhln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author anhln
 */
public class Vietlott {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if ("1".equals(args[0])) {
            get45();
        } else if ("2".equals(args[0])) {
            get55();
        } else {
            System.out.println("CHI NHAP GIA TRI 1 OR 2");
        }
        
    }
    
    public static void get45() {
        System.out.println("VIELOTT 45: Wednesday, Friday, Sunday ");
        String[] v = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45"};
        List<Integer> i = new ArrayList<>();
        while (i.size() < 6) { // length of the random string.
            Random rnd = new Random();
            int index = (int) (rnd.nextFloat() * v.length);
            while (i.contains(index)) {
                index = (int) (rnd.nextFloat() * v.length);
            }
            i.add(index);
        }
        Collections.sort(i);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i.size(); j++) {
            sb.append(v[i.get(j)]);
            sb.append(" ");
        }
        System.out.println("DAY SO MAN MAY NGAY HOM NAY LA: " + sb.toString());
    }
    
    public static void get55() {
        System.out.println("VIELOTT 55: Tuesday, Thursday, Saturday ");
        String[] v = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55"};
        List<Integer> i = new ArrayList<>();
        while (i.size() < 6) { // length of the random string.
            Random rnd = new Random();
            int index = (int) (rnd.nextFloat() * v.length);
            while (i.contains(index)) {
                index = (int) (rnd.nextFloat() * v.length);
            }
            i.add(index);
        }
        Collections.sort(i);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i.size(); j++) {
            sb.append(v[i.get(j)]);
            sb.append(" ");
        }
        System.out.println("DAY SO MAN MAY NGAY HOM NAY LA: " + sb.toString());
    }
    
}
