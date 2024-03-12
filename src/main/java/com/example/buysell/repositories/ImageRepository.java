package com.example.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	
}
