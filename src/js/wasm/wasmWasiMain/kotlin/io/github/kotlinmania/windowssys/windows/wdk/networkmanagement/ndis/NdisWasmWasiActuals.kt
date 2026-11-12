@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ndisAcquireReadWriteLock(lock: MutPtr, fwrite: Boolean, lockstate: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock")

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr, length: UInt, tag: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag")

public actual fun ndisCancelTimer(timer: ConstPtr, timercancelled: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer")

public actual fun ndisClAddParty(ndisvchandle: ConstPtr, protocolpartycontext: ConstPtr, callparameters: MutPtr, ndispartyhandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty")

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily")

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall")

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap")

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClGetProtocolVcContextFromTapiCallId")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete")

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr, callparameters: MutPtr, protocolpartycontext: ConstPtr, ndispartyhandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall")

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS")

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr, protocolsapcontext: ConstPtr, sap: ConstPtr, ndissaphandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap")

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration")

public actual fun ndisCloseFile(filehandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile")

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr, callparameters: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete")

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete")

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete")

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete")

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected")

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr, ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr, callparameters: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange")

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr, buffer: ConstPtr, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall")

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr, buffer: ConstPtr, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty")

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete")

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr, ndispartyhandle: ConstPtr, callmgrpartycontext: ConstPtr, callparameters: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete")

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete")

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr, callmgrafcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete")

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr, callmgrsapcontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete")

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr, baseinstancename: ConstPtr, vcinstancename: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName")

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr, ndisafhandle: ConstPtr, protocolvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc")

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc")

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr, tapicallid: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId")

public actual fun ndisCompleteDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer")

public actual fun ndisCopyBuffer(status: MutPtr, buffer: MutPtr, poolhandle: ConstPtr, memorydescriptor: ConstPtr, offset: UInt, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack(): Unit

public actual fun ndisDeregisterTdiCallBack(): Unit =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()

public actual fun ndisFreeMemory(virtualaddress: ConstPtr, length: UInt, memoryflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId(): Int

public actual fun ndisGeneratePartialCancelId(): UByte =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId().toUByte()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr, pkernelanduser: MutPtr, pindex: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts")

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage")

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment(): Int

public actual fun ndisGetSharedDataAlignment(): UInt =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetVersion(): Int

public actual fun ndisGetVersion(): UInt =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetVersion().toUInt()

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr, protocolhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport")

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr, deviceinstance: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr, driverinstance: ConstPtr, devicecontext: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx")

public actual fun ndisInitializeEvent(event: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent")

public actual fun ndisInitializeReadWriteLock(lock: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock")

public actual fun ndisInitializeString(destination: MutPtr, source: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString")

public actual fun ndisInitializeTimer(timer: MutPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer")

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: MutPtr, physicaladdress: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory")

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, context: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync")

public actual fun ndisMCancelTimer(timer: ConstPtr, timercancelled: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer")

public actual fun ndisMCloseLog(loghandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog")

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr, callparameters: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc")

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr, ndisafhandle: ConstPtr, miniportvccontext: ConstPtr, ndisvchandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc")

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc")

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr, addressfamily: MutPtr, cmcharacteristics: MutPtr, sizeofcmcharacteristics: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr, callparameters: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete")

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete")

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr, size: UInt, loghandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel")

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt, portoffset: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange")

public actual fun ndisMFlushLog(loghandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog")

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr, length: UInt, cached: Boolean, virtualaddress: ConstPtr, physicaladdress: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory")

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr, physicaldeviceobject: MutPtr, functionaldeviceobject: MutPtr, nextdeviceobject: MutPtr, allocatedresources: MutPtr, allocatedresourcestranslated: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty")

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment")

public actual fun ndisMInitializeTimer(timer: ConstPtr, miniportadapterhandle: ConstPtr, timerfunction: PndisTimerFunction, functioncontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer")

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr, miniportadapterhandle: ConstPtr, physicaladdress: Long, length: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr, miniporthandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName")

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr, miniportadapterhandle: ConstPtr, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr, maximumlength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel")

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr, miniportadapterhandle: ConstPtr, initialport: UInt, numberofports: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange")

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport")

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr, millisecondperiod: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisMSleep")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep: Int): Unit

public actual fun ndisMSleep(microsecondstosleep: UInt): Unit =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep.toInt())

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr, virtualaddress: ConstPtr, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace")

public actual fun ndisMWriteLogData(loghandle: ConstPtr, logbuffer: ConstPtr, logbuffersize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData")

public actual fun ndisMapFile(status: MutPtr, mappedbuffer: MutPtr, filehandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMapFile")

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr, configurationhandle: ConstPtr, index: UInt, keyname: MutPtr, keyhandle: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex")

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr, configurationhandle: ConstPtr, subkeyname: ConstPtr, subkeyhandle: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName")

public actual fun ndisOpenFile(status: MutPtr, filehandle: MutPtr, filelength: MutPtr, filename: ConstPtr, highestacceptableaddress: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile")

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr, ndisbindinghandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName")

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr, bindingcontext: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings")

public actual fun ndisReadConfiguration(status: MutPtr, parametervalue: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametertype: NdisParameterType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration")

public actual fun ndisReadNetworkAddress(status: MutPtr, networkaddress: MutPtr, networkaddresslength: MutPtr, configurationhandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress")

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack")

public actual fun ndisReleaseReadWriteLock(lock: MutPtr, lockstate: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock")

public actual fun ndisResetEvent(event: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent")

public actual fun ndisSetEvent(event: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent")

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr, millisecondsperiod: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer")

public actual fun ndisSetTimer(timer: ConstPtr, millisecondstodelay: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer")

public actual fun ndisSetTimerEx(ndistimer: ConstPtr, millisecondstodelay: UInt, functioncontext: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx")

public actual fun ndisSetupDmaTransfer(status: MutPtr, ndisdmahandle: MutPtr, buffer: MutPtr, offset: UInt, length: UInt, writetodevice: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount(): Int

public actual fun ndisSystemProcessorCount(): Byte =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount().toByte()

public actual fun ndisUnmapFile(filehandle: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile")

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr, length: UInt, virtualaddress: MutPtr, physicaladdress: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory")

public actual fun ndisWaitEvent(event: ConstPtr, mstowait: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent")

public actual fun ndisWriteConfiguration(status: MutPtr, configurationhandle: ConstPtr, keyword: ConstPtr, parametervalue: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration")

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry")

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr, datasize: UInt, data: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry")
