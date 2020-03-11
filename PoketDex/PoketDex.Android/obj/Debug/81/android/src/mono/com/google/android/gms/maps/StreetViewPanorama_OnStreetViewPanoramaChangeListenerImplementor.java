package mono.com.google.android.gms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaChange:(Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;)V:GetOnStreetViewPanoramaChange_Lcom_google_android_gms_maps_model_StreetViewPanoramaLocation_Handler:Android.Gms.Maps.StreetViewPanorama/IOnStreetViewPanoramaChangeListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.StreetViewPanorama+IOnStreetViewPanoramaChangeListenerImplementor, Xamarin.GooglePlayServices.Maps", StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.StreetViewPanorama+IOnStreetViewPanoramaChangeListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaChange (com.google.android.gms.maps.model.StreetViewPanoramaLocation p0)
	{
		n_onStreetViewPanoramaChange (p0);
	}

	private native void n_onStreetViewPanoramaChange (com.google.android.gms.maps.model.StreetViewPanoramaLocation p0);

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
