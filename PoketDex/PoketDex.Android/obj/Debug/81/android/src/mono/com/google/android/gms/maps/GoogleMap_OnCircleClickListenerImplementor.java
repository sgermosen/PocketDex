package mono.com.google.android.gms.maps;


public class GoogleMap_OnCircleClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.OnCircleClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCircleClick:(Lcom/google/android/gms/maps/model/Circle;)V:GetOnCircleClick_Lcom_google_android_gms_maps_model_Circle_Handler:Android.Gms.Maps.GoogleMap/IOnCircleClickListenerInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Maps.GoogleMap+IOnCircleClickListenerImplementor, Xamarin.GooglePlayServices.Maps", GoogleMap_OnCircleClickListenerImplementor.class, __md_methods);
	}


	public GoogleMap_OnCircleClickListenerImplementor ()
	{
		super ();
		if (getClass () == GoogleMap_OnCircleClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Maps.GoogleMap+IOnCircleClickListenerImplementor, Xamarin.GooglePlayServices.Maps", "", this, new java.lang.Object[] {  });
	}


	public void onCircleClick (com.google.android.gms.maps.model.Circle p0)
	{
		n_onCircleClick (p0);
	}

	private native void n_onCircleClick (com.google.android.gms.maps.model.Circle p0);

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
