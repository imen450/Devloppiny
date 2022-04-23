package tn.enicarthage.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")

public class Admin {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="A_ID")
		private Long id;
		
		@Column(name="A_NAME")
		private String name;
		
		@Column(name="A_PWD")
		private String pwd;

		public Long  getId() {
			return id;
		}

		public void setId(Long  id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
}


