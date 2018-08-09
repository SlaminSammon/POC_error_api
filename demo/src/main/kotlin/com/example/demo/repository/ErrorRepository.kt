package com.example.demo.repository

import com.example.demo.data.ErrorData
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ErrorRepository : JpaRepository<ErrorData,Long>