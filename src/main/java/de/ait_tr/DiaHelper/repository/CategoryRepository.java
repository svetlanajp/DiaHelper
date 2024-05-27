package de.ait_tr.DiaHelper.repository;

import de.ait_tr.DiaHelper.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByTitle(String title);
}
