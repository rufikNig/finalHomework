package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    private int clientId;
    private String userName;
    private int cardNo;
    private int pinCode;
}
