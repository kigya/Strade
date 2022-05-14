package com.kigya.strade.domain.repository

import com.kigya.strade.domain.model.CompanyInfo
import com.kigya.strade.domain.model.CompanyListing
import com.kigya.strade.domain.model.IntradayInfo
import com.kigya.strade.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>

}