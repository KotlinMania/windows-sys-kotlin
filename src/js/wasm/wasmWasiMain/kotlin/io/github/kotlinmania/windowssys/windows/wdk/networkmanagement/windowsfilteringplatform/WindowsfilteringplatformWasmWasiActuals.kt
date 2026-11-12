@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpValue0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmCallout0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmCalloutEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmConnection0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmConnectionEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmEngineOption
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmFilter0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmFilterCondition0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmFilterEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmLayer0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmLayerEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent3
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent4
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent5
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEventEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProvider0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext3
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContextEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmServiceState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSession0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSessionEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSublayer0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSublayerEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaDetails0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaDetails1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaDetails2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextStatistics0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextStatistics1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecDospState0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecDospStateEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecDospStatistics0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecGetspi0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecGetspi1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaBundle0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaBundle1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaContext0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaContext1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaContextEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaDetails0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaDetails1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecStatistics0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecStatistics1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecTraffic0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecTraffic1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecVirtualIfTunnelInfo0
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityW

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0")
private external fun wasiWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0(): Int

public actual fun fwpmBfeStateGet0(): FwpmServiceState =
    wasiWindowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0().toInt()

public actual fun fwpmBfeStateSubscribeChanges0(deviceobject: MutPtr<CVoid>, callback: FwpmServiceStateChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0")

public actual fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0")

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr<FwpmCallout0>, sd: PsecurityDescriptor, id: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0")

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmCalloutEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0")

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0")

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0")

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0")

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmCallout0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0")

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0")

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0")

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0")

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0")

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmConnectionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0")

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0")

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmConnection0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0")

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr<MutPtr<FwpmConnection0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0")

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0")

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0")

public actual fun fwpmEngineClose0(enginehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0")

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr<MutPtr<FwpValue0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0")

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0")

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr<SecWinntAuthIdentityW>, session: ConstPtr<FwpmSession0>, enginehandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0")

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr<FwpValue0>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0")

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0")

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr<FwpmFilter0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0")

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmFilterEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0")

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0")

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0")

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0")

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmFilter0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0")

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0")

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0")

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0")

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0")

public actual fun fwpmFreeMemory0(p: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0")

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext0>, tunnelpolicy: ConstPtr<FwpmProviderContext0>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, sd: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0")

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext1>, tunnelpolicy: ConstPtr<FwpmProviderContext1>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1")

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext2>, tunnelpolicy: ConstPtr<FwpmProviderContext2>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2")

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext3>, tunnelpolicy: ConstPtr<FwpmProviderContext3>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3")

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0")

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmLayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0")

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0")

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmLayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0")

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0")

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0")

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0")

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0")

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmNetEventEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0")

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0")

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0")

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1")

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2")

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3")

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent4>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4")

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent5>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5")

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0")

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0")

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr<FwpmProvider0>, sd: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0")

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0")

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext1>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1")

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext2>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2")

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext3>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3")

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0")

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0")

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0")

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0")

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0")

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1")

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2")

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3")

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0")

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1")

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2")

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3")

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0")

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1")

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2")

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3")

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0")

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0")

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0")

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0")

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0")

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProvider0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0")

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, provider: MutPtr<MutPtr<FwpmProvider0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0")

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0")

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0")

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSessionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0")

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0")

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSession0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0")

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr<FwpmSublayer0>, sd: PsecurityDescriptor): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0")

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSublayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0")

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0")

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0")

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSublayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0")

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, sublayer: MutPtr<MutPtr<FwpmSublayer0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0")

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0")

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0")

public actual fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0")

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0")

public actual fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0")

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0")

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0")

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0")

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr<IpsecDospStatistics0>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0")

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0")

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecDospStateEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0")

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0")

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecDospState0>>>, numentries: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0")

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics0>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0")

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics1>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1")

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0")

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1")

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0")

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1")

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0")

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic1>, virtualiftunnelinfo: ConstPtr<IpsecVirtualIfTunnelInfo0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1")

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0")

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0")

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0")

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0")

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1")

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0")

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0")

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext1>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1")

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi0>, inboundspi: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0")

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1")

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0")

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr<IpsecSaContext1>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0")

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0")

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0")

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0")

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0")

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0")

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1")

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics0>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0")

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics1>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1")

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IkeextSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0")

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0")

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0")

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0")

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0")

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0")

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1")

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2")

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr<MutPtr<IkeextSaDetails0>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0")

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails1>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1")

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails2>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2")
