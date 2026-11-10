@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmEngineOption
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmServiceState
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun fwpmBfeStateGet0(): FwpmServiceState =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmBfeStateGet0()

public actual fun fwpmBfeStateSubscribeChanges0(deviceobject: COpaquePointer?, callback: FwpmServiceStateChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmBfeStateSubscribeChanges0(deviceobject?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), changehandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmBfeStateUnsubscribeChanges0(changehandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutAdd0(enginehandle?.value?.toCPointer<ByteVar>(), callout?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteById0(enginehandle?.value?.toCPointer<ByteVar>(), id)

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, callout?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: COpaquePointer?, callout: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutGetByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), callout?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutGetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmCalloutSetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, connection?.value?.toCPointer<ByteVar>())

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmConnectionSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmEngineClose0(enginehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineClose0(enginehandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineGetOption0(enginehandle?.value?.toCPointer<ByteVar>(), option, value?.value?.toCPointer<ByteVar>())

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: COpaquePointer?, session: COpaquePointer?, enginehandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineOpen0(servername?.value?.toCPointer<ByteVar>(), authnservice, authidentity?.value?.toCPointer<ByteVar>(), session?.value?.toCPointer<ByteVar>(), enginehandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineSetOption0(enginehandle?.value?.toCPointer<ByteVar>(), option, newvalue?.value?.toCPointer<ByteVar>())

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmEngineSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterAdd0(enginehandle?.value?.toCPointer<ByteVar>(), filter?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteById0(enginehandle?.value?.toCPointer<ByteVar>(), id)

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, filter?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: COpaquePointer?, filter: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterGetByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), filter?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterGetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFilterSetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmFreeMemory0(p: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmFreeMemory0(p?.value?.toCPointer<ByteVar>())
}

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd0(enginehandle?.value?.toCPointer<ByteVar>(), flags, mainmodepolicy?.value?.toCPointer<ByteVar>(), tunnelpolicy?.value?.toCPointer<ByteVar>(), numfilterconditions, filterconditions?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>())

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd1(enginehandle?.value?.toCPointer<ByteVar>(), flags, mainmodepolicy?.value?.toCPointer<ByteVar>(), tunnelpolicy?.value?.toCPointer<ByteVar>(), numfilterconditions, filterconditions?.value?.toCPointer<ByteVar>(), keymodkey?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>())

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd2(enginehandle?.value?.toCPointer<ByteVar>(), flags, mainmodepolicy?.value?.toCPointer<ByteVar>(), tunnelpolicy?.value?.toCPointer<ByteVar>(), numfilterconditions, filterconditions?.value?.toCPointer<ByteVar>(), keymodkey?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>())

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd3(enginehandle?.value?.toCPointer<ByteVar>(), flags, mainmodepolicy?.value?.toCPointer<ByteVar>(), tunnelpolicy?.value?.toCPointer<ByteVar>(), numfilterconditions, filterconditions?.value?.toCPointer<ByteVar>(), keymodkey?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>())

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelDeleteByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, layer?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, layer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerGetByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), layer?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerGetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmLayerSetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum1(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum2(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum3(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum4(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum5(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventsGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmNetEventsSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderAdd0(enginehandle?.value?.toCPointer<ByteVar>(), provider?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd0(enginehandle?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd1(enginehandle?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd2(enginehandle?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd3(enginehandle?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteById0(enginehandle?.value?.toCPointer<ByteVar>(), id)

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum1(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum2(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum3(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById1(enginehandle?.value?.toCPointer<ByteVar>(), id, providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById2(enginehandle?.value?.toCPointer<ByteVar>(), id, providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById3(enginehandle?.value?.toCPointer<ByteVar>(), id, providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey1(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey2(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey3(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), providercontext?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderContextSetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderDeleteByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: COpaquePointer?, provider: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderGetByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), provider?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderGetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmProviderSetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSessionCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSessionDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSessionEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerAdd0(enginehandle?.value?.toCPointer<ByteVar>(), sublayer?.value?.toCPointer<ByteVar>(), sd?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerDeleteByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, sublayer: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), sublayer?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmSubLayerSetSecurityInfoByKey0(enginehandle?.value?.toCPointer<ByteVar>(), key?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmTransactionAbort0(enginehandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmTransactionBegin0(enginehandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmTransactionCommit0(enginehandle?.value?.toCPointer<ByteVar>())

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospGetStatistics0(enginehandle?.value?.toCPointer<ByteVar>(), idpstatistics?.value?.toCPointer<ByteVar>())

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospStateCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospStateDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentries: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecDospStateEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentries?.value?.toCPointer<ByteVar>())

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecGetStatistics0(enginehandle?.value?.toCPointer<ByteVar>(), ipsecstatistics?.value?.toCPointer<ByteVar>())

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecGetStatistics1(enginehandle?.value?.toCPointer<ByteVar>(), ipsecstatistics?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound0(enginehandle?.value?.toCPointer<ByteVar>(), id, inboundbundle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound1(enginehandle?.value?.toCPointer<ByteVar>(), id, inboundbundle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound0(enginehandle?.value?.toCPointer<ByteVar>(), id, outboundbundle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound1(enginehandle?.value?.toCPointer<ByteVar>(), id, outboundbundle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate0(enginehandle?.value?.toCPointer<ByteVar>(), outboundtraffic?.value?.toCPointer<ByteVar>(), inboundfilterid?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: COpaquePointer?, virtualiftunnelinfo: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate1(enginehandle?.value?.toCPointer<ByteVar>(), outboundtraffic?.value?.toCPointer<ByteVar>(), virtualiftunnelinfo?.value?.toCPointer<ByteVar>(), inboundfilterid?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextDeleteById0(enginehandle?.value?.toCPointer<ByteVar>(), id)

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum1(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextExpire0(enginehandle?.value?.toCPointer<ByteVar>(), id)

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, sacontext?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById1(enginehandle?.value?.toCPointer<ByteVar>(), id, sacontext?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi0(enginehandle?.value?.toCPointer<ByteVar>(), id, getspi?.value?.toCPointer<ByteVar>(), inboundspi?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi1(enginehandle?.value?.toCPointer<ByteVar>(), id, getspi?.value?.toCPointer<ByteVar>(), inboundspi?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextSetSpi0(enginehandle?.value?.toCPointer<ByteVar>(), id, getspi?.value?.toCPointer<ByteVar>(), inboundspi)

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaContextUpdate0(enginehandle?.value?.toCPointer<ByteVar>(), flags, newvalues?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaDbGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaDbSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_iPsecSaEnum1(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextGetStatistics0(enginehandle?.value?.toCPointer<ByteVar>(), ikeextstatistics?.value?.toCPointer<ByteVar>())

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextGetStatistics1(enginehandle?.value?.toCPointer<ByteVar>(), ikeextstatistics?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaCreateEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumtemplate?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDbGetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDbSetSecurityInfo0(enginehandle?.value?.toCPointer<ByteVar>(), securityinfo, sidowner?.value?.toCPointer<ByteVar>(), sidgroup?.value?.toCPointer<ByteVar>(), dacl?.value?.toCPointer<ByteVar>(), sacl?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDeleteById0(enginehandle?.value?.toCPointer<ByteVar>(), id)

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaDestroyEnumHandle0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaEnum0(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaEnum1(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaEnum2(enginehandle?.value?.toCPointer<ByteVar>(), enumhandle?.value?.toCPointer<ByteVar>(), numentriesrequested, entries?.value?.toCPointer<ByteVar>(), numentriesreturned?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaGetById0(enginehandle?.value?.toCPointer<ByteVar>(), id, sa?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaGetById1(enginehandle?.value?.toCPointer<ByteVar>(), id, salookupcontext?.value?.toCPointer<ByteVar>(), sa?.value?.toCPointer<ByteVar>())

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_ikeextSaGetById2(enginehandle?.value?.toCPointer<ByteVar>(), id, salookupcontext?.value?.toCPointer<ByteVar>(), sa?.value?.toCPointer<ByteVar>())
