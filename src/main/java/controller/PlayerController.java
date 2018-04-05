package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import impl.ArtistRepositoryImpl;
import interfaces.Player;

@Controller
@ComponentScan("sample")
public class PlayerController implements Player {

	@Autowired
	ArtistRepositoryImpl artistRepositoryImpl = new ArtistRepositoryImpl();

	/**
	 * 初期設定
	 */
	public void init(){

		// 登録処理
		artistRepositoryImpl.repository();

//		StringBuilder builder = new StringBuilder();

		// path
//		File path = new File("path");

		// ファイルの読み込み
//			FileReader fileReader new FileReader(path);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);



	}

	public void play(){

	}

}
