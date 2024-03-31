package com.iessotero.divertida.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iessotero.divertida.model.Stories;

public interface IStoryRepository extends JpaRepository<Stories, Long> {

}
