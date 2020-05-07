package com.tallgram.repo;

import com.tallgram.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Alen on 08.03.2020.
 */
public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);
}