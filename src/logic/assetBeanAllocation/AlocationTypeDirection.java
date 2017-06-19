package logic.assetBeanAllocation;

import beans.AssetMember;
import logic.assetBeanAllocation.Interface.AlocationInterface;
import logic.assetBeanAllocation.parent.AlocationParent;

public class AlocationTypeDirection extends AlocationParent implements  AlocationInterface {

	public AlocationTypeDirection(AssetMember bean, String errorMassage) {
		super(bean, errorMassage);
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
