package beanBuilder.logic.assetBeanAllocation.beanBulder;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypeDirection extends AlocationParent implements  AlocationInterface {

	public AlocationTypeDirection(AssetMember bean, StringBuilder errorMassage) {
		super(bean, errorMassage);
	}


	@Override
	public StringBuilder valid(String inputDate) {
		if ("up".equals(inputDate) || "down".equals(inputDate)){
			return errorMassage;
		}
		return errorMassage.append(inputDate).append("");
	}

	@Override
	public void parseAndSet(String inputDate) {
		bean.setDirection(inputDate);
	}

	@Override
	public AssetMember getbean() {
		return bean;
	}

}
