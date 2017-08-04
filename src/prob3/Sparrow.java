package prob3;

public class Sparrow extends Bird {

	@Override
	protected void fly() {
		System.out.println("참새(" + getName() + ")는 날아다닙니다.");
	}

	@Override
	protected void sing() {
		System.out.println("참새(" + getName() + ")는 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + getName() + "입니다";
	}

}
