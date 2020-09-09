package com.travels.searchtravels

import android.graphics.BitmapFactory
import android.os.Handler
import android.view.View
import com.google.api.services.vision.v1.model.LatLng
import com.preview.planner.prefs.AppPreferences
import com.travels.searchtravels.api.OnVisionApiListener
import com.travels.searchtravels.api.VisionApi
import com.travels.searchtravels.utils.Constants
import com.travels.searchtravels.utils.L
import kotlinx.android.synthetic.main.activity_main.*
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test
import java.io.IOException
import java.net.URL


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val seaImageUrl = URL("https://i.picsum.photos/id/1038/3914/5863.jpg?hmac=SGtXryWDkn_eVQdA1NjYrikcsrIfcfS4SFYHo4lCpkQ")
    private val oceanImageUrl = URL("https://i.picsum.photos/id/266/4608/2592.jpg?hmac=6aICI-kg2CPyWcM8YFrpdcHPO8zrZtoY2vpZkAESt3M")
    private val beachImageUrl = URL("https://i.picsum.photos/id/108/2000/1333.jpg?hmac=jtsJnUALS7Y2pJnLKGF7fSvGhEKpDWLvjTr9bRVFELA")
    private val mountainsImageUrl = URL("https://i.picsum.photos/id/191/2560/1707.jpg?hmac=60dSBXsS8n-Gi2-LMtm-BfDd6Mz_JMrYI8jN4yb41qg")
    private val snowImageUrl = URL("https://i.picsum.photos/id/1036/4608/3072.jpg?hmac=Tn9CS_V7lFSMMgAI5k1M38Mdj-YEJR9dPJCyeXNpnZc")
    private val otherImageUrl = URL("https://i.picsum.photos/id/274/3824/2520.jpg?hmac=OOl_w8LX_psogyruUe1z986AuqeS_TY7rLxAFgG4wrc")
    private val plainWhiteImageUrl = URL("https://www.publicdomainpictures.net/pictures/30000/velka/plain-white-background.jpg")

    private val authToken = ""   //ENTER YOUR AUTH TOKEN

    @Test
    fun testSeaVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(seaImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        val pair = loadByCategory(category)
                        assertEquals("Rimini", pair.first)
                        assertEquals("Римини", pair.second)
                    }

                    override fun onError() {
                        fail()
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    @Test
    fun testOceanVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(oceanImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        val pair = loadByCategory(category)
                        assertEquals("Rimini", pair.first)
                        assertEquals("Римини", pair.second)
                    }

                    override fun onError() {
                        fail()
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    @Test
    fun testBeachVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(beachImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        val pair = loadByCategory(category)
                        assertEquals("Rimini", pair.first)
                        assertEquals("Римини", pair.second)
                    }

                    override fun onError() {
                        fail()
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    @Test
    fun testMountainsVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(mountainsImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        val pair = loadByCategory(category)
                        assertEquals("Sochi", pair.first)
                        assertEquals("Сочи", pair.second)
                    }

                    override fun onError() {
                        fail()
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    @Test
    fun testSnowVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(snowImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        val pair = loadByCategory(category)
                        assertEquals("Helsinki", pair.first)
                        assertEquals("Хельсинки", pair.second)
                    }

                    override fun onError() {
                        fail()
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    @Test
    fun testOtherVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(otherImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        val pair = loadByCategory(category)
                        assertEquals("Rimini", pair.first)
                        assertEquals("Римини", pair.second)
                    }

                    override fun onError() {
                        fail()
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    @Test
    fun testErrorVisionApi() {
        try {
            val image = BitmapFactory.decodeStream(plainWhiteImageUrl.openConnection().getInputStream())
            VisionApi.findLocation(image,
                authToken,
                object : OnVisionApiListener {

                    override fun onSuccess(latLng: LatLng) {
                        fail()
                    }

                    override fun onErrorPlace(category: String) {
                        fail()
                    }

                    override fun onError() {
                        assert(true)
                    }
                })

        } catch (e: IOException) {
            System.out.println(e)
        }
    }

    private fun loadByCategory(category: String): Pair<String, String> {
        var city = "Rimini"
        var cityRu = "Римини"
        when(category){
            "sea" -> {
                city = "Rimini"
                cityRu = "Римини"
            }
            "ocean" -> {
                city = "Rimini"
                cityRu = "Римини"
            }
            "beach" -> {
                city = "Rimini"
                cityRu = "Римини"
            }
            "mountain" -> {
                city = "Sochi"
                cityRu = "Сочи"
            }
            "snow" -> {
                city = "Helsinki"
                cityRu = "Хельсинки"
            }
            else -> {
                city = "Rimini"
                cityRu = "Римини"
            }
        }

        return Pair(city, cityRu)
    }
}
