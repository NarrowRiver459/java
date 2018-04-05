package Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArtistRepositoryDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int getArtistName(){

		// 返却用のインスタンス生成
//		List<ArtistRepositoryEntity> artistRepositoryEntityList = new ArrayList<>();

		// TEST 返却用
		int count = 0;

		try {

			String sql = "SELECT COUNT(*) FROM user";

			// データベースの接続
			count = jdbcTemplate.queryForObject(sql, Integer.class);

		} catch(Exception e) {

			System.out.println("エラーです");
			e.printStackTrace();
		}

		return count;
	}
}
