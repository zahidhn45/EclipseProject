package com.xworkz.linkedlistprac;

public interface AssetDAO {

	boolean addAsset(Object obj);

	boolean searchAsset(int id);

	boolean updateAsset(int id, String name);

	boolean deleteAsset(int id);

	void listAsset();

	void setAsset(int index, Object object);

	void removeLastAsset();

	void removeFirstAsset();

	void getFirstAsset();

	void getLastAsset();

	void addFirstAsset(Object object);

	void addLastAsset(Object object);
}
