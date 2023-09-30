package com.example.shramvriddhi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.shramvriddhi.R
import com.example.shramvriddhi.databinding.ActivityLocationBinding
import com.google.android.gms.common.api.Status
import com.google.android.libraries.maps.CameraUpdateFactory
import com.google.android.libraries.maps.GoogleMap
import com.google.android.libraries.maps.OnMapReadyCallback
import com.google.android.libraries.maps.SupportMapFragment
import com.google.android.libraries.maps.model.LatLng
import com.google.android.libraries.maps.model.Marker
import com.google.android.libraries.maps.model.MarkerOptions
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener

class LocationActivity : AppCompatActivity(),OnMapReadyCallback {
    private lateinit var binding: ActivityLocationBinding
    private lateinit var autocompleteFragment:  AutocompleteSupportFragment
    private var mGoogleMap: GoogleMap? = null

    private val raipur = LatLng(21.253943220973245, 81.64765630715799)
    private val risda = LatLng(21.769069079694475, 82.11758498005382)
    private val bihar = LatLng(26.433687512380548, 85.48380367292258)
    private val odisha = LatLng(22.897805704942055, 84.67249500710719)
    private val westBengal = LatLng(23.94068764613572, 87.20869149758212)
    private val uttarPradesh = LatLng(27.272940481489005, 81.078441480041)
    private val madhyaPradesh = LatLng(25.118028233393634, 81.0386121679048)
    private val maharashtra = LatLng(19.6451742435733, 73.54252268965494)
    private val andhraPradesh = LatLng(17.368289809349594, 81.66896098353753)
    private val telangana = LatLng(17.874038376888905, 78.41466846678134)


    private val cglocation = LatLng(21.253943220973245, 81.64765630715799)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        Places.initialize(applicationContext,getString(R.string.google_map_api))
        autocompleteFragment=supportFragmentManager
            .findFragmentById(R.id.autocomplete_Fragment) as AutocompleteSupportFragment
        autocompleteFragment.setPlaceFields(listOf(
            Place.Field.ID,
            Place.Field.ADDRESS,
            Place.Field.LAT_LNG))
        autocompleteFragment.setOnPlaceSelectedListener(object: PlaceSelectionListener {
            override fun onError(p0: Status) {
                Toast.makeText(this@LocationActivity,"Some Error in Search",Toast.LENGTH_SHORT).show()
            }

            override fun onPlaceSelected(place: Place) {
                val add = place.address
                val id = place.id

            }

        })

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)


}

    private fun zoomOnMap(latLng: LatLng){
        val newLatLngZoom = CameraUpdateFactory.newLatLngZoom(latLng,5f)
        mGoogleMap?.animateCamera(newLatLngZoom)

    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mGoogleMap= googleMap
        addMarker(odisha)
        addMarker(bihar)
        addMarker(raipur)
        addMarker(westBengal)
        addMarker(andhraPradesh)
        addMarker(madhyaPradesh)
        addMarker(maharashtra)
        addMarker(risda)
        addMarker(uttarPradesh)
        addMarker(telangana)
        zoomOnMap(madhyaPradesh)



    }

    private fun addMarker(position:LatLng): Marker {
        val marker =  mGoogleMap?.addMarker(
            MarkerOptions()
            .position(position)
            .title("Draggable Marker")
            .draggable(true))

        return marker!!
    }
}