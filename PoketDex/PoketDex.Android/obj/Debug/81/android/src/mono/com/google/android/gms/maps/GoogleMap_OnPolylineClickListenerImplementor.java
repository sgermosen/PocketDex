package mono.com.google.android.gms.maps;


public class GoogleMap_OnPolylineClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPolylineClick:(Lcom/google/android/gms/maps/model/Polyline;)V:GetOnPolylineClick_Lcom_google_android_gms_maps_model_Polyline_Handler:Android.Gms.Maps.GoogleMap/IOnPolylineClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnPolylineClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnPolylineClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnPolylineClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnPolylineClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnPolylineClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onPolylineClick (com.google.android.gms.maps.model.Polyline p0)
	{
		n_onPolylineClick (p0);
	}

	private native void n_onPolylineClick (com.google.android.gms.maps.model.Polyline p0);

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
