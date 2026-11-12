@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
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

public actual fun ndisAcquireReadWriteLock(lock: MutPtr<NdisRwLock>, fwrite: Boolean, lockstate: MutPtr<LockState>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock(lock.rawAddress, fwrite, lockstate.rawAddress)
}

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr<MutPtr<CVoid>>, length: UInt, tag: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag(virtualaddress.rawAddress, length.toInt(), tag.toInt())

public actual fun ndisCancelTimer(timer: ConstPtr<NdisTimer>, timercancelled: MutPtr<Boolean>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer(timer.rawAddress, timercancelled.rawAddress)
}

public actual fun ndisClAddParty(ndisvchandle: ConstPtr<CVoid>, protocolpartycontext: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty(ndisvchandle.rawAddress, protocolpartycontext.rawAddress, callparameters.rawAddress, ndispartyhandle.rawAddress)

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily(ndisafhandle.rawAddress)

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall(ndisvchandle.rawAddress, ndispartyhandle.rawAddress, buffer.rawAddress, size.toInt())

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap(ndissaphandle.rawAddress)

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty(ndispartyhandle.rawAddress, buffer.rawAddress, size.toInt())

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete(status, ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, protocolpartycontext: ConstPtr<CVoid>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall(ndisvchandle.rawAddress, callparameters.rawAddress, protocolpartycontext.rawAddress, ndispartyhandle.rawAddress)

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS(ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr<CVoid>, protocolsapcontext: ConstPtr<CVoid>, sap: ConstPtr<CoSap>, ndissaphandle: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap(ndisafhandle.rawAddress, protocolsapcontext.rawAddress, sap.rawAddress, ndissaphandle.rawAddress)

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration(configurationhandle.rawAddress)
}

public actual fun ndisCloseFile(filehandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile(filehandle.rawAddress)
}

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc(ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete(status, ndispartyhandle.rawAddress, callmgrpartycontext.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete(status, ndisafhandle.rawAddress)
}

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete(status, ndisvchandle.rawAddress, ndispartyhandle.rawAddress)
}

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc(ndisvchandle.rawAddress)

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete(status, ndissaphandle.rawAddress)
}

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected(ndisvchandle.rawAddress)
}

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr<CVoid>, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall(ndissaphandle.rawAddress, ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange(ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall(closestatus, ndisvchandle.rawAddress, buffer.rawAddress, size.toInt())
}

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty(dropstatus, ndispartyhandle.rawAddress, buffer.rawAddress, size.toInt())
}

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete(status, ndispartyhandle.rawAddress)
}

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete(status, ndisvchandle.rawAddress, ndispartyhandle.rawAddress, callmgrpartycontext.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete(status, ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>, callmgrafcontext: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete(status, ndisafhandle.rawAddress, callmgrafcontext.rawAddress)
}

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>, callmgrsapcontext: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete(status, ndissaphandle.rawAddress, callmgrsapcontext.rawAddress)
}

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr<CVoid>, baseinstancename: ConstPtr<UnicodeString>, vcinstancename: MutPtr<UnicodeString>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName(ndisvchandle.rawAddress, baseinstancename.rawAddress, vcinstancename.rawAddress)

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, protocolvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc(ndisbindinghandle.rawAddress, ndisafhandle.rawAddress, protocolvccontext.rawAddress, ndisvchandle.rawAddress)

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc(ndisvchandle.rawAddress)

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr<CVoid>, tapicallid: MutPtr<VarString>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId(ndisvchandle.rawAddress, tapicallid.rawAddress)

public actual fun ndisCompleteDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer(status.rawAddress, ndisdmahandle.rawAddress, buffer.rawAddress, offset.toInt(), length.toInt(), writetodevice)
}

public actual fun ndisCopyBuffer(status: MutPtr<Int>, buffer: MutPtr<MutPtr<Mdl>>, poolhandle: ConstPtr<CVoid>, memorydescriptor: ConstPtr<CVoid>, offset: UInt, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer(status.rawAddress, buffer.rawAddress, poolhandle.rawAddress, memorydescriptor.rawAddress, offset.toInt(), length.toInt())
}

public actual fun ndisDeregisterTdiCallBack() {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()
}

public actual fun ndisFreeMemory(virtualaddress: ConstPtr<CVoid>, length: UInt, memoryflags: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory(virtualaddress.rawAddress, length.toInt(), memoryflags.toInt())
}

public actual fun ndisGeneratePartialCancelId(): UByte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId().toUByte()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr<UInt>, pkernelanduser: MutPtr<UInt>, pindex: MutPtr<UInt>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts(pidlecount.rawAddress, pkernelanduser.rawAddress, pindex.rawAddress)
}

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr<UInt>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage(pcpuusage.rawAddress)
}

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    MutPtr(WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress(ndisroutinename.rawAddress))

public actual fun ndisGetSharedDataAlignment(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment().toUInt()

public actual fun ndisGetVersion(): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion().toUInt()

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr<CVoid>, protocolhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport(driverhandle.rawAddress, protocolhandle.rawAddress)
}

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr<CVoid>, deviceinstance: ConstPtr<UnicodeString>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance(driverhandle.rawAddress, deviceinstance.rawAddress)

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance(ndisminiporthandle.rawAddress)

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext(ndisbindinghandle.rawAddress))

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr<CVoid>, driverinstance: ConstPtr<UnicodeString>, devicecontext: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx(driverhandle.rawAddress, driverinstance.rawAddress, devicecontext.rawAddress)

public actual fun ndisInitializeEvent(event: MutPtr<NdisEvent>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent(event.rawAddress)
}

public actual fun ndisInitializeReadWriteLock(lock: MutPtr<NdisRwLock>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock(lock.rawAddress)
}

public actual fun ndisInitializeString(destination: MutPtr<UnicodeString>, source: ConstPtr<UByte>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString(destination.rawAddress, source.rawAddress)
}

public actual fun ndisInitializeTimer(timer: MutPtr<NdisTimer>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer(timer.rawAddress, 0L, functioncontext.rawAddress)
}

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: MutPtr<MutPtr<CVoid>>, physicaladdress: MutPtr<Long>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory(miniportadapterhandle.rawAddress, length.toInt(), cached, virtualaddress.rawAddress, physicaladdress.rawAddress)
}

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, context: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync(miniportadapterhandle.rawAddress, length.toInt(), cached, context.rawAddress)

public actual fun ndisMCancelTimer(timer: ConstPtr<NdisMiniportTimer>, timercancelled: MutPtr<Boolean>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer(timer.rawAddress, timercancelled.rawAddress)
}

public actual fun ndisMCloseLog(loghandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog(loghandle.rawAddress)
}

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc(ndisvchandle.rawAddress, callparameters.rawAddress)

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, miniportvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc(miniportadapterhandle.rawAddress, ndisafhandle.rawAddress, miniportvccontext.rawAddress, ndisvchandle.rawAddress)

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc(ndisvchandle.rawAddress)

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc(ndisvchandle.rawAddress)

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr<CVoid>, addressfamily: MutPtr<CoAddressFamily>, cmcharacteristics: MutPtr<NdisCallManagerCharacteristics>, sizeofcmcharacteristics: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily(miniportadapterhandle.rawAddress, addressfamily.rawAddress, cmcharacteristics.rawAddress, sizeofcmcharacteristics.toInt())

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete(status, ndisvchandle.rawAddress, callparameters.rawAddress)
}

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete(status, ndisvchandle.rawAddress)
}

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr<CVoid>, size: UInt, loghandle: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog(miniportadapterhandle.rawAddress, size.toInt(), loghandle.rawAddress)

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel(miniportdmahandle.rawAddress)
}

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt, portoffset: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange(miniportadapterhandle.rawAddress, initialport.toInt(), numberofports.toInt(), portoffset.rawAddress)
}

public actual fun ndisMFlushLog(loghandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog(loghandle.rawAddress)
}

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: ConstPtr<CVoid>, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory(miniportadapterhandle.rawAddress, length.toInt(), cached, virtualaddress.rawAddress, physicaladdress)
}

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr<CVoid>, physicaldeviceobject: MutPtr<MutPtr<DeviceObject>>, functionaldeviceobject: MutPtr<MutPtr<DeviceObject>>, nextdeviceobject: MutPtr<MutPtr<DeviceObject>>, allocatedresources: MutPtr<MutPtr<CmResourceList>>, allocatedresourcestranslated: MutPtr<MutPtr<CmResourceList>>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty(miniportadapterhandle.rawAddress, physicaldeviceobject.rawAddress, functionaldeviceobject.rawAddress, nextdeviceobject.rawAddress, allocatedresources.rawAddress, allocatedresourcestranslated.rawAddress)
}

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr<CVoid>): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment(miniportadapterhandle.rawAddress).toUInt()

public actual fun ndisMInitializeTimer(timer: ConstPtr<NdisMiniportTimer>, miniportadapterhandle: ConstPtr<CVoid>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer(timer.rawAddress, miniportadapterhandle.rawAddress, 0L, functioncontext.rawAddress)
}

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, physicaladdress: Long, length: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace(virtualaddress.rawAddress, miniportadapterhandle.rawAddress, physicaladdress, length.toInt())

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, miniporthandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName(padapterinstancename.rawAddress, miniporthandle.rawAddress)

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr<CVoid>): UInt =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter(miniportdmahandle.rawAddress).toUInt()

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr<NdisDmaDescription>, maximumlength: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel(miniportdmahandle.rawAddress, miniportadapterhandle.rawAddress, dmachannel.toInt(), dma32bitaddresses, dmadescription.rawAddress, maximumlength.toInt())

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange(portoffset.rawAddress, miniportadapterhandle.rawAddress, initialport.toInt(), numberofports.toInt())

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport(miniporthandle.rawAddress)

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr<NdisMiniportTimer>, millisecondperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer(timer.rawAddress, millisecondperiod.toInt())
}

public actual fun ndisMSleep(microsecondstosleep: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep.toInt())
}

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr<CVoid>, virtualaddress: ConstPtr<CVoid>, length: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace(miniportadapterhandle.rawAddress, virtualaddress.rawAddress, length.toInt())
}

public actual fun ndisMWriteLogData(loghandle: ConstPtr<CVoid>, logbuffer: ConstPtr<CVoid>, logbuffersize: UInt): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData(loghandle.rawAddress, logbuffer.rawAddress, logbuffersize.toInt())

public actual fun ndisMapFile(status: MutPtr<Int>, mappedbuffer: MutPtr<MutPtr<CVoid>>, filehandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisMapFile(status.rawAddress, mappedbuffer.rawAddress, filehandle.rawAddress)
}

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, index: UInt, keyname: MutPtr<UnicodeString>, keyhandle: MutPtr<MutPtr<CVoid>>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex(status.rawAddress, configurationhandle.rawAddress, index.toInt(), keyname.rawAddress, keyhandle.rawAddress)
}

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, subkeyname: ConstPtr<UnicodeString>, subkeyhandle: MutPtr<MutPtr<CVoid>>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName(status.rawAddress, configurationhandle.rawAddress, subkeyname.rawAddress, subkeyhandle.rawAddress)
}

public actual fun ndisOpenFile(status: MutPtr<Int>, filehandle: MutPtr<MutPtr<CVoid>>, filelength: MutPtr<UInt>, filename: ConstPtr<UnicodeString>, highestacceptableaddress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile(status.rawAddress, filehandle.rawAddress, filelength.rawAddress, filename.rawAddress, highestacceptableaddress)
}

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, ndisbindinghandle: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName(padapterinstancename.rawAddress, ndisbindinghandle.rawAddress)

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr<UnicodeString>, bindingcontext: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName(padapterinstancename.rawAddress, bindingcontext.rawAddress)

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings(ndisprotocolhandle.rawAddress)
}

public actual fun ndisReadConfiguration(status: MutPtr<Int>, parametervalue: MutPtr<MutPtr<NdisConfigurationParameter>>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametertype: NdisParameterType) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration(status.rawAddress, parametervalue.rawAddress, configurationhandle.rawAddress, keyword.rawAddress, parametertype)
}

public actual fun ndisReadNetworkAddress(status: MutPtr<Int>, networkaddress: MutPtr<MutPtr<CVoid>>, networkaddresslength: MutPtr<UInt>, configurationhandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress(status.rawAddress, networkaddress.rawAddress, networkaddresslength.rawAddress, configurationhandle.rawAddress)
}

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack(0L, 0L)
}

public actual fun ndisReleaseReadWriteLock(lock: MutPtr<NdisRwLock>, lockstate: ConstPtr<LockState>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock(lock.rawAddress, lockstate.rawAddress)
}

public actual fun ndisResetEvent(event: ConstPtr<NdisEvent>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent(event.rawAddress)
}

public actual fun ndisSetEvent(event: ConstPtr<NdisEvent>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent(event.rawAddress)
}

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr<NdisTimer>, millisecondsperiod: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer(ndistimer.rawAddress, millisecondsperiod.toInt())
}

public actual fun ndisSetTimer(timer: ConstPtr<NdisTimer>, millisecondstodelay: UInt) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer(timer.rawAddress, millisecondstodelay.toInt())
}

public actual fun ndisSetTimerEx(ndistimer: ConstPtr<NdisTimer>, millisecondstodelay: UInt, functioncontext: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx(ndistimer.rawAddress, millisecondstodelay.toInt(), functioncontext.rawAddress)
}

public actual fun ndisSetupDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer(status.rawAddress, ndisdmahandle.rawAddress, buffer.rawAddress, offset.toInt(), length.toInt(), writetodevice)
}

public actual fun ndisSystemProcessorCount(): Byte =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount()

public actual fun ndisUnmapFile(filehandle: ConstPtr<CVoid>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile(filehandle.rawAddress)
}

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr<CVoid>, length: UInt, virtualaddress: MutPtr<CVoid>, physicaladdress: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory(ndisadapterhandle.rawAddress, length.toInt(), virtualaddress.rawAddress, physicaladdress)
}

public actual fun ndisWaitEvent(event: ConstPtr<NdisEvent>, mstowait: UInt): Boolean =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent(event.rawAddress, mstowait.toInt())

public actual fun ndisWriteConfiguration(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametervalue: ConstPtr<NdisConfigurationParameter>) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration(status.rawAddress, configurationhandle.rawAddress, keyword.rawAddress, parametervalue.rawAddress)
}

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr<CVoid>, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long) {
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry(ndisadapterhandle.rawAddress, errorcode.toInt(), numberoferrorvalues.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr<CVoid>, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr<CVoid>, datasize: UInt, data: ConstPtr<CVoid>): Int =
    WindowsWdkNetworkmanagementNdisJniBridge.windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry(loghandle.rawAddress, eventcode, uniqueeventvalue.toInt(), numstrings.toShort(), stringslist.rawAddress, datasize.toInt(), data.rawAddress)
