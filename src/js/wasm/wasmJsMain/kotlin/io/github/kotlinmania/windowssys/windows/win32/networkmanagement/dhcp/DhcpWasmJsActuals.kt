@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public actual fun DhcpAddFilterV4(serveripaddress: PCWSTR, addfilterinfo: Long, forceflag: BOOL): UInt =
    0u

public actual fun DhcpAddSecurityGroup(pserver: PCWSTR): UInt =
    0u

public actual fun DhcpAddServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    0u

public actual fun DhcpAddSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAddSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAddSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAddSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAuditLogGetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): UInt =
    0u

public actual fun DhcpAuditLogSetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: PCWSTR, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    0u

public actual fun DhcpCApiCleanup() {
}

public actual fun DhcpCApiInitialize(version: Long): UInt =
    0u

public actual fun DhcpCreateClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    0u

public actual fun DhcpCreateClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    0u

public actual fun DhcpCreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpCreateClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpCreateClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpCreateOption(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    0u

public actual fun DhcpCreateOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    0u

public actual fun DhcpCreateOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    0u

public actual fun DhcpCreateSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    0u

public actual fun DhcpCreateSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpCreateSubnetVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    0u

public actual fun DhcpDeRegisterParamChange(flags: UInt, reserved: Long, event: Long): UInt =
    0u

public actual fun DhcpDeleteClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    0u

public actual fun DhcpDeleteClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    0u

public actual fun DhcpDeleteClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpDeleteClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpDeleteFilterV4(serveripaddress: PCWSTR, deletefilterinfo: Long): UInt =
    0u

public actual fun DhcpDeleteServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    0u

public actual fun DhcpDeleteSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpDeleteSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpDeleteSuperScopeV4(serveripaddress: PCWSTR, superscopename: PCWSTR): UInt =
    0u

public actual fun DhcpDsCleanup() {
}

public actual fun DhcpDsInit(): UInt =
    0u

public actual fun DhcpEnumClasses(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    0u

public actual fun DhcpEnumClassesV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    0u

public actual fun DhcpEnumFilterV4(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, listtype: DHCP_FILTER_LIST_TYPE, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    0u

public actual fun DhcpEnumOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    0u

public actual fun DhcpEnumOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    0u

public actual fun DhcpEnumOptions(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    0u

public actual fun DhcpEnumOptionsV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    0u

public actual fun DhcpEnumOptionsV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    0u

public actual fun DhcpEnumServers(flags: UInt, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsV4(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsV5(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsVQ(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetElements(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetElementsV4(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetElementsV5(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetElementsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE_V6, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnets(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetsV6(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpGetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    0u

public actual fun DhcpGetAllOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    0u

public actual fun DhcpGetAllOptions(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    0u

public actual fun DhcpGetAllOptionsV6(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    0u

public actual fun DhcpGetClassInfo(serveripaddress: PCWSTR, reservedmustbezero: UInt, partialclassinfo: Long, filledclassinfo: Long): UInt =
    0u

public actual fun DhcpGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpGetClientInfoV4(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpGetClientInfoV6(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpGetClientInfoVQ(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpGetClientOptions(serveripaddress: PCWSTR, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: Long): UInt =
    0u

public actual fun DhcpGetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    0u

public actual fun DhcpGetMibInfo(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    0u

public actual fun DhcpGetMibInfoV5(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    0u

public actual fun DhcpGetMibInfoV6(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    0u

public actual fun DhcpGetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    0u

public actual fun DhcpGetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    0u

public actual fun DhcpGetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    0u

public actual fun DhcpGetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpGetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpGetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpGetOriginalSubnetMask(sadaptername: PCWSTR, dwsubnetmask: Long): UInt =
    0u

public actual fun DhcpGetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    0u

public actual fun DhcpGetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    0u

public actual fun DhcpGetServerSpecificStrings(serveripaddress: PCWSTR, serverspecificstrings: Long): UInt =
    0u

public actual fun DhcpGetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: Long): UInt =
    0u

public actual fun DhcpGetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    0u

public actual fun DhcpGetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpGetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    0u

public actual fun DhcpGetSuperScopeInfoV4(serveripaddress: PCWSTR, superscopetable: Long): UInt =
    0u

public actual fun DhcpGetThreadOptions(pflags: Long, reserved: Long): UInt =
    0u

public actual fun DhcpGetVersion(serveripaddress: PCWSTR, majorversion: Long, minorversion: Long): UInt =
    0u

public actual fun DhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: UInt, type: DHCP_POL_ATTR_TYPE, optionid: UInt, suboptionid: UInt, vendorname: PCWSTR, operator: DHCP_POL_COMPARATOR, value: Long, valuelength: UInt, conditionindex: Long): UInt =
    0u

public actual fun DhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: UInt, operator: DHCP_POL_LOGIC_OPER, exprindex: Long): UInt =
    0u

public actual fun DhcpHlprAddV4PolicyRange(policy: Long, range: Long): UInt =
    0u

public actual fun DhcpHlprCreateV4Policy(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    0u

public actual fun DhcpHlprCreateV4PolicyEx(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    0u

public actual fun DhcpHlprFindV4DhcpProperty(propertyarray: Long, id: DHCP_PROPERTY_ID, type: DHCP_PROPERTY_TYPE): Long =
    0L

public actual fun DhcpHlprFreeV4DhcpProperty(property: Long) {
}

public actual fun DhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long) {
}

public actual fun DhcpHlprFreeV4Policy(policy: Long) {
}

public actual fun DhcpHlprFreeV4PolicyArray(policyarray: Long) {
}

public actual fun DhcpHlprFreeV4PolicyEx(policyex: Long) {
}

public actual fun DhcpHlprFreeV4PolicyExArray(policyexarray: Long) {
}

public actual fun DhcpHlprIsV4PolicySingleUC(policy: Long): BOOL =
    0

public actual fun DhcpHlprIsV4PolicyValid(ppolicy: Long): UInt =
    0u

public actual fun DhcpHlprIsV4PolicyWellFormed(ppolicy: Long): BOOL =
    0

public actual fun DhcpHlprModifyV4PolicyExpr(policy: Long, operator: DHCP_POL_LOGIC_OPER): UInt =
    0u

public actual fun DhcpHlprResetV4PolicyExpr(policy: Long): UInt =
    0u

public actual fun DhcpModifyClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    0u

public actual fun DhcpModifyClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    0u

public actual fun DhcpRegisterParamChange(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, params: DHCPCAPI_PARAMS_ARRAY, handle: Long): UInt =
    0u

public actual fun DhcpRemoveDNSRegistrations(): UInt =
    0u

public actual fun DhcpRemoveOption(serveripaddress: PCWSTR, optionid: UInt): UInt =
    0u

public actual fun DhcpRemoveOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    0u

public actual fun DhcpRemoveOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    0u

public actual fun DhcpRemoveOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long): UInt =
    0u

public actual fun DhcpRemoveOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    0u

public actual fun DhcpRemoveOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    0u

public actual fun DhcpRemoveSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRemoveSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRemoveSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRemoveSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, sendparams: DHCPCAPI_PARAMS_ARRAY, recdparams: DHCPCAPI_PARAMS_ARRAY, buffer: Long, psize: Long, requestidstr: PCWSTR): UInt =
    0u

public actual fun DhcpRpcFreeMemory(bufferpointer: Long) {
}

public actual fun DhcpScanDatabase(serveripaddress: PCWSTR, subnetaddress: UInt, fixflag: UInt, scanlist: Long): UInt =
    0u

public actual fun DhcpServerAuditlogParamsFree(configinfo: Long) {
}

public actual fun DhcpServerBackupDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    0u

public actual fun DhcpServerGetConfig(serveripaddress: PCWSTR, configinfo: Long): UInt =
    0u

public actual fun DhcpServerGetConfigV4(serveripaddress: PCWSTR, configinfo: Long): UInt =
    0u

public actual fun DhcpServerGetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, configinfo: Long): UInt =
    0u

public actual fun DhcpServerGetConfigVQ(serveripaddress: PCWSTR, configinfo: Long): UInt =
    0u

public actual fun DhcpServerQueryAttribute(serveripaddr: PCWSTR, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: Long): UInt =
    0u

public actual fun DhcpServerQueryAttributes(serveripaddr: PCWSTR, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: Long, pdhcpattribarr: Long): UInt =
    0u

public actual fun DhcpServerQueryDnsRegCredentials(serveripaddress: PCWSTR, unamesize: UInt, uname: PWSTR, domainsize: UInt, domain: PWSTR): UInt =
    0u

public actual fun DhcpServerRedoAuthorization(serveripaddr: PCWSTR, dwreserved: UInt): UInt =
    0u

public actual fun DhcpServerRestoreDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    0u

public actual fun DhcpServerSetConfig(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    0u

public actual fun DhcpServerSetConfigV4(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    0u

public actual fun DhcpServerSetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, fieldstoset: UInt, configinfo: Long): UInt =
    0u

public actual fun DhcpServerSetConfigVQ(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    0u

public actual fun DhcpServerSetDnsRegCredentials(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    0u

public actual fun DhcpServerSetDnsRegCredentialsV5(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    0u

public actual fun DhcpSetClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpSetClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpSetClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpSetClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpSetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    0u

public actual fun DhcpSetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    0u

public actual fun DhcpSetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    0u

public actual fun DhcpSetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    0u

public actual fun DhcpSetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpSetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpSetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpSetOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    0u

public actual fun DhcpSetOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    0u

public actual fun DhcpSetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    0u

public actual fun DhcpSetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    0u

public actual fun DhcpSetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    0u

public actual fun DhcpSetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    0u

public actual fun DhcpSetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpSetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    0u

public actual fun DhcpSetSuperScopeV4(serveripaddress: PCWSTR, subnetaddress: UInt, superscopename: PCWSTR, changeexisting: BOOL): UInt =
    0u

public actual fun DhcpSetThreadOptions(flags: UInt, reserved: Long): UInt =
    0u

public actual fun DhcpUndoRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, requestidstr: PCWSTR): UInt =
    0u

public actual fun DhcpV4AddPolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    0u

public actual fun DhcpV4CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpV4CreateClientInfoEx(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpV4CreatePolicy(serveripaddress: PCWSTR, ppolicy: Long): UInt =
    0u

public actual fun DhcpV4CreatePolicyEx(serveripaddress: PCWSTR, policyex: Long): UInt =
    0u

public actual fun DhcpV4DeletePolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR): UInt =
    0u

public actual fun DhcpV4EnumPolicies(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpV4EnumPoliciesEx(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, globalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpV4EnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpV4EnumSubnetClientsEx(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpV4EnumSubnetReservations(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpV4FailoverAddScopeToRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    0u

public actual fun DhcpV4FailoverCreateRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    0u

public actual fun DhcpV4FailoverDeleteRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR): UInt =
    0u

public actual fun DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    0u

public actual fun DhcpV4FailoverEnumRelationship(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, prelationship: Long, relationshipread: Long, relationshiptotal: Long): UInt =
    0u

public actual fun DhcpV4FailoverGetAddressStatus(serveripaddress: PCWSTR, subnetaddress: UInt, pstatus: Long): UInt =
    0u

public actual fun DhcpV4FailoverGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpV4FailoverGetRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR, prelationship: Long): UInt =
    0u

public actual fun DhcpV4FailoverGetScopeRelationship(serveripaddress: PCWSTR, scopeid: UInt, prelationship: Long): UInt =
    0u

public actual fun DhcpV4FailoverGetScopeStatistics(serveripaddress: PCWSTR, scopeid: UInt, pstats: Long): UInt =
    0u

public actual fun DhcpV4FailoverGetSystemTime(serveripaddress: PCWSTR, ptime: Long, pmaxalloweddeltatime: Long): UInt =
    0u

public actual fun DhcpV4FailoverSetRelationship(serveripaddress: PCWSTR, flags: UInt, prelationship: Long): UInt =
    0u

public actual fun DhcpV4FailoverTriggerAddrAllocation(serveripaddress: PCWSTR, pfailrelname: PCWSTR): UInt =
    0u

public actual fun DhcpV4GetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    0u

public actual fun DhcpV4GetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpV4GetClientInfoEx(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    0u

public actual fun DhcpV4GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    0u

public actual fun DhcpV4GetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpV4GetPolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    0u

public actual fun DhcpV4GetPolicyEx(serveripaddress: PCWSTR, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    0u

public actual fun DhcpV4QueryPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enabled: Long): UInt =
    0u

public actual fun DhcpV4RemoveOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    0u

public actual fun DhcpV4RemovePolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    0u

public actual fun DhcpV4SetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    0u

public actual fun DhcpV4SetOptionValues(serveripaddress: PCWSTR, flags: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    0u

public actual fun DhcpV4SetPolicy(serveripaddress: PCWSTR, fieldsmodified: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    0u

public actual fun DhcpV4SetPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enable: BOOL): UInt =
    0u

public actual fun DhcpV4SetPolicyEx(serveripaddress: PCWSTR, fieldsmodified: UInt, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    0u

public actual fun DhcpV6CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    0u

public actual fun DhcpV6GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: DHCP_IPV6_ADDRESS, startip: DHCP_IPV6_ADDRESS, endip: DHCP_IPV6_ADDRESS, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    0u

public actual fun DhcpV6GetStatelessStatistics(serveripaddress: PCWSTR, statelessstats: Long): UInt =
    0u

public actual fun DhcpV6GetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, params: Long): UInt =
    0u

public actual fun DhcpV6SetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, fieldmodified: UInt, params: Long): UInt =
    0u

public actual fun Dhcpv6CApiCleanup() {
}

public actual fun Dhcpv6CApiInitialize(version: Long) {
}

public actual fun Dhcpv6ReleasePrefix(adaptername: PCWSTR, classid: Long, leaseinfo: Long): UInt =
    0u

public actual fun Dhcpv6RenewPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: UInt): UInt =
    0u

public actual fun Dhcpv6RequestParams(forcenewinform: BOOL, reserved: Long, adaptername: PCWSTR, classid: Long, recdparams: DHCPV6CAPI_PARAMS_ARRAY, buffer: Long, psize: Long): UInt =
    0u

public actual fun Dhcpv6RequestPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): UInt =
    0u
