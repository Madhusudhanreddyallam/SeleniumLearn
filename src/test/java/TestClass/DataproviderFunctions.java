package TestClass;

import java.util.*;
import org.testng.annotations.DataProvider;

/* we can use multi-dimensional array or single dimension / list/set/Map , you need to give the data provider name and same name
has to be specified in method */

public class DataproviderFunctions {

	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		Object [][] twitterdata=new Object[2][2];
		twitterdata[0][0]="username1@gmail.com";
		twitterdata[0][1]="Password1";
		twitterdata[1][0]="username2@gmail.com";
		twitterdata[1][1]="Password2";
		return twitterdata;
	}

	@DataProvider(name = "loginDataList")
	public static Iterator<Object[]> getLoginData() {
		List<Object[]> data = new ArrayList<>();
		/* 1) Here you are creating single dimension array using "new Object[]" and adding user name and password to it
		   2) At every step we are creating a new object and below code has 3 objects
		   3) Object[]{"username1", "password1"} is same as Object[] array = {"username1", "password1"}  
		   4) data.iterator() -> return the entire object Object[]{"username1", "password1"} at once*/	 
		data.add(new Object[]{"username1", "password1"}); 
		data.add(new Object[]{"username2", "password2"});
		data.add(new Object[]{"username3", "password3"});
		return data.iterator();
	}

	@DataProvider(name = "loginDataSet")
	public static Iterator<Object[]> getLoginSetData() {
		Set<Object[]> dataSet = new HashSet<>();
		dataSet.add(new Object[]{"username1", "password1"});
		dataSet.add(new Object[]{"username2", "password2"});
		dataSet.add(new Object[]{"username3", "password3"});
		return dataSet.iterator();
	}
	
	@DataProvider(name = "loginDataMap")
	public static Iterator<Object[]> getLoginMapData() {
		Map<String, String> data = new HashMap<>();
		data.put("username1", "password1");
		data.put("username2", "password2");
		data.put("username3", "password3");
		List<Object[]> dataList = new ArrayList<>();
		for (Map.Entry<String, String> entry : data.entrySet()) {
			dataList.add(new Object[]{entry.getKey(), entry.getValue()});
		}
		return dataList.iterator();
	}

	@DataProvider(name="testdata2")
	public Object[] TestDataFeedSingle(){
		Object [] twitterdata=new Object[2];
		twitterdata[0]="username1@gmail.com";
		twitterdata[1]="username2@gmail.com";
		return twitterdata;
	}

}
