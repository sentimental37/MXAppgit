package md5e386347682ca6ba9104993c6721ae291;


public class HyperlinkHighlightedView
	extends android.view.View
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onSetAlpha:(I)Z:GetOnSetAlpha_IHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.SfPdfViewer.XForms.Droid.HyperlinkHighlightedView, Syncfusion.SfPdfViewer.XForms.Android, Version=16.1451.0.24, Culture=neutral, PublicKeyToken=null", HyperlinkHighlightedView.class, __md_methods);
	}


	public HyperlinkHighlightedView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == HyperlinkHighlightedView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfPdfViewer.XForms.Droid.HyperlinkHighlightedView, Syncfusion.SfPdfViewer.XForms.Android, Version=16.1451.0.24, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public HyperlinkHighlightedView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == HyperlinkHighlightedView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfPdfViewer.XForms.Droid.HyperlinkHighlightedView, Syncfusion.SfPdfViewer.XForms.Android, Version=16.1451.0.24, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public HyperlinkHighlightedView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == HyperlinkHighlightedView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfPdfViewer.XForms.Droid.HyperlinkHighlightedView, Syncfusion.SfPdfViewer.XForms.Android, Version=16.1451.0.24, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);


	public boolean onSetAlpha (int p0)
	{
		return n_onSetAlpha (p0);
	}

	private native boolean n_onSetAlpha (int p0);

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