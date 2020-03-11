package mono.com.google.android.gms.maps;


public class GoogleMap_OnCameraMoveListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMove:()V:GetOnCameraMoveHandler:Android.Gms.Maps.GoogleMap/IOnCameraMoveListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnCameraMoveListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnCameraMoveListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnCameraMoveListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnCameraMoveListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnCameraMoveListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMove ()
	{
		n_onCameraMove ();
	}

	private native void n_onCameraMove ();

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
