package alfianyusufabdullah.hilt.quote

import alfianyusufabdullah.hilt.R
import alfianyusufabdullah.hilt.databinding.ActivityQuoteBinding
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuoteActivity : AppCompatActivity() {

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val quoteViewBinding: ActivityQuoteBinding =
            DataBindingUtil.setContentView(this,
                R.layout.activity_quote
            )

        quoteViewBinding.quoteViewModel = quoteViewModel
        quoteViewBinding.lifecycleOwner = this
    }
}