package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FnCallback1 {
    public operator fun invoke(devicename: Long, tdihandle: Long): Win32.Foundation.NTSTATUS
}

public fun interface FnCallback2 {
    public operator fun invoke(uppercomponent: Long, lowercomponent: Long, bindlist: Long, reconfigbuffer: Long, reconfigbuffersize: UInt, operation: UInt): Win32.Foundation.NTSTATUS
}

public fun NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisAcquireReadWriteLock", longArrayOf(lock, if (fwrite) 1L else 0L, lockstate))
}

public fun NdisAllocateMemoryWithTag(virtualaddress: Long, length: UInt, tag: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisAllocateMemoryWithTag", longArrayOf(virtualaddress, length.toLong(), tag.toLong())).toInt()
}

public fun NdisCancelTimer(timer: Long, timercancelled: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCancelTimer", longArrayOf(timer, timercancelled))
}

public fun NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClAddParty", longArrayOf(ndisvchandle, protocolpartycontext, callparameters, ndispartyhandle)).toInt()
}

public fun NdisClCloseAddressFamily(ndisafhandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClCloseAddressFamily", longArrayOf(ndisafhandle)).toInt()
}

public fun NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClCloseCall", longArrayOf(ndisvchandle, ndispartyhandle, buffer, size.toLong())).toInt()
}

public fun NdisClDeregisterSap(ndissaphandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClDeregisterSap", longArrayOf(ndissaphandle)).toInt()
}

public fun NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClDropParty", longArrayOf(ndispartyhandle, buffer, size.toLong())).toInt()
}

public fun NdisClGetProtocolVcContextFromTapiCallId(tapicallid: Win32.Foundation.UNICODE_STRING, protocolvccontext: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClGetProtocolVcContextFromTapiCallId", longArrayOf(Win32DynamicFfi.objectSlot(tapicallid), protocolvccontext)).toInt()
}

public fun NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisClIncomingCallComplete", longArrayOf(status.toLong(), ndisvchandle, callparameters))
}

public fun NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClMakeCall", longArrayOf(ndisvchandle, callparameters, protocolpartycontext, ndispartyhandle)).toInt()
}

public fun NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClModifyCallQoS", longArrayOf(ndisvchandle, callparameters)).toInt()
}

public fun NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisClRegisterSap", longArrayOf(ndisafhandle, protocolsapcontext, sap, ndissaphandle)).toInt()
}

public fun NdisCloseConfiguration(configurationhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCloseConfiguration", longArrayOf(configurationhandle))
}

public fun NdisCloseFile(filehandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCloseFile", longArrayOf(filehandle))
}

public fun NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCmActivateVc", longArrayOf(ndisvchandle, callparameters)).toInt()
}

public fun NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmAddPartyComplete", longArrayOf(status.toLong(), ndispartyhandle, callmgrpartycontext, callparameters))
}

public fun NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmCloseAddressFamilyComplete", longArrayOf(status.toLong(), ndisafhandle))
}

public fun NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmCloseCallComplete", longArrayOf(status.toLong(), ndisvchandle, ndispartyhandle))
}

public fun NdisCmDeactivateVc(ndisvchandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCmDeactivateVc", longArrayOf(ndisvchandle)).toInt()
}

public fun NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmDeregisterSapComplete", longArrayOf(status.toLong(), ndissaphandle))
}

public fun NdisCmDispatchCallConnected(ndisvchandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmDispatchCallConnected", longArrayOf(ndisvchandle))
}

public fun NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCmDispatchIncomingCall", longArrayOf(ndissaphandle, ndisvchandle, callparameters)).toInt()
}

public fun NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmDispatchIncomingCallQoSChange", longArrayOf(ndisvchandle, callparameters))
}

public fun NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmDispatchIncomingCloseCall", longArrayOf(closestatus.toLong(), ndisvchandle, buffer, size.toLong()))
}

public fun NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmDispatchIncomingDropParty", longArrayOf(dropstatus.toLong(), ndispartyhandle, buffer, size.toLong()))
}

public fun NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmDropPartyComplete", longArrayOf(status.toLong(), ndispartyhandle))
}

public fun NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmMakeCallComplete", longArrayOf(status.toLong(), ndisvchandle, ndispartyhandle, callmgrpartycontext, callparameters))
}

public fun NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmModifyCallQoSComplete", longArrayOf(status.toLong(), ndisvchandle, callparameters))
}

public fun NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmOpenAddressFamilyComplete", longArrayOf(status.toLong(), ndisafhandle, callmgrafcontext))
}

public fun NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCmRegisterSapComplete", longArrayOf(status.toLong(), ndissaphandle, callmgrsapcontext))
}

public fun NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCoAssignInstanceName", longArrayOf(ndisvchandle, baseinstancename, vcinstancename)).toInt()
}

public fun NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCoCreateVc", longArrayOf(ndisbindinghandle, ndisafhandle, protocolvccontext, ndisvchandle)).toInt()
}

public fun NdisCoDeleteVc(ndisvchandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCoDeleteVc", longArrayOf(ndisvchandle)).toInt()
}

public fun NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisCoGetTapiCallId", longArrayOf(ndisvchandle, tapicallid)).toInt()
}

public fun NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCompleteDmaTransfer", longArrayOf(status, ndisdmahandle, buffer, offset.toLong(), length.toLong(), if (writetodevice) 1L else 0L))
}

public fun NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: UInt, length: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisCopyBuffer", longArrayOf(status, buffer, poolhandle, memorydescriptor, offset.toLong(), length.toLong()))
}

public fun NdisDeregisterTdiCallBack() {
    Win32DynamicFfi.invoke("ndis.sys", "NdisDeregisterTdiCallBack", longArrayOf())
}

public fun NdisFreeMemory(virtualaddress: Long, length: UInt, memoryflags: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisFreeMemory", longArrayOf(virtualaddress, length.toLong(), memoryflags.toLong()))
}

public fun NdisGeneratePartialCancelId(): UByte {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisGeneratePartialCancelId", longArrayOf()).toUByte()
}

public fun NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisGetCurrentProcessorCounts", longArrayOf(pidlecount, pkernelanduser, pindex))
}

public fun NdisGetCurrentProcessorCpuUsage(pcpuusage: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisGetCurrentProcessorCpuUsage", longArrayOf(pcpuusage))
}

public fun NdisGetRoutineAddress(ndisroutinename: Long): Long {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisGetRoutineAddress", longArrayOf(ndisroutinename))
}

public fun NdisGetSharedDataAlignment(): UInt {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisGetSharedDataAlignment", longArrayOf()).toUInt()
}

public fun NdisGetVersion(): UInt {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisGetVersion", longArrayOf()).toUInt()
}

public fun NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisIMAssociateMiniport", longArrayOf(driverhandle, protocolhandle))
}

public fun NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisIMCancelInitializeDeviceInstance", longArrayOf(driverhandle, deviceinstance)).toInt()
}

public fun NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisIMDeInitializeDeviceInstance", longArrayOf(ndisminiporthandle)).toInt()
}

public fun NdisIMGetBindingContext(ndisbindinghandle: Long): Long {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisIMGetBindingContext", longArrayOf(ndisbindinghandle))
}

public fun NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisIMInitializeDeviceInstanceEx", longArrayOf(driverhandle, driverinstance, devicecontext)).toInt()
}

public fun NdisInitializeEvent(event: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisInitializeEvent", longArrayOf(event))
}

public fun NdisInitializeReadWriteLock(lock: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisInitializeReadWriteLock", longArrayOf(lock))
}

public fun NdisInitializeString(destination: Long, source: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisInitializeString", longArrayOf(destination, source))
}

public fun NdisInitializeTimer(timer: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisInitializeTimer", longArrayOf(timer, Win32DynamicFfi.objectSlot(timerfunction), functioncontext))
}

public fun NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMAllocateSharedMemory", longArrayOf(miniportadapterhandle, length.toLong(), if (cached) 1L else 0L, virtualaddress, physicaladdress))
}

public fun NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: UInt, cached: Boolean, context: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMAllocateSharedMemoryAsync", longArrayOf(miniportadapterhandle, length.toLong(), if (cached) 1L else 0L, context)).toInt()
}

public fun NdisMCancelTimer(timer: Long, timercancelled: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMCancelTimer", longArrayOf(timer, timercancelled))
}

public fun NdisMCloseLog(loghandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMCloseLog", longArrayOf(loghandle))
}

public fun NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMCmActivateVc", longArrayOf(ndisvchandle, callparameters)).toInt()
}

public fun NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMCmCreateVc", longArrayOf(miniportadapterhandle, ndisafhandle, miniportvccontext, ndisvchandle)).toInt()
}

public fun NdisMCmDeactivateVc(ndisvchandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMCmDeactivateVc", longArrayOf(ndisvchandle)).toInt()
}

public fun NdisMCmDeleteVc(ndisvchandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMCmDeleteVc", longArrayOf(ndisvchandle)).toInt()
}

public fun NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMCmRegisterAddressFamily", longArrayOf(miniportadapterhandle, addressfamily, cmcharacteristics, sizeofcmcharacteristics.toLong())).toInt()
}

public fun NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMCoActivateVcComplete", longArrayOf(status.toLong(), ndisvchandle, callparameters))
}

public fun NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMCoDeactivateVcComplete", longArrayOf(status.toLong(), ndisvchandle))
}

public fun NdisMCreateLog(miniportadapterhandle: Long, size: UInt, loghandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMCreateLog", longArrayOf(miniportadapterhandle, size.toLong(), loghandle)).toInt()
}

public fun NdisMDeregisterDmaChannel(miniportdmahandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMDeregisterDmaChannel", longArrayOf(miniportdmahandle))
}

public fun NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: UInt, numberofports: UInt, portoffset: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMDeregisterIoPortRange", longArrayOf(miniportadapterhandle, initialport.toLong(), numberofports.toLong(), portoffset))
}

public fun NdisMFlushLog(loghandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMFlushLog", longArrayOf(loghandle))
}

public fun NdisMFreeSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMFreeSharedMemory", longArrayOf(miniportadapterhandle, length.toLong(), if (cached) 1L else 0L, virtualaddress, physicaladdress))
}

public fun NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMGetDeviceProperty", longArrayOf(miniportadapterhandle, physicaldeviceobject, functionaldeviceobject, nextdeviceobject, allocatedresources, allocatedresourcestranslated))
}

public fun NdisMGetDmaAlignment(miniportadapterhandle: Long): UInt {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMGetDmaAlignment", longArrayOf(miniportadapterhandle)).toUInt()
}

public fun NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMInitializeTimer", longArrayOf(timer, miniportadapterhandle, Win32DynamicFfi.objectSlot(timerfunction), functioncontext))
}

public fun NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMMapIoSpace", longArrayOf(virtualaddress, miniportadapterhandle, physicaladdress, length.toLong())).toInt()
}

public fun NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMQueryAdapterInstanceName", longArrayOf(padapterinstancename, miniporthandle)).toInt()
}

public fun NdisMReadDmaCounter(miniportdmahandle: Long): UInt {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMReadDmaCounter", longArrayOf(miniportdmahandle)).toUInt()
}

public fun NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMRegisterDmaChannel", longArrayOf(miniportdmahandle, miniportadapterhandle, dmachannel.toLong(), if (dma32bitaddresses) 1L else 0L, dmadescription, maximumlength.toLong())).toInt()
}

public fun NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: UInt, numberofports: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMRegisterIoPortRange", longArrayOf(portoffset, miniportadapterhandle, initialport.toLong(), numberofports.toLong())).toInt()
}

public fun NdisMRemoveMiniport(miniporthandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMRemoveMiniport", longArrayOf(miniporthandle)).toInt()
}

public fun NdisMSetPeriodicTimer(timer: Long, millisecondperiod: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMSetPeriodicTimer", longArrayOf(timer, millisecondperiod.toLong()))
}

public fun NdisMSleep(microsecondstosleep: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMSleep", longArrayOf(microsecondstosleep.toLong()))
}

public fun NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMUnmapIoSpace", longArrayOf(miniportadapterhandle, virtualaddress, length.toLong()))
}

public fun NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: UInt): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisMWriteLogData", longArrayOf(loghandle, logbuffer, logbuffersize.toLong())).toInt()
}

public fun NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisMapFile", longArrayOf(status, mappedbuffer, filehandle))
}

public fun NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: UInt, keyname: Long, keyhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisOpenConfigurationKeyByIndex", longArrayOf(status, configurationhandle, index.toLong(), keyname, keyhandle))
}

public fun NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisOpenConfigurationKeyByName", longArrayOf(status, configurationhandle, subkeyname, subkeyhandle))
}

public fun NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisOpenFile", longArrayOf(status, filehandle, filelength, filename, highestacceptableaddress))
}

public fun NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisQueryAdapterInstanceName", longArrayOf(padapterinstancename, ndisbindinghandle)).toInt()
}

public fun NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisQueryBindInstanceName", longArrayOf(padapterinstancename, bindingcontext)).toInt()
}

public fun NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisReEnumerateProtocolBindings", longArrayOf(ndisprotocolhandle))
}

public fun NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: NDIS_PARAMETER_TYPE) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisReadConfiguration", longArrayOf(status, parametervalue, configurationhandle, keyword, parametertype.toLong()))
}

public fun NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisReadNetworkAddress", longArrayOf(status, networkaddress, networkaddresslength, configurationhandle))
}

public fun NdisRegisterTdiCallBack(registercallback: TDI_REGISTER_CALLBACK, pnphandler: TDI_PNP_HANDLER) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisRegisterTdiCallBack", longArrayOf(Win32DynamicFfi.objectSlot(registercallback), Win32DynamicFfi.objectSlot(pnphandler)))
}

public fun NdisReleaseReadWriteLock(lock: Long, lockstate: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisReleaseReadWriteLock", longArrayOf(lock, lockstate))
}

public fun NdisResetEvent(event: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisResetEvent", longArrayOf(event))
}

public fun NdisSetEvent(event: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisSetEvent", longArrayOf(event))
}

public fun NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisSetPeriodicTimer", longArrayOf(ndistimer, millisecondsperiod.toLong()))
}

public fun NdisSetTimer(timer: Long, millisecondstodelay: UInt) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisSetTimer", longArrayOf(timer, millisecondstodelay.toLong()))
}

public fun NdisSetTimerEx(ndistimer: Long, millisecondstodelay: UInt, functioncontext: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisSetTimerEx", longArrayOf(ndistimer, millisecondstodelay.toLong(), functioncontext))
}

public fun NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisSetupDmaTransfer", longArrayOf(status, ndisdmahandle, buffer, offset.toLong(), length.toLong(), if (writetodevice) 1L else 0L))
}

public fun NdisSystemProcessorCount(): Byte {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisSystemProcessorCount", longArrayOf()).toByte()
}

public fun NdisUnmapFile(filehandle: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisUnmapFile", longArrayOf(filehandle))
}

public fun NdisUpdateSharedMemory(ndisadapterhandle: Long, length: UInt, virtualaddress: Long, physicaladdress: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisUpdateSharedMemory", longArrayOf(ndisadapterhandle, length.toLong(), virtualaddress, physicaladdress))
}

public fun NdisWaitEvent(event: Long, mstowait: UInt): Boolean {
    val rawRet = Win32DynamicFfi.invoke("ndis.sys", "NdisWaitEvent", longArrayOf(event, mstowait.toLong()))
    return (rawRet and 0xFFL) != 0L
}

public fun NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisWriteConfiguration", longArrayOf(status, configurationhandle, keyword, parametervalue))
}

public fun NdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    Win32DynamicFfi.invoke("ndis.sys", "NdisWriteErrorLogEntry", longArrayOf(ndisadapterhandle, errorcode.toLong(), numberoferrorvalues.toLong()) + variadicArgs)
}

public fun NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: Long, datasize: UInt, data: Long): Int {
    return Win32DynamicFfi.invoke("ndis.sys", "NdisWriteEventLogEntry", longArrayOf(loghandle, eventcode.toLong(), uniqueeventvalue.toLong(), numstrings.toLong(), stringslist, datasize.toLong(), data)).toInt()
}
