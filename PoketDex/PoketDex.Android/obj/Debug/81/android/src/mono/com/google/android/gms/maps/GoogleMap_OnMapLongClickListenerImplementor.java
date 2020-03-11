package mono.com.google.android.gms.maps;


public class GoogleMap_OnMapLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMapLongClick:(Lcom/google/android/gms/maps/model/LatLng;)V:GetOnMapLongClick_Lcom_google_android_gms_maps_model_LatLng_Handler:Android.Gms.Maps.GoogleMap/IOnMapLongClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnMapLongClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnMapLongClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnMapLongClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnMapLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnMapLongClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onMapLongClick (com.google.android.gms.maps.model.LatLng p0)
	{
		n_onMapLongClick (p0);
	}

	private native void n_onMapLongClick (com.google.android.gms.maps.model.LatLng p0);

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
