package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Hub 
{
private int hubid;
private String hubname;
private String hubaddress;
@Override
public String toString() {
	return "Hub [hubid=" + hubid + ", hubname=" + hubname + ", hubaddress="
			+ hubaddress + ", cityid=" + cityid + ", stateid=" + stateid + "]";
}
private int cityid;
private int stateid;

@Id
@Column
public int getHubid() {
	return hubid;
}
public void setHubid(int hubid) {
	this.hubid = hubid;
}

@Column
public String getHubname() {
	return hubname;
}
public void setHubname(String hubname) {
	this.hubname = hubname;
}

@Column
public String getHubaddress() {
	return hubaddress;
}
public void setHubaddress(String hubaddress) {
	this.hubaddress = hubaddress;
}

@Column
public int getCityid() {
	return cityid;
}
public void setCityid(int cityid) {
	this.cityid = cityid;
}

@Column
public int getStateid() {
	return stateid;
}
public void setStateid(int stateid) {
	this.stateid = stateid;
}

}
