package beanBuilder;

import java.io.File;
import java.util.ArrayList;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTradeCloseDate;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypeAssetRule;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypeBet;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypeDirection;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypePair;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypePayout;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypePropetyNumber;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypeRateBigin;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypeTradeOpenDate;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationTypeTradeStatus;
import beanBuilder.logic.assetBeanAllocation.concreatBulder.AlocationtypeRateEnd;
import beans.AssetMember;
import parser.ParseCSV;

public class Director {
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

	private enum category{
		propetyNumber,
		pair,
		assetRule,
		direction,
		rateBigin,
		tradeStatus,
		Bet,
		payout,
		RateEnd,
		tradeOpenDate,
		tradeEndDate;
	}

private static final Integer
	PROPERTY_NUMBER =100,
	PAIR = 110,
	ASSET_RULE= 120,
	DIRECTION =130,
	RATE_BIGIN = 140,
	TRADE_STATUS =150,
	BET =160,
	PAYOUT= 170 ,
	RATE_END = 180,
	TRADE_OPEN_DATE = 190,
	TRADE_CLOSE_DATE = 200;
private static AlocationInterface type = null;
private static String errorMassage =errorMassage ="";

public static void main(String[]  args){
getArray();
}
	public static void getArray(){
			ParseCSV two = new ParseCSV();
			File file = new File(pathName);
	ArrayList<AssetMember> AssetmemberCollection = new ArrayList<>();
	ArrayList<String[]>  assetSeeds = (ArrayList<String[]>)two.opencsvTostringArray(file);

	for (String[] seeds: assetSeeds){
		Integer cat =100;
		AssetMember bean = new AssetMember();
		for(String seed:seeds ){
			setType(bean,cat);
			type.valid(seed);
			type.parseAndSet(seed);
			bean = type.getbean();
			cat = cat +10;
			}
		AssetmemberCollection.add(bean);
			}
		}

	public static void setType( AssetMember bean,Integer cat ){
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
			type = new AlocationTypeTradeStatus(bean,errorMassage);
			break;
		case 6:
			type = new AlocationtypeRateEnd(bean,errorMassage);
			break;

		case 7:
			type = new AlocationTypeBet(bean,errorMassage);
			break;
		case 8:
			type = new AlocationTypePayout(bean,errorMassage);
			break;
		case 10:
			type = new AlocationtypeRateEnd(bean,errorMassage);
			break;
		case 9:
			type = new AlocationTypeTradeOpenDate(bean,errorMassage);
			break;
		case 11:
			type = new AlocationTradeCloseDate(bean,errorMassage);
			break;

		}

	}


}
