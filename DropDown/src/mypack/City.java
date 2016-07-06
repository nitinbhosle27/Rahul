package mypack;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
	public class City {
		private int cityid;
		private int stateid;
		private String cityname;
		
		
		
		@Override
		public String toString() {
			return "City [cityid=" + cityid + ", stateid=" + stateid
					+ ", cityname=" + cityname + "]";
		}
		@Column
		@Id
	   public int getCityid() {
			return cityid;
		}
		public void setCityid(int cityid) {
			this.cityid = cityid;
		}
		
		
		@Column
		@NotNull
		public int getStateid() {
			return stateid;
		}
		public void setStateid(int stateid) {
			this.stateid = stateid;
		}
		
		
		@Column
		@NotNull
		public String getCityname() {
			return cityname;
		}
		public void setCityname(String cityname) {
			this.cityname = cityname;
		}

}
