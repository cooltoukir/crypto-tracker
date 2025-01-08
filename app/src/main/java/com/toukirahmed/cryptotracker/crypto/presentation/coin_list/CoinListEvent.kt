package com.toukirahmed.cryptotracker.crypto.presentation.coin_list

import com.toukirahmed.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}