@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private val _windowsWin32NetworkmanagementDhcpNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun DhcpAddFilterV4(serveripaddress: PCWSTR, addfilterinfo: Long, forceflag: BOOL): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4(serveripaddress.toString(), addfilterinfo.toString(), forceflag) as Int).toUInt() else 0u

public actual fun DhcpAddSecurityGroup(pserver: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup(pserver.toString()) as Int).toUInt() else 0u

public actual fun DhcpAddServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer(flags.toInt(), idinfo.toString(), newserver.toString(), callbackfn.toString(), callbackdata.toString()) as Int).toUInt() else 0u

public actual fun DhcpAddSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement(serveripaddress.toString(), subnetaddress.toInt(), addelementinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpAddSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4(serveripaddress.toString(), subnetaddress.toInt(), addelementinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpAddSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5(serveripaddress.toString(), subnetaddress.toInt(), addelementinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpAddSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAuditLogGetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams(serveripaddress.toString(), flags.toInt(), auditlogdir.toString(), diskcheckinterval.toString(), maxlogfilessize.toString(), minspaceondisk.toString()) as Int).toUInt() else 0u

public actual fun DhcpAuditLogSetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: PCWSTR, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams(serveripaddress.toString(), flags.toInt(), auditlogdir.toString(), diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()) as Int).toUInt() else 0u

public actual fun DhcpCApiCleanup() {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup()
    }
}

public actual fun DhcpCApiInitialize(version: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize(version.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass(serveripaddress.toString(), reservedmustbezero.toInt(), classinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6(serveripaddress.toString(), reservedmustbezero.toInt(), classinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateOption(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption(serveripaddress.toString(), optionid.toInt(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet(serveripaddress.toString(), subnetaddress.toInt(), subnetinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpCreateSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpCreateSubnetVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ(serveripaddress.toString(), subnetaddress.toInt(), subnetinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeRegisterParamChange(flags: UInt, reserved: Long, event: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange(flags.toInt(), reserved.toString(), event.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass(serveripaddress.toString(), reservedmustbezero.toInt(), classname.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6(serveripaddress.toString(), reservedmustbezero.toInt(), classname.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteFilterV4(serveripaddress: PCWSTR, deletefilterinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4(serveripaddress.toString(), deletefilterinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer(flags.toInt(), idinfo.toString(), newserver.toString(), callbackfn.toString(), callbackdata.toString()) as Int).toUInt() else 0u

public actual fun DhcpDeleteSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, forceflag: DHCP_FORCE_FLAG): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet(serveripaddress.toString(), subnetaddress.toInt(), forceflag) as Int).toUInt() else 0u

public actual fun DhcpDeleteSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpDeleteSuperScopeV4(serveripaddress: PCWSTR, superscopename: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4(serveripaddress.toString(), superscopename.toString()) as Int).toUInt() else 0u

public actual fun DhcpDsCleanup() {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup()
    }
}

public actual fun DhcpDsInit(): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit() as Int).toUInt() else 0u

public actual fun DhcpEnumClasses(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses(serveripaddress.toString(), reservedmustbezero.toInt(), resumehandle.toString(), preferredmaximum.toInt(), classinfoarray.toString(), nread.toString(), ntotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumClassesV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6(serveripaddress.toString(), reservedmustbezero.toInt(), resumehandle.toString(), preferredmaximum.toInt(), classinfoarray.toString(), nread.toString(), ntotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumFilterV4(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, listtype: DHCP_FILTER_LIST_TYPE, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), listtype, enumfilterinfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues(serveripaddress.toString(), scopeinfo.toString(), resumehandle.toString(), preferredmaximum.toInt(), optionvalues.toString(), optionsread.toString(), optionstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5(serveripaddress.toString(), flags.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), resumehandle.toString(), preferredmaximum.toInt(), optionvalues.toString(), optionsread.toString(), optionstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6(serveripaddress.toString(), flags.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), resumehandle.toString(), preferredmaximum.toInt(), optionvalues.toString(), optionsread.toString(), optionstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumOptions(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), options.toString(), optionsread.toString(), optionstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumOptionsV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5(serveripaddress.toString(), flags.toInt(), classname.toString(), vendorname.toString(), resumehandle.toString(), preferredmaximum.toInt(), options.toString(), optionsread.toString(), optionstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumOptionsV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6(serveripaddress.toString(), flags.toInt(), classname.toString(), vendorname.toString(), resumehandle.toString(), preferredmaximum.toInt(), options.toString(), optionsread.toString(), optionstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumServers(flags: UInt, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers(flags.toInt(), idinfo.toString(), servers.toString(), callbackfn.toString(), callbackdata.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetClientsV4(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetClientsV5(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetClientsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsVQ(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetElements(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements(serveripaddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.toString(), preferredmaximum.toInt(), enumelementinfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetElementsV4(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4(serveripaddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.toString(), preferredmaximum.toInt(), enumelementinfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetElementsV5(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5(serveripaddress.toString(), subnetaddress.toInt(), enumelementtype, resumehandle.toString(), preferredmaximum.toInt(), enumelementinfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetElementsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE_V6, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnets(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), enuminfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpEnumSubnetsV6(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), enuminfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues(serveripaddress.toString(), flags.toInt(), scopeinfo.toString(), values.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetAllOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6(serveripaddress.toString(), flags.toInt(), scopeinfo.toString(), values.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetAllOptions(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions(serveripaddress.toString(), flags.toInt(), optionstruct.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetAllOptionsV6(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6(serveripaddress.toString(), flags.toInt(), optionstruct.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetClassInfo(serveripaddress: PCWSTR, reservedmustbezero: UInt, partialclassinfo: Long, filledclassinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo(serveripaddress.toString(), reservedmustbezero.toInt(), partialclassinfo.toString(), filledclassinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetClientInfoV4(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetClientInfoV6(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetClientInfoVQ(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetClientOptions(serveripaddress: PCWSTR, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions(serveripaddress.toString(), clientipaddress.toInt(), clientsubnetmask.toInt(), clientoptions.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4(serveripaddress.toString(), globalfilterinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetMibInfo(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo(serveripaddress.toString(), mibinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetMibInfoV5(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5(serveripaddress.toString(), mibinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetMibInfoV6(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6(serveripaddress.toString(), mibinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo(serveripaddress.toString(), optionid.toInt(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue(serveripaddress.toString(), optionid.toInt(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetOriginalSubnetMask(sadaptername: PCWSTR, dwsubnetmask: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask(sadaptername.toString(), dwsubnetmask.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo(serveripaddress.toString(), flags.toInt(), bindelementsinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6(serveripaddress.toString(), flags.toInt(), bindelementsinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetServerSpecificStrings(serveripaddress: PCWSTR, serverspecificstrings: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings(serveripaddress.toString(), serverspecificstrings.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer(serveripaddress.toString(), subnetaddress.toInt(), timedelayinmilliseconds.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo(serveripaddress.toString(), subnetaddress.toInt(), subnetinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpGetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ(serveripaddress.toString(), subnetaddress.toInt(), subnetinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetSuperScopeInfoV4(serveripaddress: PCWSTR, superscopetable: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4(serveripaddress.toString(), superscopetable.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetThreadOptions(pflags: Long, reserved: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions(pflags.toString(), reserved.toString()) as Int).toUInt() else 0u

public actual fun DhcpGetVersion(serveripaddress: PCWSTR, majorversion: Long, minorversion: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion(serveripaddress.toString(), majorversion.toString(), minorversion.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: UInt, type: DHCP_POL_ATTR_TYPE, optionid: UInt, suboptionid: UInt, vendorname: PCWSTR, operator: DHCP_POL_COMPARATOR, value: Long, valuelength: UInt, conditionindex: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition(policy.toString(), parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), vendorname.toString(), operator, value.toString(), valuelength.toInt(), conditionindex.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: UInt, operator: DHCP_POL_LOGIC_OPER, exprindex: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr(policy.toString(), parentexpr.toInt(), operator, exprindex.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprAddV4PolicyRange(policy: Long, range: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange(policy.toString(), range.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprCreateV4Policy(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy(policyname.toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.toString(), enabled, policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprCreateV4PolicyEx(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx(policyname.toString(), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.toString(), enabled, policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprFindV4DhcpProperty(propertyarray: Long, id: DHCP_PROPERTY_ID, type: DHCP_PROPERTY_TYPE): Long =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty(propertyarray.toString(), id, type) as String).toLong() else 0L

public actual fun DhcpHlprFreeV4DhcpProperty(property: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty(property.toString())
    }
}

public actual fun DhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray(propertyarray.toString())
    }
}

public actual fun DhcpHlprFreeV4Policy(policy: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy(policy.toString())
    }
}

public actual fun DhcpHlprFreeV4PolicyArray(policyarray: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray(policyarray.toString())
    }
}

public actual fun DhcpHlprFreeV4PolicyEx(policyex: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx(policyex.toString())
    }
}

public actual fun DhcpHlprFreeV4PolicyExArray(policyexarray: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray(policyexarray.toString())
    }
}

public actual fun DhcpHlprIsV4PolicySingleUC(policy: Long): BOOL =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC(policy.toString()) as Int) else 0

public actual fun DhcpHlprIsV4PolicyValid(ppolicy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid(ppolicy.toString()) as Int).toUInt() else 0u

public actual fun DhcpHlprIsV4PolicyWellFormed(ppolicy: Long): BOOL =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed(ppolicy.toString()) as Int) else 0

public actual fun DhcpHlprModifyV4PolicyExpr(policy: Long, operator: DHCP_POL_LOGIC_OPER): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr(policy.toString(), operator) as Int).toUInt() else 0u

public actual fun DhcpHlprResetV4PolicyExpr(policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr(policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpModifyClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass(serveripaddress.toString(), reservedmustbezero.toInt(), classinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpModifyClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6(serveripaddress.toString(), reservedmustbezero.toInt(), classinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpRegisterParamChange(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, params: DHCPCAPI_PARAMS_ARRAY, handle: Long): UInt =
    0u

public actual fun DhcpRemoveDNSRegistrations(): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations() as Int).toUInt() else 0u

public actual fun DhcpRemoveOption(serveripaddress: PCWSTR, optionid: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption(serveripaddress.toString(), optionid.toInt()) as Int).toUInt() else 0u

public actual fun DhcpRemoveOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString()) as Int).toUInt() else 0u

public actual fun DhcpRemoveOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString()) as Int).toUInt() else 0u

public actual fun DhcpRemoveOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue(serveripaddress.toString(), optionid.toInt(), scopeinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpRemoveOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpRemoveOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpRemoveSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement(serveripaddress.toString(), subnetaddress.toInt(), removeelementinfo.toString(), forceflag) as Int).toUInt() else 0u

public actual fun DhcpRemoveSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4(serveripaddress.toString(), subnetaddress.toInt(), removeelementinfo.toString(), forceflag) as Int).toUInt() else 0u

public actual fun DhcpRemoveSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5(serveripaddress.toString(), subnetaddress.toInt(), removeelementinfo.toString(), forceflag) as Int).toUInt() else 0u

public actual fun DhcpRemoveSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, sendparams: DHCPCAPI_PARAMS_ARRAY, recdparams: DHCPCAPI_PARAMS_ARRAY, buffer: Long, psize: Long, requestidstr: PCWSTR): UInt =
    0u

public actual fun DhcpRpcFreeMemory(bufferpointer: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory(bufferpointer.toString())
    }
}

public actual fun DhcpScanDatabase(serveripaddress: PCWSTR, subnetaddress: UInt, fixflag: UInt, scanlist: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase(serveripaddress.toString(), subnetaddress.toInt(), fixflag.toInt(), scanlist.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerAuditlogParamsFree(configinfo: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree(configinfo.toString())
    }
}

public actual fun DhcpServerBackupDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase(serveripaddress.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerGetConfig(serveripaddress: PCWSTR, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig(serveripaddress.toString(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerGetConfigV4(serveripaddress: PCWSTR, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4(serveripaddress.toString(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerGetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6(serveripaddress.toString(), scopeinfo.toString(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerGetConfigVQ(serveripaddress: PCWSTR, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ(serveripaddress.toString(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerQueryAttribute(serveripaddr: PCWSTR, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute(serveripaddr.toString(), dwreserved.toInt(), dhcpattribid.toInt(), pdhcpattrib.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerQueryAttributes(serveripaddr: PCWSTR, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: Long, pdhcpattribarr: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes(serveripaddr.toString(), dwreserved.toInt(), dwattribcount.toInt(), pdhcpattribs.toString(), pdhcpattribarr.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerQueryDnsRegCredentials(serveripaddress: PCWSTR, unamesize: UInt, uname: PWSTR, domainsize: UInt, domain: PWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials(serveripaddress.toString(), unamesize.toInt(), uname.toString(), domainsize.toInt(), domain.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerRedoAuthorization(serveripaddr: PCWSTR, dwreserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization(serveripaddr.toString(), dwreserved.toInt()) as Int).toUInt() else 0u

public actual fun DhcpServerRestoreDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase(serveripaddress.toString(), path.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerSetConfig(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig(serveripaddress.toString(), fieldstoset.toInt(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerSetConfigV4(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4(serveripaddress.toString(), fieldstoset.toInt(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerSetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, fieldstoset: UInt, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6(serveripaddress.toString(), scopeinfo.toString(), fieldstoset.toInt(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerSetConfigVQ(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ(serveripaddress.toString(), fieldstoset.toInt(), configinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerSetDnsRegCredentials(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials(serveripaddress.toString(), uname.toString(), domain.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun DhcpServerSetDnsRegCredentialsV5(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5(serveripaddress.toString(), uname.toString(), domain.toString(), passwd.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4(serveripaddress.toString(), globalfilterinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo(serveripaddress.toString(), optionid.toInt(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), optioninfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue(serveripaddress.toString(), optionid.toInt(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6(serveripaddress.toString(), flags.toInt(), optionid.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues(serveripaddress.toString(), scopeinfo.toString(), optionvalues.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5(serveripaddress.toString(), flags.toInt(), classname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalues.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo(serveripaddress.toString(), flags.toInt(), bindelementinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6(serveripaddress.toString(), flags.toInt(), bindelementinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer(serveripaddress.toString(), subnetaddress.toInt(), timedelayinmilliseconds.toInt()) as Int).toUInt() else 0u

public actual fun DhcpSetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo(serveripaddress.toString(), subnetaddress.toInt(), subnetinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpSetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ(serveripaddress.toString(), subnetaddress.toInt(), subnetinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpSetSuperScopeV4(serveripaddress: PCWSTR, subnetaddress: UInt, superscopename: PCWSTR, changeexisting: BOOL): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4(serveripaddress.toString(), subnetaddress.toInt(), superscopename.toString(), changeexisting) as Int).toUInt() else 0u

public actual fun DhcpSetThreadOptions(flags: UInt, reserved: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions(flags.toInt(), reserved.toString()) as Int).toUInt() else 0u

public actual fun DhcpUndoRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, requestidstr: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams(flags.toInt(), reserved.toString(), adaptername.toString(), requestidstr.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4AddPolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange(serveripaddress.toString(), subnetaddress.toInt(), policyname.toString(), range.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4CreateClientInfoEx(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4CreatePolicy(serveripaddress: PCWSTR, ppolicy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy(serveripaddress.toString(), ppolicy.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4CreatePolicyEx(serveripaddress: PCWSTR, policyex: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx(serveripaddress.toString(), policyex.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4DeletePolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy(serveripaddress.toString(), fglobalpolicy, subnetaddress.toInt(), policyname.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4EnumPolicies(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), enuminfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4EnumPoliciesEx(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, globalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), enuminfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4EnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4EnumSubnetClientsEx(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), clientinfo.toString(), clientsread.toString(), clientstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4EnumSubnetReservations(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations(serveripaddress.toString(), subnetaddress.toInt(), resumehandle.toString(), preferredmaximum.toInt(), enumelementinfo.toString(), elementsread.toString(), elementstotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverAddScopeToRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship(serveripaddress.toString(), prelationship.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverCreateRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship(serveripaddress.toString(), prelationship.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverDeleteRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship(serveripaddress.toString(), prelationshipname.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress.toString(), prelationship.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverEnumRelationship(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, prelationship: Long, relationshipread: Long, relationshiptotal: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship(serveripaddress.toString(), resumehandle.toString(), preferredmaximum.toInt(), prelationship.toString(), relationshipread.toString(), relationshiptotal.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverGetAddressStatus(serveripaddress: PCWSTR, subnetaddress: UInt, pstatus: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus(serveripaddress.toString(), subnetaddress.toInt(), pstatus.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverGetRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR, prelationship: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship(serveripaddress.toString(), prelationshipname.toString(), prelationship.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverGetScopeRelationship(serveripaddress: PCWSTR, scopeid: UInt, prelationship: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship(serveripaddress.toString(), scopeid.toInt(), prelationship.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverGetScopeStatistics(serveripaddress: PCWSTR, scopeid: UInt, pstats: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics(serveripaddress.toString(), scopeid.toInt(), pstats.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverGetSystemTime(serveripaddress: PCWSTR, ptime: Long, pmaxalloweddeltatime: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime(serveripaddress.toString(), ptime.toString(), pmaxalloweddeltatime.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverSetRelationship(serveripaddress: PCWSTR, flags: UInt, prelationship: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship(serveripaddress.toString(), flags.toInt(), prelationship.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4FailoverTriggerAddrAllocation(serveripaddress: PCWSTR, pfailrelname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation(serveripaddress.toString(), pfailrelname.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues(serveripaddress.toString(), flags.toInt(), scopeinfo.toString(), values.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetClientInfoEx(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx(serveripaddress.toString(), searchinfo.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress(serveripaddress.toString(), scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), ipaddrlist.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue(serveripaddress.toString(), flags.toInt(), optionid.toInt(), policyname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetPolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy(serveripaddress.toString(), fglobalpolicy, subnetaddress.toInt(), policyname.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4GetPolicyEx(serveripaddress: PCWSTR, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx(serveripaddress.toString(), globalpolicy, subnetaddress.toInt(), policyname.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4QueryPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enabled: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement(serveripaddress.toString(), fglobalpolicy, subnetaddress.toInt(), enabled.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4RemoveOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue(serveripaddress.toString(), flags.toInt(), optionid.toInt(), policyname.toString(), vendorname.toString(), scopeinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4RemovePolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange(serveripaddress.toString(), subnetaddress.toInt(), policyname.toString(), range.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4SetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue(serveripaddress.toString(), flags.toInt(), optionid.toInt(), policyname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalue.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4SetOptionValues(serveripaddress: PCWSTR, flags: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues(serveripaddress.toString(), flags.toInt(), policyname.toString(), vendorname.toString(), scopeinfo.toString(), optionvalues.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4SetPolicy(serveripaddress: PCWSTR, fieldsmodified: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy(serveripaddress.toString(), fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), policyname.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpV4SetPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enable: BOOL): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement(serveripaddress.toString(), fglobalpolicy, subnetaddress.toInt(), enable) as Int).toUInt() else 0u

public actual fun DhcpV4SetPolicyEx(serveripaddress: PCWSTR, fieldsmodified: UInt, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx(serveripaddress.toString(), fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), policyname.toString(), policy.toString()) as Int).toUInt() else 0u

public actual fun DhcpV6CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo(serveripaddress.toString(), clientinfo.toString()) as Int).toUInt() else 0u

public actual fun DhcpV6GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: DHCP_IPV6_ADDRESS, startip: DHCP_IPV6_ADDRESS, endip: DHCP_IPV6_ADDRESS, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    0u

public actual fun DhcpV6GetStatelessStatistics(serveripaddress: PCWSTR, statelessstats: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics(serveripaddress.toString(), statelessstats.toString()) as Int).toUInt() else 0u

public actual fun DhcpV6GetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, params: Long): UInt =
    0u

public actual fun DhcpV6SetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, fieldmodified: UInt, params: Long): UInt =
    0u

public actual fun Dhcpv6CApiCleanup() {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup()
    }
}

public actual fun Dhcpv6CApiInitialize(version: Long) {
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) {
        _windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize(version.toString())
    }
}

public actual fun Dhcpv6ReleasePrefix(adaptername: PCWSTR, classid: Long, leaseinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix(adaptername.toString(), classid.toString(), leaseinfo.toString()) as Int).toUInt() else 0u

public actual fun Dhcpv6RenewPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: UInt): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix(adaptername.toString(), pclassid.toString(), prefixleaseinfo.toString(), pdwtimetowait.toString(), bvalidateprefix.toInt()) as Int).toUInt() else 0u

public actual fun Dhcpv6RequestParams(forcenewinform: BOOL, reserved: Long, adaptername: PCWSTR, classid: Long, recdparams: DHCPV6CAPI_PARAMS_ARRAY, buffer: Long, psize: Long): UInt =
    0u

public actual fun Dhcpv6RequestPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): UInt =
    if (_windowsWin32NetworkmanagementDhcpNapiAddon != null) (_windowsWin32NetworkmanagementDhcpNapiAddon.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix(adaptername.toString(), pclassid.toString(), prefixleaseinfo.toString(), pdwtimetowait.toString()) as Int).toUInt() else 0u
