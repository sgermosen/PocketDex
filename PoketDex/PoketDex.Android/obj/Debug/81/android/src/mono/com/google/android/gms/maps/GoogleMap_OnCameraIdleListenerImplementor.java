package mono.com.google.android.gms.maps;


public class GoogleMap_OnCameraIdleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraIdle:()V:GetOnCameraIdleHandler:Android.Gms.Maps.GoogleMap/IOnCameraIdleListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnCameraIdleListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnCameraIdleListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnCameraIdleListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnCameraIdleListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnCameraIdleListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onCameraIdle ()
	{
		n_onCameraIdle ();
	}

	private native void n_onCameraIdle ();

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
