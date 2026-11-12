@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

private object WindowsWdkNetworkmanagementNdisJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock: Long, fwrite: Boolean, lockstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress: Long, length: Int, tag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer: Long, timercancelled: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle: Long, protocolpartycontext: Long, callparameters: Long, ndispartyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle: Long, ndispartyhandle: Long, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle: Long, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle: Long, callparameters: Long, protocolpartycontext: Long, ndispartyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle: Long, protocolsapcontext: Long, sap: Long, ndissaphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status: Int, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status: Int, ndissaphandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle: Long, ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: Long, buffer: Long, size: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: Long, buffer: Long, size: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status: Int, ndispartyhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status: Int, ndisvchandle: Long, ndispartyhandle: Long, callmgrpartycontext: Long, callparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: Long, callmgrafcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status: Int, ndissaphandle: Long, callmgrsapcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle: Long, baseinstancename: Long, vcinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle: Long, ndisafhandle: Long, protocolvccontext: Long, ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle: Long, tapicallid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: Int, length: Int, writetodevice: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(status: Long, buffer: Long, poolhandle: Long, memorydescriptor: Long, offset: Int, length: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress: Long, length: Int, memoryflags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId(): Byte

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount: Long, pkernelanduser: Long, pindex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment(): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion(): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle: Long, protocolhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle: Long, deviceinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle: Long, driverinstance: Long, devicecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination: Long, source: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer: Long, timerfunction: Long, functioncontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle: Long, length: Int, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle: Long, length: Int, cached: Boolean, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer: Long, timercancelled: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle: Long, callparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle: Long, ndisafhandle: Long, miniportvccontext: Long, ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle: Long, addressfamily: Long, cmcharacteristics: Long, sizeofcmcharacteristics: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status: Int, ndisvchandle: Long, callparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status: Int, ndisvchandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle: Long, size: Int, loghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle: Long, initialport: Int, numberofports: Int, portoffset: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle: Long, length: Int, cached: Boolean, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle: Long, physicaldeviceobject: Long, functionaldeviceobject: Long, nextdeviceobject: Long, allocatedresources: Long, allocatedresourcestranslated: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer: Long, miniportadapterhandle: Long, timerfunction: Long, functioncontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress: Long, miniportadapterhandle: Long, physicaladdress: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename: Long, miniporthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle: Long, miniportadapterhandle: Long, dmachannel: Int, dma32bitaddresses: Boolean, dmadescription: Long, maximumlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset: Long, miniportadapterhandle: Long, initialport: Int, numberofports: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(timer: Long, millisecondperiod: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle: Long, virtualaddress: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle: Long, logbuffer: Long, logbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status: Long, mappedbuffer: Long, filehandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status: Long, configurationhandle: Long, index: Int, keyname: Long, keyhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status: Long, configurationhandle: Long, subkeyname: Long, subkeyhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status: Long, filehandle: Long, filelength: Long, filename: Long, highestacceptableaddress: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename: Long, ndisbindinghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename: Long, bindingcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status: Long, parametervalue: Long, configurationhandle: Long, keyword: Long, parametertype: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(status: Long, networkaddress: Long, networkaddresslength: Long, configurationhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(registercallback: Long, pnphandler: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock: Long, lockstate: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer: Long, millisecondsperiod: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer: Long, millisecondstodelay: Int)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer: Long, millisecondstodelay: Int, functioncontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status: Long, ndisdmahandle: Long, buffer: Long, offset: Int, length: Int, writetodevice: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount(): Byte

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle: Long, length: Int, virtualaddress: Long, physicaladdress: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event: Long, mstowait: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status: Long, configurationhandle: Long, keyword: Long, parametervalue: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle: Long, errorcode: Int, numberoferrorvalues: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle: Long, eventcode: Int, uniqueeventvalue: Int, numstrings: Short, stringslist: Long, datasize: Int, data: Long): Int
}

public actual fun ndisAcquireReadWriteLock(lock: MutPtr, fwrite: Boolean, lockstate: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock.rawAddress, fwrite, lockstate.rawAddress)
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr, length: UInt, tag: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress.rawAddress, length.toInt(), tag.toInt())

public actual fun ndisCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer.rawAddress, timercancelled.rawAddress)
}

public actual fun ndisClAddParty(ndisvchandle: ConstPtr, protocolpartycontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle.rawAddress, protocolpartycontext.rawAddress, callparameters.rawAddress, ndispartyhandle.rawAddress)

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle.rawAddress)

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle.rawAddress, ndispartyhandle.rawAddress, buffer.rawAddress, size.toInt())

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle.rawAddress)

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle.rawAddress, buffer.rawAddress, size.toInt())

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr): Int =
    0

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status, ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr, callparameters: MutPtr, protocolpartycontext: ConstPtr, ndispartyhandle: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle.rawAddress, callparameters.rawAddress, protocolpartycontext.rawAddress, ndispartyhandle.rawAddress)

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle.rawAddress, protocolsapcontext.rawAddress, sap.rawAddress, ndissaphandle.rawAddress)

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle.rawAddress)
}

public actual fun ndisCloseFile(filehandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle.rawAddress)
}

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr, callparameters: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status, ndispartyhandle.rawAddress, callmgrpartycontext.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status, ndisafhandle.rawAddress)
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status, ndisvchandle.rawAddress, ndispartyhandle.rawAddress)
}

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle.rawAddress)

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status, ndissaphandle.rawAddress)
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle.rawAddress)
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr, ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle.rawAddress, ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.rawAddress, buffer.rawAddress, size.toInt())
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.rawAddress, buffer.rawAddress, size.toInt())
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status, ndispartyhandle.rawAddress)
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status, ndisvchandle.rawAddress, ndispartyhandle.rawAddress, callmgrpartycontext.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status, ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr, callmgrafcontext: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status, ndisafhandle.rawAddress, callmgrafcontext.rawAddress)
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr, callmgrsapcontext: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status, ndissaphandle.rawAddress, callmgrsapcontext.rawAddress)
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr, baseinstancename: ConstPtr, vcinstancename: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle.rawAddress, baseinstancename.rawAddress, vcinstancename.rawAddress)

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr, ndisafhandle: ConstPtr, protocolvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle.rawAddress, ndisafhandle.rawAddress, protocolvccontext.rawAddress, ndisvchandle.rawAddress)

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle.rawAddress)

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr, tapicallid: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle.rawAddress, tapicallid.rawAddress)

public actual fun ndisCompleteDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status.rawAddress, ndisdmahandle.rawAddress, buffer.rawAddress, offset.toInt(), length.toInt(), writetodevice)
}

public actual fun ndisCopyBuffer(status: MutPtr, buffer: MutPtr, poolhandle: ConstPtr, memorydescriptor: ConstPtr, offset: UInt, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(status.rawAddress, buffer.rawAddress, poolhandle.rawAddress, memorydescriptor.rawAddress, offset.toInt(), length.toInt())
}

public actual fun ndisDeregisterTdiCallBack() {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()
}

public actual fun ndisFreeMemory(virtualaddress: ConstPtr, length: UInt, memoryflags: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress.rawAddress, length.toInt(), memoryflags.toInt())
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId().toUByte()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr, pkernelanduser: MutPtr, pindex: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount.rawAddress, pkernelanduser.rawAddress, pindex.rawAddress)
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage.rawAddress)
}

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr): MutPtr =
    MutPtr(WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename.rawAddress))

public actual fun ndisGetSharedDataAlignment(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment().toUInt()

public actual fun ndisGetVersion(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion().toUInt()

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr, protocolhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle.rawAddress, protocolhandle.rawAddress)
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr, deviceinstance: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle.rawAddress, deviceinstance.rawAddress)

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle.rawAddress)

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr): MutPtr =
    MutPtr(WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle.rawAddress))

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr, driverinstance: ConstPtr, devicecontext: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle.rawAddress, driverinstance.rawAddress, devicecontext.rawAddress)

public actual fun ndisInitializeEvent(event: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event.rawAddress)
}

public actual fun ndisInitializeReadWriteLock(lock: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock.rawAddress)
}

public actual fun ndisInitializeString(destination: MutPtr, source: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination.rawAddress, source.rawAddress)
}

public actual fun ndisInitializeTimer(timer: MutPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer.rawAddress, 0L, functioncontext.rawAddress)
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: MutPtr, physicaladdress: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle.rawAddress, length.toInt(), cached, virtualaddress.rawAddress, physicaladdress.rawAddress)
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, context: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle.rawAddress, length.toInt(), cached, context.rawAddress)

public actual fun ndisMCancelTimer(timer: ConstPtr, timercancelled: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer.rawAddress, timercancelled.rawAddress)
}

public actual fun ndisMCloseLog(loghandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle.rawAddress)
}

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr, ndisafhandle: ConstPtr, miniportvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle.rawAddress, ndisafhandle.rawAddress, miniportvccontext.rawAddress, ndisvchandle.rawAddress)

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle.rawAddress)

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle.rawAddress)

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr, addressfamily: MutPtr, cmcharacteristics: MutPtr, sizeofcmcharacteristics: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle.rawAddress, addressfamily.rawAddress, cmcharacteristics.rawAddress, sizeofcmcharacteristics.toInt())

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status, ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status, ndisvchandle.rawAddress)
}

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr, size: UInt, loghandle: MutPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle.rawAddress, size.toInt(), loghandle.rawAddress)

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle.rawAddress)
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt, portoffset: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle.rawAddress, initialport.toInt(), numberofports.toInt(), portoffset.rawAddress)
}

public actual fun ndisMFlushLog(loghandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle.rawAddress)
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: ConstPtr, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle.rawAddress, length.toInt(), cached, virtualaddress.rawAddress, physicaladdress)
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr, physicaldeviceobject: MutPtr, functionaldeviceobject: MutPtr, nextdeviceobject: MutPtr, allocatedresources: MutPtr, allocatedresourcestranslated: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle.rawAddress, physicaldeviceobject.rawAddress, functionaldeviceobject.rawAddress, nextdeviceobject.rawAddress, allocatedresources.rawAddress, allocatedresourcestranslated.rawAddress)
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle.rawAddress).toUInt()

public actual fun ndisMInitializeTimer(timer: ConstPtr, miniportadapterhandle: ConstPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer.rawAddress, miniportadapterhandle.rawAddress, 0L, functioncontext.rawAddress)
}

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr, miniportadapterhandle: ConstPtr, physicaladdress: Long, length: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress.rawAddress, miniportadapterhandle.rawAddress, physicaladdress, length.toInt())

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr, miniporthandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename.rawAddress, miniporthandle.rawAddress)

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle.rawAddress).toUInt()

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr, miniportadapterhandle: ConstPtr, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr, maximumlength: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle.rawAddress, miniportadapterhandle.rawAddress, dmachannel.toInt(), dma32bitaddresses, dmadescription.rawAddress, maximumlength.toInt())

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr, miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset.rawAddress, miniportadapterhandle.rawAddress, initialport.toInt(), numberofports.toInt())

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle.rawAddress)

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr, millisecondperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(timer.rawAddress, millisecondperiod.toInt())
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep.toInt())
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr, virtualaddress: ConstPtr, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle.rawAddress, virtualaddress.rawAddress, length.toInt())
}

public actual fun ndisMWriteLogData(loghandle: ConstPtr, logbuffer: ConstPtr, logbuffersize: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle.rawAddress, logbuffer.rawAddress, logbuffersize.toInt())

public actual fun ndisMapFile(status: MutPtr, mappedbuffer: MutPtr, filehandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status.rawAddress, mappedbuffer.rawAddress, filehandle.rawAddress)
}

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr, configurationhandle: ConstPtr, index: UInt, keyname: MutPtr, keyhandle: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status.rawAddress, configurationhandle.rawAddress, index.toInt(), keyname.rawAddress, keyhandle.rawAddress)
}

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr, configurationhandle: ConstPtr, subkeyname: ConstPtr, subkeyhandle: MutPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status.rawAddress, configurationhandle.rawAddress, subkeyname.rawAddress, subkeyhandle.rawAddress)
}

public actual fun ndisOpenFile(status: MutPtr, filehandle: MutPtr, filelength: MutPtr, filename: ConstPtr, highestacceptableaddress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status.rawAddress, filehandle.rawAddress, filelength.rawAddress, filename.rawAddress, highestacceptableaddress)
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr, ndisbindinghandle: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename.rawAddress, ndisbindinghandle.rawAddress)

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr, bindingcontext: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename.rawAddress, bindingcontext.rawAddress)

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle.rawAddress)
}

public actual fun ndisReadConfiguration(status: MutPtr, parametervalue: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametertype: NdisParameterType) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status.rawAddress, parametervalue.rawAddress, configurationhandle.rawAddress, keyword.rawAddress, parametertype)
}

public actual fun ndisReadNetworkAddress(status: MutPtr, networkaddress: MutPtr, networkaddresslength: MutPtr, configurationhandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(status.rawAddress, networkaddress.rawAddress, networkaddresslength.rawAddress, configurationhandle.rawAddress)
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(0L, 0L)
}

public actual fun ndisReleaseReadWriteLock(lock: MutPtr, lockstate: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock.rawAddress, lockstate.rawAddress)
}

public actual fun ndisResetEvent(event: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event.rawAddress)
}

public actual fun ndisSetEvent(event: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event.rawAddress)
}

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr, millisecondsperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer.rawAddress, millisecondsperiod.toInt())
}

public actual fun ndisSetTimer(timer: ConstPtr, millisecondstodelay: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer.rawAddress, millisecondstodelay.toInt())
}

public actual fun ndisSetTimerEx(ndistimer: ConstPtr, millisecondstodelay: UInt, functioncontext: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer.rawAddress, millisecondstodelay.toInt(), functioncontext.rawAddress)
}

public actual fun ndisSetupDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status.rawAddress, ndisdmahandle.rawAddress, buffer.rawAddress, offset.toInt(), length.toInt(), writetodevice)
}

public actual fun ndisSystemProcessorCount(): Byte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount()

public actual fun ndisUnmapFile(filehandle: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle.rawAddress)
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr, length: UInt, virtualaddress: MutPtr, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle.rawAddress, length.toInt(), virtualaddress.rawAddress, physicaladdress)
}

public actual fun ndisWaitEvent(event: ConstPtr, mstowait: UInt): Boolean =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event.rawAddress, mstowait.toInt())

public actual fun ndisWriteConfiguration(status: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametervalue: ConstPtr) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status.rawAddress, configurationhandle.rawAddress, keyword.rawAddress, parametervalue.rawAddress)
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle.rawAddress, errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr, datasize: UInt, data: ConstPtr): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle.rawAddress, eventcode, uniqueeventvalue.toInt(), numstrings.toShort(), stringslist.rawAddress, datasize.toInt(), data.rawAddress)
