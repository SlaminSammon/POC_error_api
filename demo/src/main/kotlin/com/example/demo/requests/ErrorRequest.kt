package com.example.demo.requests

import com.example.demo.data.ErrorData
import com.fasterxml.jackson.annotation.JsonProperty

class ErrorRequest() {
    @JsonProperty("errorData")
    var errorData : ErrorData = ErrorData()

}