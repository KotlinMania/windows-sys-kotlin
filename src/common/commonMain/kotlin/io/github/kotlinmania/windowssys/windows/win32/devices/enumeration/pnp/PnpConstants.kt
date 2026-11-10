package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ADDRESS_FAMILY_VALUE_NAME: Pcwstr = w("AddressFamily")

public val FAULT_ACTION_SPECIFIC_BASE: UInt = 600u

public val FAULT_ACTION_SPECIFIC_MAX: UInt = 899u

public val FAULT_DEVICE_INTERNAL_ERROR: UInt = 501u

public val FAULT_INVALID_ACTION: UInt = 401u

public val FAULT_INVALID_ARG: UInt = 402u

public val FAULT_INVALID_SEQUENCE_NUMBER: UInt = 403u

public val FAULT_INVALID_VARIABLE: UInt = 404u

public val REMOTE_ADDRESS_VALUE_NAME: Pcwstr = w("RemoteAddress")

public val SW_DEVICE_CAPABILITIES_DRIVER_REQUIRED: SwDeviceCapabilities = 8

public val SW_DEVICE_CAPABILITIES_NO_DISPLAY_IN_UI: SwDeviceCapabilities = 4

public val SW_DEVICE_CAPABILITIES_NONE: SwDeviceCapabilities = 0

public val SW_DEVICE_CAPABILITIES_REMOVABLE: SwDeviceCapabilities = 1

public val SW_DEVICE_CAPABILITIES_SILENT_INSTALL: SwDeviceCapabilities = 2

public val SW_DEVICE_LIFETIME_HANDLE: SwDeviceLifetime = 0

public val SW_DEVICE_LIFETIME_MAX: SwDeviceLifetime = 2

public val SW_DEVICE_LIFETIME_PARENT_PRESENT: SwDeviceLifetime = 1

public val UPNP_ADDRESSFAMILY_BOTH: UInt = 3u

public val UPNP_ADDRESSFAMILY_I_PV4: UInt = 1u

public val UPNP_ADDRESSFAMILY_I_PV6: UInt = 2u

public val UPNP_E_ACTION_REQUEST_FAILED: Hresult = 0x80040210u.toInt()

public val UPNP_E_ACTION_SPECIFIC_BASE: Hresult = 0x80040300u.toInt()

public val UPNP_E_DEVICE_ELEMENT_EXPECTED: Hresult = 0x80040201u.toInt()

public val UPNP_E_DEVICE_ERROR: Hresult = 0x80040214u.toInt()

public val UPNP_E_DEVICE_NODE_INCOMPLETE: Hresult = 0x80040204u.toInt()

public val UPNP_E_DEVICE_NOTREGISTERED: Hresult = 0x8004A032u.toInt()

public val UPNP_E_DEVICE_RUNNING: Hresult = 0x8004A031u.toInt()

public val UPNP_E_DEVICE_TIMEOUT: Hresult = 0x80040217u.toInt()

public val UPNP_E_DUPLICATE_NOT_ALLOWED: Hresult = 0x8004A021u.toInt()

public val UPNP_E_DUPLICATE_SERVICE_ID: Hresult = 0x8004A022u.toInt()

public val UPNP_E_ERROR_PROCESSING_RESPONSE: Hresult = 0x80040216u.toInt()

public val UPNP_E_EVENT_SUBSCRIPTION_FAILED: Hresult = 0x80040501u.toInt()

public val UPNP_E_ICON_ELEMENT_EXPECTED: Hresult = 0x80040205u.toInt()

public val UPNP_E_ICON_NODE_INCOMPLETE: Hresult = 0x80040206u.toInt()

public val UPNP_E_INVALID_ACTION: Hresult = 0x80040207u.toInt()

public val UPNP_E_INVALID_ARGUMENTS: Hresult = 0x80040208u.toInt()

public val UPNP_E_INVALID_DESCRIPTION: Hresult = 0x8004A023u.toInt()

public val UPNP_E_INVALID_DOCUMENT: Hresult = 0x80040500u.toInt()

public val UPNP_E_INVALID_ICON: Hresult = 0x8004A025u.toInt()

public val UPNP_E_INVALID_ROOT_NAMESPACE: Hresult = 0x8004A027u.toInt()

public val UPNP_E_INVALID_SERVICE: Hresult = 0x8004A024u.toInt()

public val UPNP_E_INVALID_VARIABLE: Hresult = 0x80040213u.toInt()

public val UPNP_E_INVALID_XML: Hresult = 0x8004A026u.toInt()

public val UPNP_E_OUT_OF_SYNC: Hresult = 0x80040209u.toInt()

public val UPNP_E_PROTOCOL_ERROR: Hresult = 0x80040215u.toInt()

public val UPNP_E_REQUIRED_ELEMENT_ERROR: Hresult = 0x8004A020u.toInt()

public val UPNP_E_ROOT_ELEMENT_EXPECTED: Hresult = 0x80040200u.toInt()

public val UPNP_E_SERVICE_ELEMENT_EXPECTED: Hresult = 0x80040202u.toInt()

public val UPNP_E_SERVICE_NODE_INCOMPLETE: Hresult = 0x80040203u.toInt()

public val UPNP_E_SUFFIX_TOO_LONG: Hresult = 0x8004A028u.toInt()

public val UPNP_E_TRANSPORT_ERROR: Hresult = 0x80040211u.toInt()

public val UPNP_E_URLBASE_PRESENT: Hresult = 0x8004A029u.toInt()

public val UPNP_E_VALUE_TOO_LONG: Hresult = 0x8004A030u.toInt()

public val UPNP_E_VARIABLE_VALUE_UNKNOWN: Hresult = 0x80040212u.toInt()

public val UPNP_SERVICE_DELAY_SCPD_AND_SUBSCRIPTION: UInt = 1u

public val U_PN_P_DESCRIPTION_DOCUMENT: Guid = Guid.fromU128(U128(0x1d8a9b473a284ce2uL, 0x8a4bbd34e45bceebuL))

public val U_PN_P_DESCRIPTION_DOCUMENT_EX: Guid = Guid.fromU128(U128(0x33fd0563d81a4393uL, 0x83cc0195b1da2f91uL))

public val U_PN_P_DEVICE: Guid = Guid.fromU128(U128(0xa32552c5ba61457auL, 0xb59aa2561e125e33uL))

public val U_PN_P_DEVICE_FINDER: Guid = Guid.fromU128(U128(0xe2085f28feb7404auL, 0xb8e7e659bdeaaa02uL))

public val U_PN_P_DEVICE_FINDER_EX: Guid = Guid.fromU128(U128(0x181b54fc380b4a75uL, 0xb3f14ac45e9605b0uL))

public val U_PN_P_DEVICES: Guid = Guid.fromU128(U128(0xb9e84ffdad3c40a4uL, 0xb8350882ebcbaaa8uL))

public val U_PN_P_REGISTRAR: Guid = Guid.fromU128(U128(0x204810b973b211d4uL, 0xbf4200b0d0118b56uL))

public val U_PN_P_REMOTE_ENDPOINT_INFO: Guid = Guid.fromU128(U128(0x2e5e84e940494244uL, 0xb7282d24227157c7uL))

public val U_PN_P_SERVICE: Guid = Guid.fromU128(U128(0xc624ba95fbcb4409uL, 0x8c038cceec533ef1uL))

public val U_PN_P_SERVICES: Guid = Guid.fromU128(U128(0xc0bc4b4aa4064efcuL, 0x932fb8546b8100ccuL))
