package com.example.demo.controller

import com.example.demo.model.response.PlaceResponse
import com.example.demo.model.response.SearchPlaceResultResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/api/v1/search")
class SearchPlaceController {

    @GetMapping("/places")
    fun getSearchResult(@RequestParam() query: String, @RequestHeader("Authorization") userId: String): SearchPlaceResultResponse? {
        return SearchPlaceResultResponse(
            query,
            listOf()
        );
    }

    @GetMapping("/most-popular-places")
    fun getMostPopularPlaces(): List<PlaceResponse> {
        return listOf()
    }
}