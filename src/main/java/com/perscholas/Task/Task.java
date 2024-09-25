package com.perscholas.Task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;


@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Task {

	@Id
	@GeneratedValue(Strategy= GenerationType.IDENTITY)
	//long vs Long
	private Long id;

	private String title;

	private String description;

	private String status;


}
