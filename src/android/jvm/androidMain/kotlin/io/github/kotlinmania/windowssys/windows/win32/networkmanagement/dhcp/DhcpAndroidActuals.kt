@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32NetworkmanagementDhcpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAddFilterV4(serveripaddress: Long, addfilterinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSecurityGroup(pserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAddServer(flags: Int, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElement(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElementV4(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElementV5(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAuditLogGetParams(serveripaddress: Long, flags: Int, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpAuditLogSetParams(serveripaddress: Long, flags: Int, auditlogdir: Long, diskcheckinterval: Int, maxlogfilessize: Int, minspaceondisk: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCApiCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCApiInitialize(version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClass(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClassV6(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfoV4(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfoVQ(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOption(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOptionV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOptionV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateSubnet(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateSubnetVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeRegisterParamChange(flags: Int, reserved: Long, event: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClass(serveripaddress: Long, reservedmustbezero: Int, classname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClassV6(serveripaddress: Long, reservedmustbezero: Int, classname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClientInfoV6(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteFilterV4(serveripaddress: Long, deletefilterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteServer(flags: Int, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteSubnet(serveripaddress: Long, subnetaddress: Int, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteSuperScopeV4(serveripaddress: Long, superscopename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDsCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpDsInit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumClasses(serveripaddress: Long, reservedmustbezero: Int, resumehandle: Long, preferredmaximum: Int, classinfoarray: Long, nread: Long, ntotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumClassesV6(serveripaddress: Long, reservedmustbezero: Int, resumehandle: Long, preferredmaximum: Int, classinfoarray: Long, nread: Long, ntotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumFilterV4(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, listtype: Int, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValues(serveripaddress: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValuesV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValuesV6(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptions(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionsV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionsV6(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumServers(flags: Int, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClients(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsV4(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsV5(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsVQ(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElements(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElementsV4(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElementsV5(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnets(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetsV6(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionValues(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionValuesV6(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptions(serveripaddress: Long, flags: Int, optionstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionsV6(serveripaddress: Long, flags: Int, optionstruct: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClassInfo(serveripaddress: Long, reservedmustbezero: Int, partialclassinfo: Long, filledclassinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoV4(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoV6(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoVQ(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientOptions(serveripaddress: Long, clientipaddress: Int, clientsubnetmask: Int, clientoptions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetFilterV4(serveripaddress: Long, globalfilterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfo(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfoV5(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfoV6(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfo(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfoV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfoV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOriginalSubnetMask(sadaptername: Long, dwsubnetmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerBindingInfo(serveripaddress: Long, flags: Int, bindelementsinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerBindingInfoV6(serveripaddress: Long, flags: Int, bindelementsinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerSpecificStrings(serveripaddress: Long, serverspecificstrings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetDelayOffer(serveripaddress: Long, subnetaddress: Int, timedelayinmilliseconds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetInfo(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetInfoVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSuperScopeInfoV4(serveripaddress: Long, superscopetable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetThreadOptions(pflags: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpGetVersion(serveripaddress: Long, majorversion: Long, minorversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: Int, type: Int, optionid: Int, suboptionid: Int, vendorname: Long, operator: Int, value: Long, valuelength: Int, conditionindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: Int, operator: Int, exprindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyRange(policy: Long, range: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprCreateV4Policy(policyname: Long, fglobalpolicy: Int, subnet: Int, processingorder: Int, rootoperator: Int, description: Long, enabled: Int, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprCreateV4PolicyEx(policyname: Long, fglobalpolicy: Int, subnet: Int, processingorder: Int, rootoperator: Int, description: Long, enabled: Int, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFindV4DhcpProperty(propertyarray: Long, id: Int, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4DhcpProperty(property: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4Policy(policy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyArray(policyarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyEx(policyex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyExArray(policyexarray: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicySingleUC(policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicyValid(ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicyWellFormed(ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprModifyV4PolicyExpr(policy: Long, operator: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprResetV4PolicyExpr(policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpModifyClass(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpModifyClassV6(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveDNSRegistrations(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOption(serveripaddress: Long, optionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElement(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElementV4(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElementV5(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpRpcFreeMemory(bufferpointer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpScanDatabase(serveripaddress: Long, subnetaddress: Int, fixflag: Int, scanlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerAuditlogParamsFree(configinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerBackupDatabase(serveripaddress: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfig(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigV4(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigV6(serveripaddress: Long, scopeinfo: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigVQ(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryAttribute(serveripaddr: Long, dwreserved: Int, dhcpattribid: Int, pdhcpattrib: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryAttributes(serveripaddr: Long, dwreserved: Int, dwattribcount: Int, pdhcpattribs: Long, pdhcpattribarr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryDnsRegCredentials(serveripaddress: Long, unamesize: Int, uname: Long, domainsize: Int, domain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerRedoAuthorization(serveripaddr: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerRestoreDatabase(serveripaddress: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfig(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigV4(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigV6(serveripaddress: Long, scopeinfo: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigVQ(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetDnsRegCredentials(serveripaddress: Long, uname: Long, domain: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetDnsRegCredentialsV5(serveripaddress: Long, uname: Long, domain: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoV4(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoV6(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoVQ(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetFilterV4(serveripaddress: Long, globalfilterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfo(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfoV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfoV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValues(serveripaddress: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValuesV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetServerBindingInfo(serveripaddress: Long, flags: Int, bindelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetServerBindingInfoV6(serveripaddress: Long, flags: Int, bindelementinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetDelayOffer(serveripaddress: Long, subnetaddress: Int, timedelayinmilliseconds: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetInfo(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetInfoVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSuperScopeV4(serveripaddress: Long, subnetaddress: Int, superscopename: Long, changeexisting: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpSetThreadOptions(flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpUndoRequestParams(flags: Int, reserved: Long, adaptername: Long, requestidstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4AddPolicyRange(serveripaddress: Long, subnetaddress: Int, policyname: Long, range: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreateClientInfoEx(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreatePolicy(serveripaddress: Long, ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreatePolicyEx(serveripaddress: Long, policyex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4DeletePolicy(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, policyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumPolicies(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, fglobalpolicy: Int, subnetaddress: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumPoliciesEx(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, globalpolicy: Int, subnetaddress: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetClients(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetClientsEx(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetReservations(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverAddScopeToRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverCreateRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverDeleteRelationship(serveripaddress: Long, prelationshipname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverEnumRelationship(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, prelationship: Long, relationshipread: Long, relationshiptotal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetAddressStatus(serveripaddress: Long, subnetaddress: Int, pstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetRelationship(serveripaddress: Long, prelationshipname: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetScopeRelationship(serveripaddress: Long, scopeid: Int, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetScopeStatistics(serveripaddress: Long, scopeid: Int, pstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetSystemTime(serveripaddress: Long, ptime: Long, pmaxalloweddeltatime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverSetRelationship(serveripaddress: Long, flags: Int, prelationship: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Long, pfailrelname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetAllOptionValues(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetClientInfoEx(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetFreeIPAddress(serveripaddress: Long, scopeid: Int, startip: Int, endip: Int, numfreeaddrreq: Int, ipaddrlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetPolicy(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetPolicyEx(serveripaddress: Long, globalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4QueryPolicyEnforcement(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4RemoveOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4RemovePolicyRange(serveripaddress: Long, subnetaddress: Int, policyname: Long, range: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetOptionValues(serveripaddress: Long, flags: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicy(serveripaddress: Long, fieldsmodified: Int, fglobalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicyEnforcement(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, enable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicyEx(serveripaddress: Long, fieldsmodified: Int, globalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV6CreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpV6GetStatelessStatistics(serveripaddress: Long, statelessstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpv6CApiCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpv6CApiInitialize(version: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpv6ReleasePrefix(adaptername: Long, classid: Long, leaseinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpv6RenewPrefix(adaptername: Long, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dhcp_dhcpv6RequestPrefix(adaptername: Long, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): Int
}

public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: COpaquePointer?, forceflag: Bool): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddFilterV4((serveripaddress?.value ?: 0L), (addfilterinfo?.value ?: 0L), forceflag).toUInt()

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSecurityGroup((pserver?.value ?: 0L)).toUInt()

public actual fun dhcpAddServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddServer(flags.toInt(), (idinfo?.value ?: 0L), (newserver?.value ?: 0L), (callbackfn?.value ?: 0L), (callbackdata?.value ?: 0L)).toUInt()

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElement((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (addelementinfo?.value ?: 0L)).toUInt()

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElementV4((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (addelementinfo?.value ?: 0L)).toUInt()

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAddSubnetElementV5((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (addelementinfo?.value ?: 0L)).toUInt()

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: COpaquePointer?): UInt =
    0u

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: COpaquePointer?, diskcheckinterval: COpaquePointer?, maxlogfilessize: COpaquePointer?, minspaceondisk: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAuditLogGetParams((serveripaddress?.value ?: 0L), flags.toInt(), (auditlogdir?.value ?: 0L), (diskcheckinterval?.value ?: 0L), (maxlogfilessize?.value ?: 0L), (minspaceondisk?.value ?: 0L)).toUInt()

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpAuditLogSetParams((serveripaddress?.value ?: 0L), flags.toInt(), (auditlogdir?.value ?: 0L), diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()).toUInt()

public actual fun dhcpCApiCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCApiCleanup()
}

public actual fun dhcpCApiInitialize(version: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCApiInitialize((version?.value ?: 0L)).toUInt()

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClass((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (classinfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClassV6((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (classinfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfo((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfoV4((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateClientInfoVQ((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOption((serveripaddress?.value ?: 0L), optionid.toInt(), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOptionV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateOptionV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateSubnet((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (subnetinfo?.value ?: 0L)).toUInt()

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    0u

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpCreateSubnetVQ((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (subnetinfo?.value ?: 0L)).toUInt()

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: COpaquePointer?, event: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeRegisterParamChange(flags.toInt(), (reserved?.value ?: 0L), (event?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClass((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (classname?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClassV6((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (classname?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClientInfo((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteClientInfoV6((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteFilterV4((serveripaddress?.value ?: 0L), (deletefilterinfo?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteServer(flags: UInt, idinfo: COpaquePointer?, newserver: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteServer(flags.toInt(), (idinfo?.value ?: 0L), (newserver?.value ?: 0L), (callbackfn?.value ?: 0L), (callbackdata?.value ?: 0L)).toUInt()

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteSubnet((serveripaddress?.value ?: 0L), subnetaddress.toInt(), forceflag).toUInt()

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    0u

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDeleteSuperScopeV4((serveripaddress?.value ?: 0L), (superscopename?.value ?: 0L)).toUInt()

public actual fun dhcpDsCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDsCleanup()
}

public actual fun dhcpDsInit(): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpDsInit().toUInt()

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumClasses((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (classinfoarray?.value ?: 0L), (nread?.value ?: 0L), (ntotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, classinfoarray: COpaquePointer?, nread: COpaquePointer?, ntotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumClassesV6((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (classinfoarray?.value ?: 0L), (nread?.value ?: 0L), (ntotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumFilterV4((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), listtype, (enumfilterinfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValues((serveripaddress?.value ?: 0L), (scopeinfo?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (optionvalues?.value ?: 0L), (optionsread?.value ?: 0L), (optionstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValuesV5((serveripaddress?.value ?: 0L), flags.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (optionvalues?.value ?: 0L), (optionsread?.value ?: 0L), (optionstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, resumehandle: COpaquePointer?, preferredmaximum: UInt, optionvalues: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionValuesV6((serveripaddress?.value ?: 0L), flags.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (optionvalues?.value ?: 0L), (optionsread?.value ?: 0L), (optionstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptions((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (options?.value ?: 0L), (optionsread?.value ?: 0L), (optionstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionsV5((serveripaddress?.value ?: 0L), flags.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (options?.value ?: 0L), (optionsread?.value ?: 0L), (optionstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, options: COpaquePointer?, optionsread: COpaquePointer?, optionstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumOptionsV6((serveripaddress?.value ?: 0L), flags.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (options?.value ?: 0L), (optionsread?.value ?: 0L), (optionstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumServers(flags: UInt, idinfo: COpaquePointer?, servers: COpaquePointer?, callbackfn: COpaquePointer?, callbackdata: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumServers(flags.toInt(), (idinfo?.value ?: 0L), (servers?.value ?: 0L), (callbackfn?.value ?: 0L), (callbackdata?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClients((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsFilterStatusInfo((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsV4((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsV5((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    0u

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetClientsVQ((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElements((serveripaddress?.value ?: 0L), subnetaddress.toInt(), enumelementtype, (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElementsV4((serveripaddress?.value ?: 0L), subnetaddress.toInt(), enumelementtype, (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetElementsV5((serveripaddress?.value ?: 0L), subnetaddress.toInt(), enumelementtype, (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    0u

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnets((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (enuminfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpEnumSubnetsV6((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (enuminfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionValues((serveripaddress?.value ?: 0L), flags.toInt(), (scopeinfo?.value ?: 0L), (values?.value ?: 0L)).toUInt()

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionValuesV6((serveripaddress?.value ?: 0L), flags.toInt(), (scopeinfo?.value ?: 0L), (values?.value ?: 0L)).toUInt()

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptions((serveripaddress?.value ?: 0L), flags.toInt(), (optionstruct?.value ?: 0L)).toUInt()

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetAllOptionsV6((serveripaddress?.value ?: 0L), flags.toInt(), (optionstruct?.value ?: 0L)).toUInt()

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: COpaquePointer?, filledclassinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClassInfo((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (partialclassinfo?.value ?: 0L), (filledclassinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfo((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoV4((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoV6((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientInfoVQ((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetClientOptions((serveripaddress?.value ?: 0L), clientipaddress.toInt(), clientsubnetmask.toInt(), (clientoptions?.value ?: 0L)).toUInt()

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetFilterV4((serveripaddress?.value ?: 0L), (globalfilterinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfo((serveripaddress?.value ?: 0L), (mibinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfoV5((serveripaddress?.value ?: 0L), (mibinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetMibInfoV6((serveripaddress?.value ?: 0L), (mibinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfo((serveripaddress?.value ?: 0L), optionid.toInt(), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfoV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionInfoV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValue((serveripaddress?.value ?: 0L), optionid.toInt(), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValueV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOptionValueV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetOriginalSubnetMask((sadaptername?.value ?: 0L), (dwsubnetmask?.value ?: 0L)).toUInt()

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerBindingInfo((serveripaddress?.value ?: 0L), flags.toInt(), (bindelementsinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerBindingInfoV6((serveripaddress?.value ?: 0L), flags.toInt(), (bindelementsinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetServerSpecificStrings((serveripaddress?.value ?: 0L), (serverspecificstrings?.value ?: 0L)).toUInt()

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetDelayOffer((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (timedelayinmilliseconds?.value ?: 0L)).toUInt()

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetInfo((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (subnetinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    0u

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSubnetInfoVQ((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (subnetinfo?.value ?: 0L)).toUInt()

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetSuperScopeInfoV4((serveripaddress?.value ?: 0L), (superscopetable?.value ?: 0L)).toUInt()

public actual fun dhcpGetThreadOptions(pflags: COpaquePointer?, reserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetThreadOptions((pflags?.value ?: 0L), (reserved?.value ?: 0L)).toUInt()

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: COpaquePointer?, minorversion: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpGetVersion((serveripaddress?.value ?: 0L), (majorversion?.value ?: 0L), (minorversion?.value ?: 0L)).toUInt()

public actual fun dhcpHlprAddV4PolicyCondition(policy: COpaquePointer?, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: COpaquePointer?, valuelength: UInt, conditionindex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyCondition((policy?.value ?: 0L), parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), (vendorname?.value ?: 0L), operator, (value?.value ?: 0L), valuelength.toInt(), (conditionindex?.value ?: 0L)).toUInt()

public actual fun dhcpHlprAddV4PolicyExpr(policy: COpaquePointer?, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyExpr((policy?.value ?: 0L), parentexpr.toInt(), operator, (exprindex?.value ?: 0L)).toUInt()

public actual fun dhcpHlprAddV4PolicyRange(policy: COpaquePointer?, range: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprAddV4PolicyRange((policy?.value ?: 0L), (range?.value ?: 0L)).toUInt()

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprCreateV4Policy((policyname?.value ?: 0L), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, (description?.value ?: 0L), enabled, (policy?.value ?: 0L)).toUInt()

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprCreateV4PolicyEx((policyname?.value ?: 0L), fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, (description?.value ?: 0L), enabled, (policy?.value ?: 0L)).toUInt()

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: COpaquePointer?, id: DhcpPropertyId, type: DhcpPropertyType): COpaquePointer? =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFindV4DhcpProperty((propertyarray?.value ?: 0L), id, type).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dhcpHlprFreeV4DhcpProperty(property: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4DhcpProperty((property?.value ?: 0L))
}

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4DhcpPropertyArray((propertyarray?.value ?: 0L))
}

public actual fun dhcpHlprFreeV4Policy(policy: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4Policy((policy?.value ?: 0L))
}

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyArray((policyarray?.value ?: 0L))
}

public actual fun dhcpHlprFreeV4PolicyEx(policyex: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyEx((policyex?.value ?: 0L))
}

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprFreeV4PolicyExArray((policyexarray?.value ?: 0L))
}

public actual fun dhcpHlprIsV4PolicySingleUC(policy: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicySingleUC((policy?.value ?: 0L))

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicyValid((ppolicy?.value ?: 0L)).toUInt()

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprIsV4PolicyWellFormed((ppolicy?.value ?: 0L))

public actual fun dhcpHlprModifyV4PolicyExpr(policy: COpaquePointer?, operator: DhcpPolLogicOper): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprModifyV4PolicyExpr((policy?.value ?: 0L), operator).toUInt()

public actual fun dhcpHlprResetV4PolicyExpr(policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpHlprResetV4PolicyExpr((policy?.value ?: 0L)).toUInt()

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpModifyClass((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (classinfo?.value ?: 0L)).toUInt()

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpModifyClassV6((serveripaddress?.value ?: 0L), reservedmustbezero.toInt(), (classinfo?.value ?: 0L)).toUInt()

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, params: DhcpcapiParamsArray, handle: COpaquePointer?): UInt =
    0u

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveDNSRegistrations().toUInt()

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOption((serveripaddress?.value ?: 0L), optionid.toInt()).toUInt()

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L)).toUInt()

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L)).toUInt()

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValue((serveripaddress?.value ?: 0L), optionid.toInt(), (scopeinfo?.value ?: 0L)).toUInt()

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValueV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L)).toUInt()

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveOptionValueV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L)).toUInt()

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElement((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (removeelementinfo?.value ?: 0L), forceflag).toUInt()

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElementV4((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (removeelementinfo?.value ?: 0L), forceflag).toUInt()

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRemoveSubnetElementV5((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (removeelementinfo?.value ?: 0L), forceflag).toUInt()

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: COpaquePointer?, forceflag: DhcpForceFlag): UInt =
    0u

public actual fun dhcpRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?, requestidstr: Pcwstr): UInt =
    0u

public actual fun dhcpRpcFreeMemory(bufferpointer: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpRpcFreeMemory((bufferpointer?.value ?: 0L))
}

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpScanDatabase((serveripaddress?.value ?: 0L), subnetaddress.toInt(), fixflag.toInt(), (scanlist?.value ?: 0L)).toUInt()

public actual fun dhcpServerAuditlogParamsFree(configinfo: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerAuditlogParamsFree((configinfo?.value ?: 0L))
}

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerBackupDatabase((serveripaddress?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfig((serveripaddress?.value ?: 0L), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigV4((serveripaddress?.value ?: 0L), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigV6((serveripaddress?.value ?: 0L), (scopeinfo?.value ?: 0L), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerGetConfigVQ((serveripaddress?.value ?: 0L), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryAttribute((serveripaddr?.value ?: 0L), dwreserved.toInt(), dhcpattribid.toInt(), (pdhcpattrib?.value ?: 0L)).toUInt()

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: COpaquePointer?, pdhcpattribarr: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryAttributes((serveripaddr?.value ?: 0L), dwreserved.toInt(), dwattribcount.toInt(), (pdhcpattribs?.value ?: 0L), (pdhcpattribarr?.value ?: 0L)).toUInt()

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerQueryDnsRegCredentials((serveripaddress?.value ?: 0L), unamesize.toInt(), (uname?.value ?: 0L), domainsize.toInt(), (domain?.value ?: 0L)).toUInt()

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerRedoAuthorization((serveripaddr?.value ?: 0L), dwreserved.toInt()).toUInt()

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerRestoreDatabase((serveripaddress?.value ?: 0L), (path?.value ?: 0L)).toUInt()

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfig((serveripaddress?.value ?: 0L), fieldstoset.toInt(), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigV4((serveripaddress?.value ?: 0L), fieldstoset.toInt(), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigV6((serveripaddress?.value ?: 0L), (scopeinfo?.value ?: 0L), fieldstoset.toInt(), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetConfigVQ((serveripaddress?.value ?: 0L), fieldstoset.toInt(), (configinfo?.value ?: 0L)).toUInt()

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetDnsRegCredentials((serveripaddress?.value ?: 0L), (uname?.value ?: 0L), (domain?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpServerSetDnsRegCredentialsV5((serveripaddress?.value ?: 0L), (uname?.value ?: 0L), (domain?.value ?: 0L), (passwd?.value ?: 0L)).toUInt()

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfo((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoV4((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoV6((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetClientInfoVQ((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetFilterV4((serveripaddress?.value ?: 0L), (globalfilterinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfo((serveripaddress?.value ?: 0L), optionid.toInt(), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfoV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionInfoV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (optioninfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValue((serveripaddress?.value ?: 0L), optionid.toInt(), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValueV5((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValueV6((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValues((serveripaddress?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalues?.value ?: 0L)).toUInt()

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetOptionValuesV5((serveripaddress?.value ?: 0L), flags.toInt(), (classname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalues?.value ?: 0L)).toUInt()

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetServerBindingInfo((serveripaddress?.value ?: 0L), flags.toInt(), (bindelementinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetServerBindingInfoV6((serveripaddress?.value ?: 0L), flags.toInt(), (bindelementinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetDelayOffer((serveripaddress?.value ?: 0L), subnetaddress.toInt(), timedelayinmilliseconds.toShort()).toUInt()

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetInfo((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (subnetinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: COpaquePointer?): UInt =
    0u

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSubnetInfoVQ((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (subnetinfo?.value ?: 0L)).toUInt()

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetSuperScopeV4((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (superscopename?.value ?: 0L), changeexisting).toUInt()

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpSetThreadOptions(flags.toInt(), (reserved?.value ?: 0L)).toUInt()

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: COpaquePointer?, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpUndoRequestParams(flags.toInt(), (reserved?.value ?: 0L), (adaptername?.value ?: 0L), (requestidstr?.value ?: 0L)).toUInt()

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4AddPolicyRange((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (policyname?.value ?: 0L), (range?.value ?: 0L)).toUInt()

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreateClientInfo((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreateClientInfoEx((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreatePolicy((serveripaddress?.value ?: 0L), (ppolicy?.value ?: 0L)).toUInt()

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4CreatePolicyEx((serveripaddress?.value ?: 0L), (policyex?.value ?: 0L)).toUInt()

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4DeletePolicy((serveripaddress?.value ?: 0L), fglobalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L)).toUInt()

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumPolicies((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), (enuminfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumPoliciesEx((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), (enuminfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetClients((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, clientinfo: COpaquePointer?, clientsread: COpaquePointer?, clientstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetClientsEx((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (clientinfo?.value ?: 0L), (clientsread?.value ?: 0L), (clientstotal?.value ?: 0L)).toUInt()

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: COpaquePointer?, preferredmaximum: UInt, enumelementinfo: COpaquePointer?, elementsread: COpaquePointer?, elementstotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4EnumSubnetReservations((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (enumelementinfo?.value ?: 0L), (elementsread?.value ?: 0L), (elementstotal?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverAddScopeToRelationship((serveripaddress?.value ?: 0L), (prelationship?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverCreateRelationship((serveripaddress?.value ?: 0L), (prelationship?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverDeleteRelationship((serveripaddress?.value ?: 0L), (prelationshipname?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverDeleteScopeFromRelationship((serveripaddress?.value ?: 0L), (prelationship?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: COpaquePointer?, preferredmaximum: UInt, prelationship: COpaquePointer?, relationshipread: COpaquePointer?, relationshiptotal: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverEnumRelationship((serveripaddress?.value ?: 0L), (resumehandle?.value ?: 0L), preferredmaximum.toInt(), (prelationship?.value ?: 0L), (relationshipread?.value ?: 0L), (relationshiptotal?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetAddressStatus((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (pstatus?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetClientInfo((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetRelationship((serveripaddress?.value ?: 0L), (prelationshipname?.value ?: 0L), (prelationship?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetScopeRelationship((serveripaddress?.value ?: 0L), scopeid.toInt(), (prelationship?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetScopeStatistics((serveripaddress?.value ?: 0L), scopeid.toInt(), (pstats?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: COpaquePointer?, pmaxalloweddeltatime: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverGetSystemTime((serveripaddress?.value ?: 0L), (ptime?.value ?: 0L), (pmaxalloweddeltatime?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverSetRelationship((serveripaddress?.value ?: 0L), flags.toInt(), (prelationship?.value ?: 0L)).toUInt()

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4FailoverTriggerAddrAllocation((serveripaddress?.value ?: 0L), (pfailrelname?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: COpaquePointer?, values: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetAllOptionValues((serveripaddress?.value ?: 0L), flags.toInt(), (scopeinfo?.value ?: 0L), (values?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetClientInfo((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: COpaquePointer?, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetClientInfoEx((serveripaddress?.value ?: 0L), (searchinfo?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetFreeIPAddress((serveripaddress?.value ?: 0L), scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), (ipaddrlist?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetOptionValue((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (policyname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetPolicy((serveripaddress?.value ?: 0L), fglobalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4GetPolicyEx((serveripaddress?.value ?: 0L), globalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4QueryPolicyEnforcement((serveripaddress?.value ?: 0L), fglobalpolicy, subnetaddress.toInt(), (enabled?.value ?: 0L)).toUInt()

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4RemoveOptionValue((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (policyname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4RemovePolicyRange((serveripaddress?.value ?: 0L), subnetaddress.toInt(), (policyname?.value ?: 0L), (range?.value ?: 0L)).toUInt()

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetOptionValue((serveripaddress?.value ?: 0L), flags.toInt(), optionid.toInt(), (policyname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalue?.value ?: 0L)).toUInt()

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: COpaquePointer?, optionvalues: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetOptionValues((serveripaddress?.value ?: 0L), flags.toInt(), (policyname?.value ?: 0L), (vendorname?.value ?: 0L), (scopeinfo?.value ?: 0L), (optionvalues?.value ?: 0L)).toUInt()

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicy((serveripaddress?.value ?: 0L), fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicyEnforcement((serveripaddress?.value ?: 0L), fglobalpolicy, subnetaddress.toInt(), enable).toUInt()

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV4SetPolicyEx((serveripaddress?.value ?: 0L), fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), (policyname?.value ?: 0L), (policy?.value ?: 0L)).toUInt()

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV6CreateClientInfo((serveripaddress?.value ?: 0L), (clientinfo?.value ?: 0L)).toUInt()

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: COpaquePointer?): UInt =
    0u

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpV6GetStatelessStatistics((serveripaddress?.value ?: 0L), (statelessstats?.value ?: 0L)).toUInt()

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: COpaquePointer?): UInt =
    0u

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: COpaquePointer?): UInt =
    0u

public actual fun dhcpv6CApiCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6CApiCleanup()
}

public actual fun dhcpv6CApiInitialize(version: COpaquePointer?) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6CApiInitialize((version?.value ?: 0L))
}

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: COpaquePointer?, leaseinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6ReleasePrefix((adaptername?.value ?: 0L), (classid?.value ?: 0L), (leaseinfo?.value ?: 0L)).toUInt()

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?, bvalidateprefix: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6RenewPrefix((adaptername?.value ?: 0L), (pclassid?.value ?: 0L), (prefixleaseinfo?.value ?: 0L), (pdwtimetowait?.value ?: 0L), bvalidateprefix.toInt()).toUInt()

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: COpaquePointer?, adaptername: Pcwstr, classid: COpaquePointer?, recdparams: Dhcpv6capiParamsArray, buffer: COpaquePointer?, psize: COpaquePointer?): UInt =
    0u

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: COpaquePointer?, prefixleaseinfo: COpaquePointer?, pdwtimetowait: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssys_windows_win32_networkmanagement_dhcp_dhcpv6RequestPrefix((adaptername?.value ?: 0L), (pclassid?.value ?: 0L), (prefixleaseinfo?.value ?: 0L), (pdwtimetowait?.value ?: 0L)).toUInt()
