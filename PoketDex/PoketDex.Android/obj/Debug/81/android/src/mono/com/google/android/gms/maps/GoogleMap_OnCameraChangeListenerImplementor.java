package mono.com.google.android.gms.maps;


public class GoogleMap_OnCameraChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraChange:(Lcom/google/android/gms/maps/model/CameraPosition;)V:GetOnCameraChange_Lcom_google_android_gms_maps_model_CameraPosition_Handler:Android.Gms.Maps.GoogleMap/IOnCameraChangeListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnCameraChangeListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnCameraChangeListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnCameraChangeListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnCameraChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnCameraChangeListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onCameraChange (com.google.android.gms.maps.model.CameraPosition p0)
	{
		n_onCameraChange (p0);
	}

	private native void n_onCameraChange (com.google.android.gms.maps.model.CameraPosition p0);

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
