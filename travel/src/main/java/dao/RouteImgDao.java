package dao;

import domain.RouteImg;

import java.util.List;

public interface RouteImgDao {

    List<RouteImg> findByRid(int rid);
}
