package bean;

public class Order {
	private String id;
	private String name;
	private String img;
	private String money;
	private String address;
	private String userid;
	private String detail;
	private String doid;
	private String time;
	private boolean end;
	private boolean accept;
	private boolean finish;
	public boolean isEnd() {
		return end;
	}
	public void setEnd(boolean end) {
		this.end = end;
	}
	public boolean isAccept() {
		return accept;
	}
	public void setAccept(boolean accept) {
		this.accept = accept;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", img=" + img
				+ ", money=" + money + ", address=" + address + ", userid="
				+ userid + ", detail=" + detail + ", doid=" + doid + ", time="
				+ time + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getDoid() {
		return doid;
	}
	public void setDoid(String doid) {
		this.doid = doid;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSid() {
		return userid;
	}
	public void setSid(String userid) {
		this.userid = userid;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	
}
