package com.liu.start.entity;


import java.util.Date;

/**
 *
 * 订单配送时效表（7天前数据饼状图）
 *
 */
public class ScsDeliveryTime {

	/**id主键**/
	private Integer id;

	/**24小时送达数**/
	private Integer time24;

	/**48小时送达数**/
	private Integer time48;

	/**72小时送达数**/
	private Integer time72;

	/**96小时送达数**/
	private Integer time96;

	/**96小时以上送达数**/
	private Integer timegt96;

	/**订单总数**/
	private Integer total;

	/**平台**/
	private String platform;

	/**省份 **/
	private String province;

	/**承运商id **/
	private String carrierId;

	/**仓库id**/
	private Long warehouseId;

	/**订单统计时间**/
	private Date countTime;

	/**创建时间**/
	private Date createTime;

	/**创建人**/
	private String createBy;

	private Integer count;//统计订单数

	private String orderSource;//订单来源

	private String fromLocationId;//订单位置（转成仓库id）

	private String provinceName;//省份名称



	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setTime24(Integer time24){
		this.time24 = time24;
	}

	public Integer getTime24(){
		return this.time24;
	}

	public void setTime48(Integer time48){
		this.time48 = time48;
	}

	public Integer getTime48(){
		return this.time48;
	}

	public void setTime72(Integer time72){
		this.time72 = time72;
	}

	public Integer getTime72(){
		return this.time72;
	}

	public void setTime96(Integer time96){
		this.time96 = time96;
	}

	public Integer getTime96(){
		return this.time96;
	}

	public void setTimegt96(Integer timegt96){
		this.timegt96 = timegt96;
	}

	public Integer getTimegt96(){
		return this.timegt96;
	}

	public void setTotal(Integer total){
		this.total = total;
	}

	public Integer getTotal(){
		return this.total;
	}

	public void setPlatform(String platform){
		this.platform = platform;
	}

	public String getPlatform(){
		return this.platform;
	}

	public void setProvince(String province){
		this.province = province;
	}

	public String getProvince(){
		return this.province;
	}

	public void setCarrierId(String carrierId){
		this.carrierId = carrierId;
	}

	public String getCarrierId(){
		return this.carrierId;
	}

	public void setWarehouseId(Long warehouseId){
		this.warehouseId = warehouseId;
	}

	public Long getWarehouseId(){
		return this.warehouseId;
	}

	public void setCountTime(Date countTime){
		this.countTime = countTime;
	}

	public Date getCountTime(){
		return this.countTime;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}

	public String getCreateBy(){
		return this.createBy;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getFromLocationId() {
		return fromLocationId;
	}

	public void setFromLocationId(String fromLocationId) {
		this.fromLocationId = fromLocationId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
