package mono.android.support.v4.widget;


public class SearchViewCompat_OnCloseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v4.widget.SearchViewCompat.OnCloseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClose:()Z:GetOnCloseHandler:Android.Support.V4.Widget.SearchViewCompat/IOnCloseListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SearchViewCompat+IOnCloseListenerImplementor, Xamarin.Android.Support.Compat", SearchViewCompat_OnCloseListenerImplementor.class, __md_methods);
	}


	public SearchViewCompat_OnCloseListenerImplementor ()
	{
		super ();
		if (getClass () == SearchViewCompat_OnCloseListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SearchViewCompat+IOnCloseListenerImplementor, Xamarin.Android.Support.Compat", "", this, new java.lang.Object[] {  });
	}


	public boolean onClose ()
	{
		return n_onClose ();
	}

	private native boolean n_onClose ();

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
