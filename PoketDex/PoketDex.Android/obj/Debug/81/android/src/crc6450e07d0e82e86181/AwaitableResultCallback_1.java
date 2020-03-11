package crc6450e07d0e82e86181;


public class AwaitableResultCallback_1
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.common.api.ResultCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lcom/google/android/gms/common/api/Result;)V:GetOnResult_Lcom_google_android_gms_common_api_Result_Handler:Android.Gms.Common.Apis.IResultCallbackInvoker, Xamarin.GooglePlayServices.Basement\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.Common.Apis.AwaitableResultCallback`1, Xamarin.GooglePlayServices.Basement", AwaitableResultCallback_1.class, __md_methods);
	}


	public AwaitableResultCallback_1 ()
	{
		super ();
		if (getClass () == AwaitableResultCallback_1.class)
			mono.android.TypeManager.Activate ("Android.Gms.Common.Apis.AwaitableResultCallback`1, Xamarin.GooglePlayServices.Basement", "", this, new java.lang.Object[] {  });
	}


	public void onResult (com.google.android.gms.common.api.Result p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (com.google.android.gms.common.api.Result p0);

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
