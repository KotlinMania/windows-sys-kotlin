package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: COpaquePointer?, forceflag: Bool): UInt

public expect fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt

public expect fun dhcpAddServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt

public expect fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt

public expect fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt

public expect fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt

public expect fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: COpaquePointer?): UInt

public expect fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: COpaquePointer?, diskcheckinterval: COpaquePointer?, maxlogfilessize: COpaquePointer?, minspaceondisk: COpaquePointer?): UInt

public expect fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt

public expect fun dhcpCApiCleanup()

public expect fun dhcpCApiInitialize(version: COpaquePointer?): UInt

public expect fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt

public expect fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt

public expect fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt

public expect fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt

public expect fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt

public expect fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpDeRegisterParamChange(flags: UInt, reserved: COpaquePointer?, event: COpaquePointer?): UInt

public expect fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt

public expect fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt

public expect fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: COpaquePointer?): UInt

public expect fun dhcpDeleteServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt

public expect fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt

public expect fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt

public expect fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt

public expect fun dhcpDsCleanup()

public expect fun dhcpDsInit(): UInt

public expect fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt

public expect fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt

public expect fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt

public expect fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt

public expect fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt

public expect fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt

public expect fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt

public expect fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt

public expect fun dhcpEnumServers(flags: UInt, idinfo: COpaquePointer?, servers: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt

public expect fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt

public expect fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt

public expect fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt

public expect fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: COpaquePointer?, filledclassinfo: COpaquePointer?): UInt

public expect fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: COpaquePointer?): UInt

public expect fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt

public expect fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt

public expect fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt

public expect fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt

public expect fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt

public expect fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt

public expect fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt

public expect fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: COpaquePointer?): UInt

public expect fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt

public expect fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt

public expect fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: COpaquePointer?): UInt

public expect fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: COpaquePointer?): UInt

public expect fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: COpaquePointer?): UInt

public expect fun dhcpGetThreadOptions(pflags: COpaquePointer?, reserved: COpaquePointer?): UInt

public expect fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: COpaquePointer?, minorversion: COpaquePointer?): UInt

public expect fun dhcpHlprAddV4PolicyCondition(policy: COpaquePointer?, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: COpaquePointer?, valuelength: UInt, conditionindex: COpaquePointer?): UInt

public expect fun dhcpHlprAddV4PolicyExpr(policy: COpaquePointer?, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: COpaquePointer?): UInt

public expect fun dhcpHlprAddV4PolicyRange(policy: COpaquePointer?, range: COpaquePointer?): UInt

public expect fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt

public expect fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt

public expect fun dhcpHlprFindV4DhcpProperty(propertyarray: COpaquePointer?, id: DhcpPropertyId, type: DhcpPropertyType): COpaquePointer?

public expect fun dhcpHlprFreeV4DhcpProperty(property: COpaquePointer?)

public expect fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: COpaquePointer?)

public expect fun dhcpHlprFreeV4Policy(policy: COpaquePointer?)

public expect fun dhcpHlprFreeV4PolicyArray(policyarray: COpaquePointer?)

public expect fun dhcpHlprFreeV4PolicyEx(policyex: COpaquePointer?)

public expect fun dhcpHlprFreeV4PolicyExArray(policyexarray: COpaquePointer?)

public expect fun dhcpHlprIsV4PolicySingleUC(policy: COpaquePointer?): Bool

public expect fun dhcpHlprIsV4PolicyValid(ppolicy: COpaquePointer?): UInt

public expect fun dhcpHlprIsV4PolicyWellFormed(ppolicy: COpaquePointer?): Bool

public expect fun dhcpHlprModifyV4PolicyExpr(policy: COpaquePointer?, operator: DhcpPolLogicOper): UInt

public expect fun dhcpHlprResetV4PolicyExpr(policy: COpaquePointer?): UInt

public expect fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt

public expect fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt

public expect fun dhcpRegisterParamChange(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, params: DhcpcapiParamsArray, handle: COpaquePointer?): UInt

public expect fun dhcpRemoveDNSRegistrations(): UInt

public expect fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt

public expect fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt

public expect fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt

public expect fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?): UInt

public expect fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt

public expect fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt

public expect fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?, requestidstr: Pcwstr): UInt

public expect fun dhcpRpcFreeMemory(bufferpointer: COpaquePointer?)

public expect fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: COpaquePointer?): UInt

public expect fun dhcpServerAuditlogParamsFree(configinfo: COpaquePointer?)

public expect fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt

public expect fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: COpaquePointer?): UInt

public expect fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: COpaquePointer?, pdhcpattribarr: COpaquePointer?): UInt

public expect fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt

public expect fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt

public expect fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt

public expect fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, fieldstoset: UInt, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt

public expect fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt

public expect fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt

public expect fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt

public expect fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt

public expect fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt

public expect fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt

public expect fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt

public expect fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt

public expect fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt

public expect fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt

public expect fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt

public expect fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt

public expect fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt

public expect fun dhcpSetThreadOptions(flags: UInt, reserved: COpaquePointer?): UInt

public expect fun dhcpUndoRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, requestidstr: Pcwstr): UInt

public expect fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt

public expect fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: COpaquePointer?): UInt

public expect fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: COpaquePointer?): UInt

public expect fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt

public expect fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt

public expect fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt

public expect fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt

public expect fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt

public expect fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt

public expect fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt

public expect fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, prelationship: COpaquePointer?, relationshipread: COpaquePointer?, relationshiptotal: COpaquePointer?): UInt

public expect fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: COpaquePointer?): UInt

public expect fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: COpaquePointer?): UInt

public expect fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: COpaquePointer?): UInt

public expect fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: COpaquePointer?): UInt

public expect fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: COpaquePointer?, pmaxalloweddeltatime: COpaquePointer?): UInt

public expect fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: COpaquePointer?): UInt

public expect fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt

public expect fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt

public expect fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt

public expect fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt

public expect fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt

public expect fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt

public expect fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: COpaquePointer?): UInt

public expect fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt

public expect fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt

public expect fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt

public expect fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt

public expect fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt

public expect fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt

public expect fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt

public expect fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt

public expect fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt

public expect fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: COpaquePointer?): UInt

public expect fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: COpaquePointer?): UInt

public expect fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: COpaquePointer?): UInt

public expect fun dhcpv6CApiCleanup()

public expect fun dhcpv6CApiInitialize(version: COpaquePointer?)

public expect fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: COpaquePointer?, leaseinfo: COpaquePointer?): UInt

public expect fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?, bvalidateprefix: UInt): UInt

public expect fun dhcpv6RequestParams(forcenewinform: Bool, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, recdparams: Dhcpv6capiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?): UInt

public expect fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?): UInt
