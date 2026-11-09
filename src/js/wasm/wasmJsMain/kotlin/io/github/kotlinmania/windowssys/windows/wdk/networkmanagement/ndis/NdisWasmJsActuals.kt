@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING

public actual fun NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long) {
}

public actual fun NdisAllocateMemoryWithTag(virtualaddress: Long, length: UInt, tag: UInt): Int =
    0

public actual fun NdisCancelTimer(timer: Long, timercancelled: Long) {
}

public actual fun NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int =
    0

public actual fun NdisClCloseAddressFamily(ndisafhandle: Long): Int =
    0

public actual fun NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    0

public actual fun NdisClDeregisterSap(ndissaphandle: Long): Int =
    0

public actual fun NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    0

public actual fun NdisClGetProtocolVcContextFromTapiCallId(tapicallid: UNICODE_STRING, protocolvccontext: Long): Int =
    0

public actual fun NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
}

public actual fun NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int =
    0

public actual fun NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int =
    0

public actual fun NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int =
    0

public actual fun NdisCloseConfiguration(configurationhandle: Long) {
}

public actual fun NdisCloseFile(filehandle: Long) {
}

public actual fun NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    0

public actual fun NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
}

public actual fun NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long) {
}

public actual fun NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long) {
}

public actual fun NdisCmDeactivateVc(ndisvchandle: Long): Int =
    0

public actual fun NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long) {
}

public actual fun NdisCmDispatchCallConnected(ndisvchandle: Long) {
}

public actual fun NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int =
    0

public actual fun NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long) {
}

public actual fun NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: UInt) {
}

public actual fun NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: UInt) {
}

public actual fun NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long) {
}

public actual fun NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
}

public actual fun NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
}

public actual fun NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long) {
}

public actual fun NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long) {
}

public actual fun NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int =
    0

public actual fun NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int =
    0

public actual fun NdisCoDeleteVc(ndisvchandle: Long): Int =
    0

public actual fun NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int =
    0

public actual fun NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
}

public actual fun NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: UInt, length: UInt) {
}

public actual fun NdisDeregisterTdiCallBack() {
}

public actual fun NdisFreeMemory(virtualaddress: Long, length: UInt, memoryflags: UInt) {
}

public actual fun NdisGeneratePartialCancelId(): UByte =
    0u

public actual fun NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long) {
}

public actual fun NdisGetCurrentProcessorCpuUsage(pcpuusage: Long) {
}

public actual fun NdisGetRoutineAddress(ndisroutinename: Long): Long =
    0L

public actual fun NdisGetSharedDataAlignment(): UInt =
    0u

public actual fun NdisGetVersion(): UInt =
    0u

public actual fun NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long) {
}

public actual fun NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int =
    0

public actual fun NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int =
    0

public actual fun NdisIMGetBindingContext(ndisbindinghandle: Long): Long =
    0L

public actual fun NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int =
    0

public actual fun NdisInitializeEvent(event: Long) {
}

public actual fun NdisInitializeReadWriteLock(lock: Long) {
}

public actual fun NdisInitializeString(destination: Long, source: Long) {
}

public actual fun NdisInitializeTimer(timer: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
}

public actual fun NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
}

public actual fun NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: UInt, cached: Boolean, context: Long): Int =
    0

public actual fun NdisMCancelTimer(timer: Long, timercancelled: Long) {
}

public actual fun NdisMCloseLog(loghandle: Long) {
}

public actual fun NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    0

public actual fun NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int =
    0

public actual fun NdisMCmDeactivateVc(ndisvchandle: Long): Int =
    0

public actual fun NdisMCmDeleteVc(ndisvchandle: Long): Int =
    0

public actual fun NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: UInt): Int =
    0

public actual fun NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
}

public actual fun NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long) {
}

public actual fun NdisMCreateLog(miniportadapterhandle: Long, size: UInt, loghandle: Long): Int =
    0

public actual fun NdisMDeregisterDmaChannel(miniportdmahandle: Long) {
}

public actual fun NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: UInt, numberofports: UInt, portoffset: Long) {
}

public actual fun NdisMFlushLog(loghandle: Long) {
}

public actual fun NdisMFreeSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
}

public actual fun NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long) {
}

public actual fun NdisMGetDmaAlignment(miniportadapterhandle: Long): UInt =
    0u

public actual fun NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
}

public actual fun NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: UInt): Int =
    0

public actual fun NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int =
    0

public actual fun NdisMReadDmaCounter(miniportdmahandle: Long): UInt =
    0u

public actual fun NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: UInt): Int =
    0

public actual fun NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: UInt, numberofports: UInt): Int =
    0

public actual fun NdisMRemoveMiniport(miniporthandle: Long): Int =
    0

public actual fun NdisMSetPeriodicTimer(timer: Long, millisecondperiod: UInt) {
}

public actual fun NdisMSleep(microsecondstosleep: UInt) {
}

public actual fun NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: UInt) {
}

public actual fun NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: UInt): Int =
    0

public actual fun NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long) {
}

public actual fun NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: UInt, keyname: Long, keyhandle: Long) {
}

public actual fun NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long) {
}

public actual fun NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long) {
}

public actual fun NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int =
    0

public actual fun NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int =
    0

public actual fun NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long) {
}

public actual fun NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: NDIS_PARAMETER_TYPE) {
}

public actual fun NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long) {
}

public actual fun NdisRegisterTdiCallBack(registercallback: TDI_REGISTER_CALLBACK, pnphandler: TDI_PNP_HANDLER) {
}

public actual fun NdisReleaseReadWriteLock(lock: Long, lockstate: Long) {
}

public actual fun NdisResetEvent(event: Long) {
}

public actual fun NdisSetEvent(event: Long) {
}

public actual fun NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: UInt) {
}

public actual fun NdisSetTimer(timer: Long, millisecondstodelay: UInt) {
}

public actual fun NdisSetTimerEx(ndistimer: Long, millisecondstodelay: UInt, functioncontext: Long) {
}

public actual fun NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
}

public actual fun NdisSystemProcessorCount(): Byte =
    0

public actual fun NdisUnmapFile(filehandle: Long) {
}

public actual fun NdisUpdateSharedMemory(ndisadapterhandle: Long, length: UInt, virtualaddress: Long, physicaladdress: Long) {
}

public actual fun NdisWaitEvent(event: Long, mstowait: UInt): Boolean =
    false

public actual fun NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long) {
}

public actual fun NdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: UInt, numberoferrorvalues: UInt) {
}

public actual fun NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: Long, datasize: UInt, data: Long): Int =
    0
