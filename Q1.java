package com.practice;

/*Create a function that finds the maximum range of a triangle's third edge, where the side
lengths are all integers.*/

public class Q1 {
        public static int nextEdge(int side1, int side2) {
            int edge=(side1 + side2) - 1;
            return edge;
        }
        public static void main(String args[]){
            Q1 c= new Q1();
            c.nextEdge(6,7);
        }
    }

