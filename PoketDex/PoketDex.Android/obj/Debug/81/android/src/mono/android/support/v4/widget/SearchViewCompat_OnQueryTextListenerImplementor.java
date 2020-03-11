package mono.android.support.v4.widget;


public class SearchViewCompat_OnQueryTextListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v4.widget.SearchViewCompat.OnQueryTextListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onQueryTextChange:(Ljava/lang/String;)Z:GetOnQueryTextChange_Ljava_lang_String_Handler:Android.Support.V4.Widget.SearchViewCompat/IOnQueryTextListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"n_onQueryTextSubmit:(Ljava/lang/String;)Z:GetOnQueryTextSubmit_Ljava_lang_String_Handler:Android.Support.V4.Widget.SearchViewCompat/IOnQueryTextListenerInvoker, Xamarin.Android.Support.Compat\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SearchViewCompat+IOnQueryTextListenerImplementor, Xamarin.Android.Support.Compat", SearchViewCompat_OnQueryTextListenerImplementor.class, __md_methods);
	}


	public SearchViewCompat_OnQueryTextListenerImplementor ()
	{
		super ();
		if (getClass () == SearchViewCompat_OnQueryTextListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SearchViewCompat+IOnQueryTextListenerImplementor, Xamarin.Android.Support.Compat", "", this, new java.lang.Object[] {  });
	}


	public boolean onQueryTextChange (java.lang.String p0)
	{
		return n_onQueryTextChange (p0);
	}

	private native boolean n_onQueryTextChange (java.lang.String p0);


	public boolean onQueryTextSubmit (java.lang.String p0)
	{
		return n_onQueryTextSubmit (p0);
	}

	private native boolean n_onQueryTextSubmit (java.lang.String p0);

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
