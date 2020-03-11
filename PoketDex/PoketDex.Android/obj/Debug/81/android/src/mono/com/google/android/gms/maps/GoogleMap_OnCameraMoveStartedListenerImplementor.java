package mono.com.google.android.gms.maps;


public class GoogleMap_OnCameraMoveStartedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMoveStarted:(I)V:GetOnCameraMoveStarted_IHandler:Android.Gms.Maps.GoogleMap/IOnCameraMoveStartedListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnCameraMoveStartedListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnCameraMoveStartedListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnCameraMoveStartedListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnCameraMoveStartedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnCameraMoveStartedListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMoveStarted (int p0)
	{
		n_onCameraMoveStarted (p0);
	}

	private native void n_onCameraMoveStarted (int p0);

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
