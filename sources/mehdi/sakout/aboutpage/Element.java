package mehdi.sakout.aboutpage;

import android.content.Intent;
import android.view.View;

public class Element {
    private Boolean autoIconColor = false;
    private Integer colorDay;
    private Integer colorNight;
    private Integer gravity;
    private Integer iconDrawable;
    private Intent intent;
    private View.OnClickListener onClickListener;
    private Boolean skipTint = false;
    private String title;
    private String value;

    public Element() {
    }

    public Element(String str, Integer num) {
        this.title = str;
        this.iconDrawable = num;
    }

    public View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public Element setOnClickListener(View.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
        return this;
    }

    public Integer getGravity() {
        return this.gravity;
    }

    public Element setGravity(Integer num) {
        this.gravity = num;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Element setTitle(String str) {
        this.title = str;
        return this;
    }

    public Integer getIconDrawable() {
        return this.iconDrawable;
    }

    public Element setIconDrawable(Integer num) {
        this.iconDrawable = num;
        return this;
    }

    public Integer getIconTint() {
        return this.colorDay;
    }

    public Element setIconTint(Integer num) {
        this.colorDay = num;
        return this;
    }

    public Integer getIconNightTint() {
        return this.colorNight;
    }

    public Element setIconNightTint(Integer num) {
        this.colorNight = num;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public Element setValue(String str) {
        this.value = str;
        return this;
    }

    public Intent getIntent() {
        return this.intent;
    }

    public Element setIntent(Intent intent2) {
        this.intent = intent2;
        return this;
    }

    public Boolean getAutoApplyIconTint() {
        return this.autoIconColor;
    }

    public Element setAutoApplyIconTint(Boolean bool) {
        this.autoIconColor = bool;
        return this;
    }

    public void setSkipTint(Boolean bool) {
        this.skipTint = bool;
    }

    public Boolean getSkipTint() {
        return this.skipTint;
    }
}
