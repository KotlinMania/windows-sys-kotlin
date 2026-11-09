@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock(lock.toCPointer<ByteVar>(), fwrite, lockstate.toCPointer<ByteVar>())
}

public actual fun NdisAllocateMemoryWithTag(virtualaddress: Long, length: UInt, tag: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag(virtualaddress.toCPointer<ByteVar>(), length, tag)

public actual fun NdisCancelTimer(timer: Long, timercancelled: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer(timer.toCPointer<ByteVar>(), timercancelled.toCPointer<ByteVar>())
}

public actual fun NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty(ndisvchandle.toCPointer<ByteVar>(), protocolpartycontext.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>(), ndispartyhandle.toCPointer<ByteVar>())

public actual fun NdisClCloseAddressFamily(ndisafhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily(ndisafhandle.toCPointer<ByteVar>())

public actual fun NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall(ndisvchandle.toCPointer<ByteVar>(), ndispartyhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)

public actual fun NdisClDeregisterSap(ndissaphandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap(ndissaphandle.toCPointer<ByteVar>())

public actual fun NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty(ndispartyhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)

public actual fun NdisClGetProtocolVcContextFromTapiCallId(tapicallid: UNICODE_STRING, protocolvccontext: Long): Int =
    0

public actual fun NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete(status, ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())
}

public actual fun NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall(ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>(), protocolpartycontext.toCPointer<ByteVar>(), ndispartyhandle.toCPointer<ByteVar>())

public actual fun NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS(ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())

public actual fun NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap(ndisafhandle.toCPointer<ByteVar>(), protocolsapcontext.toCPointer<ByteVar>(), sap.toCPointer<ByteVar>(), ndissaphandle.toCPointer<ByteVar>())

public actual fun NdisCloseConfiguration(configurationhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration(configurationhandle.toCPointer<ByteVar>())
}

public actual fun NdisCloseFile(filehandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile(filehandle.toCPointer<ByteVar>())
}

public actual fun NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc(ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())

public actual fun NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete(status, ndispartyhandle.toCPointer<ByteVar>(), callmgrpartycontext.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())
}

public actual fun NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete(status, ndisafhandle.toCPointer<ByteVar>())
}

public actual fun NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete(status, ndisvchandle.toCPointer<ByteVar>(), ndispartyhandle.toCPointer<ByteVar>())
}

public actual fun NdisCmDeactivateVc(ndisvchandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc(ndisvchandle.toCPointer<ByteVar>())

public actual fun NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete(status, ndissaphandle.toCPointer<ByteVar>())
}

public actual fun NdisCmDispatchCallConnected(ndisvchandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected(ndisvchandle.toCPointer<ByteVar>())
}

public actual fun NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall(ndissaphandle.toCPointer<ByteVar>(), ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())

public actual fun NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange(ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())
}

public actual fun NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)
}

public actual fun NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), size)
}

public actual fun NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete(status, ndispartyhandle.toCPointer<ByteVar>())
}

public actual fun NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete(status, ndisvchandle.toCPointer<ByteVar>(), ndispartyhandle.toCPointer<ByteVar>(), callmgrpartycontext.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())
}

public actual fun NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete(status, ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())
}

public actual fun NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete(status, ndisafhandle.toCPointer<ByteVar>(), callmgrafcontext.toCPointer<ByteVar>())
}

public actual fun NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete(status, ndissaphandle.toCPointer<ByteVar>(), callmgrsapcontext.toCPointer<ByteVar>())
}

public actual fun NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName(ndisvchandle.toCPointer<ByteVar>(), baseinstancename.toCPointer<ByteVar>(), vcinstancename.toCPointer<ByteVar>())

public actual fun NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc(ndisbindinghandle.toCPointer<ByteVar>(), ndisafhandle.toCPointer<ByteVar>(), protocolvccontext.toCPointer<ByteVar>(), ndisvchandle.toCPointer<ByteVar>())

public actual fun NdisCoDeleteVc(ndisvchandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc(ndisvchandle.toCPointer<ByteVar>())

public actual fun NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId(ndisvchandle.toCPointer<ByteVar>(), tapicallid.toCPointer<ByteVar>())

public actual fun NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer(status.toCPointer<ByteVar>(), ndisdmahandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), offset, length, writetodevice)
}

public actual fun NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: UInt, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer(status.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), poolhandle.toCPointer<ByteVar>(), memorydescriptor.toCPointer<ByteVar>(), offset, length)
}

public actual fun NdisDeregisterTdiCallBack() {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack()
}

public actual fun NdisFreeMemory(virtualaddress: Long, length: UInt, memoryflags: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory(virtualaddress.toCPointer<ByteVar>(), length, memoryflags)
}

public actual fun NdisGeneratePartialCancelId(): UByte =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId()

public actual fun NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts(pidlecount.toCPointer<ByteVar>(), pkernelanduser.toCPointer<ByteVar>(), pindex.toCPointer<ByteVar>())
}

public actual fun NdisGetCurrentProcessorCpuUsage(pcpuusage: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage(pcpuusage.toCPointer<ByteVar>())
}

public actual fun NdisGetRoutineAddress(ndisroutinename: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress(ndisroutinename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdisGetSharedDataAlignment(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment()

public actual fun NdisGetVersion(): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion()

public actual fun NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport(driverhandle.toCPointer<ByteVar>(), protocolhandle.toCPointer<ByteVar>())
}

public actual fun NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance(driverhandle.toCPointer<ByteVar>(), deviceinstance.toCPointer<ByteVar>())

public actual fun NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance(ndisminiporthandle.toCPointer<ByteVar>())

public actual fun NdisIMGetBindingContext(ndisbindinghandle: Long): Long =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext(ndisbindinghandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx(driverhandle.toCPointer<ByteVar>(), driverinstance.toCPointer<ByteVar>(), devicecontext.toCPointer<ByteVar>())

public actual fun NdisInitializeEvent(event: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent(event.toCPointer<ByteVar>())
}

public actual fun NdisInitializeReadWriteLock(lock: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock(lock.toCPointer<ByteVar>())
}

public actual fun NdisInitializeString(destination: Long, source: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString(destination.toCPointer<ByteVar>(), source.toCPointer<ByteVar>())
}

public actual fun NdisInitializeTimer(timer: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer(timer.toCPointer<ByteVar>(), timerfunction.toLong().toCPointer<ByteVar>(), functioncontext.toCPointer<ByteVar>())
}

public actual fun NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory(miniportadapterhandle.toCPointer<ByteVar>(), length, cached, virtualaddress.toCPointer<ByteVar>(), physicaladdress.toCPointer<ByteVar>())
}

public actual fun NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: UInt, cached: Boolean, context: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync(miniportadapterhandle.toCPointer<ByteVar>(), length, cached, context.toCPointer<ByteVar>())

public actual fun NdisMCancelTimer(timer: Long, timercancelled: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer(timer.toCPointer<ByteVar>(), timercancelled.toCPointer<ByteVar>())
}

public actual fun NdisMCloseLog(loghandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog(loghandle.toCPointer<ByteVar>())
}

public actual fun NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc(ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())

public actual fun NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc(miniportadapterhandle.toCPointer<ByteVar>(), ndisafhandle.toCPointer<ByteVar>(), miniportvccontext.toCPointer<ByteVar>(), ndisvchandle.toCPointer<ByteVar>())

public actual fun NdisMCmDeactivateVc(ndisvchandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc(ndisvchandle.toCPointer<ByteVar>())

public actual fun NdisMCmDeleteVc(ndisvchandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc(ndisvchandle.toCPointer<ByteVar>())

public actual fun NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily(miniportadapterhandle.toCPointer<ByteVar>(), addressfamily.toCPointer<ByteVar>(), cmcharacteristics.toCPointer<ByteVar>(), sizeofcmcharacteristics)

public actual fun NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete(status, ndisvchandle.toCPointer<ByteVar>(), callparameters.toCPointer<ByteVar>())
}

public actual fun NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete(status, ndisvchandle.toCPointer<ByteVar>())
}

public actual fun NdisMCreateLog(miniportadapterhandle: Long, size: UInt, loghandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog(miniportadapterhandle.toCPointer<ByteVar>(), size, loghandle.toCPointer<ByteVar>())

public actual fun NdisMDeregisterDmaChannel(miniportdmahandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel(miniportdmahandle.toCPointer<ByteVar>())
}

public actual fun NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: UInt, numberofports: UInt, portoffset: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange(miniportadapterhandle.toCPointer<ByteVar>(), initialport, numberofports, portoffset.toCPointer<ByteVar>())
}

public actual fun NdisMFlushLog(loghandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog(loghandle.toCPointer<ByteVar>())
}

public actual fun NdisMFreeSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory(miniportadapterhandle.toCPointer<ByteVar>(), length, cached, virtualaddress.toCPointer<ByteVar>(), physicaladdress)
}

public actual fun NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty(miniportadapterhandle.toCPointer<ByteVar>(), physicaldeviceobject.toCPointer<ByteVar>(), functionaldeviceobject.toCPointer<ByteVar>(), nextdeviceobject.toCPointer<ByteVar>(), allocatedresources.toCPointer<ByteVar>(), allocatedresourcestranslated.toCPointer<ByteVar>())
}

public actual fun NdisMGetDmaAlignment(miniportadapterhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment(miniportadapterhandle.toCPointer<ByteVar>())

public actual fun NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer(timer.toCPointer<ByteVar>(), miniportadapterhandle.toCPointer<ByteVar>(), timerfunction.toLong().toCPointer<ByteVar>(), functioncontext.toCPointer<ByteVar>())
}

public actual fun NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace(virtualaddress.toCPointer<ByteVar>(), miniportadapterhandle.toCPointer<ByteVar>(), physicaladdress, length)

public actual fun NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName(padapterinstancename.toCPointer<ByteVar>(), miniporthandle.toCPointer<ByteVar>())

public actual fun NdisMReadDmaCounter(miniportdmahandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter(miniportdmahandle.toCPointer<ByteVar>())

public actual fun NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel(miniportdmahandle.toCPointer<ByteVar>(), miniportadapterhandle.toCPointer<ByteVar>(), dmachannel, dma32bitaddresses, dmadescription.toCPointer<ByteVar>(), maximumlength)

public actual fun NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: UInt, numberofports: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange(portoffset.toCPointer<ByteVar>(), miniportadapterhandle.toCPointer<ByteVar>(), initialport, numberofports)

public actual fun NdisMRemoveMiniport(miniporthandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport(miniporthandle.toCPointer<ByteVar>())

public actual fun NdisMSetPeriodicTimer(timer: Long, millisecondperiod: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer(timer.toCPointer<ByteVar>(), millisecondperiod)
}

public actual fun NdisMSleep(microsecondstosleep: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep(microsecondstosleep)
}

public actual fun NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace(miniportadapterhandle.toCPointer<ByteVar>(), virtualaddress.toCPointer<ByteVar>(), length)
}

public actual fun NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: UInt): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData(loghandle.toCPointer<ByteVar>(), logbuffer.toCPointer<ByteVar>(), logbuffersize)

public actual fun NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile(status.toCPointer<ByteVar>(), mappedbuffer.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>())
}

public actual fun NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: UInt, keyname: Long, keyhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex(status.toCPointer<ByteVar>(), configurationhandle.toCPointer<ByteVar>(), index, keyname.toCPointer<ByteVar>(), keyhandle.toCPointer<ByteVar>())
}

public actual fun NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName(status.toCPointer<ByteVar>(), configurationhandle.toCPointer<ByteVar>(), subkeyname.toCPointer<ByteVar>(), subkeyhandle.toCPointer<ByteVar>())
}

public actual fun NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile(status.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>(), filelength.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), highestacceptableaddress)
}

public actual fun NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName(padapterinstancename.toCPointer<ByteVar>(), ndisbindinghandle.toCPointer<ByteVar>())

public actual fun NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName(padapterinstancename.toCPointer<ByteVar>(), bindingcontext.toCPointer<ByteVar>())

public actual fun NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings(ndisprotocolhandle.toCPointer<ByteVar>())
}

public actual fun NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: NDIS_PARAMETER_TYPE) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration(status.toCPointer<ByteVar>(), parametervalue.toCPointer<ByteVar>(), configurationhandle.toCPointer<ByteVar>(), keyword.toCPointer<ByteVar>(), parametertype)
}

public actual fun NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress(status.toCPointer<ByteVar>(), networkaddress.toCPointer<ByteVar>(), networkaddresslength.toCPointer<ByteVar>(), configurationhandle.toCPointer<ByteVar>())
}

public actual fun NdisRegisterTdiCallBack(registercallback: TDI_REGISTER_CALLBACK, pnphandler: TDI_PNP_HANDLER) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack(registercallback.toLong().toCPointer<ByteVar>(), pnphandler.toLong().toCPointer<ByteVar>())
}

public actual fun NdisReleaseReadWriteLock(lock: Long, lockstate: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock(lock.toCPointer<ByteVar>(), lockstate.toCPointer<ByteVar>())
}

public actual fun NdisResetEvent(event: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent(event.toCPointer<ByteVar>())
}

public actual fun NdisSetEvent(event: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent(event.toCPointer<ByteVar>())
}

public actual fun NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer(ndistimer.toCPointer<ByteVar>(), millisecondsperiod)
}

public actual fun NdisSetTimer(timer: Long, millisecondstodelay: UInt) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer(timer.toCPointer<ByteVar>(), millisecondstodelay)
}

public actual fun NdisSetTimerEx(ndistimer: Long, millisecondstodelay: UInt, functioncontext: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx(ndistimer.toCPointer<ByteVar>(), millisecondstodelay, functioncontext.toCPointer<ByteVar>())
}

public actual fun NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer(status.toCPointer<ByteVar>(), ndisdmahandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), offset, length, writetodevice)
}

public actual fun NdisSystemProcessorCount(): Byte =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount()

public actual fun NdisUnmapFile(filehandle: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile(filehandle.toCPointer<ByteVar>())
}

public actual fun NdisUpdateSharedMemory(ndisadapterhandle: Long, length: UInt, virtualaddress: Long, physicaladdress: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory(ndisadapterhandle.toCPointer<ByteVar>(), length, virtualaddress.toCPointer<ByteVar>(), physicaladdress)
}

public actual fun NdisWaitEvent(event: Long, mstowait: UInt): Boolean =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent(event.toCPointer<ByteVar>(), mstowait)

public actual fun NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long) {
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration(status.toCPointer<ByteVar>(), configurationhandle.toCPointer<ByteVar>(), keyword.toCPointer<ByteVar>(), parametervalue.toCPointer<ByteVar>())
}

public actual fun NdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: UInt, numberoferrorvalues: UInt) {
}

public actual fun NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: Long, datasize: UInt, data: Long): Int =
    io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis.cinterop.windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry(loghandle.toCPointer<ByteVar>(), eventcode, uniqueeventvalue, numstrings, stringslist.toCPointer<ByteVar>(), datasize, data.toCPointer<ByteVar>())
