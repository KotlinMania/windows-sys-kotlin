// port-lint: source Windows/Win32/Devices/Enumeration/Pnp/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

// Upstream type aliases from Windows/Win32/Devices/Enumeration/Pnp/mod.rs.
// Pointer types use Long per this port's convention.

public typealias HSWDEVICE = Long
public typealias SW_DEVICE_CAPABILITIES = Int
public typealias SW_DEVICE_LIFETIME = Int

// Function-pointer type alias. Upstream uses
// `Option<unsafe extern "system" fn(...)>` — Kotlin has no `unsafe`
// or `extern "system"` equivalent, so this is a nullable functional
// type with Long standing in for raw pointers.
public typealias SW_DEVICE_CREATE_CALLBACK = (
    (
        hswdevice: HSWDEVICE,
        createresult: HRESULT,
        pcontext: Long,
        pszdeviceinstanceid: PCWSTR,
    ) -> Unit
)?

// Upstream struct SW_DEVICE_CREATE_INFO (lines 37-47). The
// pSecurityDescriptor field references Security::SECURITY_DESCRIPTOR
// which is not yet ported; it uses Long as a placeholder.
public class SW_DEVICE_CREATE_INFO(
    public var cbSize: UInt = 0u,
    public var pszInstanceId: PCWSTR = 0L,
    public var pszzHardwareIds: PCWSTR = 0L,
    public var pszzCompatibleIds: PCWSTR = 0L,
    public var pContainerId: Long = 0L,
    public var capabilityFlags: UInt = 0u,
    public var pszDeviceDescription: PCWSTR = 0L,
    public var pszDeviceLocation: PCWSTR = 0L,
    public var pSecurityDescriptor: Long = 0L,
)

// SW_DEVICE_CAPABILITIES constants
public const val SWDeviceCapabilitiesDriverRequired: SW_DEVICE_CAPABILITIES = 8
public const val SWDeviceCapabilitiesNoDisplayInUI: SW_DEVICE_CAPABILITIES = 4
public const val SWDeviceCapabilitiesNone: SW_DEVICE_CAPABILITIES = 0
public const val SWDeviceCapabilitiesRemovable: SW_DEVICE_CAPABILITIES = 1
public const val SWDeviceCapabilitiesSilentInstall: SW_DEVICE_CAPABILITIES = 2

// SW_DEVICE_LIFETIME constants
public const val SWDeviceLifetimeHandle: SW_DEVICE_LIFETIME = 0
public const val SWDeviceLifetimeMax: SW_DEVICE_LIFETIME = 2
public const val SWDeviceLifetimeParentPresent: SW_DEVICE_LIFETIME = 1

// FAULT constants
public const val FAULT_ACTION_SPECIFIC_BASE: UInt = 600u
public const val FAULT_ACTION_SPECIFIC_MAX: UInt = 899u
public const val FAULT_DEVICE_INTERNAL_ERROR: UInt = 501u
public const val FAULT_INVALID_ACTION: UInt = 401u
public const val FAULT_INVALID_ARG: UInt = 402u
public const val FAULT_INVALID_SEQUENCE_NUMBER: UInt = 403u
public const val FAULT_INVALID_VARIABLE: UInt = 404u

// UPNP_ADDRESSFAMILY constants
public const val UPNP_ADDRESSFAMILY_BOTH: UInt = 3u
public const val UPNP_ADDRESSFAMILY_IPv4: UInt = 1u
public const val UPNP_ADDRESSFAMILY_IPv6: UInt = 2u
public const val UPNP_SERVICE_DELAY_SCPD_AND_SUBSCRIPTION: UInt = 1u

// UPNP HRESULT error constants
public const val UPNP_E_ACTION_REQUEST_FAILED: HRESULT = -2147220976
public const val UPNP_E_ACTION_SPECIFIC_BASE: HRESULT = -2147220736
public const val UPNP_E_DEVICE_ELEMENT_EXPECTED: HRESULT = -2147220991
public const val UPNP_E_DEVICE_ERROR: HRESULT = -2147220972
public const val UPNP_E_DEVICE_NODE_INCOMPLETE: HRESULT = -2147220988
public const val UPNP_E_DEVICE_NOTREGISTERED: HRESULT = -2147180494
public const val UPNP_E_DEVICE_RUNNING: HRESULT = -2147180495
public const val UPNP_E_DEVICE_TIMEOUT: HRESULT = -2147220969
public const val UPNP_E_DUPLICATE_NOT_ALLOWED: HRESULT = -2147180511
public const val UPNP_E_DUPLICATE_SERVICE_ID: HRESULT = -2147180510
public const val UPNP_E_ERROR_PROCESSING_RESPONSE: HRESULT = -2147220970
public const val UPNP_E_EVENT_SUBSCRIPTION_FAILED: HRESULT = -2147220223
public const val UPNP_E_ICON_ELEMENT_EXPECTED: HRESULT = -2147220987
public const val UPNP_E_ICON_NODE_INCOMPLETE: HRESULT = -2147220986
public const val UPNP_E_INVALID_ACTION: HRESULT = -2147220985
public const val UPNP_E_INVALID_ARGUMENTS: HRESULT = -2147220984
public const val UPNP_E_INVALID_DESCRIPTION: HRESULT = -2147180509
public const val UPNP_E_INVALID_DOCUMENT: HRESULT = -2147220224
public const val UPNP_E_INVALID_ICON: HRESULT = -2147180507
public const val UPNP_E_INVALID_ROOT_NAMESPACE: HRESULT = -2147180505
public const val UPNP_E_INVALID_SERVICE: HRESULT = -2147180508
public const val UPNP_E_INVALID_VARIABLE: HRESULT = -2147220973
public const val UPNP_E_INVALID_XML: HRESULT = -2147180506
public const val UPNP_E_OUT_OF_SYNC: HRESULT = -2147220983
public const val UPNP_E_PROTOCOL_ERROR: HRESULT = -2147220971
public const val UPNP_E_REQUIRED_ELEMENT_ERROR: HRESULT = -2147180512
public const val UPNP_E_ROOT_ELEMENT_EXPECTED: HRESULT = -2147220992
public const val UPNP_E_SERVICE_ELEMENT_EXPECTED: HRESULT = -2147220990
public const val UPNP_E_SERVICE_NODE_INCOMPLETE: HRESULT = -2147220989
public const val UPNP_E_SUFFIX_TOO_LONG: HRESULT = -2147180504
public const val UPNP_E_TRANSPORT_ERROR: HRESULT = -2147220975
public const val UPNP_E_URLBASE_PRESENT: HRESULT = -2147180503
public const val UPNP_E_VALUE_TOO_LONG: HRESULT = -2147180496
public const val UPNP_E_VARIABLE_VALUE_UNKNOWN: HRESULT = -2147220974

// GUID constants
public val UPnPDescriptionDocument: GUID = GUID.fromU128(0x1D8A9B473A284CE2uL, 0x8A4BBD34E45BCEEBuL)
public val UPnPDescriptionDocumentEx: GUID = GUID.fromU128(0x33FD0563D81A4393uL, 0x83CC0195B1DA2F91uL)
public val UPnPDevice: GUID = GUID.fromU128(0xA32552C5BA61457AuL, 0xB59AA2561E125E33uL)
public val UPnPDeviceFinder: GUID = GUID.fromU128(0xE2085F28FEB7404AuL, 0xB8E7E659BDEAAA02uL)
public val UPnPDeviceFinderEx: GUID = GUID.fromU128(0x204810B973B211D4uL, 0xBF4200B0D0118B56uL)
public val UPnPDevices: GUID = GUID.fromU128(0xB9E84FFDAD3C40A4uL, 0xB8350882EBCBAAA8uL)
public val UPnPRegistrar: GUID = GUID.fromU128(0x204810B973B211D4uL, 0xBF4200B0D0118B56uL)
public val UPnPRemoteEndpointInfo: GUID = GUID.fromU128(0x2E5E84E940494244uL, 0xB7282D24227157C7uL)
public val UPnPService: GUID = GUID.fromU128(0xC624BA95FBCB4409uL, 0x8C038CCEEC533EF1uL)
public val UPnPServices: GUID = GUID.fromU128(0xC0BC4B4AA4064EFCuL, 0x932FB8546B8100CCuL)
