package mono.com.google.android.gms.maps;


public class GoogleMap_OnPoiClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnPoiClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPoiClick:(Lcom/google/android/gms/maps/model/PointOfInterest;)V:GetOnPoiClick_Lcom_google_android_gms_maps_model_PointOfInterest_Handler:Android.Gms.Maps.GoogleMap/IOnPoiClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnPoiClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnPoiClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnPoiClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnPoiClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnPoiClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onPoiClick (com.google.android.gms.maps.model.PointOfInterest p0)
	{
		n_onPoiClick (p0);
	}

	private native void n_onPoiClick (com.google.android.gms.maps.model.PointOfInterest p0);

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
