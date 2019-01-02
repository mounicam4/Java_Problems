package com.problems.array;

import java.util.*;

public class Array_2D {

	public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();  // B = [ ]

		for (int i = 0; i < A.size(); i++) {
			B.add(new ArrayList<Integer>());

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).add(0); 
			}                                                   /////////////// B = [[0,0,0,0],[0,0,0,0],[0,0,0,0]]


			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
			}                                                  /////////// set (position, value)

		}
		return B;
	}

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

		A.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));    ///////// [1,2,3,4]
		A.add(new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8)));
		A.add(new ArrayList<Integer>(Arrays.asList(9, 10, 11, 12)));  ////////// A = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]

		ArrayList<ArrayList<Integer>> B = performOps(A);

		for (int i = 0; i < A.size(); i++) {
			for (int j = 0; j < A.get(i).size(); j++) {
				System.out.print(B.get(i).get(j) + " ");        ///////// B = [[4,3,2,1],[8,7,6,5],[12,11,10,9]]
			}
		}
	}

}
