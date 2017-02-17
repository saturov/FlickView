package ru.strv.flick_view.utils;

import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;

/**
 * Утилита для работы с цветами
 */
public class ColorUtils {

    /**
     * Установка альфа-компонента цвета {@code color} на уровень {@code alpha}
     */
    @ColorInt
    private static int modifyAlpha(@ColorInt int color, @IntRange(from = 0, to = 255) int alpha) {
        return (color & 0x00ffffff) | (alpha << 24);
    }

    /**
     * Установка альфа-компонента цвета {@code color} на уровень {@code alpha}
     */
    @ColorInt
    public static int modifyAlpha(@ColorInt int color, @FloatRange(from = 0f, to = 1f) float alpha) {
        return modifyAlpha(color, (int) (255f * alpha));
    }
}