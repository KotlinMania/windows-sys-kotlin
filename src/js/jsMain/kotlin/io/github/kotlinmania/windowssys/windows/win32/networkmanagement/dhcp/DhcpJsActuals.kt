@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private val windowsWin32NetworkmanagementDhcpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: ConstPtr, forceflag: Bool): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4(serveripaddress.rawAddress.toString(), addfilterinfo.rawAddress.toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup(pserver.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddServer(flags: UInt, idinfo: MutPtr, newserver: MutPtr, callbackfn: MutPtr, callbackdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer(flags.toInt(), idinfo.rawAddress.toString(), newserver.rawAddress.toString(), callbackfn.rawAddress.toString(), callbackdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), addelementinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), addelementinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), addelementinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: MutPtr, diskcheckinterval: MutPtr, maxlogfilessize: MutPtr, minspaceondisk: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams(serveripaddress.rawAddress.toString(), flags.toInt(), auditlogdir.rawAddress.toString(), diskcheckinterval.rawAddress.toString(), maxlogfilessize.rawAddress.toString(), minspaceondisk.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams(serveripaddress.rawAddress.toString(), flags.toInt(), auditlogdir.rawAddress.toString(), diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCApiCleanup() {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpCApiInitialize(version: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize(version.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption(serveripaddress.rawAddress.toString(), optionid.toInt(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: MutPtr, event: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange(flags.toInt(), reserved.rawAddress.toString(), event.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4(serveripaddress.rawAddress.toString(), deletefilterinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteServer(flags: UInt, idinfo: MutPtr, newserver: MutPtr, callbackfn: MutPtr, callbackdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer(flags.toInt(), idinfo.rawAddress.toString(), newserver.rawAddress.toString(), callbackfn.rawAddress.toString(), callbackdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4(serveripaddress.rawAddress.toString(), superscopename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpDsCleanup() {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpDsInit(): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr, preferredmaximum: UInt, classinfoarray: MutPtr, nread: MutPtr, ntotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), classinfoarray.rawAddress.toString(), nread.rawAddress.toString(), ntotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr, preferredmaximum: UInt, classinfoarray: MutPtr, nread: MutPtr, ntotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), classinfoarray.rawAddress.toString(), nread.rawAddress.toString(), ntotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), listtype, enumfilterinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr, resumehandle: MutPtr, preferredmaximum: UInt, optionvalues: MutPtr, optionsread: MutPtr, optionstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), optionvalues.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, resumehandle: MutPtr, preferredmaximum: UInt, optionvalues: MutPtr, optionsread: MutPtr, optionstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), optionvalues.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, resumehandle: MutPtr, preferredmaximum: UInt, optionvalues: MutPtr, optionsread: MutPtr, optionstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), optionvalues.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, options: MutPtr, optionsread: MutPtr, optionstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), options.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, options: MutPtr, optionsread: MutPtr, optionstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), options.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, options: MutPtr, optionsread: MutPtr, optionstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), options.rawAddress.toString(), optionsread.rawAddress.toString(), optionstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumServers(flags: UInt, idinfo: MutPtr, servers: MutPtr, callbackfn: MutPtr, callbackdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers(flags.toInt(), idinfo.rawAddress.toString(), servers.rawAddress.toString(), callbackfn.rawAddress.toString(), callbackdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr, preferredmaximum: UInt, enumelementinfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr, preferredmaximum: UInt, enumelementinfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr, preferredmaximum: UInt, enumelementinfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: MutPtr, preferredmaximum: UInt, enumelementinfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, enuminfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, enuminfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr, values: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues(serveripaddress.rawAddress.toString(), flags.toInt(), scopeinfo.rawAddress.toString(), values.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr, values: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6(serveripaddress.rawAddress.toString(), flags.toInt(), scopeinfo.rawAddress.toString(), values.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions(serveripaddress.rawAddress.toString(), flags.toInt(), optionstruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionstruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: MutPtr, filledclassinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), partialclassinfo.rawAddress.toString(), filledclassinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions(serveripaddress.rawAddress.toString(), clientipaddress.toInt(), clientsubnetmask.toInt(), clientoptions.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4(serveripaddress.rawAddress.toString(), globalfilterinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo(serveripaddress.rawAddress.toString(), mibinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5(serveripaddress.rawAddress.toString(), mibinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6(serveripaddress.rawAddress.toString(), mibinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo(serveripaddress.rawAddress.toString(), optionid.toInt(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue(serveripaddress.rawAddress.toString(), optionid.toInt(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask(sadaptername.rawAddress.toString(), dwsubnetmask.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementsinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementsinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings(serveripaddress.rawAddress.toString(), serverspecificstrings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), timedelayinmilliseconds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4(serveripaddress.rawAddress.toString(), superscopetable.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetThreadOptions(pflags: MutPtr, reserved: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions(pflags.rawAddress.toString(), reserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: MutPtr, minorversion: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion(serveripaddress.rawAddress.toString(), majorversion.rawAddress.toString(), minorversion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyCondition(policy: MutPtr, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: ConstPtr, valuelength: UInt, conditionindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition(policy.rawAddress.toString(), parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), vendorname.rawAddress.toString(), operator, value.rawAddress.toString(), valuelength.toInt(), conditionindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyExpr(policy: MutPtr, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr(policy.rawAddress.toString(), parentexpr.toInt(), operator, exprindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprAddV4PolicyRange(policy: MutPtr, range: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange(policy.rawAddress.toString(), range.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy(policyname.rawAddress.toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.rawAddress.toString(), enabled, policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx(policyname.rawAddress.toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.rawAddress.toString(), enabled, policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: ConstPtr, id: DhcpPropertyId, type: DhcpPropertyType): MutPtr =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) MutPtr((windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty(propertyarray.rawAddress.toString(), id, type) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprFreeV4DhcpProperty(property: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty(property.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray(propertyarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4Policy(policy: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy(policy.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray(policyarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyEx(policyex: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx(policyex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray(policyexarray.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpHlprIsV4PolicySingleUC(policy: ConstPtr): Bool =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC(policy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid(ppolicy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: ConstPtr): Bool =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed(ppolicy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprModifyV4PolicyExpr(policy: MutPtr, operator: DhcpPolLogicOper): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr(policy.rawAddress.toString(), operator) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpHlprResetV4PolicyExpr(policy: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr(policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6(serveripaddress.rawAddress.toString(), reservedmustbezero.toInt(), classinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: ConstPtr, adaptername: Pcwstr, classid: MutPtr, params: DhcpcapiParamsArray, handle: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption(serveripaddress.rawAddress.toString(), optionid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue(serveripaddress.rawAddress.toString(), optionid.toInt(), scopeinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), removeelementinfo.rawAddress.toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), removeelementinfo.rawAddress.toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr, forceflag: DhcpForceFlag): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), removeelementinfo.rawAddress.toString(), forceflag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: MutPtr, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRequestParams(flags: UInt, reserved: MutPtr, adaptername: Pcwstr, classid: MutPtr, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: MutPtr, psize: MutPtr, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpRpcFreeMemory(bufferpointer: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory(bufferpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), fixflag.toInt(), scanlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerAuditlogParamsFree(configinfo: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree(configinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase(serveripaddress.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig(serveripaddress.rawAddress.toString(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4(serveripaddress.rawAddress.toString(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ(serveripaddress.rawAddress.toString(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute(serveripaddr.rawAddress.toString(), dwreserved.toInt(), dhcpattribid.toInt(), pdhcpattrib.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: MutPtr, pdhcpattribarr: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes(serveripaddr.rawAddress.toString(), dwreserved.toInt(), dwattribcount.toInt(), pdhcpattribs.rawAddress.toString(), pdhcpattribarr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials(serveripaddress.rawAddress.toString(), unamesize.toInt(), uname.rawAddress.toString(), domainsize.toInt(), domain.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization(serveripaddr.rawAddress.toString(), dwreserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase(serveripaddress.rawAddress.toString(), path.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig(serveripaddress.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4(serveripaddress.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr, fieldstoset: UInt, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ(serveripaddress.rawAddress.toString(), fieldstoset.toInt(), configinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials(serveripaddress.rawAddress.toString(), uname.rawAddress.toString(), domain.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5(serveripaddress.rawAddress.toString(), uname.rawAddress.toString(), domain.rawAddress.toString(), passwd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4(serveripaddress.rawAddress.toString(), globalfilterinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo(serveripaddress.rawAddress.toString(), optionid.toInt(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), optioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr, optionvalue: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue(serveripaddress.rawAddress.toString(), optionid.toInt(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr, optionvalues: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues(serveripaddress.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalues.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalues: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5(serveripaddress.rawAddress.toString(), flags.toInt(), classname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalues.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6(serveripaddress.rawAddress.toString(), flags.toInt(), bindelementinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), timedelayinmilliseconds.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), subnetinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), superscopename.rawAddress.toString(), changeexisting) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions(flags.toInt(), reserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: ConstPtr, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams(flags.toInt(), reserved.rawAddress.toString(), adaptername.rawAddress.toString(), requestidstr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), policyname.rawAddress.toString(), range.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy(serveripaddress.rawAddress.toString(), ppolicy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx(serveripaddress.rawAddress.toString(), policyex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), enuminfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, clientinfo: MutPtr, clientsread: MutPtr, clientstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), clientinfo.rawAddress.toString(), clientsread.rawAddress.toString(), clientstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr, preferredmaximum: UInt, enumelementinfo: MutPtr, elementsread: MutPtr, elementstotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), enumelementinfo.rawAddress.toString(), elementsread.rawAddress.toString(), elementstotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship(serveripaddress.rawAddress.toString(), prelationship.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship(serveripaddress.rawAddress.toString(), prelationship.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship(serveripaddress.rawAddress.toString(), prelationshipname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship(serveripaddress.rawAddress.toString(), prelationship.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: MutPtr, preferredmaximum: UInt, prelationship: MutPtr, relationshipread: MutPtr, relationshiptotal: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship(serveripaddress.rawAddress.toString(), resumehandle.rawAddress.toString(), preferredmaximum.toInt(), prelationship.rawAddress.toString(), relationshipread.rawAddress.toString(), relationshiptotal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), pstatus.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship(serveripaddress.rawAddress.toString(), prelationshipname.rawAddress.toString(), prelationship.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship(serveripaddress.rawAddress.toString(), scopeid.toInt(), prelationship.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics(serveripaddress.rawAddress.toString(), scopeid.toInt(), pstats.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: MutPtr, pmaxalloweddeltatime: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime(serveripaddress.rawAddress.toString(), ptime.rawAddress.toString(), pmaxalloweddeltatime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship(serveripaddress.rawAddress.toString(), flags.toInt(), prelationship.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation(serveripaddress.rawAddress.toString(), pfailrelname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr, values: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues(serveripaddress.rawAddress.toString(), flags.toInt(), scopeinfo.rawAddress.toString(), values.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: ConstPtr, clientinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx(serveripaddress.rawAddress.toString(), searchinfo.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress(serveripaddress.rawAddress.toString(), scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), ipaddrlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx(serveripaddress.rawAddress.toString(), globalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), enabled.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange(serveripaddress.rawAddress.toString(), subnetaddress.toInt(), policyname.rawAddress.toString(), range.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalue: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue(serveripaddress.rawAddress.toString(), flags.toInt(), optionid.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr, optionvalues: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues(serveripaddress.rawAddress.toString(), flags.toInt(), policyname.rawAddress.toString(), vendorname.rawAddress.toString(), scopeinfo.rawAddress.toString(), optionvalues.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy(serveripaddress.rawAddress.toString(), fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement(serveripaddress.rawAddress.toString(), fglobalpolicy, subnetaddress.toInt(), enable) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx(serveripaddress.rawAddress.toString(), fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), policyname.rawAddress.toString(), policy.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo(serveripaddress.rawAddress.toString(), clientinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics(serveripaddress.rawAddress.toString(), statelessstats.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: ConstPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6CApiCleanup() {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpv6CApiInitialize(version: MutPtr) {
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize(version.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: MutPtr, leaseinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix(adaptername.rawAddress.toString(), classid.rawAddress.toString(), leaseinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: MutPtr, prefixleaseinfo: MutPtr, pdwtimetowait: MutPtr, bvalidateprefix: UInt): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix(adaptername.rawAddress.toString(), pclassid.rawAddress.toString(), prefixleaseinfo.rawAddress.toString(), pdwtimetowait.rawAddress.toString(), bvalidateprefix.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: MutPtr, adaptername: Pcwstr, classid: MutPtr, recdparams: Dhcpv6capiParamsArray, buffer: MutPtr, psize: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: MutPtr, prefixleaseinfo: MutPtr, pdwtimetowait: MutPtr): UInt =
    if (windowsWin32NetworkmanagementDhcpNapiAddon != null) (windowsWin32NetworkmanagementDhcpNapiAddon.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix(adaptername.rawAddress.toString(), pclassid.rawAddress.toString(), prefixleaseinfo.rawAddress.toString(), pdwtimetowait.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
