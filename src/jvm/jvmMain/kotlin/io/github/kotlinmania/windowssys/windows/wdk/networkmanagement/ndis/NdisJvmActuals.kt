@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.windows.win32.foundation.UNICODE_STRING

private object WindowsWdkNetworkmanagementNdisJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag(virtualaddress: Long, length: Int, tag: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer(timer: Long, timercancelled: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily(ndisafhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap(ndissaphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration(configurationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile(filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected(ndisvchandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: Int, length: Int, writetodevice: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: Int, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack()

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory(virtualaddress: Long, length: Int, memoryflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage(pcpuusage: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress(ndisroutinename: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext(ndisbindinghandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock(lock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString(destination: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer(timer: Long, timerfunction: Long, functioncontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: Int, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: Int, cached: Boolean, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer(timer: Long, timercancelled: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog(loghandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog(miniportadapterhandle: Long, size: Int, loghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel(miniportdmahandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: Int, numberofports: Int, portoffset: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog(loghandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory(miniportadapterhandle: Long, length: Int, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment(miniportadapterhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: Long, functioncontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter(miniportdmahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: Int, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: Int, numberofports: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport(miniporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer(timer: Long, millisecondperiod: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep(microsecondstosleep: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: Int, keyname: Long, keyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack(registercallback: Long, pnphandler: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock(lock: Long, lockstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer(timer: Long, millisecondstodelay: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx(ndistimer: Long, millisecondstodelay: Int, functioncontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: Int, length: Int, writetodevice: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile(filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory(ndisadapterhandle: Long, length: Int, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent(event: Long, mstowait: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: Int, numstrings: Short, stringslist: Long, datasize: Int, data: Long): Int
}

public actual fun NdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisAcquireReadWriteLock(lock, fwrite, lockstate)
}

public actual fun NdisAllocateMemoryWithTag(virtualaddress: Long, length: UInt, tag: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisAllocateMemoryWithTag(virtualaddress, length.toInt(), tag.toInt())

public actual fun NdisCancelTimer(timer: Long, timercancelled: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCancelTimer(timer, timercancelled)
}

public actual fun NdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClAddParty(ndisvchandle, protocolpartycontext, callparameters, ndispartyhandle)

public actual fun NdisClCloseAddressFamily(ndisafhandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseAddressFamily(ndisafhandle)

public actual fun NdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClCloseCall(ndisvchandle, ndispartyhandle, buffer, size.toInt())

public actual fun NdisClDeregisterSap(ndissaphandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClDeregisterSap(ndissaphandle)

public actual fun NdisClDropParty(ndispartyhandle: Long, buffer: Long, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClDropParty(ndispartyhandle, buffer, size.toInt())

public actual fun NdisClGetProtocolVcContextFromTapiCallId(tapicallid: UNICODE_STRING, protocolvccontext: Long): Int =
    0

public actual fun NdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClIncomingCallComplete(status, ndisvchandle, callparameters)
}

public actual fun NdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClMakeCall(ndisvchandle, callparameters, protocolpartycontext, ndispartyhandle)

public actual fun NdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClModifyCallQoS(ndisvchandle, callparameters)

public actual fun NdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisClRegisterSap(ndisafhandle, protocolsapcontext, sap, ndissaphandle)

public actual fun NdisCloseConfiguration(configurationhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCloseConfiguration(configurationhandle)
}

public actual fun NdisCloseFile(filehandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCloseFile(filehandle)
}

public actual fun NdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmActivateVc(ndisvchandle, callparameters)

public actual fun NdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmAddPartyComplete(status, ndispartyhandle, callmgrpartycontext, callparameters)
}

public actual fun NdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseAddressFamilyComplete(status, ndisafhandle)
}

public actual fun NdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmCloseCallComplete(status, ndisvchandle, ndispartyhandle)
}

public actual fun NdisCmDeactivateVc(ndisvchandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeactivateVc(ndisvchandle)

public actual fun NdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDeregisterSapComplete(status, ndissaphandle)
}

public actual fun NdisCmDispatchCallConnected(ndisvchandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchCallConnected(ndisvchandle)
}

public actual fun NdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCall(ndissaphandle, ndisvchandle, callparameters)

public actual fun NdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCallQoSChange(ndisvchandle, callparameters)
}

public actual fun NdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle, buffer, size.toInt())
}

public actual fun NdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle, buffer, size.toInt())
}

public actual fun NdisCmDropPartyComplete(status: Int, ndispartyhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmDropPartyComplete(status, ndispartyhandle)
}

public actual fun NdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmMakeCallComplete(status, ndisvchandle, ndispartyhandle, callmgrpartycontext, callparameters)
}

public actual fun NdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmModifyCallQoSComplete(status, ndisvchandle, callparameters)
}

public actual fun NdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmOpenAddressFamilyComplete(status, ndisafhandle, callmgrafcontext)
}

public actual fun NdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCmRegisterSapComplete(status, ndissaphandle, callmgrsapcontext)
}

public actual fun NdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCoAssignInstanceName(ndisvchandle, baseinstancename, vcinstancename)

public actual fun NdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCoCreateVc(ndisbindinghandle, ndisafhandle, protocolvccontext, ndisvchandle)

public actual fun NdisCoDeleteVc(ndisvchandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCoDeleteVc(ndisvchandle)

public actual fun NdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCoGetTapiCallId(ndisvchandle, tapicallid)

public actual fun NdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCompleteDmaTransfer(status, ndisdmahandle, buffer, offset.toInt(), length.toInt(), writetodevice)
}

public actual fun NdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: UInt, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisCopyBuffer(status, buffer, poolhandle, memorydescriptor, offset.toInt(), length.toInt())
}

public actual fun NdisDeregisterTdiCallBack() {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisDeregisterTdiCallBack()
}

public actual fun NdisFreeMemory(virtualaddress: Long, length: UInt, memoryflags: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisFreeMemory(virtualaddress, length.toInt(), memoryflags.toInt())
}

public actual fun NdisGeneratePartialCancelId(): UByte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisGeneratePartialCancelId().toUByte()

public actual fun NdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCounts(pidlecount, pkernelanduser, pindex)
}

public actual fun NdisGetCurrentProcessorCpuUsage(pcpuusage: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisGetCurrentProcessorCpuUsage(pcpuusage)
}

public actual fun NdisGetRoutineAddress(ndisroutinename: Long): Long =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisGetRoutineAddress(ndisroutinename)

public actual fun NdisGetSharedDataAlignment(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisGetSharedDataAlignment().toUInt()

public actual fun NdisGetVersion(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisGetVersion().toUInt()

public actual fun NdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisIMAssociateMiniport(driverhandle, protocolhandle)
}

public actual fun NdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisIMCancelInitializeDeviceInstance(driverhandle, deviceinstance)

public actual fun NdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisIMDeInitializeDeviceInstance(ndisminiporthandle)

public actual fun NdisIMGetBindingContext(ndisbindinghandle: Long): Long =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisIMGetBindingContext(ndisbindinghandle)

public actual fun NdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisIMInitializeDeviceInstanceEx(driverhandle, driverinstance, devicecontext)

public actual fun NdisInitializeEvent(event: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeEvent(event)
}

public actual fun NdisInitializeReadWriteLock(lock: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeReadWriteLock(lock)
}

public actual fun NdisInitializeString(destination: Long, source: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeString(destination, source)
}

public actual fun NdisInitializeTimer(timer: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisInitializeTimer(timer, timerfunction.toLong(), functioncontext)
}

public actual fun NdisMAllocateSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemory(miniportadapterhandle, length.toInt(), cached, virtualaddress, physicaladdress)
}

public actual fun NdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: UInt, cached: Boolean, context: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMAllocateSharedMemoryAsync(miniportadapterhandle, length.toInt(), cached, context)

public actual fun NdisMCancelTimer(timer: Long, timercancelled: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCancelTimer(timer, timercancelled)
}

public actual fun NdisMCloseLog(loghandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCloseLog(loghandle)
}

public actual fun NdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmActivateVc(ndisvchandle, callparameters)

public actual fun NdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmCreateVc(miniportadapterhandle, ndisafhandle, miniportvccontext, ndisvchandle)

public actual fun NdisMCmDeactivateVc(ndisvchandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeactivateVc(ndisvchandle)

public actual fun NdisMCmDeleteVc(ndisvchandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmDeleteVc(ndisvchandle)

public actual fun NdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCmRegisterAddressFamily(miniportadapterhandle, addressfamily, cmcharacteristics, sizeofcmcharacteristics.toInt())

public actual fun NdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCoActivateVcComplete(status, ndisvchandle, callparameters)
}

public actual fun NdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCoDeactivateVcComplete(status, ndisvchandle)
}

public actual fun NdisMCreateLog(miniportadapterhandle: Long, size: UInt, loghandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMCreateLog(miniportadapterhandle, size.toInt(), loghandle)

public actual fun NdisMDeregisterDmaChannel(miniportdmahandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterDmaChannel(miniportdmahandle)
}

public actual fun NdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: UInt, numberofports: UInt, portoffset: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMDeregisterIoPortRange(miniportadapterhandle, initialport.toInt(), numberofports.toInt(), portoffset)
}

public actual fun NdisMFlushLog(loghandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMFlushLog(loghandle)
}

public actual fun NdisMFreeSharedMemory(miniportadapterhandle: Long, length: UInt, cached: Boolean, virtualaddress: Long, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMFreeSharedMemory(miniportadapterhandle, length.toInt(), cached, virtualaddress, physicaladdress)
}

public actual fun NdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDeviceProperty(miniportadapterhandle, physicaldeviceobject, functionaldeviceobject, nextdeviceobject, allocatedresources, allocatedresourcestranslated)
}

public actual fun NdisMGetDmaAlignment(miniportadapterhandle: Long): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMGetDmaAlignment(miniportadapterhandle).toUInt()

public actual fun NdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: PNDIS_TIMER_FUNCTION, functioncontext: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMInitializeTimer(timer, miniportadapterhandle, timerfunction.toLong(), functioncontext)
}

public actual fun NdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMMapIoSpace(virtualaddress, miniportadapterhandle, physicaladdress, length.toInt())

public actual fun NdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMQueryAdapterInstanceName(padapterinstancename, miniporthandle)

public actual fun NdisMReadDmaCounter(miniportdmahandle: Long): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMReadDmaCounter(miniportdmahandle).toUInt()

public actual fun NdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterDmaChannel(miniportdmahandle, miniportadapterhandle, dmachannel.toInt(), dma32bitaddresses, dmadescription, maximumlength.toInt())

public actual fun NdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: UInt, numberofports: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMRegisterIoPortRange(portoffset, miniportadapterhandle, initialport.toInt(), numberofports.toInt())

public actual fun NdisMRemoveMiniport(miniporthandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMRemoveMiniport(miniporthandle)

public actual fun NdisMSetPeriodicTimer(timer: Long, millisecondperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMSetPeriodicTimer(timer, millisecondperiod.toInt())
}

public actual fun NdisMSleep(microsecondstosleep: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMSleep(microsecondstosleep.toInt())
}

public actual fun NdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMUnmapIoSpace(miniportadapterhandle, virtualaddress, length.toInt())
}

public actual fun NdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMWriteLogData(loghandle, logbuffer, logbuffersize.toInt())

public actual fun NdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisMapFile(status, mappedbuffer, filehandle)
}

public actual fun NdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: UInt, keyname: Long, keyhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByIndex(status, configurationhandle, index.toInt(), keyname, keyhandle)
}

public actual fun NdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenConfigurationKeyByName(status, configurationhandle, subkeyname, subkeyhandle)
}

public actual fun NdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisOpenFile(status, filehandle, filelength, filename, highestacceptableaddress)
}

public actual fun NdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisQueryAdapterInstanceName(padapterinstancename, ndisbindinghandle)

public actual fun NdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisQueryBindInstanceName(padapterinstancename, bindingcontext)

public actual fun NdisReEnumerateProtocolBindings(ndisprotocolhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisReEnumerateProtocolBindings(ndisprotocolhandle)
}

public actual fun NdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: NDIS_PARAMETER_TYPE) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisReadConfiguration(status, parametervalue, configurationhandle, keyword, parametertype)
}

public actual fun NdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisReadNetworkAddress(status, networkaddress, networkaddresslength, configurationhandle)
}

public actual fun NdisRegisterTdiCallBack(registercallback: TDI_REGISTER_CALLBACK, pnphandler: TDI_PNP_HANDLER) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisRegisterTdiCallBack(registercallback.toLong(), pnphandler.toLong())
}

public actual fun NdisReleaseReadWriteLock(lock: Long, lockstate: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisReleaseReadWriteLock(lock, lockstate)
}

public actual fun NdisResetEvent(event: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisResetEvent(event)
}

public actual fun NdisSetEvent(event: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisSetEvent(event)
}

public actual fun NdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisSetPeriodicTimer(ndistimer, millisecondsperiod.toInt())
}

public actual fun NdisSetTimer(timer: Long, millisecondstodelay: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimer(timer, millisecondstodelay.toInt())
}

public actual fun NdisSetTimerEx(ndistimer: Long, millisecondstodelay: UInt, functioncontext: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisSetTimerEx(ndistimer, millisecondstodelay.toInt(), functioncontext)
}

public actual fun NdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisSetupDmaTransfer(status, ndisdmahandle, buffer, offset.toInt(), length.toInt(), writetodevice)
}

public actual fun NdisSystemProcessorCount(): Byte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisSystemProcessorCount()

public actual fun NdisUnmapFile(filehandle: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisUnmapFile(filehandle)
}

public actual fun NdisUpdateSharedMemory(ndisadapterhandle: Long, length: UInt, virtualaddress: Long, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisUpdateSharedMemory(ndisadapterhandle, length.toInt(), virtualaddress, physicaladdress)
}

public actual fun NdisWaitEvent(event: Long, mstowait: UInt): Boolean =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisWaitEvent(event, mstowait.toInt())

public actual fun NdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisWriteConfiguration(status, configurationhandle, keyword, parametervalue)
}

public actual fun NdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: UInt, numberoferrorvalues: UInt) {
}

public actual fun NdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: Long, datasize: UInt, data: Long): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_NdisWriteEventLogEntry(loghandle, eventcode, uniqueeventvalue.toInt(), numstrings.toShort(), stringslist, datasize.toInt(), data)
