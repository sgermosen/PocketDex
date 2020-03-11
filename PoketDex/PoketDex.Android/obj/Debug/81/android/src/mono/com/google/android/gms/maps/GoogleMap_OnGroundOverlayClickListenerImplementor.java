package mono.com.google.android.gms.maps;


public class GoogleMap_OnGroundOverlayClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGroundOverlayClick:(Lcom/google/android/gms/maps/model/GroundOverlay;)V:GetOnGroundOverlayClick_Lcom_google_android_gms_maps_model_GroundOverlay_Handler:Android.Gms.Maps.GoogleMap/IOnGroundOverlayClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnGroundOverlayClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnGroundOverlayClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnGroundOverlayClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnGroundOverlayClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnGroundOverlayClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onGroundOverlayClick (com.google.android.gms.maps.model.GroundOverlay p0)
	{
		n_onGroundOverlayClick (p0);
	}

	private native void n_onGroundOverlayClick (com.google.android.gms.maps.model.GroundOverlay p0);

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
