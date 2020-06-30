package alfianyusufabdullah.hilt.quote

import alfianyusufabdullah.hilt.data.entity.QuoteResponse
import alfianyusufabdullah.hilt.data.repository.QuoteRepositoryImpl
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class QuoteViewModel @ViewModelInject constructor(private val quoteRepositoryImpl: QuoteRepositoryImpl) :
    ViewModel() {

    init {
        getRandomQuote()
    }

    private var _quote = MutableLiveData<QuoteResponse>()
    val quote: LiveData<QuoteResponse>
        get() = _quote

    fun getRandomQuote() {
        viewModelScope.launch {
            val response = quoteRepositoryImpl.getRandomQuote()
            _quote.postValue(response)
        }

    }
}