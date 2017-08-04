package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if (function.equals("앱")) {
			PlayApp();
			return;
		}
		super.execute(function);
	}

	private void PlayApp() {
		System.out.println("앱 실행");
	}

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
}
