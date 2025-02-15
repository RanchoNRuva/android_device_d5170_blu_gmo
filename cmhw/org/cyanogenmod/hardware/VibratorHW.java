package org.cyanogenmod.hardware;

import org.cyanogenmod.hardware.util.FileUtils;

/*
 * Vibrator intensity adjustment
 *
 * Exports methods to get the valid value boundaries, the
 * default and current intensities, and a method to set
 * the vibrator.
 *
 * Values exported by min/max can be the direct values required
 * by the hardware, or a local (to VibratorHW) abstraction that's
 * internally converted to something else prior to actual use. The
 * Settings user interface will normalize these into a 0-100 (percentage)
 * scale before showing them to the user, but all values passed to/from
 * the client (Settings) are in this class' scale.
 */

/* This would be just "Vibrator", but it conflicts with android.os.Vibrator */
public class VibratorHW {

    // Keep this synced to immvibe impl
    private static final String INTENSITY_FILE = "/data/.libimmvibeclient_force";

    public static boolean isSupported() {
        return true;
    }

    public static boolean setIntensity(int intensity)  {
        return FileUtils.writeLine(INTENSITY_FILE, Integer.toString(intensity));
    }

    public static int getMaxIntensity()  {
        return 127;
    }

    public static int getMinIntensity()  {
        return 3;
    }

    public static int getWarningThreshold()  {
        // actually this is rather arbitrary
        return 115;
    }

    public static int getCurIntensity()  {
        final String result = FileUtils.readOneLine(INTENSITY_FILE);
        if (result == null) {
            return 96;
        }

        try {
            return Integer.parseInt(result.trim());
        } catch (final NumberFormatException ignored) {
            return 96;
        }
    }

    public static int getDefaultIntensity()  {
        return 96;
    }
}
