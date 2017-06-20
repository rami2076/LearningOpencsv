package beans;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class AssetMember {
	//取引番号,取引原資産,オプションの種類,方向, 取引内容 ,ステータス ,購入,ペイアウト ,判定レート , 取引時間 , 終了時刻
	//87955046,AUD/JPY,turbo-spread,HIGH,87.209,取引終了,"\1,004","\2,008",87.216,2017/2/23 23:09,2017/2/23 23:09
	@Setter
	@Getter
	private String   pair,assetRule,option,direction,tradeStatus;
@Setter
@Getter
	private String propetyNumber;
@Setter
@Getter
	private Long payout ,bet;
@Setter
@Getter
	private double biginRate,endRate;
@Setter
@Getter
	private LocalDateTime tradeDateTimeOpen,TradeDateTimeClose;

}

