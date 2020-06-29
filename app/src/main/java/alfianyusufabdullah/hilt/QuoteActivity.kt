package alfianyusufabdullah.hilt

import alfianyusufabdullah.hilt.data.entity.QuoteResponse
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_quote.*

@AndroidEntryPoint
class QuoteActivity : AppCompatActivity() {

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        quoteViewModel.quote.observe(this, Observer {
            renderUI(it)
        })

        btnRandomQuote.setOnClickListener {
            quoteViewModel.getRandomQuote()
        }
    }

    private fun renderUI(quoteResponse: QuoteResponse) {
        tvQuote.text = quoteResponse.quote
        tvAuthor.text = getString(R.string.author, quoteResponse.author)
    }

}