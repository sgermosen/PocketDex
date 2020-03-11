package mono.com.google.android.gms.maps;


public class GoogleMap_OnMarkerClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMarkerClick:(Lcom/google/android/gms/maps/model/Marker;)Z:GetOnMarkerClick_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnMarkerClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnMarkerClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnMarkerClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnMarkerClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnMarkerClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnMarkerClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public boolean onMarkerClick (com.google.android.gms.maps.model.Marker p0)
	{
		return n_onMarkerClick (p0);
	}

	private native boolean n_onMarkerClick (com.google.android.gms.maps.model.Marker p0);

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
