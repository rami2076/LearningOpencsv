package beanBuilder.logic.assetBeanAllocation.concreatBulder;

import beanBuilder.logic.assetBeanAllocation.abstructBuilder.AlocationInterface;
import beanBuilder.logic.assetBeanAllocation.buildInfo.AlocationParent;
import beans.AssetMember;

public class AlocationTypeAssetRule extends AlocationParent implements  AlocationInterface{



	public AlocationTypeAssetRule(AssetMember bean, String errorMassage) {
		super(bean, errorMassage);
	}



	@Override
	public String valid(String inputDate) {
		//turbo
		 //HighLow
		//上の文字列のバイト数まで入ることが決定している。

		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void parseAndSet(String inputDate) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public AssetMember getbean() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
