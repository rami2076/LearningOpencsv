package beanBuilder.logic.assetBeanAllocation.beanBulder;

import java.text.NumberFormat;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypePropetyNumber extends AlocationParent implements AlocationInterface {
	Long propetryNumber;
	public AlocationTypePropetyNumber(AssetMember bean, StringBuilder errorMassage) {
		super(bean, errorMassage);
	}

	@Override
	public StringBuilder valid(String inputDate) {
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

	}

	@Override
	public AssetMember getbean() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}




}
