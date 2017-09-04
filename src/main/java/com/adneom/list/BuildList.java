package com.adneom.list;

import java.util.ArrayList;
import java.util.List;

import com.adneom.exception.BuildListException;

/**
 * Class allows to partition one list to many sub list.
 * @author diazau
 *
 */
public class BuildList {
	
	/**
	 * function which takes two parameters "list" and "size" 
	 * and returns a list of sub-list, where each sub-list has maximum 
	 * "size" elements.
	 * @param listvalues
	 * @param size
	 * @return List<List<Integer>>
	 * @throws Exception 
	 */
	public List<List<Integer>> partition(List<Integer> listvalues, int size) throws BuildListException{
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		try {
			checkParams(listvalues, size);
			if (listvalues.isEmpty()){
				return resultList;
			}else if (listvalues.size() <= size){
				resultList.add(listvalues);
			}else{
				int length = listvalues.size();
				for (int indexTo = 0; indexTo < length; indexTo=indexTo+size){
					if (indexTo + size <= length){
						resultList.add(listvalues.subList(indexTo, indexTo+size));
					}else{
						resultList.add(listvalues.subList(indexTo, length));
					}
				}
			}
			return resultList;
		} catch (BuildListException e) {
			throw new BuildListException(e.getMessage());
		}
	}
	
	/**
	 * Ckeck input parameters
	 * @param listvalues
	 * @param size
	 * @throws Exception
	 */
	private void checkParams(List<Integer> listvalues, int size) throws BuildListException{
		if (listvalues == null){
			throw new BuildListException("La liste est nulle !!!");
		}else if (size == 0){
			throw new BuildListException("La taille est égale à zero !!!");
		}
	}
}
