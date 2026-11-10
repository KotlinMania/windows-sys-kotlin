@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: COpaquePointer?, forceflag: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAddServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: COpaquePointer?, diskcheckinterval: COpaquePointer?, maxlogfilessize: COpaquePointer?, minspaceondisk: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCApiCleanup() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpCApiInitialize(version: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: COpaquePointer?, event: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpDsCleanup() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpDsInit(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumServers(flags: UInt, idinfo: COpaquePointer?, servers: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: COpaquePointer?, filledclassinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetThreadOptions(pflags: COpaquePointer?, reserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: COpaquePointer?, minorversion: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprAddV4PolicyCondition(policy: COpaquePointer?, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: COpaquePointer?, valuelength: UInt, conditionindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprAddV4PolicyExpr(policy: COpaquePointer?, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprAddV4PolicyRange(policy: COpaquePointer?, range: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: COpaquePointer?, id: DhcpPropertyId, type: DhcpPropertyType): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprFreeV4DhcpProperty(property: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpHlprFreeV4Policy(policy: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpHlprFreeV4PolicyEx(policyex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpHlprIsV4PolicySingleUC(policy: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprModifyV4PolicyExpr(policy: COpaquePointer?, operator: DhcpPolLogicOper): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpHlprResetV4PolicyExpr(policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, params: DhcpcapiParamsArray, handle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpRpcFreeMemory(bufferpointer: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerAuditlogParamsFree(configinfo: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: COpaquePointer?, pdhcpattribarr: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, prelationship: COpaquePointer?, relationshipread: COpaquePointer?, relationshiptotal: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: COpaquePointer?, pmaxalloweddeltatime: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpv6CApiCleanup() {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpv6CApiInitialize(version: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: COpaquePointer?, leaseinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?, bvalidateprefix: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, recdparams: Dhcpv6capiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
