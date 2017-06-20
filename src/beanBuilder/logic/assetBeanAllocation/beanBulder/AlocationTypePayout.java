package beanBuilder.logic.assetBeanAllocation.beanBulder;

import java.text.NumberFormat;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypePayout extends AlocationParent implements  AlocationInterface{

	private Long payout;

	public AlocationTypePayout(AssetMember bean, StringBuilder errorMassage) {
		super(bean, errorMassage);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public StringBuilder valid(String inputDate) {
		if("---".equals(inputDate)){
			payout = 0L;
			return errorMassage;
		}
		try{
			NumberFormat.getInstance().parse(inputDate);
			return errorMassage;
		}catch(Exception e){
			e.printStackTrace();
			return errorMassage.append(inputDate);
		}
	}

	@Override
	public void parseAndSet(String inputDate) {
		try{
			Number number  =NumberFormat.getInstance().parse(inputDate);
			payout = number.longValue();
			bean.setPayout(payout);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public AssetMember getbean() {
		return bean;
	}

}
