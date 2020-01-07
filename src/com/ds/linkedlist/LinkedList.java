package com.ds.linkedlist;

public interface LinkedList {

	/**
	 * This method will insert the data to the list next node by traversing the last node address
	 * @param String data
	 */
	public void insert(Object data);

	/**
	 * 
	 * @param String data 
	 */
	public void insertAtStart(Object data);

	/**
	 * 
	 * @param index
	 * @param data
	 */
	public void insertAt(int index, Object data);

	/**
	 * 
	 * @param data
	 * @return
	 */
	public Object find(Object data);

	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean contains(Object data);

	/**
	 * 
	 */
	public void printData();

	/**
	 * 
	 * @return
	 */
	public Object element();

	/**
	* 
	* @return
	*/
	public Object[] toArray();
}
