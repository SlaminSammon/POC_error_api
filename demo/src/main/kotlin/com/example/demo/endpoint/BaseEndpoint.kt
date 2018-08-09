package com.example.demo.endpoint

import com.example.demo.data.ErrorData
import com.example.demo.repository.ErrorRepository
import com.example.demo.requests.ErrorRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class BaseEndpoint() {
    @Autowired
    lateinit var errorRepository:ErrorRepository
    @GetMapping("/hello")
    fun helloSpring() : List<ErrorData>{
        return errorRepository.findAll()
    }
    @PostMapping("/errors")
    fun postNewError(@RequestBody req:ErrorRequest) : Long?{
        return errorRepository.save(req.errorData).errorId
    }
}
