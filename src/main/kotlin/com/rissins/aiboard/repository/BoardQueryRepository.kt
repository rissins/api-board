package com.rissins.aiboard.repository

import com.rissins.aiboard.dto.request.BoardRequest
import com.rissins.aiboard.entity.Board
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface BoardQueryRepository {
    fun search(condition: BoardRequest.Search, pageable: Pageable): Page<Board>
}