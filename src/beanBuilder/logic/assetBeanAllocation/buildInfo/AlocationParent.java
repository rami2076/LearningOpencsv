package beanBuilder.logic.assetBeanAllocation.buildInfo;

import beans.AssetMember;
import lombok.extern.log4j.Log4j2;

public class AlocationParent {
	protected AssetMember bean ;
	protected StringBuilder errorMassage;
	protected Log4j2 a;
	{
		
	}

	public  AlocationParent(AssetMember bean ,StringBuilder errorMassage2){
		this.bean = bean;
		this.errorMassage = errorMassage2;
	}



}
