package beanBuilder.logic.assetBeanAllocation.beanBulder;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypeAssetRule extends AlocationParent implements  AlocationInterface{

String assetRule;

	public AlocationTypeAssetRule(AssetMember bean, StringBuilder errorMassage) {
		super(bean, errorMassage);
	}



	/* (非 Javadoc)
	 *Owner selected rule  of HighLow Game.
	 *Max byte is 10.  decideted database Culumn's Rule.
	 * @see beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface#valid(java.lang.String)
	 */
	@Override
	public StringBuilder valid(String inputDate) {
		//turbo
		 //HighLow
		//上の文字列のバイト数まで入ることが決定している。
		if( inputDate.getBytes().length <= 10 ){
			return errorMassage;
		}
		return errorMassage.append("");
	}

	@Override
	public void parseAndSet(String inputDate) {
	assetRule = inputDate;
	bean.setAssetRule(assetRule);
	}

	@Override
	public AssetMember getbean() {
		return bean;
	}
}
