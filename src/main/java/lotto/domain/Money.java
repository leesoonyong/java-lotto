package lotto.domain;

public class Money {
    private static final int lottoPrice = 1000;

    int money;

    public Money(int money) {
       validationNegative(money);
       validationMoney(money);
       validationThousand(money);
       this.money = money / lottoPrice;
    }

    public void validationThousand(int money){
        if(money % lottoPrice != 0){
            throw new IllegalArgumentException("1000원 단위로 입력해주세요.");
        }
    }

    public void validationMoney(int money){
        if(money < 1000){
            throw new IllegalArgumentException("1000원 이상을 입력해야합니다.");
        }
    }

    public void validationNegative(int money){
        if(money < 0){
            throw new IllegalArgumentException("음수가 들어왔습니다.");
        }
    }

    public int getMoney() {
        return this.money;
    }
}
