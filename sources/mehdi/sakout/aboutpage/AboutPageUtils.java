package mehdi.sakout.aboutpage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import java.util.Iterator;

class AboutPageUtils {
    AboutPageUtils() {
    }

    static Boolean isAppInstalled(Context context, String str) {
        boolean z = false;
        Iterator<PackageInfo> it = context.getPackageManager().getInstalledPackages(0).iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().packageName.equals(str)) {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    static int resolveColorAttr(Context context, int i) {
        TypedValue resolveAttr = resolveAttr(context, i);
        if (resolveAttr.type < 28 || resolveAttr.type > 31) {
            return ContextCompat.getColor(context, resolveAttr.resourceId);
        }
        return resolveAttr.data;
    }

    static int resolveResIdAttr(Context context, int i, int i2) {
        try {
            return resolveAttr(context, i).resourceId;
        } catch (Resources.NotFoundException unused) {
            return i2;
        }
    }

    private static TypedValue resolveAttr(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.type == 2 ? resolveAttr(context, typedValue.data) : typedValue;
        }
        throw new Resources.NotFoundException("'" + context.getResources().getResourceName(i) + "' is not set.");
    }

    static boolean isNightModeEnabled(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
