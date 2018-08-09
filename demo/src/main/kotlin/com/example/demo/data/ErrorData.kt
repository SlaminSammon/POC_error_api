package com.example.demo.data

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
@Table(name="ERRORS")
class ErrorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(value = "errorId")
    var errorId : Long? = null
    @Column(name ="service",nullable = false)
    @JsonProperty(value = "service")
    var service : String? = null
    @Column(name ="error_message",nullable = false)
    @JsonProperty(value = "errorMessage")
    var errorMessage : String? = null
}