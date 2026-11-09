@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

private object WindowsWin32NetworkmanagementDhcpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4(serveripaddress: Long, addfilterinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup(pserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer(flags: Int, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams(serveripaddress: Long, flags: Int, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams(serveripaddress: Long, flags: Int, auditlogdir: Long, diskcheckinterval: Int, maxlogfilessize: Int, minspaceondisk: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize(version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange(flags: Int, reserved: Long, event: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass(serveripaddress: Long, reservedmustbezero: Int, classname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6(serveripaddress: Long, reservedmustbezero: Int, classname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4(serveripaddress: Long, deletefilterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer(flags: Int, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet(serveripaddress: Long, subnetaddress: Int, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4(serveripaddress: Long, superscopename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses(serveripaddress: Long, reservedmustbezero: Int, resumehandle: Long, preferredmaximum: Int, classinfoarray: Long, nread: Long, ntotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6(serveripaddress: Long, reservedmustbezero: Int, resumehandle: Long, preferredmaximum: Int, classinfoarray: Long, nread: Long, ntotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, listtype: Int, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues(serveripaddress: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers(flags: Int, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions(serveripaddress: Long, flags: Int, optionstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6(serveripaddress: Long, flags: Int, optionstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo(serveripaddress: Long, reservedmustbezero: Int, partialclassinfo: Long, filledclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions(serveripaddress: Long, clientipaddress: Int, clientsubnetmask: Int, clientoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4(serveripaddress: Long, globalfilterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask(sadaptername: Long, dwsubnetmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo(serveripaddress: Long, flags: Int, bindelementsinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6(serveripaddress: Long, flags: Int, bindelementsinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings(serveripaddress: Long, serverspecificstrings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer(serveripaddress: Long, subnetaddress: Int, timedelayinmilliseconds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4(serveripaddress: Long, superscopetable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions(pflags: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion(serveripaddress: Long, majorversion: Long, minorversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: Int, type: Int, optionid: Int, suboptionid: Int, vendorname: Long, operator: Int, value: Long, valuelength: Int, conditionindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: Int, operator: Int, exprindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange(policy: Long, range: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy(policyname: Long, fglobalpolicy: Int, subnet: Int, processingorder: Int, rootoperator: Int, description: Long, enabled: Int, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx(policyname: Long, fglobalpolicy: Int, subnet: Int, processingorder: Int, rootoperator: Int, description: Long, enabled: Int, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty(propertyarray: Long, id: Int, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty(property: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy(policy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray(policyarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx(policyex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray(policyexarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC(policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid(ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed(ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr(policy: Long, operator: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr(policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption(serveripaddress: Long, optionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory(bufferpointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase(serveripaddress: Long, subnetaddress: Int, fixflag: Int, scanlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree(configinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase(serveripaddress: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6(serveripaddress: Long, scopeinfo: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute(serveripaddr: Long, dwreserved: Int, dhcpattribid: Int, pdhcpattrib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes(serveripaddr: Long, dwreserved: Int, dwattribcount: Int, pdhcpattribs: Long, pdhcpattribarr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials(serveripaddress: Long, unamesize: Int, uname: Long, domainsize: Int, domain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization(serveripaddr: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase(serveripaddress: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6(serveripaddress: Long, scopeinfo: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials(serveripaddress: Long, uname: Long, domain: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5(serveripaddress: Long, uname: Long, domain: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4(serveripaddress: Long, globalfilterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues(serveripaddress: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo(serveripaddress: Long, flags: Int, bindelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6(serveripaddress: Long, flags: Int, bindelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer(serveripaddress: Long, subnetaddress: Int, timedelayinmilliseconds: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4(serveripaddress: Long, subnetaddress: Int, superscopename: Long, changeexisting: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions(flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams(flags: Int, reserved: Long, adaptername: Long, requestidstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange(serveripaddress: Long, subnetaddress: Int, policyname: Long, range: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy(serveripaddress: Long, ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx(serveripaddress: Long, policyex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, policyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, fglobalpolicy: Int, subnetaddress: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, globalpolicy: Int, subnetaddress: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship(serveripaddress: Long, prelationshipname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, prelationship: Long, relationshipread: Long, relationshiptotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus(serveripaddress: Long, subnetaddress: Int, pstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship(serveripaddress: Long, prelationshipname: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship(serveripaddress: Long, scopeid: Int, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics(serveripaddress: Long, scopeid: Int, pstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime(serveripaddress: Long, ptime: Long, pmaxalloweddeltatime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship(serveripaddress: Long, flags: Int, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation(serveripaddress: Long, pfailrelname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress(serveripaddress: Long, scopeid: Int, startip: Int, endip: Int, numfreeaddrreq: Int, ipaddrlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx(serveripaddress: Long, globalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange(serveripaddress: Long, subnetaddress: Int, policyname: Long, range: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues(serveripaddress: Long, flags: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy(serveripaddress: Long, fieldsmodified: Int, fglobalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, enable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx(serveripaddress: Long, fieldsmodified: Int, globalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics(serveripaddress: Long, statelessstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize(version: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix(adaptername: Long, classid: Long, leaseinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix(adaptername: Long, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix(adaptername: Long, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): Int
}

public actual fun DhcpAddFilterV4(serveripaddress: PCWSTR, addfilterinfo: Long, forceflag: BOOL): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddFilterV4(serveripaddress, addfilterinfo, forceflag).toUInt()

public actual fun DhcpAddSecurityGroup(pserver: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSecurityGroup(pserver).toUInt()

public actual fun DhcpAddServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddServer(flags.toInt(), idinfo, newserver, callbackfn, callbackdata).toUInt()

public actual fun DhcpAddSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElement(serveripaddress, subnetaddress.toInt(), addelementinfo).toUInt()

public actual fun DhcpAddSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV4(serveripaddress, subnetaddress.toInt(), addelementinfo).toUInt()

public actual fun DhcpAddSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, addelementinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAddSubnetElementV5(serveripaddress, subnetaddress.toInt(), addelementinfo).toUInt()

public actual fun DhcpAddSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, addelementinfo: Long): UInt =
    0u

public actual fun DhcpAuditLogGetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogGetParams(serveripaddress, flags.toInt(), auditlogdir, diskcheckinterval, maxlogfilessize, minspaceondisk).toUInt()

public actual fun DhcpAuditLogSetParams(serveripaddress: PCWSTR, flags: UInt, auditlogdir: PCWSTR, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpAuditLogSetParams(serveripaddress, flags.toInt(), auditlogdir, diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()).toUInt()

public actual fun DhcpCApiCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiCleanup()
}

public actual fun DhcpCApiInitialize(version: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCApiInitialize(version).toUInt()

public actual fun DhcpCreateClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClass(serveripaddress, reservedmustbezero.toInt(), classinfo).toUInt()

public actual fun DhcpCreateClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClassV6(serveripaddress, reservedmustbezero.toInt(), classinfo).toUInt()

public actual fun DhcpCreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfo(serveripaddress, clientinfo).toUInt()

public actual fun DhcpCreateClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoV4(serveripaddress, clientinfo).toUInt()

public actual fun DhcpCreateClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateClientInfoVQ(serveripaddress, clientinfo).toUInt()

public actual fun DhcpCreateOption(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOption(serveripaddress, optionid.toInt(), optioninfo).toUInt()

public actual fun DhcpCreateOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, optioninfo).toUInt()

public actual fun DhcpCreateOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateOptionV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, optioninfo).toUInt()

public actual fun DhcpCreateSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnet(serveripaddress, subnetaddress.toInt(), subnetinfo).toUInt()

public actual fun DhcpCreateSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpCreateSubnetVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpCreateSubnetVQ(serveripaddress, subnetaddress.toInt(), subnetinfo).toUInt()

public actual fun DhcpDeRegisterParamChange(flags: UInt, reserved: Long, event: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeRegisterParamChange(flags.toInt(), reserved, event).toUInt()

public actual fun DhcpDeleteClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClass(serveripaddress, reservedmustbezero.toInt(), classname).toUInt()

public actual fun DhcpDeleteClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClassV6(serveripaddress, reservedmustbezero.toInt(), classname).toUInt()

public actual fun DhcpDeleteClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfo(serveripaddress, clientinfo).toUInt()

public actual fun DhcpDeleteClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteClientInfoV6(serveripaddress, clientinfo).toUInt()

public actual fun DhcpDeleteFilterV4(serveripaddress: PCWSTR, deletefilterinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteFilterV4(serveripaddress, deletefilterinfo).toUInt()

public actual fun DhcpDeleteServer(flags: UInt, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteServer(flags.toInt(), idinfo, newserver, callbackfn, callbackdata).toUInt()

public actual fun DhcpDeleteSubnet(serveripaddress: PCWSTR, subnetaddress: UInt, forceflag: DHCP_FORCE_FLAG): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSubnet(serveripaddress, subnetaddress.toInt(), forceflag).toUInt()

public actual fun DhcpDeleteSubnetV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpDeleteSuperScopeV4(serveripaddress: PCWSTR, superscopename: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDeleteSuperScopeV4(serveripaddress, superscopename).toUInt()

public actual fun DhcpDsCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDsCleanup()
}

public actual fun DhcpDsInit(): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpDsInit().toUInt()

public actual fun DhcpEnumClasses(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClasses(serveripaddress, reservedmustbezero.toInt(), resumehandle, preferredmaximum.toInt(), classinfoarray, nread, ntotal).toUInt()

public actual fun DhcpEnumClassesV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, resumehandle: Long, preferredmaximum: UInt, classinfoarray: Long, nread: Long, ntotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumClassesV6(serveripaddress, reservedmustbezero.toInt(), resumehandle, preferredmaximum.toInt(), classinfoarray, nread, ntotal).toUInt()

public actual fun DhcpEnumFilterV4(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, listtype: DHCP_FILTER_LIST_TYPE, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumFilterV4(serveripaddress, resumehandle, preferredmaximum.toInt(), listtype, enumfilterinfo, elementsread, elementstotal).toUInt()

public actual fun DhcpEnumOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValues(serveripaddress, scopeinfo, resumehandle, preferredmaximum.toInt(), optionvalues, optionsread, optionstotal).toUInt()

public actual fun DhcpEnumOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV5(serveripaddress, flags.toInt(), classname, vendorname, scopeinfo, resumehandle, preferredmaximum.toInt(), optionvalues, optionsread, optionstotal).toUInt()

public actual fun DhcpEnumOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, resumehandle: Long, preferredmaximum: UInt, optionvalues: Long, optionsread: Long, optionstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionValuesV6(serveripaddress, flags.toInt(), classname, vendorname, scopeinfo, resumehandle, preferredmaximum.toInt(), optionvalues, optionsread, optionstotal).toUInt()

public actual fun DhcpEnumOptions(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptions(serveripaddress, resumehandle, preferredmaximum.toInt(), options, optionsread, optionstotal).toUInt()

public actual fun DhcpEnumOptionsV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV5(serveripaddress, flags.toInt(), classname, vendorname, resumehandle, preferredmaximum.toInt(), options, optionsread, optionstotal).toUInt()

public actual fun DhcpEnumOptionsV6(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, resumehandle: Long, preferredmaximum: UInt, options: Long, optionsread: Long, optionstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumOptionsV6(serveripaddress, flags.toInt(), classname, vendorname, resumehandle, preferredmaximum.toInt(), options, optionsread, optionstotal).toUInt()

public actual fun DhcpEnumServers(flags: UInt, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumServers(flags.toInt(), idinfo, servers, callbackfn, callbackdata).toUInt()

public actual fun DhcpEnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClients(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsFilterStatusInfo(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpEnumSubnetClientsV4(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV4(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpEnumSubnetClientsV5(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsV5(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpEnumSubnetClientsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnetClientsVQ(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetClientsVQ(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpEnumSubnetElements(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElements(serveripaddress, subnetaddress.toInt(), enumelementtype, resumehandle, preferredmaximum.toInt(), enumelementinfo, elementsread, elementstotal).toUInt()

public actual fun DhcpEnumSubnetElementsV4(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV4(serveripaddress, subnetaddress.toInt(), enumelementtype, resumehandle, preferredmaximum.toInt(), enumelementinfo, elementsread, elementstotal).toUInt()

public actual fun DhcpEnumSubnetElementsV5(serveripaddress: PCWSTR, subnetaddress: UInt, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetElementsV5(serveripaddress, subnetaddress.toInt(), enumelementtype, resumehandle, preferredmaximum.toInt(), enumelementinfo, elementsread, elementstotal).toUInt()

public actual fun DhcpEnumSubnetElementsV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, enumelementtype: DHCP_SUBNET_ELEMENT_TYPE_V6, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    0u

public actual fun DhcpEnumSubnets(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnets(serveripaddress, resumehandle, preferredmaximum.toInt(), enuminfo, elementsread, elementstotal).toUInt()

public actual fun DhcpEnumSubnetsV6(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpEnumSubnetsV6(serveripaddress, resumehandle, preferredmaximum.toInt(), enuminfo, elementsread, elementstotal).toUInt()

public actual fun DhcpGetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValues(serveripaddress, flags.toInt(), scopeinfo, values).toUInt()

public actual fun DhcpGetAllOptionValuesV6(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionValuesV6(serveripaddress, flags.toInt(), scopeinfo, values).toUInt()

public actual fun DhcpGetAllOptions(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptions(serveripaddress, flags.toInt(), optionstruct).toUInt()

public actual fun DhcpGetAllOptionsV6(serveripaddress: PCWSTR, flags: UInt, optionstruct: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetAllOptionsV6(serveripaddress, flags.toInt(), optionstruct).toUInt()

public actual fun DhcpGetClassInfo(serveripaddress: PCWSTR, reservedmustbezero: UInt, partialclassinfo: Long, filledclassinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClassInfo(serveripaddress, reservedmustbezero.toInt(), partialclassinfo, filledclassinfo).toUInt()

public actual fun DhcpGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfo(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpGetClientInfoV4(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV4(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpGetClientInfoV6(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoV6(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpGetClientInfoVQ(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientInfoVQ(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpGetClientOptions(serveripaddress: PCWSTR, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetClientOptions(serveripaddress, clientipaddress.toInt(), clientsubnetmask.toInt(), clientoptions).toUInt()

public actual fun DhcpGetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetFilterV4(serveripaddress, globalfilterinfo).toUInt()

public actual fun DhcpGetMibInfo(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfo(serveripaddress, mibinfo).toUInt()

public actual fun DhcpGetMibInfoV5(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV5(serveripaddress, mibinfo).toUInt()

public actual fun DhcpGetMibInfoV6(serveripaddress: PCWSTR, mibinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetMibInfoV6(serveripaddress, mibinfo).toUInt()

public actual fun DhcpGetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfo(serveripaddress, optionid.toInt(), optioninfo).toUInt()

public actual fun DhcpGetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, optioninfo).toUInt()

public actual fun DhcpGetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionInfoV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, optioninfo).toUInt()

public actual fun DhcpGetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValue(serveripaddress, optionid.toInt(), scopeinfo, optionvalue).toUInt()

public actual fun DhcpGetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, scopeinfo, optionvalue).toUInt()

public actual fun DhcpGetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOptionValueV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, scopeinfo, optionvalue).toUInt()

public actual fun DhcpGetOriginalSubnetMask(sadaptername: PCWSTR, dwsubnetmask: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetOriginalSubnetMask(sadaptername, dwsubnetmask).toUInt()

public actual fun DhcpGetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfo(serveripaddress, flags.toInt(), bindelementsinfo).toUInt()

public actual fun DhcpGetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementsinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerBindingInfoV6(serveripaddress, flags.toInt(), bindelementsinfo).toUInt()

public actual fun DhcpGetServerSpecificStrings(serveripaddress: PCWSTR, serverspecificstrings: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetServerSpecificStrings(serveripaddress, serverspecificstrings).toUInt()

public actual fun DhcpGetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetDelayOffer(serveripaddress, subnetaddress.toInt(), timedelayinmilliseconds).toUInt()

public actual fun DhcpGetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfo(serveripaddress, subnetaddress.toInt(), subnetinfo).toUInt()

public actual fun DhcpGetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpGetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSubnetInfoVQ(serveripaddress, subnetaddress.toInt(), subnetinfo).toUInt()

public actual fun DhcpGetSuperScopeInfoV4(serveripaddress: PCWSTR, superscopetable: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetSuperScopeInfoV4(serveripaddress, superscopetable).toUInt()

public actual fun DhcpGetThreadOptions(pflags: Long, reserved: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetThreadOptions(pflags, reserved).toUInt()

public actual fun DhcpGetVersion(serveripaddress: PCWSTR, majorversion: Long, minorversion: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpGetVersion(serveripaddress, majorversion, minorversion).toUInt()

public actual fun DhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: UInt, type: DHCP_POL_ATTR_TYPE, optionid: UInt, suboptionid: UInt, vendorname: PCWSTR, operator: DHCP_POL_COMPARATOR, value: Long, valuelength: UInt, conditionindex: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyCondition(policy, parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), vendorname, operator, value, valuelength.toInt(), conditionindex).toUInt()

public actual fun DhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: UInt, operator: DHCP_POL_LOGIC_OPER, exprindex: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyExpr(policy, parentexpr.toInt(), operator, exprindex).toUInt()

public actual fun DhcpHlprAddV4PolicyRange(policy: Long, range: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprAddV4PolicyRange(policy, range).toUInt()

public actual fun DhcpHlprCreateV4Policy(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4Policy(policyname, fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description, enabled, policy).toUInt()

public actual fun DhcpHlprCreateV4PolicyEx(policyname: PCWSTR, fglobalpolicy: BOOL, subnet: UInt, processingorder: UInt, rootoperator: DHCP_POL_LOGIC_OPER, description: PCWSTR, enabled: BOOL, policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprCreateV4PolicyEx(policyname, fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description, enabled, policy).toUInt()

public actual fun DhcpHlprFindV4DhcpProperty(propertyarray: Long, id: DHCP_PROPERTY_ID, type: DHCP_PROPERTY_TYPE): Long =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFindV4DhcpProperty(propertyarray, id, type)

public actual fun DhcpHlprFreeV4DhcpProperty(property: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpProperty(property)
}

public actual fun DhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4DhcpPropertyArray(propertyarray)
}

public actual fun DhcpHlprFreeV4Policy(policy: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4Policy(policy)
}

public actual fun DhcpHlprFreeV4PolicyArray(policyarray: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyArray(policyarray)
}

public actual fun DhcpHlprFreeV4PolicyEx(policyex: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyEx(policyex)
}

public actual fun DhcpHlprFreeV4PolicyExArray(policyexarray: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprFreeV4PolicyExArray(policyexarray)
}

public actual fun DhcpHlprIsV4PolicySingleUC(policy: Long): BOOL =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicySingleUC(policy)

public actual fun DhcpHlprIsV4PolicyValid(ppolicy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyValid(ppolicy).toUInt()

public actual fun DhcpHlprIsV4PolicyWellFormed(ppolicy: Long): BOOL =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprIsV4PolicyWellFormed(ppolicy)

public actual fun DhcpHlprModifyV4PolicyExpr(policy: Long, operator: DHCP_POL_LOGIC_OPER): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprModifyV4PolicyExpr(policy, operator).toUInt()

public actual fun DhcpHlprResetV4PolicyExpr(policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpHlprResetV4PolicyExpr(policy).toUInt()

public actual fun DhcpModifyClass(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClass(serveripaddress, reservedmustbezero.toInt(), classinfo).toUInt()

public actual fun DhcpModifyClassV6(serveripaddress: PCWSTR, reservedmustbezero: UInt, classinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpModifyClassV6(serveripaddress, reservedmustbezero.toInt(), classinfo).toUInt()

public actual fun DhcpRegisterParamChange(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, params: DHCPCAPI_PARAMS_ARRAY, handle: Long): UInt =
    0u

public actual fun DhcpRemoveDNSRegistrations(): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveDNSRegistrations().toUInt()

public actual fun DhcpRemoveOption(serveripaddress: PCWSTR, optionid: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOption(serveripaddress, optionid.toInt()).toUInt()

public actual fun DhcpRemoveOptionV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname).toUInt()

public actual fun DhcpRemoveOptionV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname).toUInt()

public actual fun DhcpRemoveOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValue(serveripaddress, optionid.toInt(), scopeinfo).toUInt()

public actual fun DhcpRemoveOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, scopeinfo).toUInt()

public actual fun DhcpRemoveOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveOptionValueV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, scopeinfo).toUInt()

public actual fun DhcpRemoveSubnetElement(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElement(serveripaddress, subnetaddress.toInt(), removeelementinfo, forceflag).toUInt()

public actual fun DhcpRemoveSubnetElementV4(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV4(serveripaddress, subnetaddress.toInt(), removeelementinfo, forceflag).toUInt()

public actual fun DhcpRemoveSubnetElementV5(serveripaddress: PCWSTR, subnetaddress: UInt, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRemoveSubnetElementV5(serveripaddress, subnetaddress.toInt(), removeelementinfo, forceflag).toUInt()

public actual fun DhcpRemoveSubnetElementV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, removeelementinfo: Long, forceflag: DHCP_FORCE_FLAG): UInt =
    0u

public actual fun DhcpRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, classid: Long, sendparams: DHCPCAPI_PARAMS_ARRAY, recdparams: DHCPCAPI_PARAMS_ARRAY, buffer: Long, psize: Long, requestidstr: PCWSTR): UInt =
    0u

public actual fun DhcpRpcFreeMemory(bufferpointer: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpRpcFreeMemory(bufferpointer)
}

public actual fun DhcpScanDatabase(serveripaddress: PCWSTR, subnetaddress: UInt, fixflag: UInt, scanlist: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpScanDatabase(serveripaddress, subnetaddress.toInt(), fixflag.toInt(), scanlist).toUInt()

public actual fun DhcpServerAuditlogParamsFree(configinfo: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerAuditlogParamsFree(configinfo)
}

public actual fun DhcpServerBackupDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerBackupDatabase(serveripaddress, path).toUInt()

public actual fun DhcpServerGetConfig(serveripaddress: PCWSTR, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfig(serveripaddress, configinfo).toUInt()

public actual fun DhcpServerGetConfigV4(serveripaddress: PCWSTR, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV4(serveripaddress, configinfo).toUInt()

public actual fun DhcpServerGetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigV6(serveripaddress, scopeinfo, configinfo).toUInt()

public actual fun DhcpServerGetConfigVQ(serveripaddress: PCWSTR, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerGetConfigVQ(serveripaddress, configinfo).toUInt()

public actual fun DhcpServerQueryAttribute(serveripaddr: PCWSTR, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttribute(serveripaddr, dwreserved.toInt(), dhcpattribid.toInt(), pdhcpattrib).toUInt()

public actual fun DhcpServerQueryAttributes(serveripaddr: PCWSTR, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: Long, pdhcpattribarr: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryAttributes(serveripaddr, dwreserved.toInt(), dwattribcount.toInt(), pdhcpattribs, pdhcpattribarr).toUInt()

public actual fun DhcpServerQueryDnsRegCredentials(serveripaddress: PCWSTR, unamesize: UInt, uname: PWSTR, domainsize: UInt, domain: PWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerQueryDnsRegCredentials(serveripaddress, unamesize.toInt(), uname, domainsize.toInt(), domain).toUInt()

public actual fun DhcpServerRedoAuthorization(serveripaddr: PCWSTR, dwreserved: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRedoAuthorization(serveripaddr, dwreserved.toInt()).toUInt()

public actual fun DhcpServerRestoreDatabase(serveripaddress: PCWSTR, path: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerRestoreDatabase(serveripaddress, path).toUInt()

public actual fun DhcpServerSetConfig(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfig(serveripaddress, fieldstoset.toInt(), configinfo).toUInt()

public actual fun DhcpServerSetConfigV4(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV4(serveripaddress, fieldstoset.toInt(), configinfo).toUInt()

public actual fun DhcpServerSetConfigV6(serveripaddress: PCWSTR, scopeinfo: Long, fieldstoset: UInt, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigV6(serveripaddress, scopeinfo, fieldstoset.toInt(), configinfo).toUInt()

public actual fun DhcpServerSetConfigVQ(serveripaddress: PCWSTR, fieldstoset: UInt, configinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetConfigVQ(serveripaddress, fieldstoset.toInt(), configinfo).toUInt()

public actual fun DhcpServerSetDnsRegCredentials(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentials(serveripaddress, uname, domain, passwd).toUInt()

public actual fun DhcpServerSetDnsRegCredentialsV5(serveripaddress: PCWSTR, uname: PCWSTR, domain: PCWSTR, passwd: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpServerSetDnsRegCredentialsV5(serveripaddress, uname, domain, passwd).toUInt()

public actual fun DhcpSetClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfo(serveripaddress, clientinfo).toUInt()

public actual fun DhcpSetClientInfoV4(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV4(serveripaddress, clientinfo).toUInt()

public actual fun DhcpSetClientInfoV6(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoV6(serveripaddress, clientinfo).toUInt()

public actual fun DhcpSetClientInfoVQ(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetClientInfoVQ(serveripaddress, clientinfo).toUInt()

public actual fun DhcpSetFilterV4(serveripaddress: PCWSTR, globalfilterinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetFilterV4(serveripaddress, globalfilterinfo).toUInt()

public actual fun DhcpSetOptionInfo(serveripaddress: PCWSTR, optionid: UInt, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfo(serveripaddress, optionid.toInt(), optioninfo).toUInt()

public actual fun DhcpSetOptionInfoV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, optioninfo).toUInt()

public actual fun DhcpSetOptionInfoV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, optioninfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionInfoV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, optioninfo).toUInt()

public actual fun DhcpSetOptionValue(serveripaddress: PCWSTR, optionid: UInt, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValue(serveripaddress, optionid.toInt(), scopeinfo, optionvalue).toUInt()

public actual fun DhcpSetOptionValueV5(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV5(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, scopeinfo, optionvalue).toUInt()

public actual fun DhcpSetOptionValueV6(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValueV6(serveripaddress, flags.toInt(), optionid.toInt(), classname, vendorname, scopeinfo, optionvalue).toUInt()

public actual fun DhcpSetOptionValues(serveripaddress: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValues(serveripaddress, scopeinfo, optionvalues).toUInt()

public actual fun DhcpSetOptionValuesV5(serveripaddress: PCWSTR, flags: UInt, classname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetOptionValuesV5(serveripaddress, flags.toInt(), classname, vendorname, scopeinfo, optionvalues).toUInt()

public actual fun DhcpSetServerBindingInfo(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfo(serveripaddress, flags.toInt(), bindelementinfo).toUInt()

public actual fun DhcpSetServerBindingInfoV6(serveripaddress: PCWSTR, flags: UInt, bindelementinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetServerBindingInfoV6(serveripaddress, flags.toInt(), bindelementinfo).toUInt()

public actual fun DhcpSetSubnetDelayOffer(serveripaddress: PCWSTR, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetDelayOffer(serveripaddress, subnetaddress.toInt(), timedelayinmilliseconds.toShort()).toUInt()

public actual fun DhcpSetSubnetInfo(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfo(serveripaddress, subnetaddress.toInt(), subnetinfo).toUInt()

public actual fun DhcpSetSubnetInfoV6(serveripaddress: PCWSTR, subnetaddress: DHCP_IPV6_ADDRESS, subnetinfo: Long): UInt =
    0u

public actual fun DhcpSetSubnetInfoVQ(serveripaddress: PCWSTR, subnetaddress: UInt, subnetinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSubnetInfoVQ(serveripaddress, subnetaddress.toInt(), subnetinfo).toUInt()

public actual fun DhcpSetSuperScopeV4(serveripaddress: PCWSTR, subnetaddress: UInt, superscopename: PCWSTR, changeexisting: BOOL): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetSuperScopeV4(serveripaddress, subnetaddress.toInt(), superscopename, changeexisting).toUInt()

public actual fun DhcpSetThreadOptions(flags: UInt, reserved: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpSetThreadOptions(flags.toInt(), reserved).toUInt()

public actual fun DhcpUndoRequestParams(flags: UInt, reserved: Long, adaptername: PCWSTR, requestidstr: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpUndoRequestParams(flags.toInt(), reserved, adaptername, requestidstr).toUInt()

public actual fun DhcpV4AddPolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4AddPolicyRange(serveripaddress, subnetaddress.toInt(), policyname, range).toUInt()

public actual fun DhcpV4CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfo(serveripaddress, clientinfo).toUInt()

public actual fun DhcpV4CreateClientInfoEx(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreateClientInfoEx(serveripaddress, clientinfo).toUInt()

public actual fun DhcpV4CreatePolicy(serveripaddress: PCWSTR, ppolicy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicy(serveripaddress, ppolicy).toUInt()

public actual fun DhcpV4CreatePolicyEx(serveripaddress: PCWSTR, policyex: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4CreatePolicyEx(serveripaddress, policyex).toUInt()

public actual fun DhcpV4DeletePolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4DeletePolicy(serveripaddress, fglobalpolicy, subnetaddress.toInt(), policyname).toUInt()

public actual fun DhcpV4EnumPolicies(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPolicies(serveripaddress, resumehandle, preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), enuminfo, elementsread, elementstotal).toUInt()

public actual fun DhcpV4EnumPoliciesEx(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, globalpolicy: BOOL, subnetaddress: UInt, enuminfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumPoliciesEx(serveripaddress, resumehandle, preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), enuminfo, elementsread, elementstotal).toUInt()

public actual fun DhcpV4EnumSubnetClients(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClients(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpV4EnumSubnetClientsEx(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, clientinfo: Long, clientsread: Long, clientstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetClientsEx(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), clientinfo, clientsread, clientstotal).toUInt()

public actual fun DhcpV4EnumSubnetReservations(serveripaddress: PCWSTR, subnetaddress: UInt, resumehandle: Long, preferredmaximum: UInt, enumelementinfo: Long, elementsread: Long, elementstotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4EnumSubnetReservations(serveripaddress, subnetaddress.toInt(), resumehandle, preferredmaximum.toInt(), enumelementinfo, elementsread, elementstotal).toUInt()

public actual fun DhcpV4FailoverAddScopeToRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverAddScopeToRelationship(serveripaddress, prelationship).toUInt()

public actual fun DhcpV4FailoverCreateRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverCreateRelationship(serveripaddress, prelationship).toUInt()

public actual fun DhcpV4FailoverDeleteRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteRelationship(serveripaddress, prelationshipname).toUInt()

public actual fun DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: PCWSTR, prelationship: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverDeleteScopeFromRelationship(serveripaddress, prelationship).toUInt()

public actual fun DhcpV4FailoverEnumRelationship(serveripaddress: PCWSTR, resumehandle: Long, preferredmaximum: UInt, prelationship: Long, relationshipread: Long, relationshiptotal: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverEnumRelationship(serveripaddress, resumehandle, preferredmaximum.toInt(), prelationship, relationshipread, relationshiptotal).toUInt()

public actual fun DhcpV4FailoverGetAddressStatus(serveripaddress: PCWSTR, subnetaddress: UInt, pstatus: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetAddressStatus(serveripaddress, subnetaddress.toInt(), pstatus).toUInt()

public actual fun DhcpV4FailoverGetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetClientInfo(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpV4FailoverGetRelationship(serveripaddress: PCWSTR, prelationshipname: PCWSTR, prelationship: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetRelationship(serveripaddress, prelationshipname, prelationship).toUInt()

public actual fun DhcpV4FailoverGetScopeRelationship(serveripaddress: PCWSTR, scopeid: UInt, prelationship: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeRelationship(serveripaddress, scopeid.toInt(), prelationship).toUInt()

public actual fun DhcpV4FailoverGetScopeStatistics(serveripaddress: PCWSTR, scopeid: UInt, pstats: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetScopeStatistics(serveripaddress, scopeid.toInt(), pstats).toUInt()

public actual fun DhcpV4FailoverGetSystemTime(serveripaddress: PCWSTR, ptime: Long, pmaxalloweddeltatime: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverGetSystemTime(serveripaddress, ptime, pmaxalloweddeltatime).toUInt()

public actual fun DhcpV4FailoverSetRelationship(serveripaddress: PCWSTR, flags: UInt, prelationship: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverSetRelationship(serveripaddress, flags.toInt(), prelationship).toUInt()

public actual fun DhcpV4FailoverTriggerAddrAllocation(serveripaddress: PCWSTR, pfailrelname: PCWSTR): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4FailoverTriggerAddrAllocation(serveripaddress, pfailrelname).toUInt()

public actual fun DhcpV4GetAllOptionValues(serveripaddress: PCWSTR, flags: UInt, scopeinfo: Long, values: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetAllOptionValues(serveripaddress, flags.toInt(), scopeinfo, values).toUInt()

public actual fun DhcpV4GetClientInfo(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfo(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpV4GetClientInfoEx(serveripaddress: PCWSTR, searchinfo: Long, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetClientInfoEx(serveripaddress, searchinfo, clientinfo).toUInt()

public actual fun DhcpV4GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetFreeIPAddress(serveripaddress, scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), ipaddrlist).toUInt()

public actual fun DhcpV4GetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetOptionValue(serveripaddress, flags.toInt(), optionid.toInt(), policyname, vendorname, scopeinfo, optionvalue).toUInt()

public actual fun DhcpV4GetPolicy(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicy(serveripaddress, fglobalpolicy, subnetaddress.toInt(), policyname, policy).toUInt()

public actual fun DhcpV4GetPolicyEx(serveripaddress: PCWSTR, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4GetPolicyEx(serveripaddress, globalpolicy, subnetaddress.toInt(), policyname, policy).toUInt()

public actual fun DhcpV4QueryPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enabled: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4QueryPolicyEnforcement(serveripaddress, fglobalpolicy, subnetaddress.toInt(), enabled).toUInt()

public actual fun DhcpV4RemoveOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemoveOptionValue(serveripaddress, flags.toInt(), optionid.toInt(), policyname, vendorname, scopeinfo).toUInt()

public actual fun DhcpV4RemovePolicyRange(serveripaddress: PCWSTR, subnetaddress: UInt, policyname: PCWSTR, range: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4RemovePolicyRange(serveripaddress, subnetaddress.toInt(), policyname, range).toUInt()

public actual fun DhcpV4SetOptionValue(serveripaddress: PCWSTR, flags: UInt, optionid: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalue: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValue(serveripaddress, flags.toInt(), optionid.toInt(), policyname, vendorname, scopeinfo, optionvalue).toUInt()

public actual fun DhcpV4SetOptionValues(serveripaddress: PCWSTR, flags: UInt, policyname: PCWSTR, vendorname: PCWSTR, scopeinfo: Long, optionvalues: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetOptionValues(serveripaddress, flags.toInt(), policyname, vendorname, scopeinfo, optionvalues).toUInt()

public actual fun DhcpV4SetPolicy(serveripaddress: PCWSTR, fieldsmodified: UInt, fglobalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicy(serveripaddress, fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), policyname, policy).toUInt()

public actual fun DhcpV4SetPolicyEnforcement(serveripaddress: PCWSTR, fglobalpolicy: BOOL, subnetaddress: UInt, enable: BOOL): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEnforcement(serveripaddress, fglobalpolicy, subnetaddress.toInt(), enable).toUInt()

public actual fun DhcpV4SetPolicyEx(serveripaddress: PCWSTR, fieldsmodified: UInt, globalpolicy: BOOL, subnetaddress: UInt, policyname: PCWSTR, policy: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV4SetPolicyEx(serveripaddress, fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), policyname, policy).toUInt()

public actual fun DhcpV6CreateClientInfo(serveripaddress: PCWSTR, clientinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV6CreateClientInfo(serveripaddress, clientinfo).toUInt()

public actual fun DhcpV6GetFreeIPAddress(serveripaddress: PCWSTR, scopeid: DHCP_IPV6_ADDRESS, startip: DHCP_IPV6_ADDRESS, endip: DHCP_IPV6_ADDRESS, numfreeaddrreq: UInt, ipaddrlist: Long): UInt =
    0u

public actual fun DhcpV6GetStatelessStatistics(serveripaddress: PCWSTR, statelessstats: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_DhcpV6GetStatelessStatistics(serveripaddress, statelessstats).toUInt()

public actual fun DhcpV6GetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, params: Long): UInt =
    0u

public actual fun DhcpV6SetStatelessStoreParams(serveripaddress: PCWSTR, fserverlevel: BOOL, subnetaddress: DHCP_IPV6_ADDRESS, fieldmodified: UInt, params: Long): UInt =
    0u

public actual fun Dhcpv6CApiCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiCleanup()
}

public actual fun Dhcpv6CApiInitialize(version: Long) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6CApiInitialize(version)
}

public actual fun Dhcpv6ReleasePrefix(adaptername: PCWSTR, classid: Long, leaseinfo: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6ReleasePrefix(adaptername, classid, leaseinfo).toUInt()

public actual fun Dhcpv6RenewPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RenewPrefix(adaptername, pclassid, prefixleaseinfo, pdwtimetowait, bvalidateprefix.toInt()).toUInt()

public actual fun Dhcpv6RequestParams(forcenewinform: BOOL, reserved: Long, adaptername: PCWSTR, classid: Long, recdparams: DHCPV6CAPI_PARAMS_ARRAY, buffer: Long, psize: Long): UInt =
    0u

public actual fun Dhcpv6RequestPrefix(adaptername: PCWSTR, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_Dhcpv6RequestPrefix(adaptername, pclassid, prefixleaseinfo, pdwtimetowait).toUInt()
