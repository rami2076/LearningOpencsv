package beans;

public class AssetMember {
	//取引番号,取引原資産,オプションの種類,方向, 取引内容 ,ステータス ,購入,ペイアウト ,判定レート , 取引時間 , 終了時刻
	//87955046,AUD/JPY,turbo-spread,HIGH,87.209,取引終了,"\1,004","\2,008",87.216,2017/2/23 23:09,2017/2/23 23:09
	private String   取引原資産, option,direction,status;
//private BigDecimal 取引番号, payout ,bet;
	private String 取引番号, payout ,bet,biginRate,endRate,startDataTime,endDataTime;
//private double biginRate,endRate;
//private Timestamp startDataTime,endDataTime;

public String get取引原資産() {
	return 取引原資産;
}
public String getOption() {
	return option;
}
public String getDirection() {
	return direction;
}
public String getStatus() {
	return status;
}
public String get取引番号() {
	return 取引番号;
}
public String getPayout() {
	return payout;
}
public String getBet() {
	return bet;
}
public String getBiginRate() {
	return biginRate;
}
public String getEndRate() {
	return endRate;
}
public String getStartDataTime() {
	return startDataTime;
}
public String getEndDataTime() {
	return endDataTime;
}
public void set取引原資産(String 取引原資産) {
	this.取引原資産 = 取引原資産;
}
public void setOption(String option) {
	this.option = option;
}
public void setDirection(String direction) {
	this.direction = direction;
}
public void setStatus(String status) {
	this.status = status;
}
public void set取引番号(String 取引番号) {
	this.取引番号 = 取引番号;
}
public void setPayout(String payout) {
	this.payout = payout;
}
public void setBet(String bet) {
	this.bet = bet;
}
public void setBiginRate(String biginRate) {
	this.biginRate = biginRate;
}
public void setEndRate(String endRate) {
	this.endRate = endRate;
}
public void setStartDataTime(String startDataTime) {
	this.startDataTime = startDataTime;
}
public void setEndDataTime(String endDataTime) {
	this.endDataTime = endDataTime;
}
}

