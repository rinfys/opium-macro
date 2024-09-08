package org.sigma.project.requests

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class MainRequests {
    companion object {
        private val client = OkHttpClient()

        val response: Response = client.newCall(
            Request.Builder()
                .url("https://google.com")
                .build()
        ).execute()

        val statusCode: String = response.body?.string() ?: "No response"
    }
}