package org.aehan.service;

import lombok.RequiredArgsConstructor;
import org.aehan.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


}
