package mehdi.sakout.aboutpage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.net.MailTo;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;

public class AboutPage {
    /* access modifiers changed from: private */
    public static final String LOG_TAG = "AboutPage";
    /* access modifiers changed from: private */
    public final Context mContext;
    private Typeface mCustomFont;
    private CharSequence mDescription;
    private int mImage;
    private final LayoutInflater mInflater;
    private boolean mIsRTL;
    private final View mView;

    public AboutPage(Context context) {
        this(context, AboutPageUtils.resolveResIdAttr(context, R.attr.aboutStyle, R.style.about_About));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AboutPage(Context context, boolean z) {
        this(context, z ? R.style.about_AboutBase_Dark : R.style.about_AboutBase_Light);
    }

    public AboutPage(Context context, int i) {
        this.mImage = 0;
        this.mIsRTL = false;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        this.mContext = contextThemeWrapper;
        LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
        this.mInflater = from;
        this.mView = from.inflate(R.layout.about_page, (ViewGroup) null);
    }

    public AboutPage setCustomFont(String str) {
        this.mCustomFont = Typeface.createFromAsset(this.mContext.getAssets(), str);
        return this;
    }

    public AboutPage setCustomFont(Typeface typeface) {
        this.mCustomFont = typeface;
        return this;
    }

    public AboutPage addEmail(String str) {
        return addEmail(str, this.mContext.getString(R.string.about_contact_us));
    }

    public AboutPage addEmail(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_email));
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        element.setIntent(intent);
        addItem(element);
        return this;
    }

    public AboutPage addFacebook(String str) {
        return addFacebook(str, this.mContext.getString(R.string.about_facebook));
    }

    public AboutPage addFacebook(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_facebook));
        element.setIconTint(Integer.valueOf(R.color.about_facebook_color));
        element.setValue(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        if (AboutPageUtils.isAppInstalled(this.mContext, "com.facebook.katana").booleanValue()) {
            intent.setPackage("com.facebook.katana");
            int i = 0;
            try {
                i = this.mContext.getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            if (i >= 3002850) {
                intent.setData(Uri.parse("fb://facewebmodal/f?href=http://m.facebook.com/" + str));
            } else {
                intent.setData(Uri.parse("fb://page/" + str));
            }
        } else {
            intent.setData(Uri.parse("http://m.facebook.com/" + str));
        }
        element.setIntent(intent);
        addItem(element);
        return this;
    }

    public AboutPage addTwitter(String str) {
        return addTwitter(str, this.mContext.getString(R.string.about_twitter));
    }

    public AboutPage addTwitter(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_twitter));
        element.setIconTint(Integer.valueOf(R.color.about_twitter_color));
        element.setValue(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        if (AboutPageUtils.isAppInstalled(this.mContext, "com.twitter.android").booleanValue()) {
            intent.setPackage("com.twitter.android");
            intent.setData(Uri.parse(String.format("twitter://user?screen_name=%s", new Object[]{str})));
        } else {
            intent.setData(Uri.parse(String.format("http://twitter.com/intent/user?screen_name=%s", new Object[]{str})));
        }
        element.setIntent(intent);
        addItem(element);
        return this;
    }

    public AboutPage addPlayStore(String str) {
        return addPlayStore(str, this.mContext.getString(R.string.about_play_store));
    }

    public AboutPage addPlayStore(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_google_play));
        element.setIconTint(Integer.valueOf(R.color.about_play_store_color));
        element.setValue(str);
        element.setIntent(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
        addItem(element);
        return this;
    }

    public AboutPage addYoutube(String str) {
        return addYoutube(str, this.mContext.getString(R.string.about_youtube));
    }

    public AboutPage addYoutube(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_youtube));
        element.setIconTint(Integer.valueOf(R.color.about_youtube_color));
        element.setValue(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(String.format("http://youtube.com/channel/%s", new Object[]{str})));
        if (AboutPageUtils.isAppInstalled(this.mContext, "com.google.android.youtube").booleanValue()) {
            intent.setPackage("com.google.android.youtube");
        }
        element.setIntent(intent);
        addItem(element);
        return this;
    }

    public AboutPage addInstagram(String str) {
        return addInstagram(str, this.mContext.getString(R.string.about_instagram));
    }

    public AboutPage addInstagram(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_instagram));
        element.setIconTint(Integer.valueOf(R.color.about_instagram_color));
        element.setValue(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://instagram.com/_u/" + str));
        if (AboutPageUtils.isAppInstalled(this.mContext, "com.instagram.android").booleanValue()) {
            intent.setPackage("com.instagram.android");
        }
        element.setIntent(intent);
        addItem(element);
        return this;
    }

    public AboutPage addGitHub(String str) {
        return addGitHub(str, this.mContext.getString(R.string.about_github));
    }

    public AboutPage addGitHub(String str, String str2) {
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_github));
        element.setIconTint(Integer.valueOf(R.color.about_github_color));
        element.setValue(str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(String.format("https://github.com/%s", new Object[]{str})));
        element.setIntent(intent);
        addItem(element);
        return this;
    }

    public AboutPage addWebsite(String str) {
        return addWebsite(str, this.mContext.getString(R.string.about_website));
    }

    public AboutPage addWebsite(String str, String str2) {
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = "http://" + str;
        }
        Element element = new Element();
        element.setTitle(str2);
        element.setIconDrawable(Integer.valueOf(R.drawable.about_icon_link));
        element.setValue(str);
        element.setIntent(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        addItem(element);
        return this;
    }

    public AboutPage addItem(Element element) {
        LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.about_providers);
        linearLayout.addView(createItem(element));
        linearLayout.addView(getSeparator(), new ViewGroup.LayoutParams(-1, this.mContext.getResources().getDimensionPixelSize(R.dimen.about_separator_height)));
        return this;
    }

    public AboutPage setImage(int i) {
        this.mImage = i;
        return this;
    }

    public AboutPage addGroup(String str) {
        TextView textView = new TextView(this.mContext);
        textView.setText(str);
        TextViewCompat.setTextAppearance(textView, AboutPageUtils.resolveResIdAttr(this.mContext, R.attr.aboutGroupTextAppearance, R.style.about_groupTextAppearance));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Typeface typeface = this.mCustomFont;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.about_group_text_padding);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.mIsRTL) {
            textView.setGravity(8388629);
            layoutParams.gravity = 8388629;
        } else {
            textView.setGravity(8388627);
            layoutParams.gravity = 8388627;
        }
        textView.setLayoutParams(layoutParams);
        ((LinearLayout) this.mView.findViewById(R.id.about_providers)).addView(textView);
        return this;
    }

    public AboutPage isRTL(boolean z) {
        this.mIsRTL = z;
        return this;
    }

    public AboutPage setDescription(CharSequence charSequence) {
        this.mDescription = charSequence;
        return this;
    }

    public View create() {
        TextView textView = (TextView) this.mView.findViewById(R.id.description);
        ImageView imageView = (ImageView) this.mView.findViewById(R.id.image);
        int i = this.mImage;
        if (i > 0) {
            imageView.setImageResource(i);
        }
        if (!TextUtils.isEmpty(this.mDescription)) {
            textView.setText(this.mDescription);
        }
        Typeface typeface = this.mCustomFont;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        return this.mView;
    }

    private View createItem(final Element element) {
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setOrientation(0);
        linearLayout.setClickable(true);
        if (element.getOnClickListener() != null) {
            linearLayout.setOnClickListener(element.getOnClickListener());
        } else if (element.getIntent() != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    try {
                        AboutPage.this.mContext.startActivity(element.getIntent());
                    } catch (ActivityNotFoundException e) {
                        String access$100 = AboutPage.LOG_TAG;
                        Log.e(access$100, "failed to launch intent for '" + element.getTitle() + "' element", e);
                    }
                }
            });
        }
        linearLayout.setBackgroundResource(AboutPageUtils.resolveResIdAttr(this.mContext, R.attr.selectableItemBackground, 17170445));
        int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.about_text_padding);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(this.mContext);
        TextViewCompat.setTextAppearance(textView, AboutPageUtils.resolveResIdAttr(this.mContext, R.attr.aboutElementTextAppearance, R.style.about_elementTextAppearance));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        textView.setLayoutParams(layoutParams);
        Typeface typeface = this.mCustomFont;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        ImageView imageView = null;
        if (element.getIconDrawable() != null) {
            imageView = new ImageView(this.mContext);
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.about_icon_size);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
            int dimensionPixelSize3 = this.mContext.getResources().getDimensionPixelSize(R.dimen.about_icon_padding);
            imageView.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
            if (Build.VERSION.SDK_INT < 21) {
                imageView.setImageDrawable(VectorDrawableCompat.create(imageView.getResources(), element.getIconDrawable().intValue(), imageView.getContext().getTheme()));
            } else {
                imageView.setImageResource(element.getIconDrawable().intValue());
            }
            Drawable mutate = DrawableCompat.wrap(imageView.getDrawable()).mutate();
            boolean isNightModeEnabled = AboutPageUtils.isNightModeEnabled(this.mContext);
            int resolveColorAttr = AboutPageUtils.resolveColorAttr(this.mContext, R.attr.aboutElementIconTint);
            if (!element.getSkipTint().booleanValue()) {
                if (element.getAutoApplyIconTint().booleanValue()) {
                    if (isNightModeEnabled) {
                        if (element.getIconNightTint() != null) {
                            DrawableCompat.setTint(mutate, ContextCompat.getColor(this.mContext, element.getIconNightTint().intValue()));
                        } else {
                            DrawableCompat.setTint(mutate, resolveColorAttr);
                        }
                    } else if (element.getIconTint() != null) {
                        DrawableCompat.setTint(mutate, ContextCompat.getColor(this.mContext, element.getIconTint().intValue()));
                    } else {
                        DrawableCompat.setTint(mutate, resolveColorAttr);
                    }
                } else if (element.getIconTint() != null) {
                    DrawableCompat.setTint(mutate, ContextCompat.getColor(this.mContext, element.getIconTint().intValue()));
                } else if (isNightModeEnabled) {
                    DrawableCompat.setTint(mutate, resolveColorAttr);
                }
            }
        } else {
            int dimensionPixelSize4 = this.mContext.getResources().getDimensionPixelSize(R.dimen.about_icon_padding);
            textView.setPadding(dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
        }
        textView.setText(element.getTitle());
        if (this.mIsRTL) {
            int intValue = (element.getGravity() != null ? element.getGravity().intValue() : GravityCompat.END) | 16;
            linearLayout.setGravity(intValue);
            layoutParams.gravity = intValue;
            linearLayout.addView(textView);
            if (element.getIconDrawable() != null) {
                linearLayout.addView(imageView);
            }
        } else {
            int intValue2 = (element.getGravity() != null ? element.getGravity().intValue() : GravityCompat.START) | 16;
            linearLayout.setGravity(intValue2);
            layoutParams.gravity = intValue2;
            if (element.getIconDrawable() != null) {
                linearLayout.addView(imageView);
            }
            linearLayout.addView(textView);
        }
        return linearLayout;
    }

    private View getSeparator() {
        return this.mInflater.inflate(R.layout.about_page_separator, (ViewGroup) null);
    }
}
