package com.example.shramvriddhi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shramvriddhi.R
import com.example.shramvriddhi.R.id.mapFragment
import com.example.shramvriddhi.databinding.ActivityHelpCentreLocateBinding
import com.google.android.libraries.maps.CameraUpdateFactory
import com.google.android.libraries.maps.GoogleMap
import com.google.android.libraries.maps.OnMapReadyCallback
import com.google.android.libraries.maps.SupportMapFragment
import com.google.android.libraries.maps.model.BitmapDescriptorFactory
import com.google.android.libraries.maps.model.LatLng
import com.google.android.libraries.maps.model.Marker
import com.google.android.libraries.maps.model.MarkerOptions

class HelpCentreLocateActivity : AppCompatActivity(),OnMapReadyCallback {
    private lateinit var binding:ActivityHelpCentreLocateBinding
    private var mGoogleMap: GoogleMap? = null
    private val latLng = LatLng(21.2088774,81.3780632)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpCentreLocateBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mapFragment = supportFragmentManager
            .findFragmentById(mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mGoogleMap= googleMap
        addMarker(latLng)
            .setIcon(BitmapDescriptorFactory.fromResource(R.drawable.logo))
        zoomOnMap(latLng)


    }

    private fun zoomOnMap (latLng: LatLng){
        val newLatLngZoom = CameraUpdateFactory.newLatLngZoom(latLng,7f)
        mGoogleMap?.animateCamera(newLatLngZoom)
    }

    private fun addMarker(position: LatLng): Marker {
        val marker =  mGoogleMap?.addMarker(
            MarkerOptions()
                .position(position)

                .title("Draggable Marker")
                .draggable(false))


        return marker!!
    }
}