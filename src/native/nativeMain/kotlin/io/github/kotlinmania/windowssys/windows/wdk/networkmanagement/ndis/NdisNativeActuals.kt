@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ndisAcquireReadWriteLock(lock: COpaquePointer?, fwrite: Boolean, lockstate: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock(lock?.value?.toCPointer<ByteVar>(), fwrite, lockstate?.value?.toCPointer<ByteVar>())
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: COpaquePointer?, length: UInt, tag: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag(virtualaddress?.value?.toCPointer<ByteVar>(), length, tag)

public actual fun ndisCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer(timer?.value?.toCPointer<ByteVar>(), timercancelled?.value?.toCPointer<ByteVar>())
}

public actual fun ndisClAddParty(ndisvchandle: COpaquePointer?, protocolpartycontext: COpaquePointer?, callparameters: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty(ndisvchandle?.value?.toCPointer<ByteVar>(), protocolpartycontext?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>(), ndispartyhandle?.value?.toCPointer<ByteVar>())

public actual fun ndisClCloseAddressFamily(ndisafhandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily(ndisafhandle?.value?.toCPointer<ByteVar>())

public actual fun ndisClCloseCall(ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall(ndisvchandle?.value?.toCPointer<ByteVar>(), ndispartyhandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun ndisClDeregisterSap(ndissaphandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap(ndissaphandle?.value?.toCPointer<ByteVar>())

public actual fun ndisClDropParty(ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty(ndispartyhandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: COpaquePointer?): Int =
    0

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(status, ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())
}

public actual fun ndisClMakeCall(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?, protocolpartycontext: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall(ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>(), protocolpartycontext?.value?.toCPointer<ByteVar>(), ndispartyhandle?.value?.toCPointer<ByteVar>())

public actual fun ndisClModifyCallQoS(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS(ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())

public actual fun ndisClRegisterSap(ndisafhandle: COpaquePointer?, protocolsapcontext: COpaquePointer?, sap: COpaquePointer?, ndissaphandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap(ndisafhandle?.value?.toCPointer<ByteVar>(), protocolsapcontext?.value?.toCPointer<ByteVar>(), sap?.value?.toCPointer<ByteVar>(), ndissaphandle?.value?.toCPointer<ByteVar>())

public actual fun ndisCloseConfiguration(configurationhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration(configurationhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCloseFile(filehandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile(filehandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc(ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(status, ndispartyhandle?.value?.toCPointer<ByteVar>(), callmgrpartycontext?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(status, ndisafhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(status, ndisvchandle?.value?.toCPointer<ByteVar>(), ndispartyhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc(ndisvchandle?.value?.toCPointer<ByteVar>())

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(status, ndissaphandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected(ndisvchandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: COpaquePointer?, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall(ndissaphandle?.value?.toCPointer<ByteVar>(), ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange(ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(closestatus, ndisvchandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), size)
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(status, ndispartyhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(status, ndisvchandle?.value?.toCPointer<ByteVar>(), ndispartyhandle?.value?.toCPointer<ByteVar>(), callmgrpartycontext?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(status, ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?, callmgrafcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(status, ndisafhandle?.value?.toCPointer<ByteVar>(), callmgrafcontext?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: COpaquePointer?, callmgrsapcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(status, ndissaphandle?.value?.toCPointer<ByteVar>(), callmgrsapcontext?.value?.toCPointer<ByteVar>())
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: COpaquePointer?, baseinstancename: COpaquePointer?, vcinstancename: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName(ndisvchandle?.value?.toCPointer<ByteVar>(), baseinstancename?.value?.toCPointer<ByteVar>(), vcinstancename?.value?.toCPointer<ByteVar>())

public actual fun ndisCoCreateVc(ndisbindinghandle: COpaquePointer?, ndisafhandle: COpaquePointer?, protocolvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc(ndisbindinghandle?.value?.toCPointer<ByteVar>(), ndisafhandle?.value?.toCPointer<ByteVar>(), protocolvccontext?.value?.toCPointer<ByteVar>(), ndisvchandle?.value?.toCPointer<ByteVar>())

public actual fun ndisCoDeleteVc(ndisvchandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc(ndisvchandle?.value?.toCPointer<ByteVar>())

public actual fun ndisCoGetTapiCallId(ndisvchandle: COpaquePointer?, tapicallid: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId(ndisvchandle?.value?.toCPointer<ByteVar>(), tapicallid?.value?.toCPointer<ByteVar>())

public actual fun ndisCompleteDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer(status?.value?.toCPointer<ByteVar>(), ndisdmahandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), offset, length, writetodevice)
}

public actual fun ndisCopyBuffer(status: COpaquePointer?, buffer: COpaquePointer?, poolhandle: COpaquePointer?, memorydescriptor: COpaquePointer?, offset: UInt, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer(status?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), poolhandle?.value?.toCPointer<ByteVar>(), memorydescriptor?.value?.toCPointer<ByteVar>(), offset, length)
}

public actual fun ndisDeregisterTdiCallBack() {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()
}

public actual fun ndisFreeMemory(virtualaddress: COpaquePointer?, length: UInt, memoryflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory(virtualaddress?.value?.toCPointer<ByteVar>(), length, memoryflags)
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: COpaquePointer?, pkernelanduser: COpaquePointer?, pindex: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts(pidlecount?.value?.toCPointer<ByteVar>(), pkernelanduser?.value?.toCPointer<ByteVar>(), pindex?.value?.toCPointer<ByteVar>())
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage(pcpuusage?.value?.toCPointer<ByteVar>())
}

public actual fun ndisGetRoutineAddress(ndisroutinename: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress(ndisroutinename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndisGetSharedDataAlignment(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment()

public actual fun ndisGetVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion()

public actual fun ndisIMAssociateMiniport(driverhandle: COpaquePointer?, protocolhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport(driverhandle?.value?.toCPointer<ByteVar>(), protocolhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: COpaquePointer?, deviceinstance: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance(driverhandle?.value?.toCPointer<ByteVar>(), deviceinstance?.value?.toCPointer<ByteVar>())

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance(ndisminiporthandle?.value?.toCPointer<ByteVar>())

public actual fun ndisIMGetBindingContext(ndisbindinghandle: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext(ndisbindinghandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: COpaquePointer?, driverinstance: COpaquePointer?, devicecontext: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx(driverhandle?.value?.toCPointer<ByteVar>(), driverinstance?.value?.toCPointer<ByteVar>(), devicecontext?.value?.toCPointer<ByteVar>())

public actual fun ndisInitializeEvent(event: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent(event?.value?.toCPointer<ByteVar>())
}

public actual fun ndisInitializeReadWriteLock(lock: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock(lock?.value?.toCPointer<ByteVar>())
}

public actual fun ndisInitializeString(destination: COpaquePointer?, source: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString(destination?.value?.toCPointer<ByteVar>(), source?.value?.toCPointer<ByteVar>())
}

public actual fun ndisInitializeTimer(timer: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer(timer?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), functioncontext?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory(miniportadapterhandle?.value?.toCPointer<ByteVar>(), length, cached, virtualaddress?.value?.toCPointer<ByteVar>(), physicaladdress?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, context: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync(miniportadapterhandle?.value?.toCPointer<ByteVar>(), length, cached, context?.value?.toCPointer<ByteVar>())

public actual fun ndisMCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer(timer?.value?.toCPointer<ByteVar>(), timercancelled?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMCloseLog(loghandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog(loghandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc(ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())

public actual fun ndisMCmCreateVc(miniportadapterhandle: COpaquePointer?, ndisafhandle: COpaquePointer?, miniportvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc(miniportadapterhandle?.value?.toCPointer<ByteVar>(), ndisafhandle?.value?.toCPointer<ByteVar>(), miniportvccontext?.value?.toCPointer<ByteVar>(), ndisvchandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc(ndisvchandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMCmDeleteVc(ndisvchandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc(ndisvchandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: COpaquePointer?, addressfamily: COpaquePointer?, cmcharacteristics: COpaquePointer?, sizeofcmcharacteristics: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily(miniportadapterhandle?.value?.toCPointer<ByteVar>(), addressfamily?.value?.toCPointer<ByteVar>(), cmcharacteristics?.value?.toCPointer<ByteVar>(), sizeofcmcharacteristics)

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(status, ndisvchandle?.value?.toCPointer<ByteVar>(), callparameters?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(status, ndisvchandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMCreateLog(miniportadapterhandle: COpaquePointer?, size: UInt, loghandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog(miniportadapterhandle?.value?.toCPointer<ByteVar>(), size, loghandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel(miniportdmahandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt, portoffset: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange(miniportadapterhandle?.value?.toCPointer<ByteVar>(), initialport, numberofports, portoffset?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMFlushLog(loghandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog(loghandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory(miniportadapterhandle?.value?.toCPointer<ByteVar>(), length, cached, virtualaddress?.value?.toCPointer<ByteVar>(), physicaladdress)
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: COpaquePointer?, physicaldeviceobject: COpaquePointer?, functionaldeviceobject: COpaquePointer?, nextdeviceobject: COpaquePointer?, allocatedresources: COpaquePointer?, allocatedresourcestranslated: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty(miniportadapterhandle?.value?.toCPointer<ByteVar>(), physicaldeviceobject?.value?.toCPointer<ByteVar>(), functionaldeviceobject?.value?.toCPointer<ByteVar>(), nextdeviceobject?.value?.toCPointer<ByteVar>(), allocatedresources?.value?.toCPointer<ByteVar>(), allocatedresourcestranslated?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment(miniportadapterhandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMInitializeTimer(timer: COpaquePointer?, miniportadapterhandle: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer(timer?.value?.toCPointer<ByteVar>(), miniportadapterhandle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), functioncontext?.value?.toCPointer<ByteVar>())
}

public actual fun ndisMMapIoSpace(virtualaddress: COpaquePointer?, miniportadapterhandle: COpaquePointer?, physicaladdress: Long, length: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace(virtualaddress?.value?.toCPointer<ByteVar>(), miniportadapterhandle?.value?.toCPointer<ByteVar>(), physicaladdress, length)

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, miniporthandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName(padapterinstancename?.value?.toCPointer<ByteVar>(), miniporthandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMReadDmaCounter(miniportdmahandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter(miniportdmahandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: COpaquePointer?, miniportadapterhandle: COpaquePointer?, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: COpaquePointer?, maximumlength: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel(miniportdmahandle?.value?.toCPointer<ByteVar>(), miniportadapterhandle?.value?.toCPointer<ByteVar>(), dmachannel, dma32bitaddresses, dmadescription?.value?.toCPointer<ByteVar>(), maximumlength)

public actual fun ndisMRegisterIoPortRange(portoffset: COpaquePointer?, miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange(portoffset?.value?.toCPointer<ByteVar>(), miniportadapterhandle?.value?.toCPointer<ByteVar>(), initialport, numberofports)

public actual fun ndisMRemoveMiniport(miniporthandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport(miniporthandle?.value?.toCPointer<ByteVar>())

public actual fun ndisMSetPeriodicTimer(timer: COpaquePointer?, millisecondperiod: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer(timer?.value?.toCPointer<ByteVar>(), millisecondperiod)
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(microsecondstosleep)
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace(miniportadapterhandle?.value?.toCPointer<ByteVar>(), virtualaddress?.value?.toCPointer<ByteVar>(), length)
}

public actual fun ndisMWriteLogData(loghandle: COpaquePointer?, logbuffer: COpaquePointer?, logbuffersize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData(loghandle?.value?.toCPointer<ByteVar>(), logbuffer?.value?.toCPointer<ByteVar>(), logbuffersize)

public actual fun ndisMapFile(status: COpaquePointer?, mappedbuffer: COpaquePointer?, filehandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile(status?.value?.toCPointer<ByteVar>(), mappedbuffer?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisOpenConfigurationKeyByIndex(status: COpaquePointer?, configurationhandle: COpaquePointer?, index: UInt, keyname: COpaquePointer?, keyhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex(status?.value?.toCPointer<ByteVar>(), configurationhandle?.value?.toCPointer<ByteVar>(), index, keyname?.value?.toCPointer<ByteVar>(), keyhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisOpenConfigurationKeyByName(status: COpaquePointer?, configurationhandle: COpaquePointer?, subkeyname: COpaquePointer?, subkeyhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName(status?.value?.toCPointer<ByteVar>(), configurationhandle?.value?.toCPointer<ByteVar>(), subkeyname?.value?.toCPointer<ByteVar>(), subkeyhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisOpenFile(status: COpaquePointer?, filehandle: COpaquePointer?, filelength: COpaquePointer?, filename: COpaquePointer?, highestacceptableaddress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile(status?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>(), filelength?.value?.toCPointer<ByteVar>(), filename?.value?.toCPointer<ByteVar>(), highestacceptableaddress)
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, ndisbindinghandle: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName(padapterinstancename?.value?.toCPointer<ByteVar>(), ndisbindinghandle?.value?.toCPointer<ByteVar>())

public actual fun ndisQueryBindInstanceName(padapterinstancename: COpaquePointer?, bindingcontext: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName(padapterinstancename?.value?.toCPointer<ByteVar>(), bindingcontext?.value?.toCPointer<ByteVar>())

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings(ndisprotocolhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisReadConfiguration(status: COpaquePointer?, parametervalue: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametertype: NdisParameterType) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration(status?.value?.toCPointer<ByteVar>(), parametervalue?.value?.toCPointer<ByteVar>(), configurationhandle?.value?.toCPointer<ByteVar>(), keyword?.value?.toCPointer<ByteVar>(), parametertype)
}

public actual fun ndisReadNetworkAddress(status: COpaquePointer?, networkaddress: COpaquePointer?, networkaddresslength: COpaquePointer?, configurationhandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress(status?.value?.toCPointer<ByteVar>(), networkaddress?.value?.toCPointer<ByteVar>(), networkaddresslength?.value?.toCPointer<ByteVar>(), configurationhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())
}

public actual fun ndisReleaseReadWriteLock(lock: COpaquePointer?, lockstate: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock(lock?.value?.toCPointer<ByteVar>(), lockstate?.value?.toCPointer<ByteVar>())
}

public actual fun ndisResetEvent(event: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent(event?.value?.toCPointer<ByteVar>())
}

public actual fun ndisSetEvent(event: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent(event?.value?.toCPointer<ByteVar>())
}

public actual fun ndisSetPeriodicTimer(ndistimer: COpaquePointer?, millisecondsperiod: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer(ndistimer?.value?.toCPointer<ByteVar>(), millisecondsperiod)
}

public actual fun ndisSetTimer(timer: COpaquePointer?, millisecondstodelay: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer(timer?.value?.toCPointer<ByteVar>(), millisecondstodelay)
}

public actual fun ndisSetTimerEx(ndistimer: COpaquePointer?, millisecondstodelay: UInt, functioncontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx(ndistimer?.value?.toCPointer<ByteVar>(), millisecondstodelay, functioncontext?.value?.toCPointer<ByteVar>())
}

public actual fun ndisSetupDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer(status?.value?.toCPointer<ByteVar>(), ndisdmahandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), offset, length, writetodevice)
}

public actual fun ndisSystemProcessorCount(): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount()

public actual fun ndisUnmapFile(filehandle: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile(filehandle?.value?.toCPointer<ByteVar>())
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: COpaquePointer?, length: UInt, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory(ndisadapterhandle?.value?.toCPointer<ByteVar>(), length, virtualaddress?.value?.toCPointer<ByteVar>(), physicaladdress)
}

public actual fun ndisWaitEvent(event: COpaquePointer?, mstowait: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent(event?.value?.toCPointer<ByteVar>(), mstowait)

public actual fun ndisWriteConfiguration(status: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametervalue: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration(status?.value?.toCPointer<ByteVar>(), configurationhandle?.value?.toCPointer<ByteVar>(), keyword?.value?.toCPointer<ByteVar>(), parametervalue?.value?.toCPointer<ByteVar>())
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: COpaquePointer?, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry(ndisadapterhandle?.value?.toCPointer<ByteVar>(), errorcode, numberoferrorvalues, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndisWriteEventLogEntry(loghandle: COpaquePointer?, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: COpaquePointer?, datasize: UInt, data: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry(loghandle?.value?.toCPointer<ByteVar>(), eventcode, uniqueeventvalue, numstrings, stringslist?.value?.toCPointer<ByteVar>(), datasize, data?.value?.toCPointer<ByteVar>())
