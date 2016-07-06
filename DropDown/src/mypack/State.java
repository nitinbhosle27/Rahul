package mypack;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
	public class State {
		
		private int stateid;
		private String statename;
		
		

		@Override
		public String toString() {
			return "State [stateid=" + stateid + ", statename=" + statename
					+ "]";
		}
		@Column(name="STATE_ID")
		@Id
		public int getStateid() {
			return stateid;
		}
		public void setStateid(int stateid) {
			this.stateid = stateid;
		}
		
		@Column(name="STATE_NAME")
		@NotNull
		public String getStatename() {
			return statename;
		}
		public void setStatename(String statename) {
			this.statename = statename;
		}
		
		
		

}
