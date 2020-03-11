package mono.com.google.android.gms.maps;


public class GoogleMap_OnMarkerDragListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerDrag:(Lcom/google/android/gms/maps/model/Marker;)V:GetOnMarkerDrag_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnMarkerDragListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"n_onMarkerDragEnd:(Lcom/google/android/gms/maps/model/Marker;)V:GetOnMarkerDragEnd_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnMarkerDragListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"n_onMarkerDragStart:(Lcom/google/android/gms/maps/model/Marker;)V:GetOnMarkerDragStart_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnMarkerDragListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnMarkerDragListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnMarkerDragListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnMarkerDragListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnMarkerDragListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnMarkerDragListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onMarkerDrag (com.google.android.gms.maps.model.Marker p0)
	{
		n_onMarkerDrag (p0);
	}

	private native void n_onMarkerDrag (com.google.android.gms.maps.model.Marker p0);


	public void onMarkerDragEnd (com.google.android.gms.maps.model.Marker p0)
	{
		n_onMarkerDragEnd (p0);
	}

	private native void n_onMarkerDragEnd (com.google.android.gms.maps.model.Marker p0);


	public void onMarkerDragStart (com.google.android.gms.maps.model.Marker p0)
	{
		n_onMarkerDragStart (p0);
	}

	private native void n_onMarkerDragStart (com.google.android.gms.maps.model.Marker p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
