# Release name
PRODUCT_RELEASE_NAME := BLU_STUDIO_G2

# Inherit some common CM stuff.
$(call inherit-product, vendor/cm/config/common_full_phone.mk)

# Inherit device configuration
$(call inherit-product, device/BLU/BLU_STUDIO_G2/device_BLU_STUDIO_G2.mk)

TARGET_SCREEN_HEIGHT := 480
TARGET_SCREEN_WIDTH := 854

## Device identifier. This must come after all inclusions
PRODUCT_DEVICE := BLU_STUDIO_G2
PRODUCT_NAME := cm_BLU_STUDIO_G2
PRODUCT_BRAND := BLU
PRODUCT_MODEL := BLU_STUDIO_G2
PRODUCT_MANUFACTURER := BLU
