package org.gabriel.carrosapi.api

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @project carros-api-kt
 * @author daohn on 31/01/2021
 */
@RestController
@RequestMapping("/")
class IndexController {

  @GetMapping
  fun hello() = "API dos Carros"

  @GetMapping("/userInfo")
  fun userInfo(@AuthenticationPrincipal user: UserDetails) = user
}