package impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.ArtistRepositoryDao;
import entity.ArtistRepositoryEntity;
import interfaces.ArtistRepository;

@Service
public class ArtistRepositoryImpl implements ArtistRepository {

	@Autowired
	ArtistRepositoryDao artistRepositoryDao;

	/**
	 *  登録を行うメソッド
	 */
	public void repository() {

		ArtistRepositoryEntity artistRepositoryEntity = new ArtistRepositoryEntity();
//		artistRepositoryEntity = artistReposcountitoryDao.getArtistName();
		int test = artistRepositoryDao.getArtistName();
//		artistRepositoryEntity.setArtist(artist);
		String result = artistRepositoryEntity.getArtist();

//		System.out.println(artistRepositoryEntity.getArtist());

		System.out.println(result + "の登録が完了しました");


	}

}
