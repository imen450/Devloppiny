package tn.enicarthage.entities;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class user implements Serializable {
		
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="U_ID")
		private long id_user;
		
		@Column(name="Name")
		private String name;
		
		@Column(name="Surname")
		private String surname;
		
		@Column(name="Pseudo")
		private String pseudo;
		
		@Column(name="Email")
		private String email;
		
		@Column(name="Tel")
		private String tel;
		
		@Column(name="Country")
		private String country;
		
		@Enumerated(EnumType.STRING)
		private Role Role;
		

		public user(long id_user2, String name2, String surname2, String pseudo2, String email2, String tel2,
				String country2, tn.enicarthage.entities.Role role2) {
			this.id_user=id_user2;
			this.name=name2;
			this.surname=surname2;
			this.pseudo=pseudo2;
			this.email=email2;
			this.tel=tel2;
			this.country=country2;
			this.Role=role2;
		}

		public Role getRole() {
			return Role;
		}

		public void setRole(Role role) {
			Role = role;
		}

		public long getId_user() {
			return id_user;
		}

		public void setId_user(long id_user) {
			this.id_user = id_user;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getPseudo() {
			return pseudo;
		}

		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
}
