package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val ADDRESS_FAMILY_VALUE_NAME: PCWSTR = w("AddressFamily")

public val FAULT_ACTION_SPECIFIC_BASE: UInt = 600u

public val FAULT_ACTION_SPECIFIC_MAX: UInt = 899u

public val FAULT_DEVICE_INTERNAL_ERROR: UInt = 501u

public val FAULT_INVALID_ACTION: UInt = 401u

public val FAULT_INVALID_ARG: UInt = 402u

public val FAULT_INVALID_SEQUENCE_NUMBER: UInt = 403u

public val FAULT_INVALID_VARIABLE: UInt = 404u

public val REMOTE_ADDRESS_VALUE_NAME: PCWSTR = w("RemoteAddress")

public val SWDeviceCapabilitiesDriverRequired: SW_DEVICE_CAPABILITIES = 8

public val SWDeviceCapabilitiesNoDisplayInUI: SW_DEVICE_CAPABILITIES = 4

public val SWDeviceCapabilitiesNone: SW_DEVICE_CAPABILITIES = 0

public val SWDeviceCapabilitiesRemovable: SW_DEVICE_CAPABILITIES = 1

public val SWDeviceCapabilitiesSilentInstall: SW_DEVICE_CAPABILITIES = 2

public val SWDeviceLifetimeHandle: SW_DEVICE_LIFETIME = 0

public val SWDeviceLifetimeMax: SW_DEVICE_LIFETIME = 2

public val SWDeviceLifetimeParentPresent: SW_DEVICE_LIFETIME = 1

public val UPNP_ADDRESSFAMILY_BOTH: UInt = 3u

public val UPNP_ADDRESSFAMILY_IPv4: UInt = 1u

public val UPNP_ADDRESSFAMILY_IPv6: UInt = 2u

public val UPNP_E_ACTION_REQUEST_FAILED: HRESULT = 0x80040210u.toInt()

public val UPNP_E_ACTION_SPECIFIC_BASE: HRESULT = 0x80040300u.toInt()

public val UPNP_E_DEVICE_ELEMENT_EXPECTED: HRESULT = 0x80040201u.toInt()

public val UPNP_E_DEVICE_ERROR: HRESULT = 0x80040214u.toInt()

public val UPNP_E_DEVICE_NODE_INCOMPLETE: HRESULT = 0x80040204u.toInt()

public val UPNP_E_DEVICE_NOTREGISTERED: HRESULT = 0x8004A032u.toInt()

public val UPNP_E_DEVICE_RUNNING: HRESULT = 0x8004A031u.toInt()

public val UPNP_E_DEVICE_TIMEOUT: HRESULT = 0x80040217u.toInt()

public val UPNP_E_DUPLICATE_NOT_ALLOWED: HRESULT = 0x8004A021u.toInt()

public val UPNP_E_DUPLICATE_SERVICE_ID: HRESULT = 0x8004A022u.toInt()

public val UPNP_E_ERROR_PROCESSING_RESPONSE: HRESULT = 0x80040216u.toInt()

public val UPNP_E_EVENT_SUBSCRIPTION_FAILED: HRESULT = 0x80040501u.toInt()

public val UPNP_E_ICON_ELEMENT_EXPECTED: HRESULT = 0x80040205u.toInt()

public val UPNP_E_ICON_NODE_INCOMPLETE: HRESULT = 0x80040206u.toInt()

public val UPNP_E_INVALID_ACTION: HRESULT = 0x80040207u.toInt()

public val UPNP_E_INVALID_ARGUMENTS: HRESULT = 0x80040208u.toInt()

public val UPNP_E_INVALID_DESCRIPTION: HRESULT = 0x8004A023u.toInt()

public val UPNP_E_INVALID_DOCUMENT: HRESULT = 0x80040500u.toInt()

public val UPNP_E_INVALID_ICON: HRESULT = 0x8004A025u.toInt()

public val UPNP_E_INVALID_ROOT_NAMESPACE: HRESULT = 0x8004A027u.toInt()

public val UPNP_E_INVALID_SERVICE: HRESULT = 0x8004A024u.toInt()

public val UPNP_E_INVALID_VARIABLE: HRESULT = 0x80040213u.toInt()

public val UPNP_E_INVALID_XML: HRESULT = 0x8004A026u.toInt()

public val UPNP_E_OUT_OF_SYNC: HRESULT = 0x80040209u.toInt()

public val UPNP_E_PROTOCOL_ERROR: HRESULT = 0x80040215u.toInt()

public val UPNP_E_REQUIRED_ELEMENT_ERROR: HRESULT = 0x8004A020u.toInt()

public val UPNP_E_ROOT_ELEMENT_EXPECTED: HRESULT = 0x80040200u.toInt()

public val UPNP_E_SERVICE_ELEMENT_EXPECTED: HRESULT = 0x80040202u.toInt()

public val UPNP_E_SERVICE_NODE_INCOMPLETE: HRESULT = 0x80040203u.toInt()

public val UPNP_E_SUFFIX_TOO_LONG: HRESULT = 0x8004A028u.toInt()

public val UPNP_E_TRANSPORT_ERROR: HRESULT = 0x80040211u.toInt()

public val UPNP_E_URLBASE_PRESENT: HRESULT = 0x8004A029u.toInt()

public val UPNP_E_VALUE_TOO_LONG: HRESULT = 0x8004A030u.toInt()

public val UPNP_E_VARIABLE_VALUE_UNKNOWN: HRESULT = 0x80040212u.toInt()

public val UPNP_SERVICE_DELAY_SCPD_AND_SUBSCRIPTION: UInt = 1u

public val UPnPDescriptionDocument: GUID = GUID.from_u128(U128(0x1d8a9b473a284ce2uL, 0x8a4bbd34e45bceebuL))

public val UPnPDescriptionDocumentEx: GUID = GUID.from_u128(U128(0x33fd0563d81a4393uL, 0x83cc0195b1da2f91uL))

public val UPnPDevice: GUID = GUID.from_u128(U128(0xa32552c5ba61457auL, 0xb59aa2561e125e33uL))

public val UPnPDeviceFinder: GUID = GUID.from_u128(U128(0xe2085f28feb7404auL, 0xb8e7e659bdeaaa02uL))

public val UPnPDeviceFinderEx: GUID = GUID.from_u128(U128(0x181b54fc380b4a75uL, 0xb3f14ac45e9605b0uL))

public val UPnPDevices: GUID = GUID.from_u128(U128(0xb9e84ffdad3c40a4uL, 0xb8350882ebcbaaa8uL))

public val UPnPRegistrar: GUID = GUID.from_u128(U128(0x204810b973b211d4uL, 0xbf4200b0d0118b56uL))

public val UPnPRemoteEndpointInfo: GUID = GUID.from_u128(U128(0x2e5e84e940494244uL, 0xb7282d24227157c7uL))

public val UPnPService: GUID = GUID.from_u128(U128(0xc624ba95fbcb4409uL, 0x8c038cceec533ef1uL))

public val UPnPServices: GUID = GUID.from_u128(U128(0xc0bc4b4aa4064efcuL, 0x932fb8546b8100ccuL))
