package parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

import beans.AssetMember;

public class ParseCSV {
	private static final String[] HEADER = new String[] { "取引番号", "取引原資産", "オプションの種類", "方向", "取引内容", "ステータス", "購入","ペイアウト" };

	public  List<String[]> opencsvTostringArray(File file) {
		try {
			CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(file), "SJIS"));
			return reader.readAll();

		} catch (Exception e) {
			e.printStackTrace();
			 throw new RuntimeException(e);
		}
	}
public   List<AssetMember> opencsvToBean(File file){
 try{
	 CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(file), "SJIS"), ',', '"', 1);
	 ColumnPositionMappingStrategy<AssetMember> start = new ColumnPositionMappingStrategy<>();
	 start.setType(AssetMember.class);
	 start.setColumnMapping(HEADER);
	 CsvToBean<AssetMember >  csv = new CsvToBean<AssetMember>();
	 return csv.parse(start,reader);
 }catch(Exception e){
	 e.printStackTrace();
	 throw new RuntimeException(e);
 }
}
}
