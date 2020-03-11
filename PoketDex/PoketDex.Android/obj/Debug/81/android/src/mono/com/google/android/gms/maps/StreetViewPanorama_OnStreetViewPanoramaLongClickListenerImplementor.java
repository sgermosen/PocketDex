package mono.com.google.android.gms.maps;


public class StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStreetViewPanoramaLongClick:(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)V:GetOnStreetViewPanoramaLongClick_Lcom_google_android_gms_maps_model_StreetViewPanoramaOrientation_Handler:Android.Gms.Maps.StreetViewPanorama/IOnStreetViewPanoramaLongClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.StreetViewPanorama+IOnStreetViewPanoramaLongClickListenerImplementor, Xamarin.GooglePlayServices.Maps", StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor.class, __md_methods);
	}


	public StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor ()
	{
		super ();
		if (getClass () == StreetViewPanorama_OnStreetViewPanoramaLongClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.StreetViewPanorama+IOnStreetViewPanoramaLongClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onStreetViewPanoramaLongClick (com.google.android.gms.maps.model.StreetViewPanoramaOrientation p0)
	{
		n_onStreetViewPanoramaLongClick (p0);
	}

	private native void n_onStreetViewPanoramaLongClick (com.google.android.gms.maps.model.StreetViewPanoramaOrientation p0);

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
