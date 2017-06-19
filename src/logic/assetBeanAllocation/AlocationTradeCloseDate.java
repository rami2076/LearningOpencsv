package logic.assetBeanAllocation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import beans.AssetMember;
import logic.assetBeanAllocation.Interface.AlocationInterface;
import logic.assetBeanAllocation.parent.AlocationParent;

public class AlocationTradeCloseDate extends AlocationParent implements AlocationInterface  {


	public AlocationTradeCloseDate(AssetMember bean, String errorMassage) {
		super(bean, errorMassage);
	}



	protected LocalDateTime TradeEndTime;
	private static final String  FORMAT_PATTERN = "yyyy.mm.dd-hh:mm";
	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern(FORMAT_PATTERN);




	@Override
	public String valid(String inputDate ) {
		//TODO 基準設定すること
		if ("".equals(inputDate)){
			//TODO Implement append!!
			errorMassage = errorMassage + "";
		}
		return errorMassage;
	}

	@Override
	public void parseAndSet(String inputDate) {
		TradeEndTime = LocalDateTime.parse(inputDate,DATE_PATTERN);
		
	}



	@Override
	public AssetMember getbean() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}



}
