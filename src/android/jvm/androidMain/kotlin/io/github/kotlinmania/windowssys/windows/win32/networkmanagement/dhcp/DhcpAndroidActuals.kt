@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

private object WindowsWin32NetworkmanagementDhcpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4(serveripaddress: Long, addfilterinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup(pserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer(flags: Int, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5(serveripaddress: Long, subnetaddress: Int, addelementinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams(serveripaddress: Long, flags: Int, auditlogdir: Long, diskcheckinterval: Long, maxlogfilessize: Long, minspaceondisk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams(serveripaddress: Long, flags: Int, auditlogdir: Long, diskcheckinterval: Int, maxlogfilessize: Int, minspaceondisk: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize(version: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange(flags: Int, reserved: Long, event: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass(serveripaddress: Long, reservedmustbezero: Int, classname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6(serveripaddress: Long, reservedmustbezero: Int, classname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4(serveripaddress: Long, deletefilterinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer(flags: Int, idinfo: Long, newserver: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet(serveripaddress: Long, subnetaddress: Int, forceflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4(serveripaddress: Long, superscopename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses(serveripaddress: Long, reservedmustbezero: Int, resumehandle: Long, preferredmaximum: Int, classinfoarray: Long, nread: Long, ntotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6(serveripaddress: Long, reservedmustbezero: Int, resumehandle: Long, preferredmaximum: Int, classinfoarray: Long, nread: Long, ntotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, listtype: Int, enumfilterinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues(serveripaddress: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, resumehandle: Long, preferredmaximum: Int, optionvalues: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, resumehandle: Long, preferredmaximum: Int, options: Long, optionsread: Long, optionstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers(flags: Int, idinfo: Long, servers: Long, callbackfn: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5(serveripaddress: Long, subnetaddress: Int, enumelementtype: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions(serveripaddress: Long, flags: Int, optionstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6(serveripaddress: Long, flags: Int, optionstruct: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo(serveripaddress: Long, reservedmustbezero: Int, partialclassinfo: Long, filledclassinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions(serveripaddress: Long, clientipaddress: Int, clientsubnetmask: Int, clientoptions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4(serveripaddress: Long, globalfilterinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6(serveripaddress: Long, mibinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask(sadaptername: Long, dwsubnetmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo(serveripaddress: Long, flags: Int, bindelementsinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6(serveripaddress: Long, flags: Int, bindelementsinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings(serveripaddress: Long, serverspecificstrings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer(serveripaddress: Long, subnetaddress: Int, timedelayinmilliseconds: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4(serveripaddress: Long, superscopetable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions(pflags: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion(serveripaddress: Long, majorversion: Long, minorversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition(policy: Long, parentexpr: Int, type: Int, optionid: Int, suboptionid: Int, vendorname: Long, operator: Int, value: Long, valuelength: Int, conditionindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr(policy: Long, parentexpr: Int, operator: Int, exprindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange(policy: Long, range: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy(policyname: Long, fglobalpolicy: Int, subnet: Int, processingorder: Int, rootoperator: Int, description: Long, enabled: Int, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx(policyname: Long, fglobalpolicy: Int, subnet: Int, processingorder: Int, rootoperator: Int, description: Long, enabled: Int, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty(propertyarray: Long, id: Int, type: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty(property: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray(propertyarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy(policy: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray(policyarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx(policyex: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray(policyexarray: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC(policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid(ppolicy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed(ppolicy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr(policy: Long, operator: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr(policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6(serveripaddress: Long, reservedmustbezero: Int, classinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption(serveripaddress: Long, optionid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5(serveripaddress: Long, subnetaddress: Int, removeelementinfo: Long, forceflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory(bufferpointer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase(serveripaddress: Long, subnetaddress: Int, fixflag: Int, scanlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree(configinfo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase(serveripaddress: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6(serveripaddress: Long, scopeinfo: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ(serveripaddress: Long, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute(serveripaddr: Long, dwreserved: Int, dhcpattribid: Int, pdhcpattrib: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes(serveripaddr: Long, dwreserved: Int, dwattribcount: Int, pdhcpattribs: Long, pdhcpattribarr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials(serveripaddress: Long, unamesize: Int, uname: Long, domainsize: Int, domain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization(serveripaddr: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase(serveripaddress: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6(serveripaddress: Long, scopeinfo: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ(serveripaddress: Long, fieldstoset: Int, configinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials(serveripaddress: Long, uname: Long, domain: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5(serveripaddress: Long, uname: Long, domain: Long, passwd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4(serveripaddress: Long, globalfilterinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo(serveripaddress: Long, optionid: Int, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, optioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue(serveripaddress: Long, optionid: Int, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6(serveripaddress: Long, flags: Int, optionid: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues(serveripaddress: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5(serveripaddress: Long, flags: Int, classname: Long, vendorname: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo(serveripaddress: Long, flags: Int, bindelementinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6(serveripaddress: Long, flags: Int, bindelementinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer(serveripaddress: Long, subnetaddress: Int, timedelayinmilliseconds: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ(serveripaddress: Long, subnetaddress: Int, subnetinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4(serveripaddress: Long, subnetaddress: Int, superscopename: Long, changeexisting: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions(flags: Int, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams(flags: Int, reserved: Long, adaptername: Long, requestidstr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange(serveripaddress: Long, subnetaddress: Int, policyname: Long, range: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy(serveripaddress: Long, ppolicy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx(serveripaddress: Long, policyex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, policyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, fglobalpolicy: Int, subnetaddress: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, globalpolicy: Int, subnetaddress: Int, enuminfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, clientinfo: Long, clientsread: Long, clientstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations(serveripaddress: Long, subnetaddress: Int, resumehandle: Long, preferredmaximum: Int, enumelementinfo: Long, elementsread: Long, elementstotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship(serveripaddress: Long, prelationshipname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship(serveripaddress: Long, resumehandle: Long, preferredmaximum: Int, prelationship: Long, relationshipread: Long, relationshiptotal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus(serveripaddress: Long, subnetaddress: Int, pstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship(serveripaddress: Long, prelationshipname: Long, prelationship: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship(serveripaddress: Long, scopeid: Int, prelationship: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics(serveripaddress: Long, scopeid: Int, pstats: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime(serveripaddress: Long, ptime: Long, pmaxalloweddeltatime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship(serveripaddress: Long, flags: Int, prelationship: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation(serveripaddress: Long, pfailrelname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues(serveripaddress: Long, flags: Int, scopeinfo: Long, values: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx(serveripaddress: Long, searchinfo: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress(serveripaddress: Long, scopeid: Int, startip: Int, endip: Int, numfreeaddrreq: Int, ipaddrlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx(serveripaddress: Long, globalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, enabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange(serveripaddress: Long, subnetaddress: Int, policyname: Long, range: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue(serveripaddress: Long, flags: Int, optionid: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues(serveripaddress: Long, flags: Int, policyname: Long, vendorname: Long, scopeinfo: Long, optionvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy(serveripaddress: Long, fieldsmodified: Int, fglobalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement(serveripaddress: Long, fglobalpolicy: Int, subnetaddress: Int, enable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx(serveripaddress: Long, fieldsmodified: Int, globalpolicy: Int, subnetaddress: Int, policyname: Long, policy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo(serveripaddress: Long, clientinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics(serveripaddress: Long, statelessstats: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize(version: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix(adaptername: Long, classid: Long, leaseinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix(adaptername: Long, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long, bvalidateprefix: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix(adaptername: Long, pclassid: Long, prefixleaseinfo: Long, pdwtimetowait: Long): Int
}

public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: ConstPtr<DhcpFilterAddInfo>, forceflag: Bool): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4(serveripaddress.rawAddress, addfilterinfo.rawAddress, forceflag).toUInt()

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup(pserver.rawAddress).toUInt()

public actual fun dhcpAddServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer(flags.toInt(), idinfo.rawAddress, newserver.rawAddress, callbackfn.rawAddress, callbackdata.rawAddress).toUInt()

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementData>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement(serveripaddress.rawAddress, subnetaddress.toInt(), addelementinfo.rawAddress).toUInt()

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV4>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4(serveripaddress.rawAddress, subnetaddress.toInt(), addelementinfo.rawAddress).toUInt()

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV5>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5(serveripaddress.rawAddress, subnetaddress.toInt(), addelementinfo.rawAddress).toUInt()

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: MutPtr<DhcpSubnetElementDataV6>): UInt =
    0u

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: MutPtr<Pwstr>, diskcheckinterval: MutPtr<UInt>, maxlogfilessize: MutPtr<UInt>, minspaceondisk: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams(serveripaddress.rawAddress, flags.toInt(), auditlogdir.rawAddress, diskcheckinterval.rawAddress, maxlogfilessize.rawAddress, minspaceondisk.rawAddress).toUInt()

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams(serveripaddress.rawAddress, flags.toInt(), auditlogdir.rawAddress, diskcheckinterval.toInt(), maxlogfilessize.toInt(), minspaceondisk.toInt()).toUInt()

public actual fun dhcpCApiCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()
}

public actual fun dhcpCApiInitialize(version: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize(version.rawAddress).toUInt()

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass(serveripaddress.rawAddress, reservedmustbezero.toInt(), classinfo.rawAddress).toUInt()

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6(serveripaddress.rawAddress, reservedmustbezero.toInt(), classinfo.rawAddress).toUInt()

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption(serveripaddress.rawAddress, optionid.toInt(), optioninfo.rawAddress).toUInt()

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, optioninfo.rawAddress).toUInt()

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, optioninfo.rawAddress).toUInt()

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet(serveripaddress.rawAddress, subnetaddress.toInt(), subnetinfo.rawAddress).toUInt()

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt =
    0u

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ(serveripaddress.rawAddress, subnetaddress.toInt(), subnetinfo.rawAddress).toUInt()

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: MutPtr<CVoid>, event: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange(flags.toInt(), reserved.rawAddress, event.rawAddress).toUInt()

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass(serveripaddress.rawAddress, reservedmustbezero.toInt(), classname.rawAddress).toUInt()

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6(serveripaddress.rawAddress, reservedmustbezero.toInt(), classname.rawAddress).toUInt()

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfoV6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: ConstPtr<DhcpAddrPattern>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4(serveripaddress.rawAddress, deletefilterinfo.rawAddress).toUInt()

public actual fun dhcpDeleteServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer(flags.toInt(), idinfo.rawAddress, newserver.rawAddress, callbackfn.rawAddress, callbackdata.rawAddress).toUInt()

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet(serveripaddress.rawAddress, subnetaddress.toInt(), forceflag).toUInt()

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    0u

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4(serveripaddress.rawAddress, superscopename.rawAddress).toUInt()

public actual fun dhcpDsCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()
}

public actual fun dhcpDsInit(): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit().toUInt()

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArray>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses(serveripaddress.rawAddress, reservedmustbezero.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), classinfoarray.rawAddress, nread.rawAddress, ntotal.rawAddress).toUInt()

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArrayV6>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6(serveripaddress.rawAddress, reservedmustbezero.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), classinfoarray.rawAddress, nread.rawAddress, ntotal.rawAddress).toUInt()

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: MutPtr<DhcpAddrPattern>, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: MutPtr<MutPtr<DhcpFilterEnumInfo>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), listtype, enumfilterinfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues(serveripaddress.rawAddress, scopeinfo.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), optionvalues.rawAddress, optionsread.rawAddress, optionstotal.rawAddress).toUInt()

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5(serveripaddress.rawAddress, flags.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), optionvalues.rawAddress, optionsread.rawAddress, optionstotal.rawAddress).toUInt()

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6(serveripaddress.rawAddress, flags.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), optionvalues.rawAddress, optionsread.rawAddress, optionstotal.rawAddress).toUInt()

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), options.rawAddress, optionsread.rawAddress, optionstotal.rawAddress).toUInt()

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5(serveripaddress.rawAddress, flags.toInt(), classname.rawAddress, vendorname.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), options.rawAddress, optionsread.rawAddress, optionstotal.rawAddress).toUInt()

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6(serveripaddress.rawAddress, flags.toInt(), classname.rawAddress, vendorname.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), options.rawAddress, optionsread.rawAddress, optionstotal.rawAddress).toUInt()

public actual fun dhcpEnumServers(flags: UInt, idinfo: MutPtr<CVoid>, servers: MutPtr<MutPtr<DhcpdsServers>>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers(flags.toInt(), idinfo.rawAddress, servers.rawAddress, callbackfn.rawAddress, callbackdata.rawAddress).toUInt()

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientFilterStatusInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV4>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV5>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: MutPtr<DhcpIpv6Address>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV6>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    0u

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayVq>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements(serveripaddress.rawAddress, subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress, preferredmaximum.toInt(), enumelementinfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV4>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4(serveripaddress.rawAddress, subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress, preferredmaximum.toInt(), enumelementinfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV5>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5(serveripaddress.rawAddress, subnetaddress.toInt(), enumelementtype, resumehandle.rawAddress, preferredmaximum.toInt(), enumelementinfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV6>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    0u

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<DhcpIpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), enuminfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<Dhcpv6IpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), enuminfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues(serveripaddress.rawAddress, flags.toInt(), scopeinfo.rawAddress, values.rawAddress).toUInt()

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6(serveripaddress.rawAddress, flags.toInt(), scopeinfo.rawAddress, values.rawAddress).toUInt()

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions(serveripaddress.rawAddress, flags.toInt(), optionstruct.rawAddress).toUInt()

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6(serveripaddress.rawAddress, flags.toInt(), optionstruct.rawAddress).toUInt()

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: MutPtr<DhcpClassInfo>, filledclassinfo: MutPtr<MutPtr<DhcpClassInfo>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo(serveripaddress.rawAddress, reservedmustbezero.toInt(), partialclassinfo.rawAddress, filledclassinfo.rawAddress).toUInt()

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfo>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV4>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfoV6>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV6>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoVq>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: MutPtr<MutPtr<DhcpOptionList>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions(serveripaddress.rawAddress, clientipaddress.toInt(), clientsubnetmask.toInt(), clientoptions.rawAddress).toUInt()

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: MutPtr<DhcpFilterGlobalInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4(serveripaddress.rawAddress, globalfilterinfo.rawAddress).toUInt()

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfo>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo(serveripaddress.rawAddress, mibinfo.rawAddress).toUInt()

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV5>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5(serveripaddress.rawAddress, mibinfo.rawAddress).toUInt()

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV6>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6(serveripaddress.rawAddress, mibinfo.rawAddress).toUInt()

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo(serveripaddress.rawAddress, optionid.toInt(), optioninfo.rawAddress).toUInt()

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, optioninfo.rawAddress).toUInt()

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, optioninfo.rawAddress).toUInt()

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue(serveripaddress.rawAddress, optionid.toInt(), scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask(sadaptername.rawAddress, dwsubnetmask.rawAddress).toUInt()

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<DhcpBindElementArray>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo(serveripaddress.rawAddress, flags.toInt(), bindelementsinfo.rawAddress).toUInt()

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<Dhcpv6BindElementArray>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6(serveripaddress.rawAddress, flags.toInt(), bindelementsinfo.rawAddress).toUInt()

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: MutPtr<MutPtr<DhcpServerSpecificStrings>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings(serveripaddress.rawAddress, serverspecificstrings.rawAddress).toUInt()

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: MutPtr<UShort>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer(serveripaddress.rawAddress, subnetaddress.toInt(), timedelayinmilliseconds.rawAddress).toUInt()

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfo>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo(serveripaddress.rawAddress, subnetaddress.toInt(), subnetinfo.rawAddress).toUInt()

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoV6>>): UInt =
    0u

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoVq>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ(serveripaddress.rawAddress, subnetaddress.toInt(), subnetinfo.rawAddress).toUInt()

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: MutPtr<MutPtr<DhcpSuperScopeTable>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4(serveripaddress.rawAddress, superscopetable.rawAddress).toUInt()

public actual fun dhcpGetThreadOptions(pflags: MutPtr<UInt>, reserved: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions(pflags.rawAddress, reserved.rawAddress).toUInt()

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion(serveripaddress.rawAddress, majorversion.rawAddress, minorversion.rawAddress).toUInt()

public actual fun dhcpHlprAddV4PolicyCondition(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: ConstPtr<UByte>, valuelength: UInt, conditionindex: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition(policy.rawAddress, parentexpr.toInt(), type, optionid.toInt(), suboptionid.toInt(), vendorname.rawAddress, operator, value.rawAddress, valuelength.toInt(), conditionindex.rawAddress).toUInt()

public actual fun dhcpHlprAddV4PolicyExpr(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr(policy.rawAddress, parentexpr.toInt(), operator, exprindex.rawAddress).toUInt()

public actual fun dhcpHlprAddV4PolicyRange(policy: MutPtr<DhcpPolicy>, range: ConstPtr<DhcpIpRange>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange(policy.rawAddress, range.rawAddress).toUInt()

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy(policyname.rawAddress, fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.rawAddress, enabled, policy.rawAddress).toUInt()

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx(policyname.rawAddress, fglobalpolicy, subnet.toInt(), processingorder.toInt(), rootoperator, description.rawAddress, enabled, policy.rawAddress).toUInt()

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: ConstPtr<DhcpPropertyArray>, id: DhcpPropertyId, type: DhcpPropertyType): MutPtr<DhcpProperty> =
    MutPtr(WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty(propertyarray.rawAddress, id, type))

public actual fun dhcpHlprFreeV4DhcpProperty(property: MutPtr<DhcpProperty>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty(property.rawAddress)
}

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: MutPtr<DhcpPropertyArray>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray(propertyarray.rawAddress)
}

public actual fun dhcpHlprFreeV4Policy(policy: MutPtr<DhcpPolicy>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy(policy.rawAddress)
}

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: MutPtr<DhcpPolicyArray>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray(policyarray.rawAddress)
}

public actual fun dhcpHlprFreeV4PolicyEx(policyex: MutPtr<DhcpPolicyEx>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx(policyex.rawAddress)
}

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: MutPtr<DhcpPolicyExArray>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray(policyexarray.rawAddress)
}

public actual fun dhcpHlprIsV4PolicySingleUC(policy: ConstPtr<DhcpPolicy>): Bool =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC(policy.rawAddress)

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: ConstPtr<DhcpPolicy>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid(ppolicy.rawAddress).toUInt()

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: ConstPtr<DhcpPolicy>): Bool =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed(ppolicy.rawAddress)

public actual fun dhcpHlprModifyV4PolicyExpr(policy: MutPtr<DhcpPolicy>, operator: DhcpPolLogicOper): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr(policy.rawAddress, operator).toUInt()

public actual fun dhcpHlprResetV4PolicyExpr(policy: MutPtr<DhcpPolicy>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr(policy.rawAddress).toUInt()

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass(serveripaddress.rawAddress, reservedmustbezero.toInt(), classinfo.rawAddress).toUInt()

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6(serveripaddress.rawAddress, reservedmustbezero.toInt(), classinfo.rawAddress).toUInt()

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, params: DhcpcapiParamsArray, handle: MutPtr<CVoid>): UInt =
    0u

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations().toUInt()

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption(serveripaddress.rawAddress, optionid.toInt()).toUInt()

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress).toUInt()

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress).toUInt()

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue(serveripaddress.rawAddress, optionid.toInt(), scopeinfo.rawAddress).toUInt()

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress).toUInt()

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress).toUInt()

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementData>, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement(serveripaddress.rawAddress, subnetaddress.toInt(), removeelementinfo.rawAddress, forceflag).toUInt()

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV4>, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4(serveripaddress.rawAddress, subnetaddress.toInt(), removeelementinfo.rawAddress, forceflag).toUInt()

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV5>, forceflag: DhcpForceFlag): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5(serveripaddress.rawAddress, subnetaddress.toInt(), removeelementinfo.rawAddress, forceflag).toUInt()

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: MutPtr<DhcpSubnetElementDataV6>, forceflag: DhcpForceFlag): UInt =
    0u

public actual fun dhcpRequestParams(flags: UInt, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>, requestidstr: Pcwstr): UInt =
    0u

public actual fun dhcpRpcFreeMemory(bufferpointer: MutPtr<CVoid>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory(bufferpointer.rawAddress)
}

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: MutPtr<MutPtr<DhcpScanList>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase(serveripaddress.rawAddress, subnetaddress.toInt(), fixflag.toInt(), scanlist.rawAddress).toUInt()

public actual fun dhcpServerAuditlogParamsFree(configinfo: MutPtr<DhcpServerConfigInfoVq>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree(configinfo.rawAddress)
}

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase(serveripaddress.rawAddress, path.rawAddress).toUInt()

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfo>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig(serveripaddress.rawAddress, configinfo.rawAddress).toUInt()

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV4>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4(serveripaddress.rawAddress, configinfo.rawAddress).toUInt()

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV6>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6(serveripaddress.rawAddress, scopeinfo.rawAddress, configinfo.rawAddress).toUInt()

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoVq>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ(serveripaddress.rawAddress, configinfo.rawAddress).toUInt()

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: MutPtr<MutPtr<DhcpAttrib>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute(serveripaddr.rawAddress, dwreserved.toInt(), dhcpattribid.toInt(), pdhcpattrib.rawAddress).toUInt()

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: MutPtr<UInt>, pdhcpattribarr: MutPtr<MutPtr<DhcpAttribArray>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes(serveripaddr.rawAddress, dwreserved.toInt(), dwattribcount.toInt(), pdhcpattribs.rawAddress, pdhcpattribarr.rawAddress).toUInt()

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials(serveripaddress.rawAddress, unamesize.toInt(), uname.rawAddress, domainsize.toInt(), domain.rawAddress).toUInt()

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization(serveripaddr.rawAddress, dwreserved.toInt()).toUInt()

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase(serveripaddress.rawAddress, path.rawAddress).toUInt()

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig(serveripaddress.rawAddress, fieldstoset.toInt(), configinfo.rawAddress).toUInt()

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV4>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4(serveripaddress.rawAddress, fieldstoset.toInt(), configinfo.rawAddress).toUInt()

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6(serveripaddress.rawAddress, scopeinfo.rawAddress, fieldstoset.toInt(), configinfo.rawAddress).toUInt()

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoVq>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ(serveripaddress.rawAddress, fieldstoset.toInt(), configinfo.rawAddress).toUInt()

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials(serveripaddress.rawAddress, uname.rawAddress, domain.rawAddress, passwd.rawAddress).toUInt()

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5(serveripaddress.rawAddress, uname.rawAddress, domain.rawAddress, passwd.rawAddress).toUInt()

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: ConstPtr<DhcpFilterGlobalInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4(serveripaddress.rawAddress, globalfilterinfo.rawAddress).toUInt()

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo(serveripaddress.rawAddress, optionid.toInt(), optioninfo.rawAddress).toUInt()

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, optioninfo.rawAddress).toUInt()

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, optioninfo.rawAddress).toUInt()

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: ConstPtr<DhcpOptionData>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue(serveripaddress.rawAddress, optionid.toInt(), scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalues: ConstPtr<DhcpOptionValueArray>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues(serveripaddress.rawAddress, scopeinfo.rawAddress, optionvalues.rawAddress).toUInt()

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5(serveripaddress.rawAddress, flags.toInt(), classname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalues.rawAddress).toUInt()

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<DhcpBindElementArray>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo(serveripaddress.rawAddress, flags.toInt(), bindelementinfo.rawAddress).toUInt()

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<Dhcpv6BindElementArray>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6(serveripaddress.rawAddress, flags.toInt(), bindelementinfo.rawAddress).toUInt()

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer(serveripaddress.rawAddress, subnetaddress.toInt(), timedelayinmilliseconds.toShort()).toUInt()

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo(serveripaddress.rawAddress, subnetaddress.toInt(), subnetinfo.rawAddress).toUInt()

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt =
    0u

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ(serveripaddress.rawAddress, subnetaddress.toInt(), subnetinfo.rawAddress).toUInt()

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4(serveripaddress.rawAddress, subnetaddress.toInt(), superscopename.rawAddress, changeexisting).toUInt()

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions(flags.toInt(), reserved.rawAddress).toUInt()

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams(flags.toInt(), reserved.rawAddress, adaptername.rawAddress, requestidstr.rawAddress).toUInt()

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange(serveripaddress.rawAddress, subnetaddress.toInt(), policyname.rawAddress, range.rawAddress).toUInt()

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoPb>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoEx>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: ConstPtr<DhcpPolicy>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy(serveripaddress.rawAddress, ppolicy.rawAddress).toUInt()

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: ConstPtr<DhcpPolicyEx>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx(serveripaddress.rawAddress, policyex.rawAddress).toUInt()

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy(serveripaddress.rawAddress, fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress).toUInt()

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), fglobalpolicy, subnetaddress.toInt(), enuminfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyExArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), globalpolicy, subnetaddress.toInt(), enuminfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoPbArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoExArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), clientinfo.rawAddress, clientsread.rawAddress, clientstotal.rawAddress).toUInt()

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpReservationInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations(serveripaddress.rawAddress, subnetaddress.toInt(), resumehandle.rawAddress, preferredmaximum.toInt(), enumelementinfo.rawAddress, elementsread.rawAddress, elementstotal.rawAddress).toUInt()

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship(serveripaddress.rawAddress, prelationship.rawAddress).toUInt()

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship(serveripaddress.rawAddress, prelationship.rawAddress).toUInt()

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship(serveripaddress.rawAddress, prelationshipname.rawAddress).toUInt()

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship(serveripaddress.rawAddress, prelationship.rawAddress).toUInt()

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationshipArray>>, relationshipread: MutPtr<UInt>, relationshiptotal: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship(serveripaddress.rawAddress, resumehandle.rawAddress, preferredmaximum.toInt(), prelationship.rawAddress, relationshipread.rawAddress, relationshiptotal.rawAddress).toUInt()

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus(serveripaddress.rawAddress, subnetaddress.toInt(), pstatus.rawAddress).toUInt()

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship(serveripaddress.rawAddress, prelationshipname.rawAddress, prelationship.rawAddress).toUInt()

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship(serveripaddress.rawAddress, scopeid.toInt(), prelationship.rawAddress).toUInt()

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: MutPtr<MutPtr<DhcpFailoverStatistics>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics(serveripaddress.rawAddress, scopeid.toInt(), pstats.rawAddress).toUInt()

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: MutPtr<UInt>, pmaxalloweddeltatime: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime(serveripaddress.rawAddress, ptime.rawAddress, pmaxalloweddeltatime.rawAddress).toUInt()

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship(serveripaddress.rawAddress, flags.toInt(), prelationship.rawAddress).toUInt()

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation(serveripaddress.rawAddress, pfailrelname.rawAddress).toUInt()

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValuesPb>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues(serveripaddress.rawAddress, flags.toInt(), scopeinfo.rawAddress, values.rawAddress).toUInt()

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoPb>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoEx>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx(serveripaddress.rawAddress, searchinfo.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<DhcpIpArray>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress(serveripaddress.rawAddress, scopeid.toInt(), startip.toInt(), endip.toInt(), numfreeaddrreq.toInt(), ipaddrlist.rawAddress).toUInt()

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), policyname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy(serveripaddress.rawAddress, fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress, policy.rawAddress).toUInt()

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx(serveripaddress.rawAddress, globalpolicy, subnetaddress.toInt(), policyname.rawAddress, policy.rawAddress).toUInt()

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: MutPtr<Bool>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement(serveripaddress.rawAddress, fglobalpolicy, subnetaddress.toInt(), enabled.rawAddress).toUInt()

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), policyname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress).toUInt()

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange(serveripaddress.rawAddress, subnetaddress.toInt(), policyname.rawAddress, range.rawAddress).toUInt()

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue(serveripaddress.rawAddress, flags.toInt(), optionid.toInt(), policyname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalue.rawAddress).toUInt()

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues(serveripaddress.rawAddress, flags.toInt(), policyname.rawAddress, vendorname.rawAddress, scopeinfo.rawAddress, optionvalues.rawAddress).toUInt()

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicy>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy(serveripaddress.rawAddress, fieldsmodified.toInt(), fglobalpolicy, subnetaddress.toInt(), policyname.rawAddress, policy.rawAddress).toUInt()

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement(serveripaddress.rawAddress, fglobalpolicy, subnetaddress.toInt(), enable).toUInt()

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicyEx>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx(serveripaddress.rawAddress, fieldsmodified.toInt(), globalpolicy, subnetaddress.toInt(), policyname.rawAddress, policy.rawAddress).toUInt()

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo(serveripaddress.rawAddress, clientinfo.rawAddress).toUInt()

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<Dhcpv6IpArray>>): UInt =
    0u

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: MutPtr<MutPtr<Dhcpv6StatelessStats>>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics(serveripaddress.rawAddress, statelessstats.rawAddress).toUInt()

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: MutPtr<MutPtr<Dhcpv6StatelessParams>>): UInt =
    0u

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: ConstPtr<Dhcpv6StatelessParams>): UInt =
    0u

public actual fun dhcpv6CApiCleanup() {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()
}

public actual fun dhcpv6CApiInitialize(version: MutPtr<UInt>) {
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize(version.rawAddress)
}

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, leaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix(adaptername.rawAddress, classid.rawAddress, leaseinfo.rawAddress).toUInt()

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>, bvalidateprefix: UInt): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix(adaptername.rawAddress, pclassid.rawAddress, prefixleaseinfo.rawAddress, pdwtimetowait.rawAddress, bvalidateprefix.toInt()).toUInt()

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, recdparams: Dhcpv6capiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>): UInt =
    0u

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementDhcpJniBridge.windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix(adaptername.rawAddress, pclassid.rawAddress, prefixleaseinfo.rawAddress, pdwtimetowait.rawAddress).toUInt()
