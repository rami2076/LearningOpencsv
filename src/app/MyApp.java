package app;

import java.io.File;

import beans.AssetMember;
import parser.ParseCSV;

public class MyApp {

public static void main(String[]  args){
	AssetMember one = new AssetMember();
	 ParseCSV two = new ParseCSV();
	 String folderPathName = "C:\\Users\\nyx\\Desktop\\asset\\";
	 String fileName = "HL78082_2017_02_23_14_11_13.csv";//"HM62855_2017_02_18_08_25_08.csv";
	 String pathName = folderPathName + fileName;

	 File file = new File(pathName);

//	 for (String a[]:two.opencsvTostringArray(file)){
//		 for (String b : a){
//			System.out.println(b);
//		 }

		 for (AssetMember aaa:two.opencsvToBean(file)){
			 if (   87955046==Integer.parseInt(aaa.get取引番号())){
				 System.out.println(aaa.get取引原資産());
				 aaa.get取引原資産();
			 		aaa.getBet();
			 		aaa.getEndDataTime();
			 		aaa.get取引番号();
			 		aaa.getBiginRate();
			 		aaa.getDirection();
			 		aaa.getOption();
			 }
			 }
	 }


}
