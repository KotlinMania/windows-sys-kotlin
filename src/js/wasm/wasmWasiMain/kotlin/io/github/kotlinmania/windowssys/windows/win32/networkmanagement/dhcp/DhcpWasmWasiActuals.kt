@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dhcp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dhcpAddFilterV4(serveripaddress: Pcwstr, addfilterinfo: ConstPtr<DhcpFilterAddInfo>, forceflag: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddFilterV4")

public actual fun dhcpAddSecurityGroup(pserver: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSecurityGroup")

public actual fun dhcpAddServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddServer")

public actual fun dhcpAddSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElement")

public actual fun dhcpAddSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV4>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV4")

public actual fun dhcpAddSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, addelementinfo: ConstPtr<DhcpSubnetElementDataV5>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV5")

public actual fun dhcpAddSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, addelementinfo: MutPtr<DhcpSubnetElementDataV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAddSubnetElementV6")

public actual fun dhcpAuditLogGetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: MutPtr<Pwstr>, diskcheckinterval: MutPtr<UInt>, maxlogfilessize: MutPtr<UInt>, minspaceondisk: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogGetParams")

public actual fun dhcpAuditLogSetParams(serveripaddress: Pcwstr, flags: UInt, auditlogdir: Pcwstr, diskcheckinterval: UInt, maxlogfilessize: UInt, minspaceondisk: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpAuditLogSetParams")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup(): Unit

public actual fun dhcpCApiCleanup(): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpCApiCleanup()

public actual fun dhcpCApiInitialize(version: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCApiInitialize")

public actual fun dhcpCreateClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClass")

public actual fun dhcpCreateClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClassV6")

public actual fun dhcpCreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfo")

public actual fun dhcpCreateClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoV4")

public actual fun dhcpCreateClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateClientInfoVQ")

public actual fun dhcpCreateOption(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOption")

public actual fun dhcpCreateOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV5")

public actual fun dhcpCreateOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateOptionV6")

public actual fun dhcpCreateSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnet")

public actual fun dhcpCreateSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetV6")

public actual fun dhcpCreateSubnetVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpCreateSubnetVQ")

public actual fun dhcpDeRegisterParamChange(flags: UInt, reserved: MutPtr<CVoid>, event: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeRegisterParamChange")

public actual fun dhcpDeleteClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClass")

public actual fun dhcpDeleteClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClassV6")

public actual fun dhcpDeleteClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfo")

public actual fun dhcpDeleteClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpSearchInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteClientInfoV6")

public actual fun dhcpDeleteFilterV4(serveripaddress: Pcwstr, deletefilterinfo: ConstPtr<DhcpAddrPattern>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteFilterV4")

public actual fun dhcpDeleteServer(flags: UInt, idinfo: MutPtr<CVoid>, newserver: MutPtr<DhcpdsServer>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteServer")

public actual fun dhcpDeleteSubnet(serveripaddress: Pcwstr, subnetaddress: UInt, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnet")

public actual fun dhcpDeleteSubnetV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSubnetV6")

public actual fun dhcpDeleteSuperScopeV4(serveripaddress: Pcwstr, superscopename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpDeleteSuperScopeV4")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup(): Unit

public actual fun dhcpDsCleanup(): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsCleanup()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit")
private external fun wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit(): Int

public actual fun dhcpDsInit(): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpDsInit().toUInt()

public actual fun dhcpEnumClasses(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArray>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClasses")

public actual fun dhcpEnumClassesV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, classinfoarray: MutPtr<MutPtr<DhcpClassInfoArrayV6>>, nread: MutPtr<UInt>, ntotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumClassesV6")

public actual fun dhcpEnumFilterV4(serveripaddress: Pcwstr, resumehandle: MutPtr<DhcpAddrPattern>, preferredmaximum: UInt, listtype: DhcpFilterListType, enumfilterinfo: MutPtr<MutPtr<DhcpFilterEnumInfo>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumFilterV4")

public actual fun dhcpEnumOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValues")

public actual fun dhcpEnumOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV5")

public actual fun dhcpEnumOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, optionvalues: MutPtr<MutPtr<DhcpOptionValueArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionValuesV6")

public actual fun dhcpEnumOptions(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptions")

public actual fun dhcpEnumOptionsV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV5")

public actual fun dhcpEnumOptionsV6(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, options: MutPtr<MutPtr<DhcpOptionArray>>, optionsread: MutPtr<UInt>, optionstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumOptionsV6")

public actual fun dhcpEnumServers(flags: UInt, idinfo: MutPtr<CVoid>, servers: MutPtr<MutPtr<DhcpdsServers>>, callbackfn: MutPtr<CVoid>, callbackdata: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumServers")

public actual fun dhcpEnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClients")

public actual fun dhcpEnumSubnetClientsFilterStatusInfo(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientFilterStatusInfoArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsFilterStatusInfo")

public actual fun dhcpEnumSubnetClientsV4(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV4>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV4")

public actual fun dhcpEnumSubnetClientsV5(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV5>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV5")

public actual fun dhcpEnumSubnetClientsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, resumehandle: MutPtr<DhcpIpv6Address>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayV6>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsV6")

public actual fun dhcpEnumSubnetClientsVQ(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoArrayVq>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetClientsVQ")

public actual fun dhcpEnumSubnetElements(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElements")

public actual fun dhcpEnumSubnetElementsV4(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV4>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV4")

public actual fun dhcpEnumSubnetElementsV5(serveripaddress: Pcwstr, subnetaddress: UInt, enumelementtype: DhcpSubnetElementType, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV5>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV5")

public actual fun dhcpEnumSubnetElementsV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, enumelementtype: DhcpSubnetElementTypeV6, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpSubnetElementInfoArrayV6>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetElementsV6")

public actual fun dhcpEnumSubnets(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<DhcpIpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnets")

public actual fun dhcpEnumSubnetsV6(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enuminfo: MutPtr<MutPtr<Dhcpv6IpArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpEnumSubnetsV6")

public actual fun dhcpGetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValues")

public actual fun dhcpGetAllOptionValuesV6(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, values: MutPtr<MutPtr<DhcpAllOptionValues>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionValuesV6")

public actual fun dhcpGetAllOptions(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptions")

public actual fun dhcpGetAllOptionsV6(serveripaddress: Pcwstr, flags: UInt, optionstruct: MutPtr<MutPtr<DhcpAllOptions>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetAllOptionsV6")

public actual fun dhcpGetClassInfo(serveripaddress: Pcwstr, reservedmustbezero: UInt, partialclassinfo: MutPtr<DhcpClassInfo>, filledclassinfo: MutPtr<MutPtr<DhcpClassInfo>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClassInfo")

public actual fun dhcpGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfo>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfo")

public actual fun dhcpGetClientInfoV4(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV4>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV4")

public actual fun dhcpGetClientInfoV6(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfoV6>, clientinfo: MutPtr<MutPtr<DhcpClientInfoV6>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoV6")

public actual fun dhcpGetClientInfoVQ(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoVq>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientInfoVQ")

public actual fun dhcpGetClientOptions(serveripaddress: Pcwstr, clientipaddress: UInt, clientsubnetmask: UInt, clientoptions: MutPtr<MutPtr<DhcpOptionList>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetClientOptions")

public actual fun dhcpGetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: MutPtr<DhcpFilterGlobalInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetFilterV4")

public actual fun dhcpGetMibInfo(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfo>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfo")

public actual fun dhcpGetMibInfoV5(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV5>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV5")

public actual fun dhcpGetMibInfoV6(serveripaddress: Pcwstr, mibinfo: MutPtr<MutPtr<DhcpMibInfoV6>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetMibInfoV6")

public actual fun dhcpGetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfo")

public actual fun dhcpGetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV5")

public actual fun dhcpGetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<MutPtr<DhcpOption>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionInfoV6")

public actual fun dhcpGetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValue")

public actual fun dhcpGetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV5")

public actual fun dhcpGetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOptionValueV6")

public actual fun dhcpGetOriginalSubnetMask(sadaptername: Pcwstr, dwsubnetmask: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetOriginalSubnetMask")

public actual fun dhcpGetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<DhcpBindElementArray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfo")

public actual fun dhcpGetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementsinfo: MutPtr<MutPtr<Dhcpv6BindElementArray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerBindingInfoV6")

public actual fun dhcpGetServerSpecificStrings(serveripaddress: Pcwstr, serverspecificstrings: MutPtr<MutPtr<DhcpServerSpecificStrings>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetServerSpecificStrings")

public actual fun dhcpGetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: MutPtr<UShort>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetDelayOffer")

public actual fun dhcpGetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfo>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfo")

public actual fun dhcpGetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoV6>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoV6")

public actual fun dhcpGetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: MutPtr<MutPtr<DhcpSubnetInfoVq>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSubnetInfoVQ")

public actual fun dhcpGetSuperScopeInfoV4(serveripaddress: Pcwstr, superscopetable: MutPtr<MutPtr<DhcpSuperScopeTable>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetSuperScopeInfoV4")

public actual fun dhcpGetThreadOptions(pflags: MutPtr<UInt>, reserved: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetThreadOptions")

public actual fun dhcpGetVersion(serveripaddress: Pcwstr, majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpGetVersion")

public actual fun dhcpHlprAddV4PolicyCondition(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, type: DhcpPolAttrType, optionid: UInt, suboptionid: UInt, vendorname: Pcwstr, operator: DhcpPolComparator, value: ConstPtr<UByte>, valuelength: UInt, conditionindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyCondition")

public actual fun dhcpHlprAddV4PolicyExpr(policy: MutPtr<DhcpPolicy>, parentexpr: UInt, operator: DhcpPolLogicOper, exprindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyExpr")

public actual fun dhcpHlprAddV4PolicyRange(policy: MutPtr<DhcpPolicy>, range: ConstPtr<DhcpIpRange>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprAddV4PolicyRange")

public actual fun dhcpHlprCreateV4Policy(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4Policy")

public actual fun dhcpHlprCreateV4PolicyEx(policyname: Pcwstr, fglobalpolicy: Bool, subnet: UInt, processingorder: UInt, rootoperator: DhcpPolLogicOper, description: Pcwstr, enabled: Bool, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprCreateV4PolicyEx")

public actual fun dhcpHlprFindV4DhcpProperty(propertyarray: ConstPtr<DhcpPropertyArray>, id: DhcpPropertyId, type: DhcpPropertyType): MutPtr<DhcpProperty> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFindV4DhcpProperty")

public actual fun dhcpHlprFreeV4DhcpProperty(property: MutPtr<DhcpProperty>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpProperty")

public actual fun dhcpHlprFreeV4DhcpPropertyArray(propertyarray: MutPtr<DhcpPropertyArray>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4DhcpPropertyArray")

public actual fun dhcpHlprFreeV4Policy(policy: MutPtr<DhcpPolicy>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4Policy")

public actual fun dhcpHlprFreeV4PolicyArray(policyarray: MutPtr<DhcpPolicyArray>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyArray")

public actual fun dhcpHlprFreeV4PolicyEx(policyex: MutPtr<DhcpPolicyEx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyEx")

public actual fun dhcpHlprFreeV4PolicyExArray(policyexarray: MutPtr<DhcpPolicyExArray>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprFreeV4PolicyExArray")

public actual fun dhcpHlprIsV4PolicySingleUC(policy: ConstPtr<DhcpPolicy>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicySingleUC")

public actual fun dhcpHlprIsV4PolicyValid(ppolicy: ConstPtr<DhcpPolicy>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyValid")

public actual fun dhcpHlprIsV4PolicyWellFormed(ppolicy: ConstPtr<DhcpPolicy>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprIsV4PolicyWellFormed")

public actual fun dhcpHlprModifyV4PolicyExpr(policy: MutPtr<DhcpPolicy>, operator: DhcpPolLogicOper): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprModifyV4PolicyExpr")

public actual fun dhcpHlprResetV4PolicyExpr(policy: MutPtr<DhcpPolicy>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpHlprResetV4PolicyExpr")

public actual fun dhcpModifyClass(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClass")

public actual fun dhcpModifyClassV6(serveripaddress: Pcwstr, reservedmustbezero: UInt, classinfo: MutPtr<DhcpClassInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpModifyClassV6")

public actual fun dhcpRegisterParamChange(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, params: DhcpcapiParamsArray, handle: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRegisterParamChange")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations")
private external fun wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations(): Int

public actual fun dhcpRemoveDNSRegistrations(): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveDNSRegistrations().toUInt()

public actual fun dhcpRemoveOption(serveripaddress: Pcwstr, optionid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOption")

public actual fun dhcpRemoveOptionV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV5")

public actual fun dhcpRemoveOptionV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionV6")

public actual fun dhcpRemoveOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValue")

public actual fun dhcpRemoveOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV5")

public actual fun dhcpRemoveOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveOptionValueV6")

public actual fun dhcpRemoveSubnetElement(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementData>, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElement")

public actual fun dhcpRemoveSubnetElementV4(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV4>, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV4")

public actual fun dhcpRemoveSubnetElementV5(serveripaddress: Pcwstr, subnetaddress: UInt, removeelementinfo: ConstPtr<DhcpSubnetElementDataV5>, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV5")

public actual fun dhcpRemoveSubnetElementV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, removeelementinfo: MutPtr<DhcpSubnetElementDataV6>, forceflag: DhcpForceFlag): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRemoveSubnetElementV6")

public actual fun dhcpRequestParams(flags: UInt, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<DhcpcapiClassid>, sendparams: DhcpcapiParamsArray, recdparams: DhcpcapiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRequestParams")

public actual fun dhcpRpcFreeMemory(bufferpointer: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpRpcFreeMemory")

public actual fun dhcpScanDatabase(serveripaddress: Pcwstr, subnetaddress: UInt, fixflag: UInt, scanlist: MutPtr<MutPtr<DhcpScanList>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpScanDatabase")

public actual fun dhcpServerAuditlogParamsFree(configinfo: MutPtr<DhcpServerConfigInfoVq>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerAuditlogParamsFree")

public actual fun dhcpServerBackupDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerBackupDatabase")

public actual fun dhcpServerGetConfig(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfo>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfig")

public actual fun dhcpServerGetConfigV4(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV4>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV4")

public actual fun dhcpServerGetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoV6>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigV6")

public actual fun dhcpServerGetConfigVQ(serveripaddress: Pcwstr, configinfo: MutPtr<MutPtr<DhcpServerConfigInfoVq>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerGetConfigVQ")

public actual fun dhcpServerQueryAttribute(serveripaddr: Pcwstr, dwreserved: UInt, dhcpattribid: UInt, pdhcpattrib: MutPtr<MutPtr<DhcpAttrib>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttribute")

public actual fun dhcpServerQueryAttributes(serveripaddr: Pcwstr, dwreserved: UInt, dwattribcount: UInt, pdhcpattribs: MutPtr<UInt>, pdhcpattribarr: MutPtr<MutPtr<DhcpAttribArray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryAttributes")

public actual fun dhcpServerQueryDnsRegCredentials(serveripaddress: Pcwstr, unamesize: UInt, uname: Pwstr, domainsize: UInt, domain: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerQueryDnsRegCredentials")

public actual fun dhcpServerRedoAuthorization(serveripaddr: Pcwstr, dwreserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRedoAuthorization")

public actual fun dhcpServerRestoreDatabase(serveripaddress: Pcwstr, path: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerRestoreDatabase")

public actual fun dhcpServerSetConfig(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfig")

public actual fun dhcpServerSetConfigV4(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV4>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV4")

public actual fun dhcpServerSetConfigV6(serveripaddress: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigV6")

public actual fun dhcpServerSetConfigVQ(serveripaddress: Pcwstr, fieldstoset: UInt, configinfo: MutPtr<DhcpServerConfigInfoVq>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetConfigVQ")

public actual fun dhcpServerSetDnsRegCredentials(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentials")

public actual fun dhcpServerSetDnsRegCredentialsV5(serveripaddress: Pcwstr, uname: Pcwstr, domain: Pcwstr, passwd: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpServerSetDnsRegCredentialsV5")

public actual fun dhcpSetClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfo")

public actual fun dhcpSetClientInfoV4(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV4>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV4")

public actual fun dhcpSetClientInfoV6(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoV6")

public actual fun dhcpSetClientInfoVQ(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoVq>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetClientInfoVQ")

public actual fun dhcpSetFilterV4(serveripaddress: Pcwstr, globalfilterinfo: ConstPtr<DhcpFilterGlobalInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetFilterV4")

public actual fun dhcpSetOptionInfo(serveripaddress: Pcwstr, optionid: UInt, optioninfo: ConstPtr<DhcpOption>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfo")

public actual fun dhcpSetOptionInfoV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV5")

public actual fun dhcpSetOptionInfoV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, optioninfo: MutPtr<DhcpOption>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionInfoV6")

public actual fun dhcpSetOptionValue(serveripaddress: Pcwstr, optionid: UInt, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalue: ConstPtr<DhcpOptionData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValue")

public actual fun dhcpSetOptionValueV5(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV5")

public actual fun dhcpSetOptionValueV6(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo6>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValueV6")

public actual fun dhcpSetOptionValues(serveripaddress: Pcwstr, scopeinfo: ConstPtr<DhcpOptionScopeInfo>, optionvalues: ConstPtr<DhcpOptionValueArray>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValues")

public actual fun dhcpSetOptionValuesV5(serveripaddress: Pcwstr, flags: UInt, classname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetOptionValuesV5")

public actual fun dhcpSetServerBindingInfo(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<DhcpBindElementArray>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfo")

public actual fun dhcpSetServerBindingInfoV6(serveripaddress: Pcwstr, flags: UInt, bindelementinfo: MutPtr<Dhcpv6BindElementArray>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetServerBindingInfoV6")

public actual fun dhcpSetSubnetDelayOffer(serveripaddress: Pcwstr, subnetaddress: UInt, timedelayinmilliseconds: UShort): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetDelayOffer")

public actual fun dhcpSetSubnetInfo(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfo")

public actual fun dhcpSetSubnetInfoV6(serveripaddress: Pcwstr, subnetaddress: DhcpIpv6Address, subnetinfo: MutPtr<DhcpSubnetInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoV6")

public actual fun dhcpSetSubnetInfoVQ(serveripaddress: Pcwstr, subnetaddress: UInt, subnetinfo: ConstPtr<DhcpSubnetInfoVq>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSubnetInfoVQ")

public actual fun dhcpSetSuperScopeV4(serveripaddress: Pcwstr, subnetaddress: UInt, superscopename: Pcwstr, changeexisting: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetSuperScopeV4")

public actual fun dhcpSetThreadOptions(flags: UInt, reserved: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpSetThreadOptions")

public actual fun dhcpUndoRequestParams(flags: UInt, reserved: ConstPtr<CVoid>, adaptername: Pcwstr, requestidstr: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpUndoRequestParams")

public actual fun dhcpV4AddPolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4AddPolicyRange")

public actual fun dhcpV4CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoPb>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfo")

public actual fun dhcpV4CreateClientInfoEx(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoEx>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreateClientInfoEx")

public actual fun dhcpV4CreatePolicy(serveripaddress: Pcwstr, ppolicy: ConstPtr<DhcpPolicy>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicy")

public actual fun dhcpV4CreatePolicyEx(serveripaddress: Pcwstr, policyex: ConstPtr<DhcpPolicyEx>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4CreatePolicyEx")

public actual fun dhcpV4DeletePolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4DeletePolicy")

public actual fun dhcpV4EnumPolicies(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, fglobalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPolicies")

public actual fun dhcpV4EnumPoliciesEx(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, globalpolicy: Bool, subnetaddress: UInt, enuminfo: MutPtr<MutPtr<DhcpPolicyExArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumPoliciesEx")

public actual fun dhcpV4EnumSubnetClients(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoPbArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClients")

public actual fun dhcpV4EnumSubnetClientsEx(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, clientinfo: MutPtr<MutPtr<DhcpClientInfoExArray>>, clientsread: MutPtr<UInt>, clientstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetClientsEx")

public actual fun dhcpV4EnumSubnetReservations(serveripaddress: Pcwstr, subnetaddress: UInt, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, enumelementinfo: MutPtr<MutPtr<DhcpReservationInfoArray>>, elementsread: MutPtr<UInt>, elementstotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4EnumSubnetReservations")

public actual fun dhcpV4FailoverAddScopeToRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverAddScopeToRelationship")

public actual fun dhcpV4FailoverCreateRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverCreateRelationship")

public actual fun dhcpV4FailoverDeleteRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteRelationship")

public actual fun dhcpV4FailoverDeleteScopeFromRelationship(serveripaddress: Pcwstr, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverDeleteScopeFromRelationship")

public actual fun dhcpV4FailoverEnumRelationship(serveripaddress: Pcwstr, resumehandle: MutPtr<UInt>, preferredmaximum: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationshipArray>>, relationshipread: MutPtr<UInt>, relationshiptotal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverEnumRelationship")

public actual fun dhcpV4FailoverGetAddressStatus(serveripaddress: Pcwstr, subnetaddress: UInt, pstatus: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetAddressStatus")

public actual fun dhcpV4FailoverGetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<Dhcpv4FailoverClientInfo>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetClientInfo")

public actual fun dhcpV4FailoverGetRelationship(serveripaddress: Pcwstr, prelationshipname: Pcwstr, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetRelationship")

public actual fun dhcpV4FailoverGetScopeRelationship(serveripaddress: Pcwstr, scopeid: UInt, prelationship: MutPtr<MutPtr<DhcpFailoverRelationship>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeRelationship")

public actual fun dhcpV4FailoverGetScopeStatistics(serveripaddress: Pcwstr, scopeid: UInt, pstats: MutPtr<MutPtr<DhcpFailoverStatistics>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetScopeStatistics")

public actual fun dhcpV4FailoverGetSystemTime(serveripaddress: Pcwstr, ptime: MutPtr<UInt>, pmaxalloweddeltatime: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverGetSystemTime")

public actual fun dhcpV4FailoverSetRelationship(serveripaddress: Pcwstr, flags: UInt, prelationship: ConstPtr<DhcpFailoverRelationship>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverSetRelationship")

public actual fun dhcpV4FailoverTriggerAddrAllocation(serveripaddress: Pcwstr, pfailrelname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4FailoverTriggerAddrAllocation")

public actual fun dhcpV4GetAllOptionValues(serveripaddress: Pcwstr, flags: UInt, scopeinfo: MutPtr<DhcpOptionScopeInfo>, values: MutPtr<MutPtr<DhcpAllOptionValuesPb>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetAllOptionValues")

public actual fun dhcpV4GetClientInfo(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoPb>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfo")

public actual fun dhcpV4GetClientInfoEx(serveripaddress: Pcwstr, searchinfo: ConstPtr<DhcpSearchInfo>, clientinfo: MutPtr<MutPtr<DhcpClientInfoEx>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetClientInfoEx")

public actual fun dhcpV4GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: UInt, startip: UInt, endip: UInt, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<DhcpIpArray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetFreeIPAddress")

public actual fun dhcpV4GetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<MutPtr<DhcpOptionValue>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetOptionValue")

public actual fun dhcpV4GetPolicy(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicy>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicy")

public actual fun dhcpV4GetPolicyEx(serveripaddress: Pcwstr, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: MutPtr<MutPtr<DhcpPolicyEx>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4GetPolicyEx")

public actual fun dhcpV4QueryPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enabled: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4QueryPolicyEnforcement")

public actual fun dhcpV4RemoveOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemoveOptionValue")

public actual fun dhcpV4RemovePolicyRange(serveripaddress: Pcwstr, subnetaddress: UInt, policyname: Pcwstr, range: ConstPtr<DhcpIpRange>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4RemovePolicyRange")

public actual fun dhcpV4SetOptionValue(serveripaddress: Pcwstr, flags: UInt, optionid: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalue: MutPtr<DhcpOptionData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValue")

public actual fun dhcpV4SetOptionValues(serveripaddress: Pcwstr, flags: UInt, policyname: Pcwstr, vendorname: Pcwstr, scopeinfo: MutPtr<DhcpOptionScopeInfo>, optionvalues: MutPtr<DhcpOptionValueArray>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetOptionValues")

public actual fun dhcpV4SetPolicy(serveripaddress: Pcwstr, fieldsmodified: UInt, fglobalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicy>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicy")

public actual fun dhcpV4SetPolicyEnforcement(serveripaddress: Pcwstr, fglobalpolicy: Bool, subnetaddress: UInt, enable: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEnforcement")

public actual fun dhcpV4SetPolicyEx(serveripaddress: Pcwstr, fieldsmodified: UInt, globalpolicy: Bool, subnetaddress: UInt, policyname: Pcwstr, policy: ConstPtr<DhcpPolicyEx>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV4SetPolicyEx")

public actual fun dhcpV6CreateClientInfo(serveripaddress: Pcwstr, clientinfo: ConstPtr<DhcpClientInfoV6>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV6CreateClientInfo")

public actual fun dhcpV6GetFreeIPAddress(serveripaddress: Pcwstr, scopeid: DhcpIpv6Address, startip: DhcpIpv6Address, endip: DhcpIpv6Address, numfreeaddrreq: UInt, ipaddrlist: MutPtr<MutPtr<Dhcpv6IpArray>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetFreeIPAddress")

public actual fun dhcpV6GetStatelessStatistics(serveripaddress: Pcwstr, statelessstats: MutPtr<MutPtr<Dhcpv6StatelessStats>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStatistics")

public actual fun dhcpV6GetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, params: MutPtr<MutPtr<Dhcpv6StatelessParams>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV6GetStatelessStoreParams")

public actual fun dhcpV6SetStatelessStoreParams(serveripaddress: Pcwstr, fserverlevel: Bool, subnetaddress: DhcpIpv6Address, fieldmodified: UInt, params: ConstPtr<Dhcpv6StatelessParams>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpV6SetStatelessStoreParams")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup")
private external fun wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup(): Unit

public actual fun dhcpv6CApiCleanup(): Unit =
    wasiWindowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiCleanup()

public actual fun dhcpv6CApiInitialize(version: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpv6CApiInitialize")

public actual fun dhcpv6ReleasePrefix(adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, leaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpv6ReleasePrefix")

public actual fun dhcpv6RenewPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>, bvalidateprefix: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RenewPrefix")

public actual fun dhcpv6RequestParams(forcenewinform: Bool, reserved: MutPtr<CVoid>, adaptername: Pcwstr, classid: MutPtr<Dhcpv6capiClassid>, recdparams: Dhcpv6capiParamsArray, buffer: MutPtr<UByte>, psize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestParams")

public actual fun dhcpv6RequestPrefix(adaptername: Pcwstr, pclassid: MutPtr<Dhcpv6capiClassid>, prefixleaseinfo: MutPtr<DHCPV6PrefixLeaseInformation>, pdwtimetowait: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDhcpDhcpv6RequestPrefix")
