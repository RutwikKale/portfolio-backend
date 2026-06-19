package com.portfolioweb.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullName;
	private String designation;
	private String bio;
	private String email;
	private String linkedinUrl;
	private String githubUrl;
	private String resumeUrl;

}
