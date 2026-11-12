package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public expect fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: ConstPtr<DhcpFilterAddInfo>, forceflag: Bool): UInt

public expect fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt

public expect fun dhcpAddServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt

public expect fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementData>): UInt

public expect fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV4>): UInt

public expect fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV5>): UInt

public expect fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: MutPtr<DhcpSubnetElementDataV6>): UInt

public expect fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: MutPtr<Pwstr>, diskcheckinterval: MutPtr<UInt>, maxlogfilessize: MutPtr<UInt>, minspaceondisk: MutPtr<UInt>): UInt

public expect fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt

public expect fun dhcpCApiCleanup()

public expect fun dhcpCApiInitialize(version: MutPtr<UInt>): UInt

public expect fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt

public expect fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt

public expect fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt

public expect fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt

public expect fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt

public expect fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt

public expect fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt

public expect fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt

public expect fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt

public expect fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt

public expect fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt

public expect fun dhcpDeRegisterParamChange(flags: UInt, reserved: MutPtr<CVoid>, event: MutPtr<CVoid>): UInt

public expect fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt

public expect fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt

public expect fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfo>): UInt

public expect fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfoV6>): UInt

public expect fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: ConstPtr<DhcpAddrPattern>): UInt

public expect fun dhcpDeleteServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt

public expect fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt

public expect fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt

public expect fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt

public expect fun dhcpDsCleanup()

public expect fun dhcpDsInit(): UInt

public expect fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArray>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArrayV6>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: MutPtr<DhcpAddrPattern>, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: MutPtr<MutPtr<DhcpFilterEnumInfo>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumServers(flags: UInt, idinfo: MutPtr<CVoid>, servers: MutPtr<MutPtr<DhcpdsServers>>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt

public expect fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientFilterStatusInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV4>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV5>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: MutPtr<DhcpIpv6Address>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV6>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayVq>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV4>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV5>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV6>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<DhcpIpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<Dhcpv6IpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt

public expect fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt

public expect fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt

public expect fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt

public expect fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: MutPtr<DhcpClassInfo>, filledclassinfo: MutPtr<MutPtr<DhcpClassInfo>>): UInt

public expect fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfo>>): UInt

public expect fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV4>>): UInt

public expect fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfoV6>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV6>>): UInt

public expect fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoVq>>): UInt

public expect fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: MutPtr<MutPtr<DhcpOptionList>>): UInt

public expect fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: MutPtr<DhcpFilterGlobalInfo>): UInt

public expect fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfo>>): UInt

public expect fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV5>>): UInt

public expect fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV6>>): UInt

public expect fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt

public expect fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt

public expect fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt

public expect fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt

public expect fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt

public expect fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt

public expect fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: MutPtr<UInt>): UInt

public expect fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<DhcpBindElementArray>>): UInt

public expect fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<Dhcpv6BindElementArray>>): UInt

public expect fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: MutPtr<MutPtr<DhcpServerSpecificStrings>>): UInt

public expect fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: MutPtr<UShort>): UInt

public expect fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfo>>): UInt

public expect fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoV6>>): UInt

public expect fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoVq>>): UInt

public expect fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: MutPtr<MutPtr<DhcpSuperScopeTable>>): UInt

public expect fun dhcpGetThreadOptions(pflags: MutPtr<UInt>, reserved: MutPtr<CVoid>): UInt

public expect fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>): UInt

public expect fun dhcpHlprAddV4PolicyCondition(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: ConstPtr<UByte>, valuelength: UInt, conditionindex: MutPtr<UInt>): UInt

public expect fun dhcpHlprAddV4PolicyExpr(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: MutPtr<UInt>): UInt

public expect fun dhcpHlprAddV4PolicyRange(policy: MutPtr<DhcpPolicy>, range: ConstPtr<DhcpIpRange>): UInt

public expect fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt

public expect fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt

public expect fun dhcpHlprFindV4DhcpProperty(propertyarray: ConstPtr<DhcpPropertyArray>, id: DhcpPropertyId, type: DhcpPropertyType): MutPtr<DhcpProperty>

public expect fun dhcpHlprFreeV4DhcpProperty(property: MutPtr<DhcpProperty>)

public expect fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: MutPtr<DhcpPropertyArray>)

public expect fun dhcpHlprFreeV4Policy(policy: MutPtr<DhcpPolicy>)

public expect fun dhcpHlprFreeV4PolicyArray(policyarray: MutPtr<DhcpPolicyArray>)

public expect fun dhcpHlprFreeV4PolicyEx(policyex: MutPtr<DhcpPolicyEx>)

public expect fun dhcpHlprFreeV4PolicyExArray(policyexarray: MutPtr<DhcpPolicyExArray>)

public expect fun dhcpHlprIsV4PolicySingleUC(policy: ConstPtr<DhcpPolicy>): Bool

public expect fun dhcpHlprIsV4PolicyValid(ppolicy: ConstPtr<DhcpPolicy>): UInt

public expect fun dhcpHlprIsV4PolicyWellFormed(ppolicy: ConstPtr<DhcpPolicy>): Bool

public expect fun dhcpHlprModifyV4PolicyExpr(policy: MutPtr<DhcpPolicy>, operator: DhcpPolLogicOper): UInt

public expect fun dhcpHlprResetV4PolicyExpr(policy: MutPtr<DhcpPolicy>): UInt

public expect fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt

public expect fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt

public expect fun dhcpRegisterParamChange(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, params: DhcpcapiParamsArray, handle: MutPtr<CVoid>): UInt

public expect fun dhcpRemoveDNSRegistrations(): UInt

public expect fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt

public expect fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt

public expect fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt

public expect fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>): UInt

public expect fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt

public expect fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>): UInt

public expect fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementData>, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV4>, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV5>, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: MutPtr<DhcpSubnetElementDataV6>, forceflag: DhcpForceFlag): UInt

public expect fun dhcpRequestParams(flags: UInt, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>, requestidstr: Pcwstr): UInt

public expect fun dhcpRpcFreeMemory(bufferpointer: MutPtr<CVoid>)

public expect fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: MutPtr<MutPtr<DhcpScanList>>): UInt

public expect fun dhcpServerAuditlogParamsFree(configinfo: MutPtr<DhcpServerConfigInfoVq>)

public expect fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt

public expect fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfo>>): UInt

public expect fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV4>>): UInt

public expect fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV6>>): UInt

public expect fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoVq>>): UInt

public expect fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: MutPtr<MutPtr<DhcpAttrib>>): UInt

public expect fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: MutPtr<UInt>, pdhcpattribarr: MutPtr<MutPtr<DhcpAttribArray>>): UInt

public expect fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt

public expect fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt

public expect fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt

public expect fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfo>): UInt

public expect fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV4>): UInt

public expect fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV6>): UInt

public expect fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoVq>): UInt

public expect fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt

public expect fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt

public expect fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt

public expect fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt

public expect fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt

public expect fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt

public expect fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: ConstPtr<DhcpFilterGlobalInfo>): UInt

public expect fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt

public expect fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt

public expect fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt

public expect fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: ConstPtr<DhcpOptionData>): UInt

public expect fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt

public expect fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<DhcpOptionData>): UInt

public expect fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalues: ConstPtr<DhcpOptionValueArray>): UInt

public expect fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt

public expect fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<DhcpBindElementArray>): UInt

public expect fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<Dhcpv6BindElementArray>): UInt

public expect fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt

public expect fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt

public expect fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt

public expect fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt

public expect fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt

public expect fun dhcpSetThreadOptions(flags: UInt, reserved: MutPtr<CVoid>): UInt

public expect fun dhcpUndoRequestParams(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, requestidstr: Pcwstr): UInt

public expect fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt

public expect fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoPb>): UInt

public expect fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoEx>): UInt

public expect fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: ConstPtr<DhcpPolicy>): UInt

public expect fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: ConstPtr<DhcpPolicyEx>): UInt

public expect fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt

public expect fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyExArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoPbArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoExArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt

public expect fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpReservationInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt

public expect fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt

public expect fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt

public expect fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt

public expect fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt

public expect fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationshipArray>>, relationshipread: MutPtr<UInt>, relationshiptotal: MutPtr<UInt>): UInt

public expect fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: MutPtr<UInt>): UInt

public expect fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>>): UInt

public expect fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt

public expect fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt

public expect fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: MutPtr<MutPtr<DhcpFailoverStatistics>>): UInt

public expect fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: MutPtr<UInt>, pmaxalloweddeltatime: MutPtr<UInt>): UInt

public expect fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt

public expect fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt

public expect fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValuesPb>>): UInt

public expect fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoPb>>): UInt

public expect fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoEx>>): UInt

public expect fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<DhcpIpArray>>): UInt

public expect fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt

public expect fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt

public expect fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt

public expect fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: MutPtr<Bool>): UInt

public expect fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt

public expect fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt

public expect fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt

public expect fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt

public expect fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicy>): UInt

public expect fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt

public expect fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicyEx>): UInt

public expect fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt

public expect fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<Dhcpv6IpArray>>): UInt

public expect fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: MutPtr<MutPtr<Dhcpv6StatelessStats>>): UInt

public expect fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: MutPtr<MutPtr<Dhcpv6StatelessParams>>): UInt

public expect fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: ConstPtr<Dhcpv6StatelessParams>): UInt

public expect fun dhcpv6CApiCleanup()

public expect fun dhcpv6CApiInitialize(version: MutPtr<UInt>)

public expect fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, leaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>): UInt

public expect fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>, bvalidateprefix: UInt): UInt

public expect fun dhcpv6RequestParams(forcenewinform: Bool, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, recdparams: Dhcpv6capiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>): UInt

public expect fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>): UInt
