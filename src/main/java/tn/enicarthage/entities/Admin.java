package tn.enicarthage.entities;
import java.util.Objects;

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
		private long id;
		
		@Column(name="A_NAME")
		private String name;
		
		@Column(name="A_PWD")
		private String pwd;
		
		
		
		

		@Override
		public int hashCode() {
			return Objects.hash(id, name, pwd);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Admin other = (Admin) obj;
			return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(pwd, other.pwd);
		}

		public Admin(Long id, String name, String pwd) {
			super();
			this.id = id;
			this.name = name;
			this.pwd = pwd;
		}

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


