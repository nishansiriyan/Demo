package Lambock;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class Student {
	private int regno;
	private String sname;
	private String saddress;
	private long phonenumber;
}
