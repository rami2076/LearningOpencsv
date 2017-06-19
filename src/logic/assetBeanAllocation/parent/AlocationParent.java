package logic.assetBeanAllocation.parent;

import beans.AssetMember;

public class AlocationParent {
	protected AssetMember bean ;
	protected String errorMassage;


	public  AlocationParent(AssetMember bean ,String errorMassage){
		this.bean = bean;
		this.errorMassage = errorMassage;
	}



}
