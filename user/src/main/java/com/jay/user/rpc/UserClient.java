package com.jay.user.rpc;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "infrastructure")
public interface UserClient {



}
