package beanBuilder.logic.assetBeanAllocation.concreatBulder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTradeCloseDate extends AlocationParent implements AlocationInterface  {


	public AlocationTradeCloseDate(AssetMember bean, String errorMassage) {
		super(bean, errorMassage);
	}



	protected LocalDateTime tradeDateTimeClose;
	private static final String  FORMAT_PATTERN = "yyyy.mm.dd-hh:mm";
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern(FORMAT_PATTERN);




	@Override
	public String valid(String inputDate ) {
		try{
		LocalDateTime.parse(inputDate,DATE_PATTERN);
		}catch(DateTimeParseException e){
			//もし、データの登録ができなかった場合外部のログデータに吐き出すようにする。
			//TODO::外部にデータを書きす。
			errorMassage = errorMassage +  "不正な日時が入力されているため、"+ inputDate + "の取引を登録できませんでした。";
			return errorMassage;
		}
		return errorMassage;
	}

	@Override
	public void parseAndSet(String inputDate) {
		tradeDateTimeClose = LocalDateTime.parse(inputDate,DATE_PATTERN);
		bean.setTradeDateTimeClose(tradeDateTimeClose);
	}

	@Override
	public AssetMember getbean() {
		return bean;
	}



}
