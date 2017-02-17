package ru.strv.flick_view.utils;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/**
 * Утилита для работы с анимациями
 */
public class AnimUtils {

    private AnimUtils() {
    }

    private static Interpolator fastOutSlowIn;

    /**
     * Создание интерполятора {@link android.support.v4.view.animation.FastOutSlowInInterpolator}
     *
     * @param context контекст
     * @return экземпляр сконфигурированного интерполятора
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static Interpolator getFastOutSlowInInterpolator(Context context) {
        if (fastOutSlowIn == null) {
            fastOutSlowIn = AnimationUtils.loadInterpolator(context,
                    android.R.interpolator.fast_out_slow_in);
        }
        return fastOutSlowIn;
    }
}