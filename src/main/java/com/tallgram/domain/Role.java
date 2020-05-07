package com.tallgram.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Alen on 02.05.2020.
 */
public enum Role implements GrantedAuthority {
    USER {
        @Override
        public String getAuthority() {
            return name();
        }
    };
}
