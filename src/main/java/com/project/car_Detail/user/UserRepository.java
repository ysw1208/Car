package com.project.car_Detail.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByUsername(String username);
    Optional<SiteUser> findByEmail(String email); // 이메일로 사용자를 찾는 메서드 추가
}
