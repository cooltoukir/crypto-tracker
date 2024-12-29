package com.toukirahmed.cryptotracker.crypto.domain

import com.toukirahmed.cryptotracker.core.domain.util.NetworkError
import com.toukirahmed.cryptotracker.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}