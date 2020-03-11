package mono.com.google.android.gms.security;


public class ProviderInstaller_ProviderInstallListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProviderInstallFailed:(ILandroid/content/Intent;)V:GetOnProviderInstallFailed_ILandroid_content_Intent_Handler:Android.Gms.Security.ProviderInstaller/IProviderInstallListenerInvoker, Xamarin.GooglePlayServices.Basement\n" +
			"n_onProviderInstalled:()V:GetOnProviderInstalledHandler:Android.Gms.Security.ProviderInstaller/IProviderInstallListenerInvoker, Xamarin.GooglePlayServices.Basement\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Security.ProviderInstaller+IProviderInstallListenerImplementor, Xamarin.GooglePlayServices.Basement", ProviderInstaller_ProviderInstallListenerImplementor.class, __md_methods);
	}


	public ProviderInstaller_ProviderInstallListenerImplementor ()
	{
		super ();
		if (getClass () == ProviderInstaller_ProviderInstallListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Gms.Security.ProviderInstaller+IProviderInstallListenerImplementor, Xamarin.GooglePlayServices.Basement", "", this, new java.lang.Object[] {  });
	}


	public void onProviderInstallFailed (int p0, android.content.Intent p1)
	{
		n_onProviderInstallFailed (p0, p1);
	}

	private native void n_onProviderInstallFailed (int p0, android.content.Intent p1);


	public void onProviderInstalled ()
	{
		n_onProviderInstalled ();
	}

	private native void n_onProviderInstalled ();

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
