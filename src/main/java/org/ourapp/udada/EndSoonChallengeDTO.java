package org.ourapp.udada;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EndSoonChallengeDTO {
	
	private Long cNo;
	private String cTitle;
	private int dDay;
	private int cCount;
	


}