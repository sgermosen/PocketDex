package mono.com.google.android.gms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaClick:(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V:GetOnStreetViewPanoramaClick_Lcom_google_android_gms_maps_model_StreetViewPanoramaOrientation_Handler:Android.Gms.Maps.StreetViewPanorama/IOnStreetViewPanoramaClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.StreetViewPanorama+IOnStreetViewPanoramaClickListenerImplementor, Xamarin.GooglePlayServices.Maps", StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.StreetViewPanorama+IOnStreetViewPanoramaClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaClick (com.google.android.gms.maps.model.StreetViewPanoramaOrientation p0)
	{
		n_onStreetViewPanoramaClick (p0);
	}

	private native void n_onStreetViewPanoramaClick (com.google.android.gms.maps.model.StreetViewPanoramaOrientation p0);

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
