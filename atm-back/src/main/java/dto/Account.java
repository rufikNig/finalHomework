package dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class Account {
    private int clientID;
    private int accountId;
    private int balanceRUB;
    private int balanceDollar;
    private int balanceEuro;



//    public enum AccountTypeEnum {
//        RUB("rub"),
//        DOLLAR("dollar"),
//        EURO("euro");
//        private String value;
//
//        AccountTypeEnum(String value) {
//            this.value = value;
//        }
//    }

    }



