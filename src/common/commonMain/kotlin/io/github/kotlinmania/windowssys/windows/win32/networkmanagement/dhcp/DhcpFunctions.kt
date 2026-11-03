package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun DhcpAddFilterV4(serveripaddress: PCWSTR, addfilterinfo: Long, forceflag: BOOL): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddFilterV4", longArrayOf(serveripaddress, addfilterinfo, forceflag.toLong())).toUInt()
}

public fun DhcpAddSecurityGroup(pserver: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddSecurityGroup", longArrayOf(pserver)).toUInt()
}

public fun DhcpAddServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddServer", longArrayOf(flags.toLong(), idinfo, newserver, callbackfn, callbackdata)).toUInt()
}

public fun DhcpAddSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddSubnetElement", longArrayOf(serveripaddress, subnetaddress.toLong(), addelementinfo)).toUInt()
}

public fun DhcpAddSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddSubnetElementV4", longArrayOf(serveripaddress, subnetaddress.toLong(), addelementinfo)).toUInt()
}

public fun DhcpAddSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddSubnetElementV5", longArrayOf(serveripaddress, subnetaddress.toLong(), addelementinfo)).toUInt()
}

public fun DhcpAddSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, addelementinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAddSubnetElementV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), addelementinfo)).toUInt()
}

public fun DhcpAuditLogGetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAuditLogGetParams", longArrayOf(serveripaddress, flags.toLong(), auditlogdir, diskcheckinterval, maxlogfilessize, minspaceondisk)).toUInt()
}

public fun DhcpAuditLogSetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: PCWSTR, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpAuditLogSetParams", longArrayOf(serveripaddress, flags.toLong(), auditlogdir, diskcheckinterval.toLong(), maxlogfilessize.toLong(), minspaceondisk.toLong())).toUInt()
}

public fun DhcpCApiCleanup() {
    Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpCApiCleanup", longArrayOf())
}

public fun DhcpCApiInitialize(version: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpCApiInitialize", longArrayOf(version)).toUInt()
}

public fun DhcpCreateClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateClass", longArrayOf(serveripaddress, reservedmustbezero.toLong(), classinfo)).toUInt()
}

public fun DhcpCreateClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateClassV6", longArrayOf(serveripaddress, reservedmustbezero.toLong(), classinfo)).toUInt()
}

public fun DhcpCreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateClientInfo", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpCreateClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateClientInfoV4", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpCreateClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateClientInfoVQ", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpCreateOption(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateOption", longArrayOf(serveripaddress, optionid.toLong(), optioninfo)).toUInt()
}

public fun DhcpCreateOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateOptionV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, optioninfo)).toUInt()
}

public fun DhcpCreateOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateOptionV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, optioninfo)).toUInt()
}

public fun DhcpCreateSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateSubnet", longArrayOf(serveripaddress, subnetaddress.toLong(), subnetinfo)).toUInt()
}

public fun DhcpCreateSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateSubnetV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), subnetinfo)).toUInt()
}

public fun DhcpCreateSubnetVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpCreateSubnetVQ", longArrayOf(serveripaddress, subnetaddress.toLong(), subnetinfo)).toUInt()
}

public fun DhcpDeRegisterParamChange(flags: UInt, reserved: Long, event: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpDeRegisterParamChange", longArrayOf(flags.toLong(), reserved, event)).toUInt()
}

public fun DhcpDeleteClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteClass", longArrayOf(serveripaddress, reservedmustbezero.toLong(), classname)).toUInt()
}

public fun DhcpDeleteClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteClassV6", longArrayOf(serveripaddress, reservedmustbezero.toLong(), classname)).toUInt()
}

public fun DhcpDeleteClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteClientInfo", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpDeleteClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteClientInfoV6", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpDeleteFilterV4(serveripaddress: PCWSTR, deletefilterinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteFilterV4", longArrayOf(serveripaddress, deletefilterinfo)).toUInt()
}

public fun DhcpDeleteServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteServer", longArrayOf(flags.toLong(), idinfo, newserver, callbackfn, callbackdata)).toUInt()
}

public fun DhcpDeleteSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, forceflag: DHCP_FORCE_FLAG): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteSubnet", longArrayOf(serveripaddress, subnetaddress.toLong(), forceflag.toLong())).toUInt()
}

public fun DhcpDeleteSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, forceflag: DHCP_FORCE_FLAG): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteSubnetV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), forceflag.toLong())).toUInt()
}

public fun DhcpDeleteSuperScopeV4(serveripaddress: PCWSTR, superscopename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDeleteSuperScopeV4", longArrayOf(serveripaddress, superscopename)).toUInt()
}

public fun DhcpDsCleanup() {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDsCleanup", longArrayOf())
}

public fun DhcpDsInit(): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpDsInit", longArrayOf()).toUInt()
}

public fun DhcpEnumClasses(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumClasses", longArrayOf(serveripaddress, reservedmustbezero.toLong(), resumehandle, preferredmaximum.toLong(), classinfoarray, nread, ntotal)).toUInt()
}

public fun DhcpEnumClassesV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumClassesV6", longArrayOf(serveripaddress, reservedmustbezero.toLong(), resumehandle, preferredmaximum.toLong(), classinfoarray, nread, ntotal)).toUInt()
}

public fun DhcpEnumFilterV4(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, listtype: DHCP_FILTER_LIST_TYPE, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumFilterV4", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), listtype.toLong(), enumfilterinfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpEnumOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumOptionValues", longArrayOf(serveripaddress, scopeinfo, resumehandle, preferredmaximum.toLong(), optionvalues, optionsread, optionstotal)).toUInt()
}

public fun DhcpEnumOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumOptionValuesV5", longArrayOf(serveripaddress, flags.toLong(), classname, vendorname, scopeinfo, resumehandle, preferredmaximum.toLong(), optionvalues, optionsread, optionstotal)).toUInt()
}

public fun DhcpEnumOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumOptionValuesV6", longArrayOf(serveripaddress, flags.toLong(), classname, vendorname, scopeinfo, resumehandle, preferredmaximum.toLong(), optionvalues, optionsread, optionstotal)).toUInt()
}

public fun DhcpEnumOptions(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumOptions", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), options, optionsread, optionstotal)).toUInt()
}

public fun DhcpEnumOptionsV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumOptionsV5", longArrayOf(serveripaddress, flags.toLong(), classname, vendorname, resumehandle, preferredmaximum.toLong(), options, optionsread, optionstotal)).toUInt()
}

public fun DhcpEnumOptionsV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumOptionsV6", longArrayOf(serveripaddress, flags.toLong(), classname, vendorname, resumehandle, preferredmaximum.toLong(), options, optionsread, optionstotal)).toUInt()
}

public fun DhcpEnumServers(flags: UInt, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumServers", longArrayOf(flags.toLong(), idinfo, servers, callbackfn, callbackdata)).toUInt()
}

public fun DhcpEnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetClients", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetClientsFilterStatusInfo", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpEnumSubnetClientsV4(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetClientsV4", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpEnumSubnetClientsV5(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetClientsV5", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpEnumSubnetClientsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetClientsV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpEnumSubnetClientsVQ(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetClientsVQ", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpEnumSubnetElements(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetElements", longArrayOf(serveripaddress, subnetaddress.toLong(), enumelementtype.toLong(), resumehandle, preferredmaximum.toLong(), enumelementinfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpEnumSubnetElementsV4(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetElementsV4", longArrayOf(serveripaddress, subnetaddress.toLong(), enumelementtype.toLong(), resumehandle, preferredmaximum.toLong(), enumelementinfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpEnumSubnetElementsV5(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetElementsV5", longArrayOf(serveripaddress, subnetaddress.toLong(), enumelementtype.toLong(), resumehandle, preferredmaximum.toLong(), enumelementinfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpEnumSubnetElementsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE_V6, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetElementsV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), enumelementtype.toLong(), resumehandle, preferredmaximum.toLong(), enumelementinfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpEnumSubnets(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnets", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), enuminfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpEnumSubnetsV6(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpEnumSubnetsV6", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), enuminfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpGetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetAllOptionValues", longArrayOf(serveripaddress, flags.toLong(), scopeinfo, values)).toUInt()
}

public fun DhcpGetAllOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetAllOptionValuesV6", longArrayOf(serveripaddress, flags.toLong(), scopeinfo, values)).toUInt()
}

public fun DhcpGetAllOptions(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetAllOptions", longArrayOf(serveripaddress, flags.toLong(), optionstruct)).toUInt()
}

public fun DhcpGetAllOptionsV6(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetAllOptionsV6", longArrayOf(serveripaddress, flags.toLong(), optionstruct)).toUInt()
}

public fun DhcpGetClassInfo(serveripaddress: PCWSTR, reservedmustbezero: UInt, partialclassinfo: Long, filledclassinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetClassInfo", longArrayOf(serveripaddress, reservedmustbezero.toLong(), partialclassinfo, filledclassinfo)).toUInt()
}

public fun DhcpGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetClientInfo", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpGetClientInfoV4(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetClientInfoV4", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpGetClientInfoV6(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetClientInfoV6", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpGetClientInfoVQ(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetClientInfoVQ", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpGetClientOptions(serveripaddress: PCWSTR, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetClientOptions", longArrayOf(serveripaddress, clientipaddress.toLong(), clientsubnetmask.toLong(), clientoptions)).toUInt()
}

public fun DhcpGetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetFilterV4", longArrayOf(serveripaddress, globalfilterinfo)).toUInt()
}

public fun DhcpGetMibInfo(serveripaddress: PCWSTR, mibinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetMibInfo", longArrayOf(serveripaddress, mibinfo)).toUInt()
}

public fun DhcpGetMibInfoV5(serveripaddress: PCWSTR, mibinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetMibInfoV5", longArrayOf(serveripaddress, mibinfo)).toUInt()
}

public fun DhcpGetMibInfoV6(serveripaddress: PCWSTR, mibinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetMibInfoV6", longArrayOf(serveripaddress, mibinfo)).toUInt()
}

public fun DhcpGetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetOptionInfo", longArrayOf(serveripaddress, optionid.toLong(), optioninfo)).toUInt()
}

public fun DhcpGetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetOptionInfoV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, optioninfo)).toUInt()
}

public fun DhcpGetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetOptionInfoV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, optioninfo)).toUInt()
}

public fun DhcpGetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetOptionValue", longArrayOf(serveripaddress, optionid.toLong(), scopeinfo, optionvalue)).toUInt()
}

public fun DhcpGetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetOptionValueV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, scopeinfo, optionvalue)).toUInt()
}

public fun DhcpGetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetOptionValueV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, scopeinfo, optionvalue)).toUInt()
}

public fun DhcpGetOriginalSubnetMask(sadaptername: PCWSTR, dwsubnetmask: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpGetOriginalSubnetMask", longArrayOf(sadaptername, dwsubnetmask)).toUInt()
}

public fun DhcpGetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetServerBindingInfo", longArrayOf(serveripaddress, flags.toLong(), bindelementsinfo)).toUInt()
}

public fun DhcpGetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetServerBindingInfoV6", longArrayOf(serveripaddress, flags.toLong(), bindelementsinfo)).toUInt()
}

public fun DhcpGetServerSpecificStrings(serveripaddress: PCWSTR, serverspecificstrings: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetServerSpecificStrings", longArrayOf(serveripaddress, serverspecificstrings)).toUInt()
}

public fun DhcpGetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetSubnetDelayOffer", longArrayOf(serveripaddress, subnetaddress.toLong(), timedelayinmilliseconds)).toUInt()
}

public fun DhcpGetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetSubnetInfo", longArrayOf(serveripaddress, subnetaddress.toLong(), subnetinfo)).toUInt()
}

public fun DhcpGetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetSubnetInfoV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), subnetinfo)).toUInt()
}

public fun DhcpGetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetSubnetInfoVQ", longArrayOf(serveripaddress, subnetaddress.toLong(), subnetinfo)).toUInt()
}

public fun DhcpGetSuperScopeInfoV4(serveripaddress: PCWSTR, superscopetable: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetSuperScopeInfoV4", longArrayOf(serveripaddress, superscopetable)).toUInt()
}

public fun DhcpGetThreadOptions(pflags: Long, reserved: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetThreadOptions", longArrayOf(pflags, reserved)).toUInt()
}

public fun DhcpGetVersion(serveripaddress: PCWSTR, majorversion: Long, minorversion: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpGetVersion", longArrayOf(serveripaddress, majorversion, minorversion)).toUInt()
}

public fun DhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: UInt, type: DHCP_POL_ATTR_TYPE, optionid: UInt, suboptionid: UInt, vendorname: PCWSTR, operator: DHCP_POL_COMPARATOR, value: Long, valuelength: UInt, conditionindex: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprAddV4PolicyCondition", longArrayOf(policy, parentexpr.toLong(), type.toLong(), optionid.toLong(), suboptionid.toLong(), vendorname, operator.toLong(), value, valuelength.toLong(), conditionindex)).toUInt()
}

public fun DhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: UInt, operator: DHCP_POL_LOGIC_OPER, exprindex: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprAddV4PolicyExpr", longArrayOf(policy, parentexpr.toLong(), operator.toLong(), exprindex)).toUInt()
}

public fun DhcpHlprAddV4PolicyRange(policy: Long, range: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprAddV4PolicyRange", longArrayOf(policy, range)).toUInt()
}

public fun DhcpHlprCreateV4Policy(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprCreateV4Policy", longArrayOf(policyname, fglobalpolicy.toLong(), subnet.toLong(), processingorder.toLong(), rootoperator.toLong(), description, enabled.toLong(), policy)).toUInt()
}

public fun DhcpHlprCreateV4PolicyEx(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprCreateV4PolicyEx", longArrayOf(policyname, fglobalpolicy.toLong(), subnet.toLong(), processingorder.toLong(), rootoperator.toLong(), description, enabled.toLong(), policy)).toUInt()
}

public fun DhcpHlprFindV4DhcpProperty(propertyarray: Long, id: DHCP_PROPERTY_ID, type: DHCP_PROPERTY_TYPE): Long {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFindV4DhcpProperty", longArrayOf(propertyarray, id.toLong(), type.toLong()))
}

public fun DhcpHlprFreeV4DhcpProperty(property: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFreeV4DhcpProperty", longArrayOf(property))
}

public fun DhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFreeV4DhcpPropertyArray", longArrayOf(propertyarray))
}

public fun DhcpHlprFreeV4Policy(policy: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFreeV4Policy", longArrayOf(policy))
}

public fun DhcpHlprFreeV4PolicyArray(policyarray: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFreeV4PolicyArray", longArrayOf(policyarray))
}

public fun DhcpHlprFreeV4PolicyEx(policyex: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFreeV4PolicyEx", longArrayOf(policyex))
}

public fun DhcpHlprFreeV4PolicyExArray(policyexarray: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprFreeV4PolicyExArray", longArrayOf(policyexarray))
}

public fun DhcpHlprIsV4PolicySingleUC(policy: Long): BOOL {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprIsV4PolicySingleUC", longArrayOf(policy)).toInt()
}

public fun DhcpHlprIsV4PolicyValid(ppolicy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprIsV4PolicyValid", longArrayOf(ppolicy)).toUInt()
}

public fun DhcpHlprIsV4PolicyWellFormed(ppolicy: Long): BOOL {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprIsV4PolicyWellFormed", longArrayOf(ppolicy)).toInt()
}

public fun DhcpHlprModifyV4PolicyExpr(policy: Long, operator: DHCP_POL_LOGIC_OPER): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprModifyV4PolicyExpr", longArrayOf(policy, operator.toLong())).toUInt()
}

public fun DhcpHlprResetV4PolicyExpr(policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpHlprResetV4PolicyExpr", longArrayOf(policy)).toUInt()
}

public fun DhcpModifyClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpModifyClass", longArrayOf(serveripaddress, reservedmustbezero.toLong(), classinfo)).toUInt()
}

public fun DhcpModifyClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpModifyClassV6", longArrayOf(serveripaddress, reservedmustbezero.toLong(), classinfo)).toUInt()
}

public fun DhcpRegisterParamChange(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, params: DHCPCAPI_PARAMS_ARRAY, handle: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpRegisterParamChange", longArrayOf(flags.toLong(), reserved, adaptername, classid, Win32DynamicFfi.objectSlot(params), handle)).toUInt()
}

public fun DhcpRemoveDNSRegistrations(): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpRemoveDNSRegistrations", longArrayOf()).toUInt()
}

public fun DhcpRemoveOption(serveripaddress: PCWSTR, optionid: UInt): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveOption", longArrayOf(serveripaddress, optionid.toLong())).toUInt()
}

public fun DhcpRemoveOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveOptionV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname)).toUInt()
}

public fun DhcpRemoveOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveOptionV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname)).toUInt()
}

public fun DhcpRemoveOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveOptionValue", longArrayOf(serveripaddress, optionid.toLong(), scopeinfo)).toUInt()
}

public fun DhcpRemoveOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveOptionValueV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, scopeinfo)).toUInt()
}

public fun DhcpRemoveOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveOptionValueV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, scopeinfo)).toUInt()
}

public fun DhcpRemoveSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveSubnetElement", longArrayOf(serveripaddress, subnetaddress.toLong(), removeelementinfo, forceflag.toLong())).toUInt()
}

public fun DhcpRemoveSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveSubnetElementV4", longArrayOf(serveripaddress, subnetaddress.toLong(), removeelementinfo, forceflag.toLong())).toUInt()
}

public fun DhcpRemoveSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveSubnetElementV5", longArrayOf(serveripaddress, subnetaddress.toLong(), removeelementinfo, forceflag.toLong())).toUInt()
}

public fun DhcpRemoveSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRemoveSubnetElementV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), removeelementinfo, forceflag.toLong())).toUInt()
}

public fun DhcpRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, sendparams: DHCPCAPI_PARAMS_ARRAY, recdparams: DHCPCAPI_PARAMS_ARRAY, buffer: Long, psize: Long, requestidstr: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpRequestParams", longArrayOf(flags.toLong(), reserved, adaptername, classid, Win32DynamicFfi.objectSlot(sendparams), Win32DynamicFfi.objectSlot(recdparams), buffer, psize, requestidstr)).toUInt()
}

public fun DhcpRpcFreeMemory(bufferpointer: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpRpcFreeMemory", longArrayOf(bufferpointer))
}

public fun DhcpScanDatabase(serveripaddress: PCWSTR, subnetaddress: UInt, fixflag: UInt, scanlist: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpScanDatabase", longArrayOf(serveripaddress, subnetaddress.toLong(), fixflag.toLong(), scanlist)).toUInt()
}

public fun DhcpServerAuditlogParamsFree(configinfo: Long) {
    Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerAuditlogParamsFree", longArrayOf(configinfo))
}

public fun DhcpServerBackupDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerBackupDatabase", longArrayOf(serveripaddress, path)).toUInt()
}

public fun DhcpServerGetConfig(serveripaddress: PCWSTR, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerGetConfig", longArrayOf(serveripaddress, configinfo)).toUInt()
}

public fun DhcpServerGetConfigV4(serveripaddress: PCWSTR, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerGetConfigV4", longArrayOf(serveripaddress, configinfo)).toUInt()
}

public fun DhcpServerGetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerGetConfigV6", longArrayOf(serveripaddress, scopeinfo, configinfo)).toUInt()
}

public fun DhcpServerGetConfigVQ(serveripaddress: PCWSTR, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerGetConfigVQ", longArrayOf(serveripaddress, configinfo)).toUInt()
}

public fun DhcpServerQueryAttribute(serveripaddr: PCWSTR, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerQueryAttribute", longArrayOf(serveripaddr, dwreserved.toLong(), dhcpattribid.toLong(), pdhcpattrib)).toUInt()
}

public fun DhcpServerQueryAttributes(serveripaddr: PCWSTR, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: Long, pdhcpattribarr: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerQueryAttributes", longArrayOf(serveripaddr, dwreserved.toLong(), dwattribcount.toLong(), pdhcpattribs, pdhcpattribarr)).toUInt()
}

public fun DhcpServerQueryDnsRegCredentials(serveripaddress: PCWSTR, unamesize: UInt, uname: PWSTR, domainsize: UInt, domain: PWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerQueryDnsRegCredentials", longArrayOf(serveripaddress, unamesize.toLong(), uname, domainsize.toLong(), domain)).toUInt()
}

public fun DhcpServerRedoAuthorization(serveripaddr: PCWSTR, dwreserved: UInt): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerRedoAuthorization", longArrayOf(serveripaddr, dwreserved.toLong())).toUInt()
}

public fun DhcpServerRestoreDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerRestoreDatabase", longArrayOf(serveripaddress, path)).toUInt()
}

public fun DhcpServerSetConfig(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerSetConfig", longArrayOf(serveripaddress, fieldstoset.toLong(), configinfo)).toUInt()
}

public fun DhcpServerSetConfigV4(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerSetConfigV4", longArrayOf(serveripaddress, fieldstoset.toLong(), configinfo)).toUInt()
}

public fun DhcpServerSetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, fieldstoset: UInt, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerSetConfigV6", longArrayOf(serveripaddress, scopeinfo, fieldstoset.toLong(), configinfo)).toUInt()
}

public fun DhcpServerSetConfigVQ(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerSetConfigVQ", longArrayOf(serveripaddress, fieldstoset.toLong(), configinfo)).toUInt()
}

public fun DhcpServerSetDnsRegCredentials(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerSetDnsRegCredentials", longArrayOf(serveripaddress, uname, domain, passwd)).toUInt()
}

public fun DhcpServerSetDnsRegCredentialsV5(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpServerSetDnsRegCredentialsV5", longArrayOf(serveripaddress, uname, domain, passwd)).toUInt()
}

public fun DhcpSetClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetClientInfo", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpSetClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetClientInfoV4", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpSetClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetClientInfoV6", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpSetClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetClientInfoVQ", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpSetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetFilterV4", longArrayOf(serveripaddress, globalfilterinfo)).toUInt()
}

public fun DhcpSetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionInfo", longArrayOf(serveripaddress, optionid.toLong(), optioninfo)).toUInt()
}

public fun DhcpSetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionInfoV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, optioninfo)).toUInt()
}

public fun DhcpSetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionInfoV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, optioninfo)).toUInt()
}

public fun DhcpSetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionValue", longArrayOf(serveripaddress, optionid.toLong(), scopeinfo, optionvalue)).toUInt()
}

public fun DhcpSetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionValueV5", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, scopeinfo, optionvalue)).toUInt()
}

public fun DhcpSetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionValueV6", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), classname, vendorname, scopeinfo, optionvalue)).toUInt()
}

public fun DhcpSetOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionValues", longArrayOf(serveripaddress, scopeinfo, optionvalues)).toUInt()
}

public fun DhcpSetOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetOptionValuesV5", longArrayOf(serveripaddress, flags.toLong(), classname, vendorname, scopeinfo, optionvalues)).toUInt()
}

public fun DhcpSetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetServerBindingInfo", longArrayOf(serveripaddress, flags.toLong(), bindelementinfo)).toUInt()
}

public fun DhcpSetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetServerBindingInfoV6", longArrayOf(serveripaddress, flags.toLong(), bindelementinfo)).toUInt()
}

public fun DhcpSetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetSubnetDelayOffer", longArrayOf(serveripaddress, subnetaddress.toLong(), timedelayinmilliseconds.toLong())).toUInt()
}

public fun DhcpSetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetSubnetInfo", longArrayOf(serveripaddress, subnetaddress.toLong(), subnetinfo)).toUInt()
}

public fun DhcpSetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetSubnetInfoV6", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(subnetaddress), subnetinfo)).toUInt()
}

public fun DhcpSetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetSubnetInfoVQ", longArrayOf(serveripaddress, subnetaddress.toLong(), subnetinfo)).toUInt()
}

public fun DhcpSetSuperScopeV4(serveripaddress: PCWSTR, subnetaddress: UInt, superscopename: PCWSTR, changeexisting: BOOL): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetSuperScopeV4", longArrayOf(serveripaddress, subnetaddress.toLong(), superscopename, changeexisting.toLong())).toUInt()
}

public fun DhcpSetThreadOptions(flags: UInt, reserved: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpSetThreadOptions", longArrayOf(flags.toLong(), reserved)).toUInt()
}

public fun DhcpUndoRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, requestidstr: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "DhcpUndoRequestParams", longArrayOf(flags.toLong(), reserved, adaptername, requestidstr)).toUInt()
}

public fun DhcpV4AddPolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4AddPolicyRange", longArrayOf(serveripaddress, subnetaddress.toLong(), policyname, range)).toUInt()
}

public fun DhcpV4CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4CreateClientInfo", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpV4CreateClientInfoEx(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4CreateClientInfoEx", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpV4CreatePolicy(serveripaddress: PCWSTR, ppolicy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4CreatePolicy", longArrayOf(serveripaddress, ppolicy)).toUInt()
}

public fun DhcpV4CreatePolicyEx(serveripaddress: PCWSTR, policyex: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4CreatePolicyEx", longArrayOf(serveripaddress, policyex)).toUInt()
}

public fun DhcpV4DeletePolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4DeletePolicy", longArrayOf(serveripaddress, fglobalpolicy.toLong(), subnetaddress.toLong(), policyname)).toUInt()
}

public fun DhcpV4EnumPolicies(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4EnumPolicies", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), fglobalpolicy.toLong(), subnetaddress.toLong(), enuminfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpV4EnumPoliciesEx(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, globalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4EnumPoliciesEx", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), globalpolicy.toLong(), subnetaddress.toLong(), enuminfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpV4EnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4EnumSubnetClients", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpV4EnumSubnetClientsEx(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4EnumSubnetClientsEx", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), clientinfo, clientsread, clientstotal)).toUInt()
}

public fun DhcpV4EnumSubnetReservations(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4EnumSubnetReservations", longArrayOf(serveripaddress, subnetaddress.toLong(), resumehandle, preferredmaximum.toLong(), enumelementinfo, elementsread, elementstotal)).toUInt()
}

public fun DhcpV4FailoverAddScopeToRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverAddScopeToRelationship", longArrayOf(serveripaddress, prelationship)).toUInt()
}

public fun DhcpV4FailoverCreateRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverCreateRelationship", longArrayOf(serveripaddress, prelationship)).toUInt()
}

public fun DhcpV4FailoverDeleteRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverDeleteRelationship", longArrayOf(serveripaddress, prelationshipname)).toUInt()
}

public fun DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverDeleteScopeFromRelationship", longArrayOf(serveripaddress, prelationship)).toUInt()
}

public fun DhcpV4FailoverEnumRelationship(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, prelationship: Long, relationshipread: Long, relationshiptotal: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverEnumRelationship", longArrayOf(serveripaddress, resumehandle, preferredmaximum.toLong(), prelationship, relationshipread, relationshiptotal)).toUInt()
}

public fun DhcpV4FailoverGetAddressStatus(serveripaddress: PCWSTR, subnetaddress: UInt, pstatus: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverGetAddressStatus", longArrayOf(serveripaddress, subnetaddress.toLong(), pstatus)).toUInt()
}

public fun DhcpV4FailoverGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverGetClientInfo", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpV4FailoverGetRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR, prelationship: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverGetRelationship", longArrayOf(serveripaddress, prelationshipname, prelationship)).toUInt()
}

public fun DhcpV4FailoverGetScopeRelationship(serveripaddress: PCWSTR, scopeid: UInt, prelationship: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverGetScopeRelationship", longArrayOf(serveripaddress, scopeid.toLong(), prelationship)).toUInt()
}

public fun DhcpV4FailoverGetScopeStatistics(serveripaddress: PCWSTR, scopeid: UInt, pstats: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverGetScopeStatistics", longArrayOf(serveripaddress, scopeid.toLong(), pstats)).toUInt()
}

public fun DhcpV4FailoverGetSystemTime(serveripaddress: PCWSTR, ptime: Long, pmaxalloweddeltatime: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverGetSystemTime", longArrayOf(serveripaddress, ptime, pmaxalloweddeltatime)).toUInt()
}

public fun DhcpV4FailoverSetRelationship(serveripaddress: PCWSTR, flags: UInt, prelationship: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverSetRelationship", longArrayOf(serveripaddress, flags.toLong(), prelationship)).toUInt()
}

public fun DhcpV4FailoverTriggerAddrAllocation(serveripaddress: PCWSTR, pfailrelname: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4FailoverTriggerAddrAllocation", longArrayOf(serveripaddress, pfailrelname)).toUInt()
}

public fun DhcpV4GetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetAllOptionValues", longArrayOf(serveripaddress, flags.toLong(), scopeinfo, values)).toUInt()
}

public fun DhcpV4GetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetClientInfo", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpV4GetClientInfoEx(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetClientInfoEx", longArrayOf(serveripaddress, searchinfo, clientinfo)).toUInt()
}

public fun DhcpV4GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetFreeIPAddress", longArrayOf(serveripaddress, scopeid.toLong(), startip.toLong(), endip.toLong(), numfreeaddrreq.toLong(), ipaddrlist)).toUInt()
}

public fun DhcpV4GetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetOptionValue", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), policyname, vendorname, scopeinfo, optionvalue)).toUInt()
}

public fun DhcpV4GetPolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetPolicy", longArrayOf(serveripaddress, fglobalpolicy.toLong(), subnetaddress.toLong(), policyname, policy)).toUInt()
}

public fun DhcpV4GetPolicyEx(serveripaddress: PCWSTR, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4GetPolicyEx", longArrayOf(serveripaddress, globalpolicy.toLong(), subnetaddress.toLong(), policyname, policy)).toUInt()
}

public fun DhcpV4QueryPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enabled: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4QueryPolicyEnforcement", longArrayOf(serveripaddress, fglobalpolicy.toLong(), subnetaddress.toLong(), enabled)).toUInt()
}

public fun DhcpV4RemoveOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4RemoveOptionValue", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), policyname, vendorname, scopeinfo)).toUInt()
}

public fun DhcpV4RemovePolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4RemovePolicyRange", longArrayOf(serveripaddress, subnetaddress.toLong(), policyname, range)).toUInt()
}

public fun DhcpV4SetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4SetOptionValue", longArrayOf(serveripaddress, flags.toLong(), optionid.toLong(), policyname, vendorname, scopeinfo, optionvalue)).toUInt()
}

public fun DhcpV4SetOptionValues(serveripaddress: PCWSTR, flags: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4SetOptionValues", longArrayOf(serveripaddress, flags.toLong(), policyname, vendorname, scopeinfo, optionvalues)).toUInt()
}

public fun DhcpV4SetPolicy(serveripaddress: PCWSTR, fieldsmodified: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4SetPolicy", longArrayOf(serveripaddress, fieldsmodified.toLong(), fglobalpolicy.toLong(), subnetaddress.toLong(), policyname, policy)).toUInt()
}

public fun DhcpV4SetPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enable: BOOL): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4SetPolicyEnforcement", longArrayOf(serveripaddress, fglobalpolicy.toLong(), subnetaddress.toLong(), enable.toLong())).toUInt()
}

public fun DhcpV4SetPolicyEx(serveripaddress: PCWSTR, fieldsmodified: UInt, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV4SetPolicyEx", longArrayOf(serveripaddress, fieldsmodified.toLong(), globalpolicy.toLong(), subnetaddress.toLong(), policyname, policy)).toUInt()
}

public fun DhcpV6CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV6CreateClientInfo", longArrayOf(serveripaddress, clientinfo)).toUInt()
}

public fun DhcpV6GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: DHCP_IPV6_ADDRESS, startip: DHCP_IPV6_ADDRESS, endip: DHCP_IPV6_ADDRESS, numfreeaddrreq: UInt, ipaddrlist: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV6GetFreeIPAddress", longArrayOf(serveripaddress, Win32DynamicFfi.objectSlot(scopeid), Win32DynamicFfi.objectSlot(startip), Win32DynamicFfi.objectSlot(endip), numfreeaddrreq.toLong(), ipaddrlist)).toUInt()
}

public fun DhcpV6GetStatelessStatistics(serveripaddress: PCWSTR, statelessstats: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV6GetStatelessStatistics", longArrayOf(serveripaddress, statelessstats)).toUInt()
}

public fun DhcpV6GetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, params: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV6GetStatelessStoreParams", longArrayOf(serveripaddress, fserverlevel.toLong(), Win32DynamicFfi.objectSlot(subnetaddress), params)).toUInt()
}

public fun DhcpV6SetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, fieldmodified: UInt, params: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpsapi.dll", "DhcpV6SetStatelessStoreParams", longArrayOf(serveripaddress, fserverlevel.toLong(), Win32DynamicFfi.objectSlot(subnetaddress), fieldmodified.toLong(), params)).toUInt()
}

public fun Dhcpv6CApiCleanup() {
    Win32DynamicFfi.invoke("dhcpcsvc6.dll", "Dhcpv6CApiCleanup", longArrayOf())
}

public fun Dhcpv6CApiInitialize(version: Long) {
    Win32DynamicFfi.invoke("dhcpcsvc6.dll", "Dhcpv6CApiInitialize", longArrayOf(version))
}

public fun Dhcpv6ReleasePrefix(adaptername: PCWSTR, classid: Long, leaseinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc6.dll", "Dhcpv6ReleasePrefix", longArrayOf(adaptername, classid, leaseinfo)).toUInt()
}

public fun Dhcpv6RenewPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: UInt): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc6.dll", "Dhcpv6RenewPrefix", longArrayOf(adaptername, pclassid, prefixleaseinfo, pdwtimetowait, bvalidateprefix.toLong())).toUInt()
}

public fun Dhcpv6RequestParams(forcenewinform: BOOL, reserved: Long, adaptername: PCWSTR, classid: Long, recdparams: DHCPV6CAPI_PARAMS_ARRAY, buffer: Long, psize: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc6.dll", "Dhcpv6RequestParams", longArrayOf(forcenewinform.toLong(), reserved, adaptername, classid, Win32DynamicFfi.objectSlot(recdparams), buffer, psize)).toUInt()
}

public fun Dhcpv6RequestPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc6.dll", "Dhcpv6RequestPrefix", longArrayOf(adaptername, pclassid, prefixleaseinfo, pdwtimetowait)).toUInt()
}
