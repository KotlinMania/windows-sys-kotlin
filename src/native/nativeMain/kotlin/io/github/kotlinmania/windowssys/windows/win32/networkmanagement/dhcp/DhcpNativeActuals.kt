@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun DhcpAddFilterV4(serveripaddress: PCWSTR, addfilterinfo: Long, forceflag: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4(serveripaddress.toCPointer<ByteVar>(), addfilterinfo.toCPointer<ByteVar>(), forceflag)

public actual fun DhcpAddSecurityGroup(pserver: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup(pserver.toCPointer<ByteVar>())

public actual fun DhcpAddServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer(flags, idinfo.toCPointer<ByteVar>(), newserver.toCPointer<ByteVar>(), callbackfn.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun DhcpAddSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement(serveripaddress.toCPointer<ByteVar>(), subnetaddress, addelementinfo.toCPointer<ByteVar>())

public actual fun DhcpAddSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4(serveripaddress.toCPointer<ByteVar>(), subnetaddress, addelementinfo.toCPointer<ByteVar>())

public actual fun DhcpAddSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5(serveripaddress.toCPointer<ByteVar>(), subnetaddress, addelementinfo.toCPointer<ByteVar>())

public actual fun DhcpAddSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAuditLogGetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams(serveripaddress.toCPointer<ByteVar>(), flags, auditlogdir.toCPointer<ByteVar>(), diskcheckinterval.toCPointer<ByteVar>(), maxlogfilessize.toCPointer<ByteVar>(), minspaceondisk.toCPointer<ByteVar>())

public actual fun DhcpAuditLogSetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: PCWSTR, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams(serveripaddress.toCPointer<ByteVar>(), flags, auditlogdir.toCPointer<ByteVar>(), diskcheckinterval, maxlogfilessize, minspaceondisk)

public actual fun DhcpCApiCleanup() {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup()
}

public actual fun DhcpCApiInitialize(version: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize(version.toCPointer<ByteVar>())

public actual fun DhcpCreateClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, classinfo.toCPointer<ByteVar>())

public actual fun DhcpCreateClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, classinfo.toCPointer<ByteVar>())

public actual fun DhcpCreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpCreateClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpCreateClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpCreateOption(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption(serveripaddress.toCPointer<ByteVar>(), optionid, optioninfo.toCPointer<ByteVar>())

public actual fun DhcpCreateOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), optioninfo.toCPointer<ByteVar>())

public actual fun DhcpCreateOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), optioninfo.toCPointer<ByteVar>())

public actual fun DhcpCreateSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet(serveripaddress.toCPointer<ByteVar>(), subnetaddress, subnetinfo.toCPointer<ByteVar>())

public actual fun DhcpCreateSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpCreateSubnetVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ(serveripaddress.toCPointer<ByteVar>(), subnetaddress, subnetinfo.toCPointer<ByteVar>())

public actual fun DhcpDeRegisterParamChange(flags: UInt, reserved: Long, event: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange(flags, reserved.toCPointer<ByteVar>(), event.toCPointer<ByteVar>())

public actual fun DhcpDeleteClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, classname.toCPointer<ByteVar>())

public actual fun DhcpDeleteClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, classname.toCPointer<ByteVar>())

public actual fun DhcpDeleteClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpDeleteClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpDeleteFilterV4(serveripaddress: PCWSTR, deletefilterinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4(serveripaddress.toCPointer<ByteVar>(), deletefilterinfo.toCPointer<ByteVar>())

public actual fun DhcpDeleteServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer(flags, idinfo.toCPointer<ByteVar>(), newserver.toCPointer<ByteVar>(), callbackfn.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun DhcpDeleteSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, forceflag: DHCP_FORCE_FLAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet(serveripaddress.toCPointer<ByteVar>(), subnetaddress, forceflag)

public actual fun DhcpDeleteSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpDeleteSuperScopeV4(serveripaddress: PCWSTR, superscopename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4(serveripaddress.toCPointer<ByteVar>(), superscopename.toCPointer<ByteVar>())

public actual fun DhcpDsCleanup() {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup()
}

public actual fun DhcpDsInit(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit()

public actual fun DhcpEnumClasses(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, resumehandle.toCPointer<ByteVar>(), preferredmaximum, classinfoarray.toCPointer<ByteVar>(), nread.toCPointer<ByteVar>(), ntotal.toCPointer<ByteVar>())

public actual fun DhcpEnumClassesV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, resumehandle.toCPointer<ByteVar>(), preferredmaximum, classinfoarray.toCPointer<ByteVar>(), nread.toCPointer<ByteVar>(), ntotal.toCPointer<ByteVar>())

public actual fun DhcpEnumFilterV4(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, listtype: DHCP_FILTER_LIST_TYPE, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, listtype, enumfilterinfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues(serveripaddress.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, optionvalues.toCPointer<ByteVar>(), optionsread.toCPointer<ByteVar>(), optionstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5(serveripaddress.toCPointer<ByteVar>(), flags, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, optionvalues.toCPointer<ByteVar>(), optionsread.toCPointer<ByteVar>(), optionstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6(serveripaddress.toCPointer<ByteVar>(), flags, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, optionvalues.toCPointer<ByteVar>(), optionsread.toCPointer<ByteVar>(), optionstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumOptions(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, options.toCPointer<ByteVar>(), optionsread.toCPointer<ByteVar>(), optionstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumOptionsV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5(serveripaddress.toCPointer<ByteVar>(), flags, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, options.toCPointer<ByteVar>(), optionsread.toCPointer<ByteVar>(), optionstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumOptionsV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6(serveripaddress.toCPointer<ByteVar>(), flags, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, options.toCPointer<ByteVar>(), optionsread.toCPointer<ByteVar>(), optionstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumServers(flags: UInt, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers(flags, idinfo.toCPointer<ByteVar>(), servers.toCPointer<ByteVar>(), callbackfn.toCPointer<ByteVar>(), callbackdata.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetClientsV4(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetClientsV5(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetClientsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsVQ(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetElements(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements(serveripaddress.toCPointer<ByteVar>(), subnetaddress, enumelementtype, resumehandle.toCPointer<ByteVar>(), preferredmaximum, enumelementinfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetElementsV4(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4(serveripaddress.toCPointer<ByteVar>(), subnetaddress, enumelementtype, resumehandle.toCPointer<ByteVar>(), preferredmaximum, enumelementinfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetElementsV5(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5(serveripaddress.toCPointer<ByteVar>(), subnetaddress, enumelementtype, resumehandle.toCPointer<ByteVar>(), preferredmaximum, enumelementinfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetElementsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE_V6, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnets(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, enuminfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpEnumSubnetsV6(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, enuminfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpGetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues(serveripaddress.toCPointer<ByteVar>(), flags, scopeinfo.toCPointer<ByteVar>(), values.toCPointer<ByteVar>())

public actual fun DhcpGetAllOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6(serveripaddress.toCPointer<ByteVar>(), flags, scopeinfo.toCPointer<ByteVar>(), values.toCPointer<ByteVar>())

public actual fun DhcpGetAllOptions(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions(serveripaddress.toCPointer<ByteVar>(), flags, optionstruct.toCPointer<ByteVar>())

public actual fun DhcpGetAllOptionsV6(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6(serveripaddress.toCPointer<ByteVar>(), flags, optionstruct.toCPointer<ByteVar>())

public actual fun DhcpGetClassInfo(serveripaddress: PCWSTR, reservedmustbezero: UInt, partialclassinfo: Long, filledclassinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, partialclassinfo.toCPointer<ByteVar>(), filledclassinfo.toCPointer<ByteVar>())

public actual fun DhcpGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpGetClientInfoV4(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpGetClientInfoV6(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpGetClientInfoVQ(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpGetClientOptions(serveripaddress: PCWSTR, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions(serveripaddress.toCPointer<ByteVar>(), clientipaddress, clientsubnetmask, clientoptions.toCPointer<ByteVar>())

public actual fun DhcpGetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4(serveripaddress.toCPointer<ByteVar>(), globalfilterinfo.toCPointer<ByteVar>())

public actual fun DhcpGetMibInfo(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo(serveripaddress.toCPointer<ByteVar>(), mibinfo.toCPointer<ByteVar>())

public actual fun DhcpGetMibInfoV5(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5(serveripaddress.toCPointer<ByteVar>(), mibinfo.toCPointer<ByteVar>())

public actual fun DhcpGetMibInfoV6(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6(serveripaddress.toCPointer<ByteVar>(), mibinfo.toCPointer<ByteVar>())

public actual fun DhcpGetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo(serveripaddress.toCPointer<ByteVar>(), optionid, optioninfo.toCPointer<ByteVar>())

public actual fun DhcpGetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), optioninfo.toCPointer<ByteVar>())

public actual fun DhcpGetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), optioninfo.toCPointer<ByteVar>())

public actual fun DhcpGetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue(serveripaddress.toCPointer<ByteVar>(), optionid, scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpGetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpGetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpGetOriginalSubnetMask(sadaptername: PCWSTR, dwsubnetmask: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask(sadaptername.toCPointer<ByteVar>(), dwsubnetmask.toCPointer<ByteVar>())

public actual fun DhcpGetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo(serveripaddress.toCPointer<ByteVar>(), flags, bindelementsinfo.toCPointer<ByteVar>())

public actual fun DhcpGetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6(serveripaddress.toCPointer<ByteVar>(), flags, bindelementsinfo.toCPointer<ByteVar>())

public actual fun DhcpGetServerSpecificStrings(serveripaddress: PCWSTR, serverspecificstrings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings(serveripaddress.toCPointer<ByteVar>(), serverspecificstrings.toCPointer<ByteVar>())

public actual fun DhcpGetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer(serveripaddress.toCPointer<ByteVar>(), subnetaddress, timedelayinmilliseconds.toCPointer<ByteVar>())

public actual fun DhcpGetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo(serveripaddress.toCPointer<ByteVar>(), subnetaddress, subnetinfo.toCPointer<ByteVar>())

public actual fun DhcpGetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpGetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ(serveripaddress.toCPointer<ByteVar>(), subnetaddress, subnetinfo.toCPointer<ByteVar>())

public actual fun DhcpGetSuperScopeInfoV4(serveripaddress: PCWSTR, superscopetable: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4(serveripaddress.toCPointer<ByteVar>(), superscopetable.toCPointer<ByteVar>())

public actual fun DhcpGetThreadOptions(pflags: Long, reserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions(pflags.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun DhcpGetVersion(serveripaddress: PCWSTR, majorversion: Long, minorversion: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion(serveripaddress.toCPointer<ByteVar>(), majorversion.toCPointer<ByteVar>(), minorversion.toCPointer<ByteVar>())

public actual fun DhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: UInt, type: DHCP_POL_ATTR_TYPE, optionid: UInt, suboptionid: UInt, vendorname: PCWSTR, operator: DHCP_POL_COMPARATOR, value: Long, valuelength: UInt, conditionindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition(policy.toCPointer<ByteVar>(), parentexpr, type, optionid, suboptionid, vendorname.toCPointer<ByteVar>(), operator, value.toCPointer<ByteVar>(), valuelength, conditionindex.toCPointer<ByteVar>())

public actual fun DhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: UInt, operator: DHCP_POL_LOGIC_OPER, exprindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr(policy.toCPointer<ByteVar>(), parentexpr, operator, exprindex.toCPointer<ByteVar>())

public actual fun DhcpHlprAddV4PolicyRange(policy: Long, range: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange(policy.toCPointer<ByteVar>(), range.toCPointer<ByteVar>())

public actual fun DhcpHlprCreateV4Policy(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy(policyname.toCPointer<ByteVar>(), fglobalpolicy, subnet, processingorder, rootoperator, description.toCPointer<ByteVar>(), enabled, policy.toCPointer<ByteVar>())

public actual fun DhcpHlprCreateV4PolicyEx(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx(policyname.toCPointer<ByteVar>(), fglobalpolicy, subnet, processingorder, rootoperator, description.toCPointer<ByteVar>(), enabled, policy.toCPointer<ByteVar>())

public actual fun DhcpHlprFindV4DhcpProperty(propertyarray: Long, id: DHCP_PROPERTY_ID, type: DHCP_PROPERTY_TYPE): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty(propertyarray.toCPointer<ByteVar>(), id, type)?.toLong() ?: 0L

public actual fun DhcpHlprFreeV4DhcpProperty(property: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty(property.toCPointer<ByteVar>())
}

public actual fun DhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray(propertyarray.toCPointer<ByteVar>())
}

public actual fun DhcpHlprFreeV4Policy(policy: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy(policy.toCPointer<ByteVar>())
}

public actual fun DhcpHlprFreeV4PolicyArray(policyarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray(policyarray.toCPointer<ByteVar>())
}

public actual fun DhcpHlprFreeV4PolicyEx(policyex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx(policyex.toCPointer<ByteVar>())
}

public actual fun DhcpHlprFreeV4PolicyExArray(policyexarray: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray(policyexarray.toCPointer<ByteVar>())
}

public actual fun DhcpHlprIsV4PolicySingleUC(policy: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC(policy.toCPointer<ByteVar>())

public actual fun DhcpHlprIsV4PolicyValid(ppolicy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid(ppolicy.toCPointer<ByteVar>())

public actual fun DhcpHlprIsV4PolicyWellFormed(ppolicy: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed(ppolicy.toCPointer<ByteVar>())

public actual fun DhcpHlprModifyV4PolicyExpr(policy: Long, operator: DHCP_POL_LOGIC_OPER): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr(policy.toCPointer<ByteVar>(), operator)

public actual fun DhcpHlprResetV4PolicyExpr(policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr(policy.toCPointer<ByteVar>())

public actual fun DhcpModifyClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, classinfo.toCPointer<ByteVar>())

public actual fun DhcpModifyClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6(serveripaddress.toCPointer<ByteVar>(), reservedmustbezero, classinfo.toCPointer<ByteVar>())

public actual fun DhcpRegisterParamChange(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, params: DHCPCAPI_PARAMS_ARRAY, handle: Long): UInt =
    0u

public actual fun DhcpRemoveDNSRegistrations(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations()

public actual fun DhcpRemoveOption(serveripaddress: PCWSTR, optionid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption(serveripaddress.toCPointer<ByteVar>(), optionid)

public actual fun DhcpRemoveOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>())

public actual fun DhcpRemoveOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>())

public actual fun DhcpRemoveOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue(serveripaddress.toCPointer<ByteVar>(), optionid, scopeinfo.toCPointer<ByteVar>())

public actual fun DhcpRemoveOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>())

public actual fun DhcpRemoveOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>())

public actual fun DhcpRemoveSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement(serveripaddress.toCPointer<ByteVar>(), subnetaddress, removeelementinfo.toCPointer<ByteVar>(), forceflag)

public actual fun DhcpRemoveSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4(serveripaddress.toCPointer<ByteVar>(), subnetaddress, removeelementinfo.toCPointer<ByteVar>(), forceflag)

public actual fun DhcpRemoveSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5(serveripaddress.toCPointer<ByteVar>(), subnetaddress, removeelementinfo.toCPointer<ByteVar>(), forceflag)

public actual fun DhcpRemoveSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, sendparams: DHCPCAPI_PARAMS_ARRAY, recdparams: DHCPCAPI_PARAMS_ARRAY, buffer: Long, psize: Long, requestidstr: PCWSTR): UInt =
    0u

public actual fun DhcpRpcFreeMemory(bufferpointer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory(bufferpointer.toCPointer<ByteVar>())
}

public actual fun DhcpScanDatabase(serveripaddress: PCWSTR, subnetaddress: UInt, fixflag: UInt, scanlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase(serveripaddress.toCPointer<ByteVar>(), subnetaddress, fixflag, scanlist.toCPointer<ByteVar>())

public actual fun DhcpServerAuditlogParamsFree(configinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree(configinfo.toCPointer<ByteVar>())
}

public actual fun DhcpServerBackupDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase(serveripaddress.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun DhcpServerGetConfig(serveripaddress: PCWSTR, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig(serveripaddress.toCPointer<ByteVar>(), configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerGetConfigV4(serveripaddress: PCWSTR, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4(serveripaddress.toCPointer<ByteVar>(), configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerGetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6(serveripaddress.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerGetConfigVQ(serveripaddress: PCWSTR, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ(serveripaddress.toCPointer<ByteVar>(), configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerQueryAttribute(serveripaddr: PCWSTR, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute(serveripaddr.toCPointer<ByteVar>(), dwreserved, dhcpattribid, pdhcpattrib.toCPointer<ByteVar>())

public actual fun DhcpServerQueryAttributes(serveripaddr: PCWSTR, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: Long, pdhcpattribarr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes(serveripaddr.toCPointer<ByteVar>(), dwreserved, dwattribcount, pdhcpattribs.toCPointer<ByteVar>(), pdhcpattribarr.toCPointer<ByteVar>())

public actual fun DhcpServerQueryDnsRegCredentials(serveripaddress: PCWSTR, unamesize: UInt, uname: PWSTR, domainsize: UInt, domain: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials(serveripaddress.toCPointer<ByteVar>(), unamesize, uname.toCPointer<ByteVar>(), domainsize, domain.toCPointer<ByteVar>())

public actual fun DhcpServerRedoAuthorization(serveripaddr: PCWSTR, dwreserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization(serveripaddr.toCPointer<ByteVar>(), dwreserved)

public actual fun DhcpServerRestoreDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase(serveripaddress.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun DhcpServerSetConfig(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig(serveripaddress.toCPointer<ByteVar>(), fieldstoset, configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerSetConfigV4(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4(serveripaddress.toCPointer<ByteVar>(), fieldstoset, configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerSetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, fieldstoset: UInt, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6(serveripaddress.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), fieldstoset, configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerSetConfigVQ(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ(serveripaddress.toCPointer<ByteVar>(), fieldstoset, configinfo.toCPointer<ByteVar>())

public actual fun DhcpServerSetDnsRegCredentials(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials(serveripaddress.toCPointer<ByteVar>(), uname.toCPointer<ByteVar>(), domain.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun DhcpServerSetDnsRegCredentialsV5(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5(serveripaddress.toCPointer<ByteVar>(), uname.toCPointer<ByteVar>(), domain.toCPointer<ByteVar>(), passwd.toCPointer<ByteVar>())

public actual fun DhcpSetClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpSetClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpSetClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpSetClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpSetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4(serveripaddress.toCPointer<ByteVar>(), globalfilterinfo.toCPointer<ByteVar>())

public actual fun DhcpSetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo(serveripaddress.toCPointer<ByteVar>(), optionid, optioninfo.toCPointer<ByteVar>())

public actual fun DhcpSetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), optioninfo.toCPointer<ByteVar>())

public actual fun DhcpSetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), optioninfo.toCPointer<ByteVar>())

public actual fun DhcpSetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue(serveripaddress.toCPointer<ByteVar>(), optionid, scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpSetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpSetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6(serveripaddress.toCPointer<ByteVar>(), flags, optionid, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpSetOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues(serveripaddress.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalues.toCPointer<ByteVar>())

public actual fun DhcpSetOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5(serveripaddress.toCPointer<ByteVar>(), flags, classname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalues.toCPointer<ByteVar>())

public actual fun DhcpSetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo(serveripaddress.toCPointer<ByteVar>(), flags, bindelementinfo.toCPointer<ByteVar>())

public actual fun DhcpSetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6(serveripaddress.toCPointer<ByteVar>(), flags, bindelementinfo.toCPointer<ByteVar>())

public actual fun DhcpSetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer(serveripaddress.toCPointer<ByteVar>(), subnetaddress, timedelayinmilliseconds)

public actual fun DhcpSetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo(serveripaddress.toCPointer<ByteVar>(), subnetaddress, subnetinfo.toCPointer<ByteVar>())

public actual fun DhcpSetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpSetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ(serveripaddress.toCPointer<ByteVar>(), subnetaddress, subnetinfo.toCPointer<ByteVar>())

public actual fun DhcpSetSuperScopeV4(serveripaddress: PCWSTR, subnetaddress: UInt, superscopename: PCWSTR, changeexisting: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4(serveripaddress.toCPointer<ByteVar>(), subnetaddress, superscopename.toCPointer<ByteVar>(), changeexisting)

public actual fun DhcpSetThreadOptions(flags: UInt, reserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions(flags, reserved.toCPointer<ByteVar>())

public actual fun DhcpUndoRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, requestidstr: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams(flags, reserved.toCPointer<ByteVar>(), adaptername.toCPointer<ByteVar>(), requestidstr.toCPointer<ByteVar>())

public actual fun DhcpV4AddPolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange(serveripaddress.toCPointer<ByteVar>(), subnetaddress, policyname.toCPointer<ByteVar>(), range.toCPointer<ByteVar>())

public actual fun DhcpV4CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpV4CreateClientInfoEx(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpV4CreatePolicy(serveripaddress: PCWSTR, ppolicy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy(serveripaddress.toCPointer<ByteVar>(), ppolicy.toCPointer<ByteVar>())

public actual fun DhcpV4CreatePolicyEx(serveripaddress: PCWSTR, policyex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx(serveripaddress.toCPointer<ByteVar>(), policyex.toCPointer<ByteVar>())

public actual fun DhcpV4DeletePolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy(serveripaddress.toCPointer<ByteVar>(), fglobalpolicy, subnetaddress, policyname.toCPointer<ByteVar>())

public actual fun DhcpV4EnumPolicies(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, fglobalpolicy, subnetaddress, enuminfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpV4EnumPoliciesEx(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, globalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, globalpolicy, subnetaddress, enuminfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpV4EnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpV4EnumSubnetClientsEx(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, clientinfo.toCPointer<ByteVar>(), clientsread.toCPointer<ByteVar>(), clientstotal.toCPointer<ByteVar>())

public actual fun DhcpV4EnumSubnetReservations(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations(serveripaddress.toCPointer<ByteVar>(), subnetaddress, resumehandle.toCPointer<ByteVar>(), preferredmaximum, enumelementinfo.toCPointer<ByteVar>(), elementsread.toCPointer<ByteVar>(), elementstotal.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverAddScopeToRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship(serveripaddress.toCPointer<ByteVar>(), prelationship.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverCreateRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship(serveripaddress.toCPointer<ByteVar>(), prelationship.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverDeleteRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship(serveripaddress.toCPointer<ByteVar>(), prelationshipname.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress.toCPointer<ByteVar>(), prelationship.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverEnumRelationship(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, prelationship: Long, relationshipread: Long, relationshiptotal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship(serveripaddress.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>(), preferredmaximum, prelationship.toCPointer<ByteVar>(), relationshipread.toCPointer<ByteVar>(), relationshiptotal.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverGetAddressStatus(serveripaddress: PCWSTR, subnetaddress: UInt, pstatus: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus(serveripaddress.toCPointer<ByteVar>(), subnetaddress, pstatus.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverGetRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR, prelationship: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship(serveripaddress.toCPointer<ByteVar>(), prelationshipname.toCPointer<ByteVar>(), prelationship.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverGetScopeRelationship(serveripaddress: PCWSTR, scopeid: UInt, prelationship: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship(serveripaddress.toCPointer<ByteVar>(), scopeid, prelationship.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverGetScopeStatistics(serveripaddress: PCWSTR, scopeid: UInt, pstats: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics(serveripaddress.toCPointer<ByteVar>(), scopeid, pstats.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverGetSystemTime(serveripaddress: PCWSTR, ptime: Long, pmaxalloweddeltatime: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime(serveripaddress.toCPointer<ByteVar>(), ptime.toCPointer<ByteVar>(), pmaxalloweddeltatime.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverSetRelationship(serveripaddress: PCWSTR, flags: UInt, prelationship: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship(serveripaddress.toCPointer<ByteVar>(), flags, prelationship.toCPointer<ByteVar>())

public actual fun DhcpV4FailoverTriggerAddrAllocation(serveripaddress: PCWSTR, pfailrelname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation(serveripaddress.toCPointer<ByteVar>(), pfailrelname.toCPointer<ByteVar>())

public actual fun DhcpV4GetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues(serveripaddress.toCPointer<ByteVar>(), flags, scopeinfo.toCPointer<ByteVar>(), values.toCPointer<ByteVar>())

public actual fun DhcpV4GetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpV4GetClientInfoEx(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx(serveripaddress.toCPointer<ByteVar>(), searchinfo.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpV4GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress(serveripaddress.toCPointer<ByteVar>(), scopeid, startip, endip, numfreeaddrreq, ipaddrlist.toCPointer<ByteVar>())

public actual fun DhcpV4GetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue(serveripaddress.toCPointer<ByteVar>(), flags, optionid, policyname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpV4GetPolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy(serveripaddress.toCPointer<ByteVar>(), fglobalpolicy, subnetaddress, policyname.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun DhcpV4GetPolicyEx(serveripaddress: PCWSTR, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx(serveripaddress.toCPointer<ByteVar>(), globalpolicy, subnetaddress, policyname.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun DhcpV4QueryPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enabled: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement(serveripaddress.toCPointer<ByteVar>(), fglobalpolicy, subnetaddress, enabled.toCPointer<ByteVar>())

public actual fun DhcpV4RemoveOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue(serveripaddress.toCPointer<ByteVar>(), flags, optionid, policyname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>())

public actual fun DhcpV4RemovePolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange(serveripaddress.toCPointer<ByteVar>(), subnetaddress, policyname.toCPointer<ByteVar>(), range.toCPointer<ByteVar>())

public actual fun DhcpV4SetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue(serveripaddress.toCPointer<ByteVar>(), flags, optionid, policyname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalue.toCPointer<ByteVar>())

public actual fun DhcpV4SetOptionValues(serveripaddress: PCWSTR, flags: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues(serveripaddress.toCPointer<ByteVar>(), flags, policyname.toCPointer<ByteVar>(), vendorname.toCPointer<ByteVar>(), scopeinfo.toCPointer<ByteVar>(), optionvalues.toCPointer<ByteVar>())

public actual fun DhcpV4SetPolicy(serveripaddress: PCWSTR, fieldsmodified: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy(serveripaddress.toCPointer<ByteVar>(), fieldsmodified, fglobalpolicy, subnetaddress, policyname.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun DhcpV4SetPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enable: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement(serveripaddress.toCPointer<ByteVar>(), fglobalpolicy, subnetaddress, enable)

public actual fun DhcpV4SetPolicyEx(serveripaddress: PCWSTR, fieldsmodified: UInt, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx(serveripaddress.toCPointer<ByteVar>(), fieldsmodified, globalpolicy, subnetaddress, policyname.toCPointer<ByteVar>(), policy.toCPointer<ByteVar>())

public actual fun DhcpV6CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo(serveripaddress.toCPointer<ByteVar>(), clientinfo.toCPointer<ByteVar>())

public actual fun DhcpV6GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: DHCP_IPV6_ADDRESS, startip: DHCP_IPV6_ADDRESS, endip: DHCP_IPV6_ADDRESS, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    0u

public actual fun DhcpV6GetStatelessStatistics(serveripaddress: PCWSTR, statelessstats: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics(serveripaddress.toCPointer<ByteVar>(), statelessstats.toCPointer<ByteVar>())

public actual fun DhcpV6GetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, params: Long): UInt =
    0u

public actual fun DhcpV6SetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, fieldmodified: UInt, params: Long): UInt =
    0u

public actual fun Dhcpv6CApiCleanup() {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup()
}

public actual fun Dhcpv6CApiInitialize(version: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize(version.toCPointer<ByteVar>())
}

public actual fun Dhcpv6ReleasePrefix(adaptername: PCWSTR, classid: Long, leaseinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix(adaptername.toCPointer<ByteVar>(), classid.toCPointer<ByteVar>(), leaseinfo.toCPointer<ByteVar>())

public actual fun Dhcpv6RenewPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix(adaptername.toCPointer<ByteVar>(), pclassid.toCPointer<ByteVar>(), prefixleaseinfo.toCPointer<ByteVar>(), pdwtimetowait.toCPointer<ByteVar>(), bvalidateprefix)

public actual fun Dhcpv6RequestParams(forcenewinform: BOOL, reserved: Long, adaptername: PCWSTR, classid: Long, recdparams: DHCPV6CAPI_PARAMS_ARRAY, buffer: Long, psize: Long): UInt =
    0u

public actual fun Dhcpv6RequestPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp.cinterop.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix(adaptername.toCPointer<ByteVar>(), pclassid.toCPointer<ByteVar>(), prefixleaseinfo.toCPointer<ByteVar>(), pdwtimetowait.toCPointer<ByteVar>())
