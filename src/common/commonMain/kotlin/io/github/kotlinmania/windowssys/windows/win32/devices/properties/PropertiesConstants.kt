package io.github.kotlinmania.windowssys.windows.win32.devices.properties

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public val DEVPROPID_FIRST_USABLE: UInt = 2u

public val DEVPROP_FALSE: DevpropBoolean = 0u.toUByte()

public val DEVPROP_MASK_TYPE: UInt = 4095u

public val DEVPROP_MASK_TYPEMOD: UInt = 61440u

public val DEVPROP_STORE_SYSTEM: Devpropstore = 0

public val DEVPROP_STORE_USER: Devpropstore = 1

public val DEVPROP_TRUE: DevpropBoolean = 255u.toUByte()

public val DEVPROP_TYPEMOD_ARRAY: Devproptype = 4096u

public val DEVPROP_TYPEMOD_LIST: Devproptype = 8192u

public val DEVPROP_TYPE_BINARY: Devproptype = 4099u

public val DEVPROP_TYPE_BOOLEAN: Devproptype = 17u

public val DEVPROP_TYPE_BYTE: Devproptype = 3u

public val DEVPROP_TYPE_CURRENCY: Devproptype = 14u

public val DEVPROP_TYPE_DATE: Devproptype = 15u

public val DEVPROP_TYPE_DECIMAL: Devproptype = 12u

public val DEVPROP_TYPE_DEVPROPKEY: Devproptype = 21u

public val DEVPROP_TYPE_DEVPROPTYPE: Devproptype = 22u

public val DEVPROP_TYPE_DOUBLE: Devproptype = 11u

public val DEVPROP_TYPE_EMPTY: Devproptype = 0u

public val DEVPROP_TYPE_ERROR: Devproptype = 23u

public val DEVPROP_TYPE_FILETIME: Devproptype = 16u

public val DEVPROP_TYPE_FLOAT: Devproptype = 10u

public val DEVPROP_TYPE_GUID: Devproptype = 13u

public val DEVPROP_TYPE_INT16: Devproptype = 4u

public val DEVPROP_TYPE_INT32: Devproptype = 6u

public val DEVPROP_TYPE_INT64: Devproptype = 8u

public val DEVPROP_TYPE_NTSTATUS: Devproptype = 24u

public val DEVPROP_TYPE_NULL: Devproptype = 1u

public val DEVPROP_TYPE_SBYTE: Devproptype = 2u

public val DEVPROP_TYPE_SECURITY_DESCRIPTOR: Devproptype = 19u

public val DEVPROP_TYPE_SECURITY_DESCRIPTOR_STRING: Devproptype = 20u

public val DEVPROP_TYPE_STRING: Devproptype = 18u

public val DEVPROP_TYPE_STRING_INDIRECT: Devproptype = 25u

public val DEVPROP_TYPE_STRING_LIST: Devproptype = 8210u

public val DEVPROP_TYPE_UINT16: Devproptype = 5u

public val DEVPROP_TYPE_UINT32: Devproptype = 7u

public val DEVPROP_TYPE_UINT64: Devproptype = 9u

public val MAX_DEVPROP_TYPE: UInt = 25u

public val MAX_DEVPROP_TYPEMOD: UInt = 8192u

public val DEVPKEY_DEV_QUERY_OBJECT_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x13673f42a3d649f6uL, 0xb4daae46e0c5237cuL)), pid = 2u)

public val DEVPKEY_DEVICE_CLASS_CHARACTERISTICS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 29u)

public val DEVPKEY_DEVICE_CLASS_CLASS_CO_INSTALLERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x713d1703a2e249f5uL, 0x921456472ef3da5cuL)), pid = 2u)

public val DEVPKEY_DEVICE_CLASS_CLASS_INSTALLER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 5u)

public val DEVPKEY_DEVICE_CLASS_CLASS_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 3u)

public val DEVPKEY_DEVICE_CLASS_DHP_REBALANCE_OPT_OUT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xd14d3ef366cf4ba2uL, 0x9d380ddb37ab4701uL)), pid = 2u)

public val DEVPKEY_DEVICE_CLASS_DEFAULT_SERVICE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 11u)

public val DEVPKEY_DEVICE_CLASS_DEV_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 27u)

public val DEVPKEY_DEVICE_CLASS_EXCLUSIVE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 28u)

public val DEVPKEY_DEVICE_CLASS_ICON: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 4u)

public val DEVPKEY_DEVICE_CLASS_ICON_PATH: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 12u)

public val DEVPKEY_DEVICE_CLASS_LOWER_FILTERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 20u)

public val DEVPKEY_DEVICE_CLASS_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 2u)

public val DEVPKEY_DEVICE_CLASS_NO_DISPLAY_CLASS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 8u)

public val DEVPKEY_DEVICE_CLASS_NO_INSTALL_CLASS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 7u)

public val DEVPKEY_DEVICE_CLASS_NO_USE_CLASS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 10u)

public val DEVPKEY_DEVICE_CLASS_PROP_PAGE_PROVIDER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 6u)

public val DEVPKEY_DEVICE_CLASS_SECURITY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 25u)

public val DEVPKEY_DEVICE_CLASS_SECURITY_SDS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 26u)

public val DEVPKEY_DEVICE_CLASS_SILENT_INSTALL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x259abffc50a747ceuL, 0xaf0868c9a7d73366uL)), pid = 9u)

public val DEVPKEY_DEVICE_CLASS_UPPER_FILTERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4321918bf69e470duL, 0xa5de4d88c75ad24buL)), pid = 19u)

public val DEVPKEY_DEVICE_CONTAINER_ADDRESS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 51u)

public val DEVPKEY_DEVICE_CONTAINER_ALWAYS_SHOW_DEVICE_AS_CONNECTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 101u)

public val DEVPKEY_DEVICE_CONTAINER_ASSOCIATION_ARRAY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 80u)

public val DEVPKEY_DEVICE_CONTAINER_BASELINE_EXPERIENCE_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 78u)

public val DEVPKEY_DEVICE_CONTAINER_CATEGORY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 90u)

public val DEVPKEY_DEVICE_CONTAINER_CATEGORY_GROUP_DESC: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 94u)

public val DEVPKEY_DEVICE_CONTAINER_CATEGORY_GROUP_ICON: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 95u)

public val DEVPKEY_DEVICE_CONTAINER_CATEGORY_DESC_PLURAL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 92u)

public val DEVPKEY_DEVICE_CONTAINER_CATEGORY_DESC_SINGULAR: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 91u)

public val DEVPKEY_DEVICE_CONTAINER_CATEGORY_ICON: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 93u)

public val DEVPKEY_DEVICE_CONTAINER_CONFIG_FLAGS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 105u)

public val DEVPKEY_DEVICE_CONTAINER_CUSTOM_PRIVILEGED_PACKAGE_FAMILY_NAMES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 107u)

public val DEVPKEY_DEVICE_CONTAINER_DEVICE_DESCRIPTION1: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 81u)

public val DEVPKEY_DEVICE_CONTAINER_DEVICE_DESCRIPTION2: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 82u)

public val DEVPKEY_DEVICE_CONTAINER_DEVICE_FUNCTION_SUB_RANK: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 100u)

public val DEVPKEY_DEVICE_CONTAINER_DISCOVERY_METHOD: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 52u)

public val DEVPKEY_DEVICE_CONTAINER_EXPERIENCE_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 89u)

public val DEVPKEY_DEVICE_CONTAINER_FRIENDLY_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 12288u)

public val DEVPKEY_DEVICE_CONTAINER_HAS_PROBLEM: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 83u)

public val DEVPKEY_DEVICE_CONTAINER_ICON: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 57u)

public val DEVPKEY_DEVICE_CONTAINER_INSTALL_IN_PROGRESS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 9u)

public val DEVPKEY_DEVICE_CONTAINER_IS_AUTHENTICATED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 54u)

public val DEVPKEY_DEVICE_CONTAINER_IS_CONNECTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 55u)

public val DEVPKEY_DEVICE_CONTAINER_IS_DEFAULT_DEVICE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 86u)

public val DEVPKEY_DEVICE_CONTAINER_IS_DEVICE_UNIQUELY_IDENTIFIABLE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 79u)

public val DEVPKEY_DEVICE_CONTAINER_IS_ENCRYPTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 53u)

public val DEVPKEY_DEVICE_CONTAINER_IS_LOCAL_MACHINE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 70u)

public val DEVPKEY_DEVICE_CONTAINER_IS_METADATA_SEARCH_IN_PROGRESS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 72u)

public val DEVPKEY_DEVICE_CONTAINER_IS_NETWORK_DEVICE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 85u)

public val DEVPKEY_DEVICE_CONTAINER_IS_NOT_INTERESTING_FOR_DISPLAY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 74u)

public val DEVPKEY_DEVICE_CONTAINER_IS_PAIRED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 56u)

public val DEVPKEY_DEVICE_CONTAINER_IS_REBOOT_REQUIRED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 108u)

public val DEVPKEY_DEVICE_CONTAINER_IS_SHARED_DEVICE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 84u)

public val DEVPKEY_DEVICE_CONTAINER_IS_SHOW_IN_DISCONNECTED_STATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 68u)

public val DEVPKEY_DEVICE_CONTAINER_LAST_CONNECTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 67u)

public val DEVPKEY_DEVICE_CONTAINER_LAST_SEEN: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 66u)

public val DEVPKEY_DEVICE_CONTAINER_LAUNCH_DEVICE_STAGE_FROM_EXPLORER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 77u)

public val DEVPKEY_DEVICE_CONTAINER_LAUNCH_DEVICE_STAGE_ON_DEVICE_CONNECT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 76u)

public val DEVPKEY_DEVICE_CONTAINER_MANUFACTURER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 8192u)

public val DEVPKEY_DEVICE_CONTAINER_METADATA_CABINET: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 87u)

public val DEVPKEY_DEVICE_CONTAINER_METADATA_CHECKSUM: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 73u)

public val DEVPKEY_DEVICE_CONTAINER_METADATA_PATH: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 71u)

public val DEVPKEY_DEVICE_CONTAINER_MODEL_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 8194u)

public val DEVPKEY_DEVICE_CONTAINER_MODEL_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x656a3bb3ecc043fduL, 0x84774ae0404a96cduL)), pid = 8195u)

public val DEVPKEY_DEVICE_CONTAINER_PRIMARY_CATEGORY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 97u)

public val DEVPKEY_DEVICE_CONTAINER_PRIVILEGED_PACKAGE_FAMILY_NAMES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 106u)

public val DEVPKEY_DEVICE_CONTAINER_REQUIRES_PAIRING_ELEVATION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 88u)

public val DEVPKEY_DEVICE_CONTAINER_REQUIRES_UNINSTALL_ELEVATION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 99u)

public val DEVPKEY_DEVICE_CONTAINER_UNPAIR_UNINSTALL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 98u)

public val DEVPKEY_DEVICE_CONTAINER_VERSION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 65u)

public val DEVPKEY_DEVICE_INTERFACE_CLASS_DEFAULT_INTERFACE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x14c83a990b3f44b7uL, 0xbe4ca178d3990564uL)), pid = 2u)

public val DEVPKEY_DEVICE_INTERFACE_CLASS_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x14c83a990b3f44b7uL, 0xbe4ca178d3990564uL)), pid = 3u)

public val DEVPKEY_DEVICE_INTERFACE_AUTOPLAY_SILENT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x434dd28f9e75450auL, 0x9ab9ff61e618bad0uL)), pid = 2u)

public val DEVPKEY_DEVICE_INTERFACE_CLASS_GUID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 4u)

public val DEVPKEY_DEVICE_INTERFACE_ENABLED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 3u)

public val DEVPKEY_DEVICE_INTERFACE_FRIENDLY_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 2u)

public val DEVPKEY_DEVICE_INTERFACE_REFERENCE_STRING: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 5u)

public val DEVPKEY_DEVICE_INTERFACE_RESTRICTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 6u)

public val DEVPKEY_DEVICE_INTERFACE_SCHEMATIC_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 9u)

public val DEVPKEY_DEVICE_INTERFACE_UNRESTRICTED_APP_CAPABILITIES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x26e516eb814414buL, 0x83cd856d6fef4822uL)), pid = 8u)

public val DEVPKEY_DEVICE_ADDITIONAL_SOFTWARE_REQUESTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 19u)

public val DEVPKEY_DEVICE_ADDRESS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 30u)

public val DEVPKEY_DEVICE_ASSIGNED_TO_GUEST: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 24u)

public val DEVPKEY_DEVICE_BASE_CONTAINER_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 38u)

public val DEVPKEY_DEVICE_BIOS_DEVICE_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 10u)

public val DEVPKEY_DEVICE_BUS_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 23u)

public val DEVPKEY_DEVICE_BUS_RELATIONS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 7u)

public val DEVPKEY_DEVICE_BUS_REPORTED_DEVICE_DESC: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 4u)

public val DEVPKEY_DEVICE_BUS_TYPE_GUID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 21u)

public val DEVPKEY_DEVICE_CAPABILITIES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 17u)

public val DEVPKEY_DEVICE_CHARACTERISTICS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 29u)

public val DEVPKEY_DEVICE_CHILDREN: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 9u)

public val DEVPKEY_DEVICE_CLASS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 9u)

public val DEVPKEY_DEVICE_CLASS_GUID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 10u)

public val DEVPKEY_DEVICE_COMPANION_APPS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x6a742654d0b24420uL, 0xa523e068352ac1dfuL)), pid = 2u)

public val DEVPKEY_DEVICE_COMPATIBLE_IDS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 4u)

public val DEVPKEY_DEVICE_CONFIG_FLAGS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 12u)

public val DEVPKEY_DEVICE_CONFIGURATION_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 7u)

public val DEVPKEY_DEVICE_CONTAINER_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x8c7ed2063f8a4827uL, 0xb3abae9e1faefc6cuL)), pid = 2u)

public val DEVPKEY_DEVICE_CREATOR_PROCESS_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 25u)

public val DEVPKEY_DEVICE_DHP_REBALANCE_POLICY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 2u)

public val DEVPKEY_DEVICE_DEBUGGER_SAFE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 12u)

public val DEVPKEY_DEVICE_DEPENDENCY_DEPENDENTS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 21u)

public val DEVPKEY_DEVICE_DEPENDENCY_PROVIDERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 20u)

public val DEVPKEY_DEVICE_DEV_NODE_STATUS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 2u)

public val DEVPKEY_DEVICE_DEV_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 27u)

public val DEVPKEY_DEVICE_DEVICE_DESC: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 2u)

public val DEVPKEY_DEVICE_DRIVER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 11u)

public val DEVPKEY_DEVICE_DRIVER_CO_INSTALLERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 11u)

public val DEVPKEY_DEVICE_DRIVER_DATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 2u)

public val DEVPKEY_DEVICE_DRIVER_DESC: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 4u)

public val DEVPKEY_DEVICE_DRIVER_INF_PATH: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 5u)

public val DEVPKEY_DEVICE_DRIVER_INF_SECTION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 6u)

public val DEVPKEY_DEVICE_DRIVER_INF_SECTION_EXT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 7u)

public val DEVPKEY_DEVICE_DRIVER_LOGO_LEVEL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 15u)

public val DEVPKEY_DEVICE_DRIVER_PROBLEM_DESC: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 11u)

public val DEVPKEY_DEVICE_DRIVER_PROP_PAGE_PROVIDER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 10u)

public val DEVPKEY_DEVICE_DRIVER_PROVIDER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 9u)

public val DEVPKEY_DEVICE_DRIVER_RANK: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 14u)

public val DEVPKEY_DEVICE_DRIVER_VERSION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 3u)

public val DEVPKEY_DEVICE_EJECTION_RELATIONS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 4u)

public val DEVPKEY_DEVICE_ENUMERATOR_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 24u)

public val DEVPKEY_DEVICE_EXCLUSIVE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 28u)

public val DEVPKEY_DEVICE_EXTENDED_ADDRESS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 23u)

public val DEVPKEY_DEVICE_EXTENDED_CONFIGURATION_IDS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 15u)

public val DEVPKEY_DEVICE_FIRMWARE_DATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 17u)

public val DEVPKEY_DEVICE_FIRMWARE_REVISION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 19u)

public val DEVPKEY_DEVICE_FIRMWARE_VENDOR: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 26u)

public val DEVPKEY_DEVICE_FIRMWARE_VERSION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 18u)

public val DEVPKEY_DEVICE_FIRST_INSTALL_DATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 101u)

public val DEVPKEY_DEVICE_FRIENDLY_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 14u)

public val DEVPKEY_DEVICE_FRIENDLY_NAME_ATTRIBUTES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 3u)

public val DEVPKEY_DEVICE_GENERIC_DRIVER_INSTALLED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 18u)

public val DEVPKEY_DEVICE_HARDWARE_IDS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 3u)

public val DEVPKEY_DEVICE_HAS_PROBLEM: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 6u)

public val DEVPKEY_DEVICE_IN_LOCAL_MACHINE_CONTAINER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x8c7ed2063f8a4827uL, 0xb3abae9e1faefc6cuL)), pid = 4u)

public val DEVPKEY_DEVICE_INSTALL_DATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 100u)

public val DEVPKEY_DEVICE_INSTALL_STATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 36u)

public val DEVPKEY_DEVICE_INSTANCE_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 256u)

public val DEVPKEY_DEVICE_IS_ASSOCIATEABLE_BY_USER_ACTION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 7u)

public val DEVPKEY_DEVICE_IS_PRESENT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 5u)

public val DEVPKEY_DEVICE_IS_REBOOT_REQUIRED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 16u)

public val DEVPKEY_DEVICE_LAST_ARRIVAL_DATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 102u)

public val DEVPKEY_DEVICE_LAST_REMOVAL_DATE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 103u)

public val DEVPKEY_DEVICE_LEGACY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x804971008c7348b9uL, 0xaad9ce387e19c56euL)), pid = 3u)

public val DEVPKEY_DEVICE_LEGACY_BUS_TYPE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 22u)

public val DEVPKEY_DEVICE_LOCATION_INFO: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 15u)

public val DEVPKEY_DEVICE_LOCATION_PATHS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 37u)

public val DEVPKEY_DEVICE_LOWER_FILTERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 20u)

public val DEVPKEY_DEVICE_MANUFACTURER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 13u)

public val DEVPKEY_DEVICE_MANUFACTURER_ATTRIBUTES: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 4u)

public val DEVPKEY_DEVICE_MATCHING_DEVICE_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 8u)

public val DEVPKEY_DEVICE_MODEL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x78c34fc8104a4acauL, 0x9ea4524d52996e57uL)), pid = 39u)

public val DEVPKEY_DEVICE_MODEL_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 2u)

public val DEVPKEY_DEVICE_NO_CONNECT_SOUND: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 17u)

public val DEVPKEY_DEVICE_NUMA_NODE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 3u)

public val DEVPKEY_DEVICE_NUMA_PROXIMITY_DOMAIN: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 1u)

public val DEVPKEY_DEVICE_PDO_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 16u)

public val DEVPKEY_DEVICE_PARENT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 8u)

public val DEVPKEY_DEVICE_PHYSICAL_DEVICE_LOCATION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 9u)

public val DEVPKEY_DEVICE_POST_INSTALL_IN_PROGRESS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 13u)

public val DEVPKEY_DEVICE_POWER_DATA: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 32u)

public val DEVPKEY_DEVICE_POWER_RELATIONS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 6u)

public val DEVPKEY_DEVICE_PRESENCE_NOT_FOR_DEVICE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 5u)

public val DEVPKEY_DEVICE_PRIMARY_COMPANION_APP: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x6a742654d0b24420uL, 0xa523e068352ac1dfuL)), pid = 3u)

public val DEVPKEY_DEVICE_PROBLEM_CODE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 3u)

public val DEVPKEY_DEVICE_PROBLEM_STATUS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 12u)

public val DEVPKEY_DEVICE_REMOVAL_POLICY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 33u)

public val DEVPKEY_DEVICE_REMOVAL_POLICY_DEFAULT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 34u)

public val DEVPKEY_DEVICE_REMOVAL_POLICY_OVERRIDE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 35u)

public val DEVPKEY_DEVICE_REMOVAL_RELATIONS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 5u)

public val DEVPKEY_DEVICE_REPORTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x804971008c7348b9uL, 0xaad9ce387e19c56euL)), pid = 2u)

public val DEVPKEY_DEVICE_REPORTED_DEVICE_IDS_HASH: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 8u)

public val DEVPKEY_DEVICE_RESOURCE_PICKER_EXCEPTIONS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 13u)

public val DEVPKEY_DEVICE_RESOURCE_PICKER_TAGS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa8b865dd2e3d4094uL, 0xad97e593a70c75d6uL)), pid = 12u)

public val DEVPKEY_DEVICE_SAFE_REMOVAL_REQUIRED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xafd9764086a34210uL, 0xb67c289c41aabe55uL)), pid = 2u)

public val DEVPKEY_DEVICE_SAFE_REMOVAL_REQUIRED_OVERRIDE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xafd9764086a34210uL, 0xb67c289c41aabe55uL)), pid = 3u)

public val DEVPKEY_DEVICE_SECURITY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 25u)

public val DEVPKEY_DEVICE_SECURITY_SDS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 26u)

public val DEVPKEY_DEVICE_SERVICE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 6u)

public val DEVPKEY_DEVICE_SESSION_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x83da632697a64088uL, 0x9453a1923f573b29uL)), pid = 6u)

public val DEVPKEY_DEVICE_SHOW_IN_UNINSTALL_UI: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 8u)

public val DEVPKEY_DEVICE_SIBLINGS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 10u)

public val DEVPKEY_DEVICE_SIGNAL_STRENGTH: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x80d81ea674734b0cuL, 0x8216efc11a2c4c8buL)), pid = 6u)

public val DEVPKEY_DEVICE_SOFT_RESTART_SUPPORTED: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 22u)

public val DEVPKEY_DEVICE_STACK: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x540b947e8b4045bcuL, 0xa8a26a0b894cbda2uL)), pid = 14u)

public val DEVPKEY_DEVICE_TRANSPORT_RELATIONS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0x4340a6c593fa4706uL, 0x972c7b648008a5a7uL)), pid = 11u)

public val DEVPKEY_DEVICE_UI_NUMBER: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 18u)

public val DEVPKEY_DEVICE_UI_NUMBER_DESC_FORMAT: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 31u)

public val DEVPKEY_DEVICE_UPPER_FILTERS: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xa45c254edf1c4efduL, 0x802067d146a850e0uL)), pid = 19u)

public val DEVPKEY_DRV_PKG_BRANDING_ICON: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 7u)

public val DEVPKEY_DRV_PKG_DETAILED_DESCRIPTION: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 4u)

public val DEVPKEY_DRV_PKG_DOCUMENTATION_LINK: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 5u)

public val DEVPKEY_DRV_PKG_ICON: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 6u)

public val DEVPKEY_DRV_PKG_MODEL: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 2u)

public val DEVPKEY_DRV_PKG_VENDOR_WEB_SITE: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xcf73bb513abf44a2uL, 0x85e09a3dc7a12132uL)), pid = 3u)

public val DEVPKEY_NAME: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xb725f13047ef101auL, 0xa5f102608c9eebacuL)), pid = 10u)
