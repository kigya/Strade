package com.plcoding.stockmarketapp.di

import com.kigya.strade.data.csv.CSVParser
import com.kigya.strade.data.csv.CompanyListingsParser
import com.kigya.strade.data.csv.IntradayInfoParser
import com.kigya.strade.data.repository.StockRepositoryImpl
import com.kigya.strade.domain.model.CompanyListing
import com.kigya.strade.domain.model.IntradayInfo
import com.kigya.strade.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}