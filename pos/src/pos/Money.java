package pos;

public class Money {
	private int amount;

	public Money(int amount) {
		this.amount = amount;
	}

	public Money() {
	}

	public int getAmount() {
		return amount;
	}

	public Money minus(Money money) {
		return new Money(getAmount() - money.getAmount());
	}

	public Money add(Money money) {
		return new Money(getAmount() + money.getAmount());
	}

	public Money times(int quantity) {
		return new Money(getAmount() * quantity);
	}

}