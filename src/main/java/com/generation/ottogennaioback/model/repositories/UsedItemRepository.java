package com.generation.ottogennaioback.model.repositories;

import com.generation.ottogennaioback.model.entities.UsedItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedItemRepository extends JpaRepository<UsedItem, Long> {
}
