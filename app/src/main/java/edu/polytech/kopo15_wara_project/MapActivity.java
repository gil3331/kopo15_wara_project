package edu.polytech.kopo15_wara_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;


import net.daum.mf.map.api.MapView;

public class MapActivity extends Activity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_map);
            MapView mapView = new MapView(this);
            ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
            mapViewContainer.addView(mapView);


//            public void setCurrentLocationEventListener(MapView.CurrentLocationEventListener currentLocationEventListener)
//            mMapView = (MapView) findViewById(R.id.map_view);
//            mMapView.setDaumMapApiKey(API_KEY);
//            mMapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithoutHeading);
//            mMapView.setCurrentLocationEventListener(mCurrentLocationEventListener);
        }

}

