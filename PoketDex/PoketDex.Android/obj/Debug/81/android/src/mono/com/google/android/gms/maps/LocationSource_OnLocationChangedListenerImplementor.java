package mono.com.google.android.gms.maps;


public class LocationSource_OnLocationChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.LocationSource.OnLocationChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLocationChanged:(Landroid/location/Location;)V:GetOnLocationChanged_Landroid_location_Location_Handler:Android.Gms.Maps.ILocationSourceOnLocationChangedListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.ILocationSourceOnLocationChangedListenerImplementor, Xamarin.GooglePlayServices.Maps", LocationSource_OnLocationChangedListenerImplementor.class, __md_methods);
	}


	public LocationSource_OnLocationChangedListenerImplementor ()
	{
		super ();
		if (getClass () == LocationSource_OnLocationChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.ILocationSourceOnLocationChangedListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onLocationChanged (android.location.Location p0)
	{
		n_onLocationChanged (p0);
	}

	private native void n_onLocationChanged (android.location.Location p0);

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
