package com.createService.domain.coderAuth;

import com.createService.domain.common.exceptions.InvalidInputException;
import com.createService.domain.common.exceptions.UnauthorizedException;
import com.createService.domain.common.models.Id;
import org.springframework.web.client.HttpClientErrorException;

public interface AuthorizeService {

    public Id authorize(String token) throws UnauthorizedException, InvalidInputException;
}
