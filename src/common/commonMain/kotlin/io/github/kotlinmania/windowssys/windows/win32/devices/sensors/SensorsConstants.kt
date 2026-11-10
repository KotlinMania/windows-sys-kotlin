package io.github.kotlinmania.windowssys.windows.win32.devices.sensors

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey

public val AXIS_MAX: Axis = 3

public val AXIS_X: Axis = 0

public val AXIS_Y: Axis = 1

public val AXIS_Z: Axis = 2

public val ACTIVITY_STATE_COUNT: ActivityStateCount = 8

public val ACTIVITY_STATE_BIKING: ActivityState = 64

public val ACTIVITY_STATE_FIDGETING: ActivityState = 4

public val ACTIVITY_STATE_FORCE_DWORD: ActivityState = -1

public val ACTIVITY_STATE_IDLE: ActivityState = 128

public val ACTIVITY_STATE_IN_VEHICLE: ActivityState = 32

public val ACTIVITY_STATE_MAX: ActivityState = 256

public val ACTIVITY_STATE_RUNNING: ActivityState = 16

public val ACTIVITY_STATE_STATIONARY: ActivityState = 2

public val ACTIVITY_STATE_UNKNOWN: ActivityState = 1

public val ACTIVITY_STATE_WALKING: ActivityState = 8

public val ELEVATION_CHANGE_MODE_ELEVATOR: ElevationChangeMode = 1

public val ELEVATION_CHANGE_MODE_FORCE_DWORD: ElevationChangeMode = -1

public val ELEVATION_CHANGE_MODE_MAX: ElevationChangeMode = 3

public val ELEVATION_CHANGE_MODE_STEPPING: ElevationChangeMode = 2

public val ELEVATION_CHANGE_MODE_UNKNOWN: ElevationChangeMode = 0

public val GNSS_CLEAR_ALL_ASSISTANCE_DATA: UInt = 1u

public val GUID_DEVINTERFACE_SENSOR: Guid = Guid.fromU128(U128(0xba1bb6929b7a4833uL, 0x9a1e525ed134e7e2uL))

public val GUID_SENSOR_CATEGORY_ALL: Guid = Guid.fromU128(U128(0xc317c286c4684288uL, 0x9975d4c4587c442cuL))

public val GUID_SENSOR_CATEGORY_BIOMETRIC: Guid = Guid.fromU128(U128(0xca19690fa2c7477duL, 0xa99e99ec6e2b5648uL))

public val GUID_SENSOR_CATEGORY_ELECTRICAL: Guid = Guid.fromU128(U128(0xfb73fcd8fc4a483cuL, 0xac5827b691c6beffuL))

public val GUID_SENSOR_CATEGORY_ENVIRONMENTAL: Guid = Guid.fromU128(U128(0x323439aa7f66492buL, 0xba0c73e9aa0a65d5uL))

public val GUID_SENSOR_CATEGORY_LIGHT: Guid = Guid.fromU128(U128(0x17a665c090634216uL, 0xb2025c7a255e18ceuL))

public val GUID_SENSOR_CATEGORY_LOCATION: Guid = Guid.fromU128(U128(0xbfa794e4f9644fdbuL, 0x90f651056bfe4b44uL))

public val GUID_SENSOR_CATEGORY_MECHANICAL: Guid = Guid.fromU128(U128(0x8d131d688ef74656uL, 0x80b5cccbd93791c5uL))

public val GUID_SENSOR_CATEGORY_MOTION: Guid = Guid.fromU128(U128(0xcd09daf13b2e4c3duL, 0xb598b5e5ff93fd46uL))

public val GUID_SENSOR_CATEGORY_ORIENTATION: Guid = Guid.fromU128(U128(0x9e6c04b696fe4954uL, 0xb72668682a473f69uL))

public val GUID_SENSOR_CATEGORY_OTHER: Guid = Guid.fromU128(U128(0x2c90e7a9f4c94fa2uL, 0xaf3756d471fe5a3duL))

public val GUID_SENSOR_CATEGORY_PERSONAL_ACTIVITY: Guid = Guid.fromU128(U128(0xf16090811e12412buL, 0xa14dcbb0e95bd2e5uL))

public val GUID_SENSOR_CATEGORY_SCANNER: Guid = Guid.fromU128(U128(0xb000e77ef5b5420fuL, 0x815d0270a726f270uL))

public val GUID_SENSOR_CATEGORY_UNSUPPORTED: Guid = Guid.fromU128(U128(0x2beae7fa19b048c5uL, 0xa1f6b5480dc206b0uL))

public val GUID_SENSOR_TYPE_ACCELEROMETER3D: Guid = Guid.fromU128(U128(0xc2fb0f5fe2d24c78uL, 0xbcd0352a9582819duL))

public val GUID_SENSOR_TYPE_ACTIVITY_DETECTION: Guid = Guid.fromU128(U128(0x9d9e011818074f2euL, 0x96e42ce57142e196uL))

public val GUID_SENSOR_TYPE_AMBIENT_LIGHT: Guid = Guid.fromU128(U128(0x97f115c8599a4153uL, 0x8894d2d12899918auL))

public val GUID_SENSOR_TYPE_BAROMETER: Guid = Guid.fromU128(U128(0xe903829ff8a4a93uL, 0x97df3dcbde402288uL))

public val GUID_SENSOR_TYPE_CUSTOM: Guid = Guid.fromU128(U128(0xe83af22986404d18uL, 0xa213e22675ebb2c3uL))

public val GUID_SENSOR_TYPE_FLOOR_ELEVATION: Guid = Guid.fromU128(U128(0xade4987f7ac44dfauL, 0x97220a027181c747uL))

public val GUID_SENSOR_TYPE_GEOMAGNETIC_ORIENTATION: Guid = Guid.fromU128(U128(0xe77195f82d1f4823uL, 0x971b1c4467556c9duL))

public val GUID_SENSOR_TYPE_GRAVITY_VECTOR: Guid = Guid.fromU128(U128(0x3b52c73bb76463fuL, 0x952438de76eb700buL))

public val GUID_SENSOR_TYPE_GYROMETER3D: Guid = Guid.fromU128(U128(0x9485f5a759e42c2uL, 0xbd4ba349b75c8643uL))

public val GUID_SENSOR_TYPE_HINGE_ANGLE: Guid = Guid.fromU128(U128(0x82358065f4c44da1uL, 0xb27213c23332a207uL))

public val GUID_SENSOR_TYPE_HUMIDITY: Guid = Guid.fromU128(U128(0x5c72bf67bd7e4257uL, 0x990b98a3ba3b400auL))

public val GUID_SENSOR_TYPE_LINEAR_ACCELEROMETER: Guid = Guid.fromU128(U128(0x38b028397b441c8uL, 0xbc245ff1aa48fec7uL))

public val GUID_SENSOR_TYPE_MAGNETOMETER3D: Guid = Guid.fromU128(U128(0x55e5effb15c740dfuL, 0x8698a84b7c863c53uL))

public val GUID_SENSOR_TYPE_ORIENTATION: Guid = Guid.fromU128(U128(0xcdb5d8f73cfd41c8uL, 0x8542cce622cf5d6euL))

public val GUID_SENSOR_TYPE_PEDOMETER: Guid = Guid.fromU128(U128(0xb19f89afe3eb444buL, 0x8dea202575a71599uL))

public val GUID_SENSOR_TYPE_PROXIMITY: Guid = Guid.fromU128(U128(0x5220dae931794430uL, 0x9f9006266d2a34deuL))

public val GUID_SENSOR_TYPE_RELATIVE_ORIENTATION: Guid = Guid.fromU128(U128(0x40993b51470644dcuL, 0x98d5c920c037ffabuL))

public val GUID_SENSOR_TYPE_SIMPLE_DEVICE_ORIENTATION: Guid = Guid.fromU128(U128(0x86a192910482402cuL, 0xbf4caddac52b1c39uL))

public val GUID_SENSOR_TYPE_TEMPERATURE: Guid = Guid.fromU128(U128(0x4fd0ec4d5da45fauL, 0x95a95db38ee19306uL))

public val HUMAN_PRESENCE_DETECTION_TYPE_COUNT: HumanPresenceDetectionTypeCount = 4

public val HUMAN_PRESENCE_DETECTION_TYPE_AUDIO_BIOMETRIC: HumanPresenceDetectionType = 8

public val HUMAN_PRESENCE_DETECTION_TYPE_FACIAL_BIOMETRIC: HumanPresenceDetectionType = 4

public val HUMAN_PRESENCE_DETECTION_TYPE_FORCE_DWORD: HumanPresenceDetectionType = -1

public val HUMAN_PRESENCE_DETECTION_TYPE_UNDEFINED: HumanPresenceDetectionType = 0

public val HUMAN_PRESENCE_DETECTION_TYPE_VENDOR_DEFINED_BIOMETRIC: HumanPresenceDetectionType = 2

public val HUMAN_PRESENCE_DETECTION_TYPE_VENDOR_DEFINED_NON_BIOMETRIC: HumanPresenceDetectionType = 1

public val LOCATION_DESIRED_ACCURACY_DEFAULT: LocationDesiredAccuracy = 0

public val LOCATION_DESIRED_ACCURACY_HIGH: LocationDesiredAccuracy = 1

public val LOCATION_POSITION_SOURCE_CELLULAR: LocationPositionSource = 0

public val LOCATION_POSITION_SOURCE_IPADDRESS: LocationPositionSource = 3

public val LOCATION_POSITION_SOURCE_SATELLITE: LocationPositionSource = 1

public val LOCATION_POSITION_SOURCE_UNKNOWN: LocationPositionSource = 4

public val LOCATION_POSITION_SOURCE_WIFI: LocationPositionSource = 2

public val MAGNETOMETER_ACCURACY_APPROXIMATE: MagnetometerAccuracy = 2

public val MAGNETOMETER_ACCURACY_HIGH: MagnetometerAccuracy = 3

public val MAGNETOMETER_ACCURACY_UNKNOWN: MagnetometerAccuracy = 0

public val MAGNETOMETER_ACCURACY_UNRELIABLE: MagnetometerAccuracy = 1

public val MAGNETOMETER_ACCURACY_APPROXIMATE1: MagnetometerAccuracy = 2

public val MAGNETOMETER_ACCURACY_HIGH1: MagnetometerAccuracy = 3

public val MAGNETOMETER_ACCURACY_UNKNOWN1: MagnetometerAccuracy = 0

public val MAGNETOMETER_ACCURACY_UNRELIABLE1: MagnetometerAccuracy = 1

public val PEDOMETER_STEP_TYPE_COUNT: PedometerStepTypeCount = 3

public val PEDOMETER_STEP_TYPE_FORCE_DWORD: PedometerStepType = -1

public val PEDOMETER_STEP_TYPE_MAX: PedometerStepType = 8

public val PEDOMETER_STEP_TYPE_RUNNING: PedometerStepType = 4

public val PEDOMETER_STEP_TYPE_UNKNOWN: PedometerStepType = 1

public val PEDOMETER_STEP_TYPE_WALKING: PedometerStepType = 2

public val PROXIMITY_TYPE_FORCE_DWORD: ProximityType = -1

public val PROXIMITY_TYPE_HUMAN_PROXIMITY: ProximityType = 1

public val PROXIMITY_TYPE_OBJECT_PROXIMITY: ProximityType = 0

public val PROXIMITY_SENSOR_HUMAN_ENGAGEMENT_CAPABLE: ProximitySensorCapabilities = 2

public val PROXIMITY_SENSOR_HUMAN_PRESENCE_CAPABLE: ProximitySensorCapabilities = 1

public val PROXIMITY_SENSOR_SUPPORTED_CAPABILITIES: ProximitySensorCapabilities = 3

public val SENSOR_CATEGORY_ALL: Guid = Guid.fromU128(U128(0xc317c286c4684288uL, 0x9975d4c4587c442cuL))

public val SENSOR_CATEGORY_BIOMETRIC: Guid = Guid.fromU128(U128(0xca19690fa2c7477duL, 0xa99e99ec6e2b5648uL))

public val SENSOR_CATEGORY_ELECTRICAL: Guid = Guid.fromU128(U128(0xfb73fcd8fc4a483cuL, 0xac5827b691c6beffuL))

public val SENSOR_CATEGORY_ENVIRONMENTAL: Guid = Guid.fromU128(U128(0x323439aa7f66492buL, 0xba0c73e9aa0a65d5uL))

public val SENSOR_CATEGORY_LIGHT: Guid = Guid.fromU128(U128(0x17a665c090634216uL, 0xb2025c7a255e18ceuL))

public val SENSOR_CATEGORY_LOCATION: Guid = Guid.fromU128(U128(0xbfa794e4f9644fdbuL, 0x90f651056bfe4b44uL))

public val SENSOR_CATEGORY_MECHANICAL: Guid = Guid.fromU128(U128(0x8d131d688ef74656uL, 0x80b5cccbd93791c5uL))

public val SENSOR_CATEGORY_MOTION: Guid = Guid.fromU128(U128(0xcd09daf13b2e4c3duL, 0xb598b5e5ff93fd46uL))

public val SENSOR_CATEGORY_ORIENTATION: Guid = Guid.fromU128(U128(0x9e6c04b696fe4954uL, 0xb72668682a473f69uL))

public val SENSOR_CATEGORY_OTHER: Guid = Guid.fromU128(U128(0x2c90e7a9f4c94fa2uL, 0xaf3756d471fe5a3duL))

public val SENSOR_CATEGORY_SCANNER: Guid = Guid.fromU128(U128(0xb000e77ef5b5420fuL, 0x815d0270a726f270uL))

public val SENSOR_CATEGORY_UNSUPPORTED: Guid = Guid.fromU128(U128(0x2beae7fa19b048c5uL, 0xa1f6b5480dc206b0uL))

public val SENSOR_CONNECTION_TYPE_PC_ATTACHED: SensorConnectionType = 1

public val SENSOR_CONNECTION_TYPE_PC_EXTERNAL: SensorConnectionType = 2

public val SENSOR_CONNECTION_TYPE_PC_INTEGRATED: SensorConnectionType = 0

public val SENSOR_DATA_TYPE_ABSOLUTE_PRESSURE_PASCAL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 5u)

public val SENSOR_DATA_TYPE_ACCELERATION_X_G: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 2u)

public val SENSOR_DATA_TYPE_ACCELERATION_Y_G: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 3u)

public val SENSOR_DATA_TYPE_ACCELERATION_Z_G: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 4u)

public val SENSOR_DATA_TYPE_ADDRESS1: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 23u)

public val SENSOR_DATA_TYPE_ADDRESS2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 24u)

public val SENSOR_DATA_TYPE_ALTITUDE_ANTENNA_SEALEVEL_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 36u)

public val SENSOR_DATA_TYPE_ALTITUDE_ELLIPSOID_ERROR_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 29u)

public val SENSOR_DATA_TYPE_ALTITUDE_ELLIPSOID_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 5u)

public val SENSOR_DATA_TYPE_ALTITUDE_SEALEVEL_ERROR_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 30u)

public val SENSOR_DATA_TYPE_ALTITUDE_SEALEVEL_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 4u)

public val SENSOR_DATA_TYPE_ANGULAR_ACCELERATION_X_DEGREES_PER_SECOND_SQUARED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 5u)

public val SENSOR_DATA_TYPE_ANGULAR_ACCELERATION_Y_DEGREES_PER_SECOND_SQUARED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 6u)

public val SENSOR_DATA_TYPE_ANGULAR_ACCELERATION_Z_DEGREES_PER_SECOND_SQUARED: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 7u)

public val SENSOR_DATA_TYPE_ANGULAR_VELOCITY_X_DEGREES_PER_SECOND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 10u)

public val SENSOR_DATA_TYPE_ANGULAR_VELOCITY_Y_DEGREES_PER_SECOND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 11u)

public val SENSOR_DATA_TYPE_ANGULAR_VELOCITY_Z_DEGREES_PER_SECOND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 12u)

public val SENSOR_DATA_TYPE_ATMOSPHERIC_PRESSURE_BAR: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x8b0aa2f12d5742eeuL, 0x8cc04d27622b46c4uL)), pid = 4u)

public val SENSOR_DATA_TYPE_BIOMETRIC_GUID: Guid = Guid.fromU128(U128(0x2299288a6d9e4b0buL, 0xb7ec3528f89e40afuL))

public val SENSOR_DATA_TYPE_BOOLEAN_SWITCH_ARRAY_STATES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 10u)

public val SENSOR_DATA_TYPE_BOOLEAN_SWITCH_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 2u)

public val SENSOR_DATA_TYPE_CAPACITANCE_FARAD: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 4u)

public val SENSOR_DATA_TYPE_CITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 25u)

public val SENSOR_DATA_TYPE_COMMON_GUID: Guid = Guid.fromU128(U128(0xdb5e0cf2cf1f4c18uL, 0xb46cd86011d62150uL))

public val SENSOR_DATA_TYPE_COUNTRY_REGION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 28u)

public val SENSOR_DATA_TYPE_CURRENT_AMPS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 3u)

public val SENSOR_DATA_TYPE_CUSTOM_BOOLEAN_ARRAY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 6u)

public val SENSOR_DATA_TYPE_CUSTOM_GUID: Guid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL))

public val SENSOR_DATA_TYPE_CUSTOM_USAGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 5u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE1: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 7u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE10: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 16u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE11: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 17u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE12: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 18u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE13: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 19u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE14: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 20u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE15: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 21u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE16: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 22u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE17: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 23u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE18: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 24u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE19: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 25u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE2: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 8u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE20: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 26u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE21: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 27u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE22: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 28u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE23: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 29u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE24: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 30u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE25: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 31u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE26: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 32u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE27: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 33u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE28: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 34u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE3: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 9u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE4: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 10u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE5: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 11u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE6: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 12u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE7: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 13u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE8: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 14u)

public val SENSOR_DATA_TYPE_CUSTOM_VALUE9: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xb14c764f07cf41e8uL, 0x9d82ebe3d0776a6fuL)), pid = 15u)

public val SENSOR_DATA_TYPE_DGPS_DATA_AGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 35u)

public val SENSOR_DATA_TYPE_DIFFERENTIAL_REFERENCE_STATION_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 37u)

public val SENSOR_DATA_TYPE_DISTANCE_X_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 8u)

public val SENSOR_DATA_TYPE_DISTANCE_Y_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 9u)

public val SENSOR_DATA_TYPE_DISTANCE_Z_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 10u)

public val SENSOR_DATA_TYPE_ELECTRICAL_FREQUENCY_HERTZ: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 9u)

public val SENSOR_DATA_TYPE_ELECTRICAL_GUID: Guid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL))

public val SENSOR_DATA_TYPE_ELECTRICAL_PERCENT_OF_RANGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 8u)

public val SENSOR_DATA_TYPE_ELECTRICAL_POWER_WATTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 7u)

public val SENSOR_DATA_TYPE_ENVIRONMENTAL_GUID: Guid = Guid.fromU128(U128(0x8b0aa2f12d5742eeuL, 0x8cc04d27622b46c4uL))

public val SENSOR_DATA_TYPE_ERROR_RADIUS_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 22u)

public val SENSOR_DATA_TYPE_FIX_QUALITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 10u)

public val SENSOR_DATA_TYPE_FIX_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 11u)

public val SENSOR_DATA_TYPE_FORCE_NEWTONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 4u)

public val SENSOR_DATA_TYPE_GAUGE_PRESSURE_PASCAL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 6u)

public val SENSOR_DATA_TYPE_GEOIDAL_SEPARATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 34u)

public val SENSOR_DATA_TYPE_GPS_OPERATION_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 32u)

public val SENSOR_DATA_TYPE_GPS_SELECTION_MODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 31u)

public val SENSOR_DATA_TYPE_GPS_STATUS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 33u)

public val SENSOR_DATA_TYPE_GUID_MECHANICAL_GUID: Guid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL))

public val SENSOR_DATA_TYPE_HORIZONAL_DILUTION_OF_PRECISION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 13u)

public val SENSOR_DATA_TYPE_HUMAN_PRESENCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2299288a6d9e4b0buL, 0xb7ec3528f89e40afuL)), pid = 2u)

public val SENSOR_DATA_TYPE_HUMAN_PROXIMITY_METERS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2299288a6d9e4b0buL, 0xb7ec3528f89e40afuL)), pid = 3u)

public val SENSOR_DATA_TYPE_INDUCTANCE_HENRY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 6u)

public val SENSOR_DATA_TYPE_LATITUDE_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 2u)

public val SENSOR_DATA_TYPE_LIGHT_CHROMACITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe4c77ce2dcb746e9uL, 0x84394fec548833a6uL)), pid = 4u)

public val SENSOR_DATA_TYPE_LIGHT_GUID: Guid = Guid.fromU128(U128(0xe4c77ce2dcb746e9uL, 0x84394fec548833a6uL))

public val SENSOR_DATA_TYPE_LIGHT_LEVEL_LUX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe4c77ce2dcb746e9uL, 0x84394fec548833a6uL)), pid = 2u)

public val SENSOR_DATA_TYPE_LIGHT_TEMPERATURE_KELVIN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe4c77ce2dcb746e9uL, 0x84394fec548833a6uL)), pid = 3u)

public val SENSOR_DATA_TYPE_LOCATION_GUID: Guid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL))

public val SENSOR_DATA_TYPE_LOCATION_SOURCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 40u)

public val SENSOR_DATA_TYPE_LONGITUDE_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 3u)

public val SENSOR_DATA_TYPE_MAGNETIC_FIELD_STRENGTH_X_MILLIGAUSS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 19u)

public val SENSOR_DATA_TYPE_MAGNETIC_FIELD_STRENGTH_Y_MILLIGAUSS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 20u)

public val SENSOR_DATA_TYPE_MAGNETIC_FIELD_STRENGTH_Z_MILLIGAUSS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 21u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_COMPENSATED_MAGNETIC_NORTH_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 11u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_COMPENSATED_TRUE_NORTH_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 12u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 8u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_MAGNETIC_NORTH_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 13u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_TRUE_NORTH_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 14u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_X_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 5u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_Y_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 6u)

public val SENSOR_DATA_TYPE_MAGNETIC_HEADING_Z_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 7u)

public val SENSOR_DATA_TYPE_MAGNETIC_VARIATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 9u)

public val SENSOR_DATA_TYPE_MAGNETOMETER_ACCURACY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 22u)

public val SENSOR_DATA_TYPE_MOTION_GUID: Guid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL))

public val SENSOR_DATA_TYPE_MOTION_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 9u)

public val SENSOR_DATA_TYPE_MULTIVALUE_SWITCH_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 3u)

public val SENSOR_DATA_TYPE_NMEA_SENTENCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 38u)

public val SENSOR_DATA_TYPE_ORIENTATION_GUID: Guid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL))

public val SENSOR_DATA_TYPE_POSITION_DILUTION_OF_PRECISION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 12u)

public val SENSOR_DATA_TYPE_POSTALCODE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 27u)

public val SENSOR_DATA_TYPE_QUADRANT_ANGLE_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 15u)

public val SENSOR_DATA_TYPE_QUATERNION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 17u)

public val SENSOR_DATA_TYPE_RELATIVE_HUMIDITY_PERCENT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x8b0aa2f12d5742eeuL, 0x8cc04d27622b46c4uL)), pid = 3u)

public val SENSOR_DATA_TYPE_RESISTANCE_OHMS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 5u)

public val SENSOR_DATA_TYPE_RFID_TAG_40_BIT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xd7a59a3c342144abuL, 0x8d3a9de8ab6c4caeuL)), pid = 2u)

public val SENSOR_DATA_TYPE_ROTATION_MATRIX: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 16u)

public val SENSOR_DATA_TYPE_SATELLITES_IN_VIEW: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 17u)

public val SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_AZIMUTH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 20u)

public val SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_ELEVATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 19u)

public val SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 39u)

public val SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_PRNS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 18u)

public val SENSOR_DATA_TYPE_SATELLITES_IN_VIEW_STN_RATIO: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 21u)

public val SENSOR_DATA_TYPE_SATELLITES_USED_COUNT: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 15u)

public val SENSOR_DATA_TYPE_SATELLITES_USED_PRNS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 16u)

public val SENSOR_DATA_TYPE_SATELLITES_USED_PRNS_AND_CONSTELLATIONS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 41u)

public val SENSOR_DATA_TYPE_SCANNER_GUID: Guid = Guid.fromU128(U128(0xd7a59a3c342144abuL, 0x8d3a9de8ab6c4caeuL))

public val SENSOR_DATA_TYPE_SIMPLE_DEVICE_ORIENTATION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 18u)

public val SENSOR_DATA_TYPE_SPEED_KNOTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 6u)

public val SENSOR_DATA_TYPE_SPEED_METERS_PER_SECOND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x3f8a69a207c54e48uL, 0xa965cd797aab56d5uL)), pid = 8u)

public val SENSOR_DATA_TYPE_STATE_PROVINCE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 26u)

public val SENSOR_DATA_TYPE_STRAIN: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 7u)

public val SENSOR_DATA_TYPE_TEMPERATURE_CELSIUS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x8b0aa2f12d5742eeuL, 0x8cc04d27622b46c4uL)), pid = 2u)

public val SENSOR_DATA_TYPE_TILT_X_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 2u)

public val SENSOR_DATA_TYPE_TILT_Y_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 3u)

public val SENSOR_DATA_TYPE_TILT_Z_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x1637d8a242484275uL, 0x865d558de84aedfduL)), pid = 4u)

public val SENSOR_DATA_TYPE_TIMESTAMP: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xdb5e0cf2cf1f4c18uL, 0xb46cd86011d62150uL)), pid = 2u)

public val SENSOR_DATA_TYPE_TOUCH_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x2299288a6d9e4b0buL, 0xb7ec3528f89e40afuL)), pid = 4u)

public val SENSOR_DATA_TYPE_TRUE_HEADING_DEGREES: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 7u)

public val SENSOR_DATA_TYPE_VERTICAL_DILUTION_OF_PRECISION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x55c74d8ca6f47d6uL, 0x95c61ed3637a0ff4uL)), pid = 14u)

public val SENSOR_DATA_TYPE_VOLTAGE_VOLTS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xbbb246d1e2424780uL, 0xa2d3cded84f35842uL)), pid = 2u)

public val SENSOR_DATA_TYPE_WEIGHT_KILOGRAMS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x38564a7cf2f249bbuL, 0x9b2bba60f66a58dfuL)), pid = 8u)

public val SENSOR_DATA_TYPE_WIND_DIRECTION_DEGREES_ANTICLOCKWISE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x8b0aa2f12d5742eeuL, 0x8cc04d27622b46c4uL)), pid = 5u)

public val SENSOR_DATA_TYPE_WIND_SPEED_METERS_PER_SECOND: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x8b0aa2f12d5742eeuL, 0x8cc04d27622b46c4uL)), pid = 6u)

public val SENSOR_ERROR_PARAMETER_COMMON_GUID: Guid = Guid.fromU128(U128(0x77112bcdfce14f43uL, 0xb8b8a88256adb4b3uL))

public val SENSOR_EVENT_ACCELEROMETER_SHAKE: Guid = Guid.fromU128(U128(0x825f5a940f484396uL, 0x9ca06ecb5c99d915uL))

public val SENSOR_EVENT_DATA_UPDATED: Guid = Guid.fromU128(U128(0x2ed0f2a4008741d3uL, 0x87db6773370b3c88uL))

public val SENSOR_EVENT_PARAMETER_COMMON_GUID: Guid = Guid.fromU128(U128(0x64346e3087284b34uL, 0xbdf64f52442c5c28uL))

public val SENSOR_EVENT_PARAMETER_EVENT_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x64346e3087284b34uL, 0xbdf64f52442c5c28uL)), pid = 2u)

public val SENSOR_EVENT_PARAMETER_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x64346e3087284b34uL, 0xbdf64f52442c5c28uL)), pid = 3u)

public val SENSOR_EVENT_PROPERTY_CHANGED: Guid = Guid.fromU128(U128(0x2358f09984c94d3duL, 0x90dfc2421e2b2045uL))

public val SENSOR_EVENT_STATE_CHANGED: Guid = Guid.fromU128(U128(0xbfd960166bd74560uL, 0xad34f2f6607e8f81uL))

public val SENSOR_PROPERTY_ACCURACY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 17u)

public val SENSOR_PROPERTY_CHANGE_SENSITIVITY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 14u)

public val SENSOR_PROPERTY_CLEAR_ASSISTANCE_DATA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe1e962f46e6545f7uL, 0x9c36d487b7b1bd34uL)), pid = 2u)

public val SENSOR_PROPERTY_COMMON_GUID: Guid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL))

public val SENSOR_PROPERTY_CONNECTION_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 11u)

public val SENSOR_PROPERTY_CURRENT_REPORT_INTERVAL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 13u)

public val SENSOR_PROPERTY_DESCRIPTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 10u)

public val SENSOR_PROPERTY_DEVICE_PATH: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 15u)

public val SENSOR_PROPERTY_FRIENDLY_NAME: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 9u)

public val SENSOR_PROPERTY_HID_USAGE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 22u)

public val SENSOR_PROPERTY_LIGHT_RESPONSE_CURVE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 16u)

public val SENSOR_PROPERTY_LIST_HEADER_SIZE: UInt = 8u

public val SENSOR_PROPERTY_LOCATION_DESIRED_ACCURACY: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 19u)

public val SENSOR_PROPERTY_MANUFACTURER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 6u)

public val SENSOR_PROPERTY_MIN_REPORT_INTERVAL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 12u)

public val SENSOR_PROPERTY_MODEL: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 7u)

public val SENSOR_PROPERTY_PERSISTENT_UNIQUE_ID: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 5u)

public val SENSOR_PROPERTY_RADIO_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 23u)

public val SENSOR_PROPERTY_RADIO_STATE_PREVIOUS: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 24u)

public val SENSOR_PROPERTY_RANGE_MAXIMUM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 21u)

public val SENSOR_PROPERTY_RANGE_MINIMUM: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 20u)

public val SENSOR_PROPERTY_RESOLUTION: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 18u)

public val SENSOR_PROPERTY_SERIAL_NUMBER: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 8u)

public val SENSOR_PROPERTY_STATE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 3u)

public val SENSOR_PROPERTY_TEST_GUID: Guid = Guid.fromU128(U128(0xe1e962f46e6545f7uL, 0x9c36d487b7b1bd34uL))

public val SENSOR_PROPERTY_TURN_ON_OFF_NMEA: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0xe1e962f46e6545f7uL, 0x9c36d487b7b1bd34uL)), pid = 3u)

public val SENSOR_PROPERTY_TYPE: Propertykey = Propertykey(fmtid = Guid.fromU128(U128(0x7f8383ecd3ec495cuL, 0xa8cfb8bbe85c2920uL)), pid = 2u)

public val SENSOR_STATE_ACCESS_DENIED: SensorState = 4

public val SENSOR_STATE_ERROR: SensorState = 5

public val SENSOR_STATE_INITIALIZING: SensorState = 3

public val SENSOR_STATE_MAX: SensorState = 5

public val SENSOR_STATE_MIN: SensorState = 0

public val SENSOR_STATE_NOT_AVAILABLE: SensorState = 1

public val SENSOR_STATE_NO_DATA: SensorState = 2

public val SENSOR_STATE_READY: SensorState = 0

public val SENSOR_TYPE_ACCELEROMETER_1D: Guid = Guid.fromU128(U128(0xc04d238773404cc2uL, 0x991e3b18cb8ef2f4uL))

public val SENSOR_TYPE_ACCELEROMETER_2D: Guid = Guid.fromU128(U128(0xb2c517a8f6b54ba6uL, 0xa4235df560b4cc07uL))

public val SENSOR_TYPE_ACCELEROMETER_3D: Guid = Guid.fromU128(U128(0xc2fb0f5fe2d24c78uL, 0xbcd0352a9582819duL))

public val SENSOR_TYPE_AGGREGATED_DEVICE_ORIENTATION: Guid = Guid.fromU128(U128(0xcdb5d8f73cfd41c8uL, 0x8542cce622cf5d6euL))

public val SENSOR_TYPE_AGGREGATED_QUADRANT_ORIENTATION: Guid = Guid.fromU128(U128(0x9f81f1afc4ab4307uL, 0x9904c828bfb90829uL))

public val SENSOR_TYPE_AGGREGATED_SIMPLE_DEVICE_ORIENTATION: Guid = Guid.fromU128(U128(0x86a192910482402cuL, 0xbf4caddac52b1c39uL))

public val SENSOR_TYPE_AMBIENT_LIGHT: Guid = Guid.fromU128(U128(0x97f115c8599a4153uL, 0x8894d2d12899918auL))

public val SENSOR_TYPE_BARCODE_SCANNER: Guid = Guid.fromU128(U128(0x990b3d8f85bb45ffuL, 0x914d998c04f372dfuL))

public val SENSOR_TYPE_BOOLEAN_SWITCH: Guid = Guid.fromU128(U128(0x9c7e371f1041460buL, 0x8d5c71e4752e350cuL))

public val SENSOR_TYPE_BOOLEAN_SWITCH_ARRAY: Guid = Guid.fromU128(U128(0x545c8ba5b1434545uL, 0x868fca7fd986b4f6uL))

public val SENSOR_TYPE_CAPACITANCE: Guid = Guid.fromU128(U128(0xca2ffb1c231749c0uL, 0xa0b4b63ce63461a0uL))

public val SENSOR_TYPE_COMPASS_1D: Guid = Guid.fromU128(U128(0xa415f6c5cb5049d0uL, 0x8e62a8270bd7a26cuL))

public val SENSOR_TYPE_COMPASS_2D: Guid = Guid.fromU128(U128(0x15655cc0997a4d30uL, 0x84db57caba3648bbuL))

public val SENSOR_TYPE_COMPASS_3D: Guid = Guid.fromU128(U128(0x76b5ce0d17dd414duL, 0x93a1e127f40bdf6euL))

public val SENSOR_TYPE_CURRENT: Guid = Guid.fromU128(U128(0x5adc9fce15a04bbeuL, 0xa1ad2d38a9ae831cuL))

public val SENSOR_TYPE_CUSTOM: Guid = Guid.fromU128(U128(0xe83af22986404d18uL, 0xa213e22675ebb2c3uL))

public val SENSOR_TYPE_DISTANCE_1D: Guid = Guid.fromU128(U128(0x5f14ab2f14074306uL, 0xa93fb1dbabe4f9c0uL))

public val SENSOR_TYPE_DISTANCE_2D: Guid = Guid.fromU128(U128(0x5cf9a46ca9a24e55uL, 0xb6a1a04aafa95a92uL))

public val SENSOR_TYPE_DISTANCE_3D: Guid = Guid.fromU128(U128(0xa20cae310e254772uL, 0x9fe596608a1354b2uL))

public val SENSOR_TYPE_ELECTRICAL_POWER: Guid = Guid.fromU128(U128(0x212f10f514ab4376uL, 0x9a43a7794098c2feuL))

public val SENSOR_TYPE_ENVIRONMENTAL_ATMOSPHERIC_PRESSURE: Guid = Guid.fromU128(U128(0xe903829ff8a4a93uL, 0x97df3dcbde402288uL))

public val SENSOR_TYPE_ENVIRONMENTAL_HUMIDITY: Guid = Guid.fromU128(U128(0x5c72bf67bd7e4257uL, 0x990b98a3ba3b400auL))

public val SENSOR_TYPE_ENVIRONMENTAL_TEMPERATURE: Guid = Guid.fromU128(U128(0x4fd0ec4d5da45fauL, 0x95a95db38ee19306uL))

public val SENSOR_TYPE_ENVIRONMENTAL_WIND_DIRECTION: Guid = Guid.fromU128(U128(0x9ef57a359306434duL, 0xaf0937fa5a9c00bduL))

public val SENSOR_TYPE_ENVIRONMENTAL_WIND_SPEED: Guid = Guid.fromU128(U128(0xdd50607ba45f42cduL, 0x8efdec61761c4226uL))

public val SENSOR_TYPE_FORCE: Guid = Guid.fromU128(U128(0xc2ab2b021a1c4778uL, 0xa81b954a1788cc75uL))

public val SENSOR_TYPE_FREQUENCY: Guid = Guid.fromU128(U128(0x8cd2cbb673e64640uL, 0xa70972ae8fb60d7fuL))

public val SENSOR_TYPE_GYROMETER_1D: Guid = Guid.fromU128(U128(0xfa088734f5524584uL, 0x8324edfaf649652cuL))

public val SENSOR_TYPE_GYROMETER_2D: Guid = Guid.fromU128(U128(0x31ef4f83919b48bfuL, 0x8de05d7a9d240556uL))

public val SENSOR_TYPE_GYROMETER_3D: Guid = Guid.fromU128(U128(0x9485f5a759e42c2uL, 0xbd4ba349b75c8643uL))

public val SENSOR_TYPE_HUMAN_PRESENCE: Guid = Guid.fromU128(U128(0xc138c12bad52451cuL, 0x937587f518ff10c6uL))

public val SENSOR_TYPE_HUMAN_PROXIMITY: Guid = Guid.fromU128(U128(0x5220dae931794430uL, 0x9f9006266d2a34deuL))

public val SENSOR_TYPE_INCLINOMETER_1D: Guid = Guid.fromU128(U128(0xb96f98c57a754ba7uL, 0x94e9ac868c966dd8uL))

public val SENSOR_TYPE_INCLINOMETER_2D: Guid = Guid.fromU128(U128(0xab140f6d83eb4264uL, 0xb70bb16a5b256a01uL))

public val SENSOR_TYPE_INCLINOMETER_3D: Guid = Guid.fromU128(U128(0xb84919fbea854976uL, 0x84446f6f5c6d31dbuL))

public val SENSOR_TYPE_INDUCTANCE: Guid = Guid.fromU128(U128(0xdc1d933fc4354c7duL, 0xa2fe607192a524d3uL))

public val SENSOR_TYPE_LOCATION_BROADCAST: Guid = Guid.fromU128(U128(0xd26988cf51624039uL, 0xbb174c58b698e44auL))

public val SENSOR_TYPE_LOCATION_DEAD_RECKONING: Guid = Guid.fromU128(U128(0x1a37d538f28b42dauL, 0x9fcea9d0a2a6d829uL))

public val SENSOR_TYPE_LOCATION_GPS: Guid = Guid.fromU128(U128(0xed4ca589327a4ff9uL, 0xa56091da4b48275euL))

public val SENSOR_TYPE_LOCATION_LOOKUP: Guid = Guid.fromU128(U128(0x3b2eae4a72ce436duL, 0x96d23c5b8570e987uL))

public val SENSOR_TYPE_LOCATION_OTHER: Guid = Guid.fromU128(U128(0x9b2d056603684f71uL, 0xb88d533f132031deuL))

public val SENSOR_TYPE_LOCATION_STATIC: Guid = Guid.fromU128(U128(0x95f81840fa94445uL, 0x8e6eb70f320b6b4cuL))

public val SENSOR_TYPE_LOCATION_TRIANGULATION: Guid = Guid.fromU128(U128(0x691c341a54064fe1uL, 0x942f2246cbeb39e0uL))

public val SENSOR_TYPE_MOTION_DETECTOR: Guid = Guid.fromU128(U128(0x5c7c1a1230a543b9uL, 0xa4b2cf09ec5b7be8uL))

public val SENSOR_TYPE_MULTIVALUE_SWITCH: Guid = Guid.fromU128(U128(0xb3ee4d7637a44402uL, 0xb25e99c60a775fa1uL))

public val SENSOR_TYPE_POTENTIOMETER: Guid = Guid.fromU128(U128(0x2b3681a9cadc45aauL, 0xa6ff54957c8bb440uL))

public val SENSOR_TYPE_PRESSURE: Guid = Guid.fromU128(U128(0x26d31f34635241cfuL, 0xb793ea0713d53d77uL))

public val SENSOR_TYPE_RESISTANCE: Guid = Guid.fromU128(U128(0x9993d2c8c1574a52uL, 0xa7b5195c76037231uL))

public val SENSOR_TYPE_RFID_SCANNER: Guid = Guid.fromU128(U128(0x44328ef502dd4e8duL, 0xad5d9249832b2ecauL))

public val SENSOR_TYPE_SCALE: Guid = Guid.fromU128(U128(0xc06dd92c7feb438euL, 0x9bf682207fff5bb8uL))

public val SENSOR_TYPE_SPEEDOMETER: Guid = Guid.fromU128(U128(0x6bd73c1f0bb44310uL, 0x81b2dfc18a52bf94uL))

public val SENSOR_TYPE_STRAIN: Guid = Guid.fromU128(U128(0xc6d1ec0e68034361uL, 0xad3d85bcc58c6d29uL))

public val SENSOR_TYPE_TOUCH: Guid = Guid.fromU128(U128(0x17db301806c44f7duL, 0x81af9274b7599c27uL))

public val SENSOR_TYPE_UNKNOWN: Guid = Guid.fromU128(U128(0x10ba83e3ef4f41eduL, 0x9885a87d6435a8e1uL))

public val SENSOR_TYPE_VOLTAGE: Guid = Guid.fromU128(U128(0xc54846374fb74953uL, 0x98b8a56d8aa1fb1euL))

public val SIMPLE_DEVICE_ORIENTATION_NOT_ROTATED: SimpleDeviceOrientation = 0

public val SIMPLE_DEVICE_ORIENTATION_ROTATED_180: SimpleDeviceOrientation = 2

public val SIMPLE_DEVICE_ORIENTATION_ROTATED_270: SimpleDeviceOrientation = 3

public val SIMPLE_DEVICE_ORIENTATION_ROTATED_90: SimpleDeviceOrientation = 1

public val SIMPLE_DEVICE_ORIENTATION_ROTATED_FACE_DOWN: SimpleDeviceOrientation = 5

public val SIMPLE_DEVICE_ORIENTATION_ROTATED_FACE_UP: SimpleDeviceOrientation = 4

public val SENSOR: Guid = Guid.fromU128(U128(0xe97ced00523a4133uL, 0xbf6fd3a2dae7f6bauL))

public val SENSOR_COLLECTION: Guid = Guid.fromU128(U128(0x79c43adba429469fuL, 0xaa392f2b74b75937uL))

public val SENSOR_CONNECTION_TYPE_ATTACHED: SensorConnectionTypes = 1

public val SENSOR_CONNECTION_TYPE_EXTERNAL: SensorConnectionTypes = 2

public val SENSOR_CONNECTION_TYPE_INTEGRATED: SensorConnectionTypes = 0

public val SENSOR_DATA_REPORT: Guid = Guid.fromU128(U128(0x4ea9d6ef694b4218uL, 0x8816ccda8da74bbauL))

public val SENSOR_MANAGER: Guid = Guid.fromU128(U128(0x77a1c827fcd24689uL, 0x89159d613cc5fa3euL))

public val SENSOR_STATE_ACTIVE: SensorState = 2

public val SENSOR_STATE_ERROR1: SensorState = 3

public val SENSOR_STATE_IDLE: SensorState = 1

public val SENSOR_STATE_INITIALIZING1: SensorState = 0

public val SIMPLE_DEVICE_ORIENTATION_FACEDOWN: SimpleDeviceOrientation = 5

public val SIMPLE_DEVICE_ORIENTATION_FACEUP: SimpleDeviceOrientation = 4

public val SIMPLE_DEVICE_ORIENTATION_NOT_ROTATED1: SimpleDeviceOrientation = 0

public val SIMPLE_DEVICE_ORIENTATION_ROTATED180DEGREES_COUNTERCLOCKWISE: SimpleDeviceOrientation = 2

public val SIMPLE_DEVICE_ORIENTATION_ROTATED270DEGREES_COUNTERCLOCKWISE: SimpleDeviceOrientation = 3

public val SIMPLE_DEVICE_ORIENTATION_ROTATED90DEGREES_COUNTERCLOCKWISE: SimpleDeviceOrientation = 1
