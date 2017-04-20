package com.anuj.maps.modules;

/**
 * Created by anuj on 21/4/17.
 */
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import com.anuj.maps.modules.Route;

/**
 * Created by Mai Thanh Hiep on 4/3/2016.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}