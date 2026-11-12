@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun fwpmBfeStateGet0(): FwpmServiceState =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmBfeStateSubscribeChanges0(deviceobject: MutPtr<CVoid>, callback: FwpmServiceStateChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(deviceobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), changehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(changehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr<FwpmCallout0>, sd: PsecurityDescriptor, id: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle.rawAddress.toString(), callout.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmCalloutEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle.rawAddress.toString(), id.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmCallout0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle.rawAddress.toString(), id.toInt(), callout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), callout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmConnectionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmConnection0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr<MutPtr<FwpmConnection0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle.rawAddress.toString(), id.toString(), connection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineClose0(enginehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr<MutPtr<FwpValue0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle.rawAddress.toString(), option, value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr<SecWinntAuthIdentityW>, session: ConstPtr<FwpmSession0>, enginehandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername.rawAddress.toString(), authnservice.toInt(), authidentity.rawAddress.toString(), session.rawAddress.toString(), enginehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr<FwpValue0>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle.rawAddress.toString(), option, newvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr<FwpmFilter0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle.rawAddress.toString(), filter.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmFilterEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmFilter0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle.rawAddress.toString(), id.toString(), filter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), filter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmFreeMemory0(p: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) {
        windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext0>, tunnelpolicy: ConstPtr<FwpmProviderContext0>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), sd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext1>, tunnelpolicy: ConstPtr<FwpmProviderContext1>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext2>, tunnelpolicy: ConstPtr<FwpmProviderContext2>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext3>, tunnelpolicy: ConstPtr<FwpmProviderContext3>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle.rawAddress.toString(), flags.toInt(), mainmodepolicy.rawAddress.toString(), tunnelpolicy.rawAddress.toString(), numfilterconditions.toInt(), filterconditions.rawAddress.toString(), keymodkey.rawAddress.toString(), sd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmLayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmLayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle.rawAddress.toString(), id.toInt(), layer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), layer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmNetEventEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent4>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent5>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr<FwpmProvider0>, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle.rawAddress.toString(), provider.rawAddress.toString(), sd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext1>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext2>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext3>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle.rawAddress.toString(), providercontext.rawAddress.toString(), sd.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle.rawAddress.toString(), id.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle.rawAddress.toString(), key.rawAddress.toString(), providercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProvider0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, provider: MutPtr<MutPtr<FwpmProvider0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), provider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSessionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSession0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr<FwpmSublayer0>, sd: PsecurityDescriptor): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle.rawAddress.toString(), sublayer.rawAddress.toString(), sd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSublayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSublayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, sublayer: MutPtr<MutPtr<FwpmSublayer0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), sublayer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle.rawAddress.toString(), key.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr<IpsecDospStatistics0>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle.rawAddress.toString(), idpstatistics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecDospStateEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecDospState0>>>, numentries: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentries.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics0>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics1>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle.rawAddress.toString(), ipsecstatistics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle.rawAddress.toString(), id.toString(), inboundbundle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle.rawAddress.toString(), id.toString(), outboundbundle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic1>, virtualiftunnelinfo: ConstPtr<IpsecVirtualIfTunnelInfo0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle.rawAddress.toString(), outboundtraffic.rawAddress.toString(), virtualiftunnelinfo.rawAddress.toString(), inboundfilterid.rawAddress.toString(), id.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle.rawAddress.toString(), id.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext1>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle.rawAddress.toString(), id.toString(), sacontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi0>, inboundspi: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: UInt): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle.rawAddress.toString(), id.toString(), getspi.rawAddress.toString(), inboundspi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr<IpsecSaContext1>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle.rawAddress.toString(), flags.toString(), newvalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics0>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics1>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle.rawAddress.toString(), ikeextstatistics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IkeextSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle.rawAddress.toString(), enumtemplate.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle.rawAddress.toString(), securityinfo.toInt(), sidowner.rawAddress.toString(), sidgroup.rawAddress.toString(), dacl.rawAddress.toString(), sacl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle.rawAddress.toString(), id.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle.rawAddress.toString(), enumhandle.rawAddress.toString(), numentriesrequested.toInt(), entries.rawAddress.toString(), numentriesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr<MutPtr<IkeextSaDetails0>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle.rawAddress.toString(), id.toString(), sa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails1>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails2>>): Ntstatus =
    if (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon != null) (windowsWdkNetworkmanagementWindowsfilteringplatformNapiAddon.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle.rawAddress.toString(), id.toString(), salookupcontext.rawAddress.toString(), sa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
