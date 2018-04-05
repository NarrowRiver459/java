package interfaces;

import org.springframework.stereotype.Component;

@Component
public interface Player{

	/**
	 * 初期設定を行うメソッド
	 *
	 *
	 */
	public abstract void init();

	/**
	 *  登録を行うメソッド
	 */
	public void play();



}