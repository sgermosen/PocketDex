package mono.com.google.android.gms.maps;


public class GoogleMap_OnPolygonClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPolygonClick:(Lcom/google/android/gms/maps/model/Polygon;)V:GetOnPolygonClick_Lcom_google_android_gms_maps_model_Polygon_Handler:Android.Gms.Maps.GoogleMap/IOnPolygonClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnPolygonClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnPolygonClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnPolygonClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnPolygonClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnPolygonClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onPolygonClick (com.google.android.gms.maps.model.Polygon p0)
	{
		n_onPolygonClick (p0);
	}

	private native void n_onPolygonClick (com.google.android.gms.maps.model.Polygon p0);

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
