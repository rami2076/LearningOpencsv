package beanBuilder.logic.assetBeanAllocation.abstructBuilder;

import beans.AssetMember;
//
//propetyNumber									管理番号							54600697, 						100
//pair														通貨ペア							USD/JPY,						110
//assetRule											取引ルール						turbo,								120
//direction												方向									HIGH,								130
//rateBigin 											取引開始レート				105.642,							140
//tradeStatus											ステータス						取引終了,							150
//Bet														賭け金								1,000								160
//payout													払い戻し金 						---,									170
//RateEnd												取り引き終了レート		105.64,							180
//tradeOpenDate								取引開始時間					2016/7/27 21:55,			190
//tradeEndDate									取引終了時間					2016/7/27 21:58				200
public interface AlocationInterface  {
	public abstract StringBuilder valid(String inputDate);

	public  abstract  void  parseAndSet(String inputDate);

	public abstract AssetMember getbean();

	//public abstract  T getSQL(T inpuDate);
}