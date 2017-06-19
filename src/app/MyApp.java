package app;

import java.io.File;
import java.util.ArrayList;

import beans.AssetMember;
import logic.assetBeanAllocation.AlocationTypeAssetRule;
import logic.assetBeanAllocation.AlocationTypeBet;
import logic.assetBeanAllocation.AlocationTypeDirection;
import logic.assetBeanAllocation.AlocationTypePair;
import logic.assetBeanAllocation.AlocationTypePayout;
import logic.assetBeanAllocation.AlocationTypePropetyNumber;
import logic.assetBeanAllocation.AlocationTypeRateBigin;
import logic.assetBeanAllocation.AlocationTypeTradeOpenDate;
import logic.assetBeanAllocation.AlocationTypeTradeStatus;
import logic.assetBeanAllocation.AlocationtypeRateEnd;
import logic.assetBeanAllocation.Interface.AlocationInterface;
import parser.ParseCSV;

public class MyApp {
	private static	AssetMember one = new AssetMember();
	private final static Integer PROPETY_NUMBER = 1;
	private final  static	String folderPathName = "C:\\Users\\nyx\\Desktop\\asset\\";
	private static	String fileName = "HL78082_2017_02_23_14_11_13.csv";//"HM62855_2017_02_18_08_25_08.csv";
	private static	String pathName = folderPathName + fileName;

	//propetyNumber									管理番号							54600697, 						100
	//pair														通貨ペア							USD/JPY,						110
	//assetRule											取引ルール						turbo,								120
	//direction												方向									HIGH,								130
	//rateBigin 											取引開始レート				105.642,							140
	//tradeStatus											ステータス						取引終了,							150
	//Bet														賭け金								1,000								160
	//payout													払い戻し金 						---,									170
	//RateEnd												取り引き終了レート		105.64,							180
	//tradeOpenDate								取引開始時間					2016/7/27 21:55,			190
	//tradeEndDate									取引終了時間					2016/7/27 21:58				200

public static void main(String[]  args){
getArray();
}
	public static void getArray(){
			ParseCSV two = new ParseCSV();
			File file = new File(pathName);
	ArrayList<AssetMember> AssetmemberCollection = new ArrayList<>();
	ArrayList<String[]>  assetSeeds = (ArrayList<String[]>)two.opencsvTostringArray(file);
	for (String[] seeds: assetSeeds){
		Integer cat =0;
		String errorMassage;
		errorMassage ="";
		AssetMember bean = new AssetMember();
		for(String seed:seeds ){
			AlocationInterface type = null;
			switch(cat){
			case 0:
				 type = new AlocationTypePropetyNumber(bean,errorMassage);
				break;
			case 1:
				 type = new AlocationTypePair(bean,errorMassage);
				break;
			case 2:
				 type = new AlocationTypeAssetRule(bean,errorMassage);
				break;
			case 3:
				type = new AlocationTypeDirection(bean,errorMassage);
				break;
			case 4:
				type = new AlocationTypeRateBigin(bean,errorMassage);
				break;
			case 5:
				type = new AlocationtypeRateEnd(bean,errorMassage);
				break;
			case 6:
				type = new AlocationTypeTradeStatus(bean,errorMassage);
				break;
			case 7:
				type = new AlocationTypeBet(bean,errorMassage);
				break;
			case 8:
				type = new AlocationTypePayout(bean,errorMassage);
				break;
			case 9:
				type = new AlocationTypeTradeOpenDate(bean,errorMassage);
				break;
			case 10:
				break;
			}
			type.valid(seed);
			type.parseAndSet(seed);
			bean = type.getbean();
			}
		AssetmemberCollection.add(bean);
			}
		}


}
