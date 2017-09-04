package com.adneom.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.adneom.exception.BuildListException;
import com.adneom.list.BuildList;
/**
 * Test class using junit.
 * @author diazau
 *
 */
public class TestList {
	private final BuildList build = new BuildList();

	@Test
	public void testPartition1() throws Exception{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int size = 3;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(1,2,3));
		result.add(Arrays.asList(4,5));
		Assert.assertEquals(result, build.partition(list, size));
	}
	
	@Test(expected=BuildListException.class)
	public void testPartition2() throws Exception{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int size = 0;
		build.partition(list, size);
	}
	
	@Test
	public void testPartition3() throws Exception{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int size = 10;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(1,2,3,4,5));
		Assert.assertEquals(result, build.partition(list, size));
	}
	
	@Test
	public void testPartition4() throws Exception{
		List<Integer> list = new ArrayList<Integer>();
		int size = 5;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Assert.assertEquals(result, build.partition(list, size));
	}

	@Test(expected=BuildListException.class)
	public void testPartition5() throws Exception{
		List<Integer> list = null;
		int size = 5;
		build.partition(list, size);
	}
	
	@Test
	public void testPartition6() throws Exception{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int size = 1;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(Arrays.asList(1));
		result.add(Arrays.asList(2));
		result.add(Arrays.asList(3));
		result.add(Arrays.asList(4));
		result.add(Arrays.asList(5));
		Assert.assertEquals(result, build.partition(list, size));
	}
}
