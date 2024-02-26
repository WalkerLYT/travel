package dao;

import domain.Favorite;

public interface FavoriteDao {

    Favorite findByRidAndUid(int rid, int uid);

    int findCountByRid(int rid);

    void add(int i, int uid);
}
