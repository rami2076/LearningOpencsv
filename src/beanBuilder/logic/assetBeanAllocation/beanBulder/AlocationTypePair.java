package beanBuilder.logic.assetBeanAllocation.beanBulder;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypePair extends AlocationParent implements AlocationInterface {

	public AlocationTypePair(AssetMember bean, StringBuilder errorMassage) {
		super(bean, errorMassage);
	}

	@Override
	public StringBuilder valid(String inputDate) {
		if( inputDate.getBytes().length==7){
			return errorMassage;
		}
		return errorMassage.append(inputDate);
	}

	@Override
	public void parseAndSet(String inputDate) {
		// TODO 自動生成されたメソッド・スタブ
		bean.setPair(inputDate);
	}

	@Override
	public AssetMember getbean() {
				return bean;
	}

}
