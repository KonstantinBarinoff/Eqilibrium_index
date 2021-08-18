package com.KB;

public class Sumer {

    int[] mas;
    int index, i, res, res2 = 0;

    public void setMas(int[] mas) {
        this.mas = mas;
    }
    public int sum() {
        if (i < mas.length -1) {
            res = res + mas[i++];
            res2 = sum2(i + 1);
            if (res == res2 && i!= mas.length - 1) {
                System.out.println("Equilibrium index1 = " + i);
                res2 = 0;
                index++;
            } else if (res == 0 && i == mas.length - 1) {
                System.out.println("Equilibrium index2 = " + (mas.length - 1));
                res2 = 0;
                index++;
            } else res2=0;
            sum();
        }
        if (sum2(1) == 0) {
            System.out.println("Equilibrium index3 = " + 0);
            res2 = 0;
            index++;
        } else if(index>0); else  index = -1;
        return index;
    }

    public int sum2(int j) {
        if (j < mas.length) {
            res2 = res2 + mas[j++];
            sum2(j);
        }
        return res2;
    }
}