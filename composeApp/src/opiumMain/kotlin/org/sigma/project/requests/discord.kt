package org.sigma.project.requests

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response

class Discord {
    companion object {
        private val client = OkHttpClient()
        private val webhook = "https://discord.com/api/webhooks/1283561499779928108/AESuVJIcGJi8pH92YJ1XgHLQ5Gpsf35eeVD9lTv4iBYqc1vm766sivS29YbUWSO87bSE"
        private val JSON = "application/json; charset=utf-8".toMediaTypeOrNull()

        private fun createJsonRequestBody(message: String): RequestBody {
            val json = """
                {
                    "embeds": [
                        {
                            "title": "Event",
                            "description": "$message",
                            "color": 5814783
                        }
                    ]
                }
            """
            return RequestBody.create(JSON, json)
        }

        fun sendWebhook(message: String) {
            val request = Request.Builder()
                .url(webhook)
                .post(createJsonRequestBody(message))
                .build()
            client.newCall(request).execute().use(Response::close)
        }
    }
}