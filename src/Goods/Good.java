package Goods;

import java.io.Serializable;

public class Good implements Serializable{
	private String name;
	private int baseprice,size;
	private boolean legal;
	
	public Good(String name,int baseprice,boolean legal,int size){
		this.name = name;
		this.baseprice = baseprice;
		this.size = size;
		this.legal = legal;
	}
	
	public String getName(){
		return name;
	}
	
	public int getBasePrice(){
		return baseprice;
	}
	
	public boolean isLegal(){
		return legal;
	}
	
	public int getSize(){
		return size;
	}
}
