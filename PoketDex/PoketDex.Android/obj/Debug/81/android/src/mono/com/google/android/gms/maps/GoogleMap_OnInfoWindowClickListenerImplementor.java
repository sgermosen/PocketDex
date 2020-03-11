package mono.com.google.android.gms.maps;


public class GoogleMap_OnInfoWindowClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfoWindowClick:(Lcom/google/android/gms/maps/model/Marker;)V:GetOnInfoWindowClick_Lcom_google_android_gms_maps_model_Marker_Handler:Android.Gms.Maps.GoogleMap/IOnInfoWindowClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnInfoWindowClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnInfoWindowClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnInfoWindowClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnInfoWindowClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnInfoWindowClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onInfoWindowClick (com.google.android.gms.maps.model.Marker p0)
	{
		n_onInfoWindowClick (p0);
	}

	private native void n_onInfoWindowClick (com.google.android.gms.maps.model.Marker p0);

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
