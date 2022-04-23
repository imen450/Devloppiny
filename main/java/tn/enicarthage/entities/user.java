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
		private Long id_user;
		
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
		

		public Role getRole() {
			return Role;
		}

		public void setRole(Role role) {
			Role = role;
		}

		public Long getId_user() {
			return id_user;
		}

		public void setId_user(Long id_user) {
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
