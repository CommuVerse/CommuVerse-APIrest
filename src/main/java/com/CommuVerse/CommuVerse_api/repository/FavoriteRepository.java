
package com.CommuVerse.CommuVerse_api.repository;

import com.CommuVerse.CommuVerse_api.model.entity.Favorite;
import com.CommuVerse.CommuVerse_api.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Integer> {
    List<Favorite> findByReader(User reader);
}
