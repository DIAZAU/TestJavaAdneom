package com.adneom.main;

import java.util.Arrays;
import java.util.List;

import com.adneom.list.BuildList;

/**
 * Example to use build list class
 * @author diazau
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		int size = 2;
		BuildList build = new BuildList();
		try {
			List<List<Integer>> result = build.partition(list, size);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
