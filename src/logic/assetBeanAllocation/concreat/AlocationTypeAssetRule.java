package logic.assetBeanAllocation.concreat;

import beans.AssetMember;
import logic.assetBeanAllocation.Interface.AlocationInterface;
import logic.assetBeanAllocation.parent.AlocationParent;

public class AlocationTypeAssetRule extends AlocationParent implements  AlocationInterface{



	public AlocationTypeAssetRule(AssetMember bean, String errorMassage) {
		super(bean, errorMassage);
		// TODO 自動生成されたコンストラクター・スタブ
	}



	@Override
	public String valid(String inputDate) {
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
