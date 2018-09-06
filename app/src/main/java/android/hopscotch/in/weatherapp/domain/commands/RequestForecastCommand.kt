package android.hopscotch.`in`.weatherapp.domain.commands

import android.hopscotch.`in`.weatherapp.data.ForecastRequest
import android.hopscotch.`in`.weatherapp.domain.mapper.ForecastDataMapper
import android.hopscotch.`in`.weatherapp.domain.model.ForecastList

class RequestForecastCommand( private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}
