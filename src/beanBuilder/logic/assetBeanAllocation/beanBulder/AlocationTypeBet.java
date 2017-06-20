package beanBuilder.logic.assetBeanAllocation.beanBulder;

import java.text.NumberFormat;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypeBet extends AlocationParent implements AlocationInterface {


	Long bet;

	public AlocationTypeBet(AssetMember bean, StringBuilder errorMassage) {
		super(bean, errorMassage);
		// TODO 自動生成されたコンストラクター・スタブ
	}




	@Override
	public StringBuilder valid(String inputDate) {
try{
		NumberFormat.getInstance().parse(inputDate);
}catch(Exception e){
	e.printStackTrace();
	return errorMassage = errorMassage.append(inputDate).append("をint型に変換できなかった。");
}
		return errorMassage;
	}

	@Override
	public void parseAndSet(String inputDate) {
		try{
	Number bet=	NumberFormat.getInstance().parse(inputDate);
	this.bet = bet.longValue();
	bean.setBet(this.bet);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public AssetMember getbean() {

		return bean;
	}

}
