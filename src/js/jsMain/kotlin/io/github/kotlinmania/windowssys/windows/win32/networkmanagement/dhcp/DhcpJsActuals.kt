@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val _windowsWin32NetworkmanagementDhcpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: COpaquePointer?, forceflag: Bool): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddFilterV4((serveripaddress?.value ?: 0L).toString(), (addfilterinfo?.value ?: 0L).toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSecurityGroup((pserver?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddServer(flags.toInt(), (idinfo?.value ?: 0L).toString(), (newserver?.value ?: 0L).toString(), (callbackfn?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElement((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (addelementinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElementV4((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (addelementinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElementV5((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (addelementinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: COpaquePointer?, diskcheckinterval: COpaquePointer?, maxlogfilessize: COpaquePointer?, minspaceondisk: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAuditLogGetParams((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (auditlogdir?.value ?: 0L).toString(), (diskcheckinterval?.value ?: 0L).toString(), (maxlogfilessize?.value ?: 0L).toString(), (minspaceondisk?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpAuditLogSetParams((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (auditlogdir?.value ?: 0L).toString(), diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCApiCleanup() {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpCApiInitialize(version: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCApiInitialize((version?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClass((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (classinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClassV6((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (classinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfo((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfoV4((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfoVQ((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOption((serveripaddress?.value ?: 0L).toString(), optionid.toInt(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOptionV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOptionV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateSubnet((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (subnetinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateSubnetVQ((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (subnetinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: COpaquePointer?, event: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeRegisterParamChange(flags.toInt(), (reserved?.value ?: 0L).toString(), (event?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClass((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (classname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClassV6((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (classname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClientInfo((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClientInfoV6((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteFilterV4((serveripaddress?.value ?: 0L).toString(), (deletefilterinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteServer(flags.toInt(), (idinfo?.value ?: 0L).toString(), (newserver?.value ?: 0L).toString(), (callbackfn?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteSubnet((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteSuperScopeV4((serveripaddress?.value ?: 0L).toString(), (superscopename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDsCleanup() {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDsCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpDsInit(): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpDsInit() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumClasses((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (classinfoarray?.value ?: 0L).toString(), (nread?.value ?: 0L).toString(), (ntotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumClassesV6((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (classinfoarray?.value ?: 0L).toString(), (nread?.value ?: 0L).toString(), (ntotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumFilterV4((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), listtype, (enumfilterinfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValues((serveripaddress?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (optionvalues?.value ?: 0L).toString(), (optionsread?.value ?: 0L).toString(), (optionstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValuesV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (optionvalues?.value ?: 0L).toString(), (optionsread?.value ?: 0L).toString(), (optionstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValuesV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (optionvalues?.value ?: 0L).toString(), (optionsread?.value ?: 0L).toString(), (optionstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptions((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (options?.value ?: 0L).toString(), (optionsread?.value ?: 0L).toString(), (optionstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionsV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (options?.value ?: 0L).toString(), (optionsread?.value ?: 0L).toString(), (optionstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionsV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (options?.value ?: 0L).toString(), (optionsread?.value ?: 0L).toString(), (optionstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumServers(flags: UInt, idinfo: COpaquePointer?, servers: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumServers(flags.toInt(), (idinfo?.value ?: 0L).toString(), (servers?.value ?: 0L).toString(), (callbackfn?.value ?: 0L).toString(), (callbackdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClients((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsFilterStatusInfo((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsV4((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsV5((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsVQ((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElements((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), enumelementtype, (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElementsV4((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), enumelementtype, (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElementsV5((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), enumelementtype, (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnets((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (enuminfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetsV6((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (enuminfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionValues((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (scopeinfo?.value ?: 0L).toString(), (values?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionValuesV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (scopeinfo?.value ?: 0L).toString(), (values?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptions((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (optionstruct?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionsV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (optionstruct?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: COpaquePointer?, filledclassinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClassInfo((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (partialclassinfo?.value ?: 0L).toString(), (filledclassinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfo((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoV4((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoV6((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoVQ((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientOptions((serveripaddress?.value ?: 0L).toString(), clientipaddress.toInt(), clientsubnetmask.toInt(), (clientoptions?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetFilterV4((serveripaddress?.value ?: 0L).toString(), (globalfilterinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfo((serveripaddress?.value ?: 0L).toString(), (mibinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfoV5((serveripaddress?.value ?: 0L).toString(), (mibinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfoV6((serveripaddress?.value ?: 0L).toString(), (mibinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfo((serveripaddress?.value ?: 0L).toString(), optionid.toInt(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfoV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfoV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValue((serveripaddress?.value ?: 0L).toString(), optionid.toInt(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValueV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValueV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOriginalSubnetMask((sadaptername?.value ?: 0L).toString(), (dwsubnetmask?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerBindingInfo((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (bindelementsinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerBindingInfoV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (bindelementsinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerSpecificStrings((serveripaddress?.value ?: 0L).toString(), (serverspecificstrings?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetDelayOffer((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (timedelayinmilliseconds?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetInfo((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (subnetinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetInfoVQ((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (subnetinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSuperScopeInfoV4((serveripaddress?.value ?: 0L).toString(), (superscopetable?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetThreadOptions(pflags: COpaquePointer?, reserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetThreadOptions((pflags?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: COpaquePointer?, minorversion: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetVersion((serveripaddress?.value ?: 0L).toString(), (majorversion?.value ?: 0L).toString(), (minorversion?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyCondition(policy: COpaquePointer?, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: COpaquePointer?, valuelength: UInt, conditionindex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyCondition((policy?.value ?: 0L).toString(), parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), (vendorname?.value ?: 0L).toString(), operator, (value?.value ?: 0L).toString(), valuelength.toInt(), (conditionindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyExpr(policy: COpaquePointer?, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyExpr((policy?.value ?: 0L).toString(), parentexpr.toInt(), operator, (exprindex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyRange(policy: COpaquePointer?, range: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyRange((policy?.value ?: 0L).toString(), (range?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprCreateV4Policy((policyname?.value ?: 0L).toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, (description?.value ?: 0L).toString(), enabled, (policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprCreateV4PolicyEx((policyname?.value ?: 0L).toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, (description?.value ?: 0L).toString(), enabled, (policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: COpaquePointer?, id: DhcpPropertyId, type: DhcpPropertyType): COpaquePointer? =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFindV4DhcpProperty((propertyarray?.value ?: 0L).toString(), id, type) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprFreeV4DhcpProperty(property: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4DhcpProperty((property?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4DhcpPropertyArray((propertyarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4Policy(policy: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4Policy((policy?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyArray((policyarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyEx(policyex: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyEx((policyex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyExArray((policyexarray?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprIsV4PolicySingleUC(policy: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicySingleUC((policy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicyValid((ppolicy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicyWellFormed((ppolicy?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprModifyV4PolicyExpr(policy: COpaquePointer?, operator: DhcpPolLogicOper): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprModifyV4PolicyExpr((policy?.value ?: 0L).toString(), operator) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprResetV4PolicyExpr(policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprResetV4PolicyExpr((policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpModifyClass((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (classinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpModifyClassV6((serveripaddress?.value ?: 0L).toString(), reservedmustbezero.toInt(), (classinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, params: DhcpcapiParamsArray, handle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveDNSRegistrations() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOption((serveripaddress?.value ?: 0L).toString(), optionid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValue((serveripaddress?.value ?: 0L).toString(), optionid.toInt(), (scopeinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValueV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValueV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElement((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (removeelementinfo?.value ?: 0L).toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElementV4((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (removeelementinfo?.value ?: 0L).toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElementV5((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (removeelementinfo?.value ?: 0L).toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRpcFreeMemory(bufferpointer: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpRpcFreeMemory((bufferpointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpScanDatabase((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), fixflag.toInt(), (scanlist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerAuditlogParamsFree(configinfo: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerAuditlogParamsFree((configinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerBackupDatabase((serveripaddress?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfig((serveripaddress?.value ?: 0L).toString(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigV4((serveripaddress?.value ?: 0L).toString(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigV6((serveripaddress?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigVQ((serveripaddress?.value ?: 0L).toString(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryAttribute((serveripaddr?.value ?: 0L).toString(), dwreserved.toInt(), dhcpattribid.toInt(), (pdhcpattrib?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: COpaquePointer?, pdhcpattribarr: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryAttributes((serveripaddr?.value ?: 0L).toString(), dwreserved.toInt(), dwattribcount.toInt(), (pdhcpattribs?.value ?: 0L).toString(), (pdhcpattribarr?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryDnsRegCredentials((serveripaddress?.value ?: 0L).toString(), unamesize.toInt(), (uname?.value ?: 0L).toString(), domainsize.toInt(), (domain?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerRedoAuthorization((serveripaddr?.value ?: 0L).toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerRestoreDatabase((serveripaddress?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfig((serveripaddress?.value ?: 0L).toString(), fieldstoset.toInt(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigV4((serveripaddress?.value ?: 0L).toString(), fieldstoset.toInt(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigV6((serveripaddress?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), fieldstoset.toInt(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigVQ((serveripaddress?.value ?: 0L).toString(), fieldstoset.toInt(), (configinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetDnsRegCredentials((serveripaddress?.value ?: 0L).toString(), (uname?.value ?: 0L).toString(), (domain?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetDnsRegCredentialsV5((serveripaddress?.value ?: 0L).toString(), (uname?.value ?: 0L).toString(), (domain?.value ?: 0L).toString(), (passwd?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfo((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoV4((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoV6((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoVQ((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetFilterV4((serveripaddress?.value ?: 0L).toString(), (globalfilterinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfo((serveripaddress?.value ?: 0L).toString(), optionid.toInt(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfoV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfoV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (optioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValue((serveripaddress?.value ?: 0L).toString(), optionid.toInt(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValueV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValueV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValues((serveripaddress?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalues?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValuesV5((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (classname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalues?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetServerBindingInfo((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (bindelementinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetServerBindingInfoV6((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (bindelementinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetDelayOffer((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), timedelayinmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetInfo((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (subnetinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetInfoVQ((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (subnetinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSuperScopeV4((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (superscopename?.value ?: 0L).toString(), changeexisting) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetThreadOptions(flags.toInt(), (reserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpUndoRequestParams(flags.toInt(), (reserved?.value ?: 0L).toString(), (adaptername?.value ?: 0L).toString(), (requestidstr?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4AddPolicyRange((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (policyname?.value ?: 0L).toString(), (range?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreateClientInfo((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreateClientInfoEx((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreatePolicy((serveripaddress?.value ?: 0L).toString(), (ppolicy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreatePolicyEx((serveripaddress?.value ?: 0L).toString(), (policyex?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4DeletePolicy((serveripaddress?.value ?: 0L).toString(), fglobalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumPolicies((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), (enuminfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumPoliciesEx((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), (enuminfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetClients((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetClientsEx((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (clientinfo?.value ?: 0L).toString(), (clientsread?.value ?: 0L).toString(), (clientstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetReservations((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L).toString(), (elementsread?.value ?: 0L).toString(), (elementstotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverAddScopeToRelationship((serveripaddress?.value ?: 0L).toString(), (prelationship?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverCreateRelationship((serveripaddress?.value ?: 0L).toString(), (prelationship?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverDeleteRelationship((serveripaddress?.value ?: 0L).toString(), (prelationshipname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverDeleteScopeFromRelationship((serveripaddress?.value ?: 0L).toString(), (prelationship?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, prelationship: COpaquePointer?, relationshipread: COpaquePointer?, relationshiptotal: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverEnumRelationship((serveripaddress?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString(), preferredmaximum.toInt(), (prelationship?.value ?: 0L).toString(), (relationshipread?.value ?: 0L).toString(), (relationshiptotal?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetAddressStatus((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (pstatus?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetClientInfo((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetRelationship((serveripaddress?.value ?: 0L).toString(), (prelationshipname?.value ?: 0L).toString(), (prelationship?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetScopeRelationship((serveripaddress?.value ?: 0L).toString(), scopeid.toInt(), (prelationship?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetScopeStatistics((serveripaddress?.value ?: 0L).toString(), scopeid.toInt(), (pstats?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: COpaquePointer?, pmaxalloweddeltatime: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetSystemTime((serveripaddress?.value ?: 0L).toString(), (ptime?.value ?: 0L).toString(), (pmaxalloweddeltatime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverSetRelationship((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (prelationship?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverTriggerAddrAllocation((serveripaddress?.value ?: 0L).toString(), (pfailrelname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetAllOptionValues((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (scopeinfo?.value ?: 0L).toString(), (values?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetClientInfo((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetClientInfoEx((serveripaddress?.value ?: 0L).toString(), (searchinfo?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetFreeIPAddress((serveripaddress?.value ?: 0L).toString(), scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), (ipaddrlist?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetOptionValue((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (policyname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetPolicy((serveripaddress?.value ?: 0L).toString(), fglobalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetPolicyEx((serveripaddress?.value ?: 0L).toString(), globalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4QueryPolicyEnforcement((serveripaddress?.value ?: 0L).toString(), fglobalpolicy, subnetaddress.toInt(), (enabled?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4RemoveOptionValue((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (policyname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4RemovePolicyRange((serveripaddress?.value ?: 0L).toString(), subnetaddress.toInt(), (policyname?.value ?: 0L).toString(), (range?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetOptionValue((serveripaddress?.value ?: 0L).toString(), flags.toInt(), optionid.toInt(), (policyname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalue?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetOptionValues((serveripaddress?.value ?: 0L).toString(), flags.toInt(), (policyname?.value ?: 0L).toString(), (vendorname?.value ?: 0L).toString(), (scopeinfo?.value ?: 0L).toString(), (optionvalues?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicy((serveripaddress?.value ?: 0L).toString(), fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicyEnforcement((serveripaddress?.value ?: 0L).toString(), fglobalpolicy, subnetaddress.toInt(), enable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicyEx((serveripaddress?.value ?: 0L).toString(), fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L).toString(), (policy?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV6CreateClientInfo((serveripaddress?.value ?: 0L).toString(), (clientinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpV6GetStatelessStatistics((serveripaddress?.value ?: 0L).toString(), (statelessstats?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6CApiCleanup() {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6CApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpv6CApiInitialize(version: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6CApiInitialize((version?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: COpaquePointer?, leaseinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6ReleasePrefix((adaptername?.value ?: 0L).toString(), (classid?.value ?: 0L).toString(), (leaseinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?, bvalidateprefix: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6RenewPrefix((adaptername?.value ?: 0L).toString(), (pclassid?.value ?: 0L).toString(), (prefixleaseinfo?.value ?: 0L).toString(), (pdwtimetowait?.value ?: 0L).toString(), bvalidateprefix.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, recdparams: Dhcpv6capiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6RequestPrefix((adaptername?.value ?: 0L).toString(), (pclassid?.value ?: 0L).toString(), (prefixleaseinfo?.value ?: 0L).toString(), (pdwtimetowait?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
