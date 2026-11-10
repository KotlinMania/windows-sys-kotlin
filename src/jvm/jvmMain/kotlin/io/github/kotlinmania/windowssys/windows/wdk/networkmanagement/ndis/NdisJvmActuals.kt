@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

private object WindowsWdkNetworkmanagementNdisJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag(virtualaddress: Long, length: Int, tag: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer(timer: Long, timercancelled: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily(ndisafhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap(ndissaphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty(ndispartyhandle: Long, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration(configurationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile(filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(status: Int, ndissaphandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected(ndisvchandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(status: Int, ndispartyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: Int, length: Int, writetodevice: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: Int, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory(virtualaddress: Long, length: Int, memoryflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage(pcpuusage: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress(ndisroutinename: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext(ndisbindinghandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock(lock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString(destination: Long, source: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer(timer: Long, timerfunction: Long, functioncontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory(miniportadapterhandle: Long, length: Int, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: Int, cached: Boolean, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer(timer: Long, timercancelled: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog(loghandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog(miniportadapterhandle: Long, size: Int, loghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel(miniportdmahandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: Int, numberofports: Int, portoffset: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog(loghandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory(miniportadapterhandle: Long, length: Int, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment(miniportadapterhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: Long, functioncontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter(miniportdmahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: Int, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: Int, numberofports: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport(miniporthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer(timer: Long, millisecondperiod: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(microsecondstosleep: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile(status: Long, mappedbuffer: Long, filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: Int, keyname: Long, keyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings(ndisprotocolhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(registercallback: Long, pnphandler: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock(lock: Long, lockstate: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer(timer: Long, millisecondstodelay: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx(ndistimer: Long, millisecondstodelay: Int, functioncontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: Int, length: Int, writetodevice: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile(filehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory(ndisadapterhandle: Long, length: Int, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent(event: Long, mstowait: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: Int, numberoferrorvalues: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: Int, numstrings: Short, stringslist: Long, datasize: Int, data: Long): Int
}

public actual fun ndisAcquireReadWriteLock(lock: COpaquePointer?, fwrite: Boolean, lockstate: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisAcquireReadWriteLock((lock?.value ?: 0L), fwrite, (lockstate?.value ?: 0L))
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: COpaquePointer?, length: UInt, tag: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisAllocateMemoryWithTag((virtualaddress?.value ?: 0L), length.toInt(), tag.toInt())

public actual fun ndisCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCancelTimer((timer?.value ?: 0L), (timercancelled?.value ?: 0L))
}

public actual fun ndisClAddParty(ndisvchandle: COpaquePointer?, protocolpartycontext: COpaquePointer?, callparameters: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClAddParty((ndisvchandle?.value ?: 0L), (protocolpartycontext?.value ?: 0L), (callparameters?.value ?: 0L), (ndispartyhandle?.value ?: 0L))

public actual fun ndisClCloseAddressFamily(ndisafhandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseAddressFamily((ndisafhandle?.value ?: 0L))

public actual fun ndisClCloseCall(ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClCloseCall((ndisvchandle?.value ?: 0L), (ndispartyhandle?.value ?: 0L), (buffer?.value ?: 0L), size.toInt())

public actual fun ndisClDeregisterSap(ndissaphandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClDeregisterSap((ndissaphandle?.value ?: 0L))

public actual fun ndisClDropParty(ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClDropParty((ndispartyhandle?.value ?: 0L), (buffer?.value ?: 0L), size.toInt())

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: COpaquePointer?): Int =
    0

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClIncomingCallComplete(status, (ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))
}

public actual fun ndisClMakeCall(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?, protocolpartycontext: COpaquePointer?, ndispartyhandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClMakeCall((ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L), (protocolpartycontext?.value ?: 0L), (ndispartyhandle?.value ?: 0L))

public actual fun ndisClModifyCallQoS(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClModifyCallQoS((ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))

public actual fun ndisClRegisterSap(ndisafhandle: COpaquePointer?, protocolsapcontext: COpaquePointer?, sap: COpaquePointer?, ndissaphandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisClRegisterSap((ndisafhandle?.value ?: 0L), (protocolsapcontext?.value ?: 0L), (sap?.value ?: 0L), (ndissaphandle?.value ?: 0L))

public actual fun ndisCloseConfiguration(configurationhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseConfiguration((configurationhandle?.value ?: 0L))
}

public actual fun ndisCloseFile(filehandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCloseFile((filehandle?.value ?: 0L))
}

public actual fun ndisCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmActivateVc((ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmAddPartyComplete(status, (ndispartyhandle?.value ?: 0L), (callmgrpartycontext?.value ?: 0L), (callparameters?.value ?: 0L))
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseAddressFamilyComplete(status, (ndisafhandle?.value ?: 0L))
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmCloseCallComplete(status, (ndisvchandle?.value ?: 0L), (ndispartyhandle?.value ?: 0L))
}

public actual fun ndisCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeactivateVc((ndisvchandle?.value ?: 0L))

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDeregisterSapComplete(status, (ndissaphandle?.value ?: 0L))
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchCallConnected((ndisvchandle?.value ?: 0L))
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: COpaquePointer?, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCall((ndissaphandle?.value ?: 0L), (ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCallQoSChange((ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingCloseCall(closestatus, (ndisvchandle?.value ?: 0L), (buffer?.value ?: 0L), size.toInt())
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: COpaquePointer?, buffer: COpaquePointer?, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDispatchIncomingDropParty(dropstatus, (ndispartyhandle?.value ?: 0L), (buffer?.value ?: 0L), size.toInt())
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmDropPartyComplete(status, (ndispartyhandle?.value ?: 0L))
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: COpaquePointer?, ndispartyhandle: COpaquePointer?, callmgrpartycontext: COpaquePointer?, callparameters: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmMakeCallComplete(status, (ndisvchandle?.value ?: 0L), (ndispartyhandle?.value ?: 0L), (callmgrpartycontext?.value ?: 0L), (callparameters?.value ?: 0L))
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmModifyCallQoSComplete(status, (ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: COpaquePointer?, callmgrafcontext: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmOpenAddressFamilyComplete(status, (ndisafhandle?.value ?: 0L), (callmgrafcontext?.value ?: 0L))
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: COpaquePointer?, callmgrsapcontext: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCmRegisterSapComplete(status, (ndissaphandle?.value ?: 0L), (callmgrsapcontext?.value ?: 0L))
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: COpaquePointer?, baseinstancename: COpaquePointer?, vcinstancename: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCoAssignInstanceName((ndisvchandle?.value ?: 0L), (baseinstancename?.value ?: 0L), (vcinstancename?.value ?: 0L))

public actual fun ndisCoCreateVc(ndisbindinghandle: COpaquePointer?, ndisafhandle: COpaquePointer?, protocolvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCoCreateVc((ndisbindinghandle?.value ?: 0L), (ndisafhandle?.value ?: 0L), (protocolvccontext?.value ?: 0L), (ndisvchandle?.value ?: 0L))

public actual fun ndisCoDeleteVc(ndisvchandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCoDeleteVc((ndisvchandle?.value ?: 0L))

public actual fun ndisCoGetTapiCallId(ndisvchandle: COpaquePointer?, tapicallid: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCoGetTapiCallId((ndisvchandle?.value ?: 0L), (tapicallid?.value ?: 0L))

public actual fun ndisCompleteDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCompleteDmaTransfer((status?.value ?: 0L), (ndisdmahandle?.value ?: 0L), (buffer?.value ?: 0L), offset.toInt(), length.toInt(), writetodevice)
}

public actual fun ndisCopyBuffer(status: COpaquePointer?, buffer: COpaquePointer?, poolhandle: COpaquePointer?, memorydescriptor: COpaquePointer?, offset: UInt, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisCopyBuffer((status?.value ?: 0L), (buffer?.value ?: 0L), (poolhandle?.value ?: 0L), (memorydescriptor?.value ?: 0L), offset.toInt(), length.toInt())
}

public actual fun ndisDeregisterTdiCallBack() {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisDeregisterTdiCallBack()
}

public actual fun ndisFreeMemory(virtualaddress: COpaquePointer?, length: UInt, memoryflags: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisFreeMemory((virtualaddress?.value ?: 0L), length.toInt(), memoryflags.toInt())
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisGeneratePartialCancelId().toUByte()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: COpaquePointer?, pkernelanduser: COpaquePointer?, pindex: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCounts((pidlecount?.value ?: 0L), (pkernelanduser?.value ?: 0L), (pindex?.value ?: 0L))
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisGetCurrentProcessorCpuUsage((pcpuusage?.value ?: 0L))
}

public actual fun ndisGetRoutineAddress(ndisroutinename: COpaquePointer?): COpaquePointer? =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisGetRoutineAddress((ndisroutinename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndisGetSharedDataAlignment(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisGetSharedDataAlignment().toUInt()

public actual fun ndisGetVersion(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisGetVersion().toUInt()

public actual fun ndisIMAssociateMiniport(driverhandle: COpaquePointer?, protocolhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisIMAssociateMiniport((driverhandle?.value ?: 0L), (protocolhandle?.value ?: 0L))
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: COpaquePointer?, deviceinstance: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisIMCancelInitializeDeviceInstance((driverhandle?.value ?: 0L), (deviceinstance?.value ?: 0L))

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisIMDeInitializeDeviceInstance((ndisminiporthandle?.value ?: 0L))

public actual fun ndisIMGetBindingContext(ndisbindinghandle: COpaquePointer?): COpaquePointer? =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisIMGetBindingContext((ndisbindinghandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: COpaquePointer?, driverinstance: COpaquePointer?, devicecontext: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisIMInitializeDeviceInstanceEx((driverhandle?.value ?: 0L), (driverinstance?.value ?: 0L), (devicecontext?.value ?: 0L))

public actual fun ndisInitializeEvent(event: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeEvent((event?.value ?: 0L))
}

public actual fun ndisInitializeReadWriteLock(lock: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeReadWriteLock((lock?.value ?: 0L))
}

public actual fun ndisInitializeString(destination: COpaquePointer?, source: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeString((destination?.value ?: 0L), (source?.value ?: 0L))
}

public actual fun ndisInitializeTimer(timer: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisInitializeTimer((timer?.value ?: 0L), 0L, (functioncontext?.value ?: 0L))
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemory((miniportadapterhandle?.value ?: 0L), length.toInt(), cached, (virtualaddress?.value ?: 0L), (physicaladdress?.value ?: 0L))
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, context: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMAllocateSharedMemoryAsync((miniportadapterhandle?.value ?: 0L), length.toInt(), cached, (context?.value ?: 0L))

public actual fun ndisMCancelTimer(timer: COpaquePointer?, timercancelled: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCancelTimer((timer?.value ?: 0L), (timercancelled?.value ?: 0L))
}

public actual fun ndisMCloseLog(loghandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCloseLog((loghandle?.value ?: 0L))
}

public actual fun ndisMCmActivateVc(ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmActivateVc((ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))

public actual fun ndisMCmCreateVc(miniportadapterhandle: COpaquePointer?, ndisafhandle: COpaquePointer?, miniportvccontext: COpaquePointer?, ndisvchandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmCreateVc((miniportadapterhandle?.value ?: 0L), (ndisafhandle?.value ?: 0L), (miniportvccontext?.value ?: 0L), (ndisvchandle?.value ?: 0L))

public actual fun ndisMCmDeactivateVc(ndisvchandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeactivateVc((ndisvchandle?.value ?: 0L))

public actual fun ndisMCmDeleteVc(ndisvchandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmDeleteVc((ndisvchandle?.value ?: 0L))

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: COpaquePointer?, addressfamily: COpaquePointer?, cmcharacteristics: COpaquePointer?, sizeofcmcharacteristics: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCmRegisterAddressFamily((miniportadapterhandle?.value ?: 0L), (addressfamily?.value ?: 0L), (cmcharacteristics?.value ?: 0L), sizeofcmcharacteristics.toInt())

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: COpaquePointer?, callparameters: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoActivateVcComplete(status, (ndisvchandle?.value ?: 0L), (callparameters?.value ?: 0L))
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCoDeactivateVcComplete(status, (ndisvchandle?.value ?: 0L))
}

public actual fun ndisMCreateLog(miniportadapterhandle: COpaquePointer?, size: UInt, loghandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMCreateLog((miniportadapterhandle?.value ?: 0L), size.toInt(), (loghandle?.value ?: 0L))

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterDmaChannel((miniportdmahandle?.value ?: 0L))
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt, portoffset: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMDeregisterIoPortRange((miniportadapterhandle?.value ?: 0L), initialport.toInt(), numberofports.toInt(), (portoffset?.value ?: 0L))
}

public actual fun ndisMFlushLog(loghandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMFlushLog((loghandle?.value ?: 0L))
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: COpaquePointer?, length: UInt, cached: Boolean, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMFreeSharedMemory((miniportadapterhandle?.value ?: 0L), length.toInt(), cached, (virtualaddress?.value ?: 0L), physicaladdress)
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: COpaquePointer?, physicaldeviceobject: COpaquePointer?, functionaldeviceobject: COpaquePointer?, nextdeviceobject: COpaquePointer?, allocatedresources: COpaquePointer?, allocatedresourcestranslated: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDeviceProperty((miniportadapterhandle?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (functionaldeviceobject?.value ?: 0L), (nextdeviceobject?.value ?: 0L), (allocatedresources?.value ?: 0L), (allocatedresourcestranslated?.value ?: 0L))
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: COpaquePointer?): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMGetDmaAlignment((miniportadapterhandle?.value ?: 0L)).toUInt()

public actual fun ndisMInitializeTimer(timer: COpaquePointer?, miniportadapterhandle: COpaquePointer?, timerfunction: PndisTimerFunction, functioncontext: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMInitializeTimer((timer?.value ?: 0L), (miniportadapterhandle?.value ?: 0L), 0L, (functioncontext?.value ?: 0L))
}

public actual fun ndisMMapIoSpace(virtualaddress: COpaquePointer?, miniportadapterhandle: COpaquePointer?, physicaladdress: Long, length: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMMapIoSpace((virtualaddress?.value ?: 0L), (miniportadapterhandle?.value ?: 0L), physicaladdress, length.toInt())

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, miniporthandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMQueryAdapterInstanceName((padapterinstancename?.value ?: 0L), (miniporthandle?.value ?: 0L))

public actual fun ndisMReadDmaCounter(miniportdmahandle: COpaquePointer?): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMReadDmaCounter((miniportdmahandle?.value ?: 0L)).toUInt()

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: COpaquePointer?, miniportadapterhandle: COpaquePointer?, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: COpaquePointer?, maximumlength: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterDmaChannel((miniportdmahandle?.value ?: 0L), (miniportadapterhandle?.value ?: 0L), dmachannel.toInt(), dma32bitaddresses, (dmadescription?.value ?: 0L), maximumlength.toInt())

public actual fun ndisMRegisterIoPortRange(portoffset: COpaquePointer?, miniportadapterhandle: COpaquePointer?, initialport: UInt, numberofports: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMRegisterIoPortRange((portoffset?.value ?: 0L), (miniportadapterhandle?.value ?: 0L), initialport.toInt(), numberofports.toInt())

public actual fun ndisMRemoveMiniport(miniporthandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMRemoveMiniport((miniporthandle?.value ?: 0L))

public actual fun ndisMSetPeriodicTimer(timer: COpaquePointer?, millisecondperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMSetPeriodicTimer((timer?.value ?: 0L), millisecondperiod.toInt())
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMSleep(microsecondstosleep.toInt())
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMUnmapIoSpace((miniportadapterhandle?.value ?: 0L), (virtualaddress?.value ?: 0L), length.toInt())
}

public actual fun ndisMWriteLogData(loghandle: COpaquePointer?, logbuffer: COpaquePointer?, logbuffersize: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMWriteLogData((loghandle?.value ?: 0L), (logbuffer?.value ?: 0L), logbuffersize.toInt())

public actual fun ndisMapFile(status: COpaquePointer?, mappedbuffer: COpaquePointer?, filehandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisMapFile((status?.value ?: 0L), (mappedbuffer?.value ?: 0L), (filehandle?.value ?: 0L))
}

public actual fun ndisOpenConfigurationKeyByIndex(status: COpaquePointer?, configurationhandle: COpaquePointer?, index: UInt, keyname: COpaquePointer?, keyhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByIndex((status?.value ?: 0L), (configurationhandle?.value ?: 0L), index.toInt(), (keyname?.value ?: 0L), (keyhandle?.value ?: 0L))
}

public actual fun ndisOpenConfigurationKeyByName(status: COpaquePointer?, configurationhandle: COpaquePointer?, subkeyname: COpaquePointer?, subkeyhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenConfigurationKeyByName((status?.value ?: 0L), (configurationhandle?.value ?: 0L), (subkeyname?.value ?: 0L), (subkeyhandle?.value ?: 0L))
}

public actual fun ndisOpenFile(status: COpaquePointer?, filehandle: COpaquePointer?, filelength: COpaquePointer?, filename: COpaquePointer?, highestacceptableaddress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisOpenFile((status?.value ?: 0L), (filehandle?.value ?: 0L), (filelength?.value ?: 0L), (filename?.value ?: 0L), highestacceptableaddress)
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: COpaquePointer?, ndisbindinghandle: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryAdapterInstanceName((padapterinstancename?.value ?: 0L), (ndisbindinghandle?.value ?: 0L))

public actual fun ndisQueryBindInstanceName(padapterinstancename: COpaquePointer?, bindingcontext: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisQueryBindInstanceName((padapterinstancename?.value ?: 0L), (bindingcontext?.value ?: 0L))

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisReEnumerateProtocolBindings((ndisprotocolhandle?.value ?: 0L))
}

public actual fun ndisReadConfiguration(status: COpaquePointer?, parametervalue: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametertype: NdisParameterType) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisReadConfiguration((status?.value ?: 0L), (parametervalue?.value ?: 0L), (configurationhandle?.value ?: 0L), (keyword?.value ?: 0L), parametertype)
}

public actual fun ndisReadNetworkAddress(status: COpaquePointer?, networkaddress: COpaquePointer?, networkaddresslength: COpaquePointer?, configurationhandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisReadNetworkAddress((status?.value ?: 0L), (networkaddress?.value ?: 0L), (networkaddresslength?.value ?: 0L), (configurationhandle?.value ?: 0L))
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisRegisterTdiCallBack(0L, 0L)
}

public actual fun ndisReleaseReadWriteLock(lock: COpaquePointer?, lockstate: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisReleaseReadWriteLock((lock?.value ?: 0L), (lockstate?.value ?: 0L))
}

public actual fun ndisResetEvent(event: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisResetEvent((event?.value ?: 0L))
}

public actual fun ndisSetEvent(event: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisSetEvent((event?.value ?: 0L))
}

public actual fun ndisSetPeriodicTimer(ndistimer: COpaquePointer?, millisecondsperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisSetPeriodicTimer((ndistimer?.value ?: 0L), millisecondsperiod.toInt())
}

public actual fun ndisSetTimer(timer: COpaquePointer?, millisecondstodelay: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimer((timer?.value ?: 0L), millisecondstodelay.toInt())
}

public actual fun ndisSetTimerEx(ndistimer: COpaquePointer?, millisecondstodelay: UInt, functioncontext: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisSetTimerEx((ndistimer?.value ?: 0L), millisecondstodelay.toInt(), (functioncontext?.value ?: 0L))
}

public actual fun ndisSetupDmaTransfer(status: COpaquePointer?, ndisdmahandle: COpaquePointer?, buffer: COpaquePointer?, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisSetupDmaTransfer((status?.value ?: 0L), (ndisdmahandle?.value ?: 0L), (buffer?.value ?: 0L), offset.toInt(), length.toInt(), writetodevice)
}

public actual fun ndisSystemProcessorCount(): Byte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisSystemProcessorCount()

public actual fun ndisUnmapFile(filehandle: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisUnmapFile((filehandle?.value ?: 0L))
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: COpaquePointer?, length: UInt, virtualaddress: COpaquePointer?, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisUpdateSharedMemory((ndisadapterhandle?.value ?: 0L), length.toInt(), (virtualaddress?.value ?: 0L), physicaladdress)
}

public actual fun ndisWaitEvent(event: COpaquePointer?, mstowait: UInt): Boolean =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisWaitEvent((event?.value ?: 0L), mstowait.toInt())

public actual fun ndisWriteConfiguration(status: COpaquePointer?, configurationhandle: COpaquePointer?, keyword: COpaquePointer?, parametervalue: COpaquePointer?) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteConfiguration((status?.value ?: 0L), (configurationhandle?.value ?: 0L), (keyword?.value ?: 0L), (parametervalue?.value ?: 0L))
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: COpaquePointer?, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteErrorLogEntry((ndisadapterhandle?.value ?: 0L), errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndisWriteEventLogEntry(loghandle: COpaquePointer?, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: COpaquePointer?, datasize: UInt, data: COpaquePointer?): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssys_windows_wdk_networkmanagement_ndis_ndisWriteEventLogEntry((loghandle?.value ?: 0L), eventcode, uniqueeventvalue.toInt(), numstrings.toShort(), (stringslist?.value ?: 0L), datasize.toInt(), (data?.value ?: 0L))
