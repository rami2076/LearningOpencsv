package logic.assetBeanAllocation.concreat;

import beans.AssetMember;
import logic.assetBeanAllocation.Interface.AlocationInterface;
import logic.assetBeanAllocation.parent.AlocationParent;

public class AlocationTypePair extends AlocationParent implements AlocationInterface {

	public AlocationTypePair(AssetMember bean, String errorMassage) {
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
