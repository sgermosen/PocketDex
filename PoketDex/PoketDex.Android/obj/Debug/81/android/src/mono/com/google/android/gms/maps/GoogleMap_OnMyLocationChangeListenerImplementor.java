package mono.com.google.android.gms.maps;


public class GoogleMap_OnMyLocationChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMyLocationChange:(Landroid/location/Location;)V:GetOnMyLocationChange_Landroid_location_Location_Handler:Android.Gms.Maps.GoogleMap/IOnMyLocationChangeListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnMyLocationChangeListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnMyLocationChangeListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnMyLocationChangeListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnMyLocationChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnMyLocationChangeListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onMyLocationChange (android.location.Location p0)
	{
		n_onMyLocationChange (p0);
	}

	private native void n_onMyLocationChange (android.location.Location p0);

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
