# Release name
PRODUCT_RELEASE_NAME := d5170_blu_gmo

# Inherit some common CM stuff.
$(call inherit-product, vendor/cm/config/common_full_phone.mk)

# Inherit device configuration
$(call inherit-product, device/ratech/d5170_blu_gmo/device_d5170_blu_gmo.mk)

## Device identifier. This must come after all inclusions
PRODUCT_DEVICE := d5170_blu_gmo
PRODUCT_NAME := cm_d5170_blu_gmo
PRODUCT_BRAND := blu
PRODUCT_MODEL := d5170_blu_gmo
PRODUCT_MANUFACTURER := ratech
