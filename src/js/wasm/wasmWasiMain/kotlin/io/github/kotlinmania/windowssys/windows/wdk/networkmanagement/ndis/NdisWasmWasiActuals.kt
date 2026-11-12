@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.CmResourceList
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ndisAcquireReadWriteLock(lock: MutPtr<NdisRwLock>, fwrite: Boolean, lockstate: MutPtr<LockState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisAcquireReadWriteLock")

public actual fun ndisAllocateMemoryWithTag(virtualaddress: MutPtr<MutPtr<CVoid>>, length: UInt, tag: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisAllocateMemoryWithTag")

public actual fun ndisCancelTimer(timer: ConstPtr<NdisTimer>, timercancelled: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCancelTimer")

public actual fun ndisClAddParty(ndisvchandle: ConstPtr<CVoid>, protocolpartycontext: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClAddParty")

public actual fun ndisClCloseAddressFamily(ndisafhandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClCloseAddressFamily")

public actual fun ndisClCloseCall(ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClCloseCall")

public actual fun ndisClDeregisterSap(ndissaphandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClDeregisterSap")

public actual fun ndisClDropParty(ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClDropParty")

public actual fun ndisClGetProtocolVcContextFromTapiCallId(tapicallid: UnicodeString, protocolvccontext: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClGetProtocolVcContextFromTapiCallId")

public actual fun ndisClIncomingCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClIncomingCallComplete")

public actual fun ndisClMakeCall(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>, protocolpartycontext: ConstPtr<CVoid>, ndispartyhandle: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClMakeCall")

public actual fun ndisClModifyCallQoS(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClModifyCallQoS")

public actual fun ndisClRegisterSap(ndisafhandle: ConstPtr<CVoid>, protocolsapcontext: ConstPtr<CVoid>, sap: ConstPtr<CoSap>, ndissaphandle: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisClRegisterSap")

public actual fun ndisCloseConfiguration(configurationhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCloseConfiguration")

public actual fun ndisCloseFile(filehandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCloseFile")

public actual fun ndisCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: MutPtr<CoCallParameters>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmActivateVc")

public actual fun ndisCmAddPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmAddPartyComplete")

public actual fun ndisCmCloseAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseAddressFamilyComplete")

public actual fun ndisCmCloseCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmCloseCallComplete")

public actual fun ndisCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDeactivateVc")

public actual fun ndisCmDeregisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDeregisterSapComplete")

public actual fun ndisCmDispatchCallConnected(ndisvchandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchCallConnected")

public actual fun ndisCmDispatchIncomingCall(ndissaphandle: ConstPtr<CVoid>, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCall")

public actual fun ndisCmDispatchIncomingCallQoSChange(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCallQoSChange")

public actual fun ndisCmDispatchIncomingCloseCall(closestatus: Int, ndisvchandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingCloseCall")

public actual fun ndisCmDispatchIncomingDropParty(dropstatus: Int, ndispartyhandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDispatchIncomingDropParty")

public actual fun ndisCmDropPartyComplete(status: Int, ndispartyhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmDropPartyComplete")

public actual fun ndisCmMakeCallComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, ndispartyhandle: ConstPtr<CVoid>, callmgrpartycontext: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmMakeCallComplete")

public actual fun ndisCmModifyCallQoSComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmModifyCallQoSComplete")

public actual fun ndisCmOpenAddressFamilyComplete(status: Int, ndisafhandle: ConstPtr<CVoid>, callmgrafcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmOpenAddressFamilyComplete")

public actual fun ndisCmRegisterSapComplete(status: Int, ndissaphandle: ConstPtr<CVoid>, callmgrsapcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCmRegisterSapComplete")

public actual fun ndisCoAssignInstanceName(ndisvchandle: ConstPtr<CVoid>, baseinstancename: ConstPtr<UnicodeString>, vcinstancename: MutPtr<UnicodeString>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoAssignInstanceName")

public actual fun ndisCoCreateVc(ndisbindinghandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, protocolvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoCreateVc")

public actual fun ndisCoDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoDeleteVc")

public actual fun ndisCoGetTapiCallId(ndisvchandle: ConstPtr<CVoid>, tapicallid: MutPtr<VarString>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCoGetTapiCallId")

public actual fun ndisCompleteDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCompleteDmaTransfer")

public actual fun ndisCopyBuffer(status: MutPtr<Int>, buffer: MutPtr<MutPtr<Mdl>>, poolhandle: ConstPtr<CVoid>, memorydescriptor: ConstPtr<CVoid>, offset: UInt, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisCopyBuffer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack(): Unit

public actual fun ndisDeregisterTdiCallBack(): Unit =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisDeregisterTdiCallBack()

public actual fun ndisFreeMemory(virtualaddress: ConstPtr<CVoid>, length: UInt, memoryflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisFreeMemory")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId(): Int

public actual fun ndisGeneratePartialCancelId(): UByte =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGeneratePartialCancelId().toUByte()

public actual fun ndisGetCurrentProcessorCounts(pidlecount: MutPtr<UInt>, pkernelanduser: MutPtr<UInt>, pindex: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCounts")

public actual fun ndisGetCurrentProcessorCpuUsage(pcpuusage: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisGetCurrentProcessorCpuUsage")

public actual fun ndisGetRoutineAddress(ndisroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisGetRoutineAddress")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment(): Int

public actual fun ndisGetSharedDataAlignment(): UInt =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetSharedDataAlignment().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisGetVersion")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetVersion(): Int

public actual fun ndisGetVersion(): UInt =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisGetVersion().toUInt()

public actual fun ndisIMAssociateMiniport(driverhandle: ConstPtr<CVoid>, protocolhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMAssociateMiniport")

public actual fun ndisIMCancelInitializeDeviceInstance(driverhandle: ConstPtr<CVoid>, deviceinstance: ConstPtr<UnicodeString>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMCancelInitializeDeviceInstance")

public actual fun ndisIMDeInitializeDeviceInstance(ndisminiporthandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMDeInitializeDeviceInstance")

public actual fun ndisIMGetBindingContext(ndisbindinghandle: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMGetBindingContext")

public actual fun ndisIMInitializeDeviceInstanceEx(driverhandle: ConstPtr<CVoid>, driverinstance: ConstPtr<UnicodeString>, devicecontext: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisIMInitializeDeviceInstanceEx")

public actual fun ndisInitializeEvent(event: MutPtr<NdisEvent>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeEvent")

public actual fun ndisInitializeReadWriteLock(lock: MutPtr<NdisRwLock>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeReadWriteLock")

public actual fun ndisInitializeString(destination: MutPtr<UnicodeString>, source: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeString")

public actual fun ndisInitializeTimer(timer: MutPtr<NdisTimer>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisInitializeTimer")

public actual fun ndisMAllocateSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: MutPtr<MutPtr<CVoid>>, physicaladdress: MutPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemory")

public actual fun ndisMAllocateSharedMemoryAsync(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, context: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMAllocateSharedMemoryAsync")

public actual fun ndisMCancelTimer(timer: ConstPtr<NdisMiniportTimer>, timercancelled: MutPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCancelTimer")

public actual fun ndisMCloseLog(loghandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCloseLog")

public actual fun ndisMCmActivateVc(ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmActivateVc")

public actual fun ndisMCmCreateVc(miniportadapterhandle: ConstPtr<CVoid>, ndisafhandle: ConstPtr<CVoid>, miniportvccontext: ConstPtr<CVoid>, ndisvchandle: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmCreateVc")

public actual fun ndisMCmDeactivateVc(ndisvchandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeactivateVc")

public actual fun ndisMCmDeleteVc(ndisvchandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmDeleteVc")

public actual fun ndisMCmRegisterAddressFamily(miniportadapterhandle: MutPtr<CVoid>, addressfamily: MutPtr<CoAddressFamily>, cmcharacteristics: MutPtr<NdisCallManagerCharacteristics>, sizeofcmcharacteristics: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCmRegisterAddressFamily")

public actual fun ndisMCoActivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>, callparameters: ConstPtr<CoCallParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCoActivateVcComplete")

public actual fun ndisMCoDeactivateVcComplete(status: Int, ndisvchandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCoDeactivateVcComplete")

public actual fun ndisMCreateLog(miniportadapterhandle: ConstPtr<CVoid>, size: UInt, loghandle: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMCreateLog")

public actual fun ndisMDeregisterDmaChannel(miniportdmahandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterDmaChannel")

public actual fun ndisMDeregisterIoPortRange(miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt, portoffset: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMDeregisterIoPortRange")

public actual fun ndisMFlushLog(loghandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMFlushLog")

public actual fun ndisMFreeSharedMemory(miniportadapterhandle: ConstPtr<CVoid>, length: UInt, cached: Boolean, virtualaddress: ConstPtr<CVoid>, physicaladdress: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMFreeSharedMemory")

public actual fun ndisMGetDeviceProperty(miniportadapterhandle: ConstPtr<CVoid>, physicaldeviceobject: MutPtr<MutPtr<DeviceObject>>, functionaldeviceobject: MutPtr<MutPtr<DeviceObject>>, nextdeviceobject: MutPtr<MutPtr<DeviceObject>>, allocatedresources: MutPtr<MutPtr<CmResourceList>>, allocatedresourcestranslated: MutPtr<MutPtr<CmResourceList>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMGetDeviceProperty")

public actual fun ndisMGetDmaAlignment(miniportadapterhandle: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMGetDmaAlignment")

public actual fun ndisMInitializeTimer(timer: ConstPtr<NdisMiniportTimer>, miniportadapterhandle: ConstPtr<CVoid>, timerfunction: PndisTimerFunction, functioncontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMInitializeTimer")

public actual fun ndisMMapIoSpace(virtualaddress: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, physicaladdress: Long, length: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMMapIoSpace")

public actual fun ndisMQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, miniporthandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMQueryAdapterInstanceName")

public actual fun ndisMReadDmaCounter(miniportdmahandle: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMReadDmaCounter")

public actual fun ndisMRegisterDmaChannel(miniportdmahandle: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, dmachannel: UInt, dma32bitaddresses: Boolean, dmadescription: ConstPtr<NdisDmaDescription>, maximumlength: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterDmaChannel")

public actual fun ndisMRegisterIoPortRange(portoffset: MutPtr<MutPtr<CVoid>>, miniportadapterhandle: ConstPtr<CVoid>, initialport: UInt, numberofports: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMRegisterIoPortRange")

public actual fun ndisMRemoveMiniport(miniporthandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMRemoveMiniport")

public actual fun ndisMSetPeriodicTimer(timer: ConstPtr<NdisMiniportTimer>, millisecondperiod: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMSetPeriodicTimer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisMSleep")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep: Int): Unit

public actual fun ndisMSleep(microsecondstosleep: UInt): Unit =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisMSleep(microsecondstosleep.toInt())

public actual fun ndisMUnmapIoSpace(miniportadapterhandle: ConstPtr<CVoid>, virtualaddress: ConstPtr<CVoid>, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMUnmapIoSpace")

public actual fun ndisMWriteLogData(loghandle: ConstPtr<CVoid>, logbuffer: ConstPtr<CVoid>, logbuffersize: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMWriteLogData")

public actual fun ndisMapFile(status: MutPtr<Int>, mappedbuffer: MutPtr<MutPtr<CVoid>>, filehandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisMapFile")

public actual fun ndisOpenConfigurationKeyByIndex(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, index: UInt, keyname: MutPtr<UnicodeString>, keyhandle: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByIndex")

public actual fun ndisOpenConfigurationKeyByName(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, subkeyname: ConstPtr<UnicodeString>, subkeyhandle: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisOpenConfigurationKeyByName")

public actual fun ndisOpenFile(status: MutPtr<Int>, filehandle: MutPtr<MutPtr<CVoid>>, filelength: MutPtr<UInt>, filename: ConstPtr<UnicodeString>, highestacceptableaddress: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisOpenFile")

public actual fun ndisQueryAdapterInstanceName(padapterinstancename: MutPtr<UnicodeString>, ndisbindinghandle: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisQueryAdapterInstanceName")

public actual fun ndisQueryBindInstanceName(padapterinstancename: MutPtr<UnicodeString>, bindingcontext: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisQueryBindInstanceName")

public actual fun ndisReEnumerateProtocolBindings(ndisprotocolhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReEnumerateProtocolBindings")

public actual fun ndisReadConfiguration(status: MutPtr<Int>, parametervalue: MutPtr<MutPtr<NdisConfigurationParameter>>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametertype: NdisParameterType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReadConfiguration")

public actual fun ndisReadNetworkAddress(status: MutPtr<Int>, networkaddress: MutPtr<MutPtr<CVoid>>, networkaddresslength: MutPtr<UInt>, configurationhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReadNetworkAddress")

public actual fun ndisRegisterTdiCallBack(registercallback: TdiRegisterCallback, pnphandler: TdiPnpHandler): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisRegisterTdiCallBack")

public actual fun ndisReleaseReadWriteLock(lock: MutPtr<NdisRwLock>, lockstate: ConstPtr<LockState>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisReleaseReadWriteLock")

public actual fun ndisResetEvent(event: ConstPtr<NdisEvent>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisResetEvent")

public actual fun ndisSetEvent(event: ConstPtr<NdisEvent>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetEvent")

public actual fun ndisSetPeriodicTimer(ndistimer: ConstPtr<NdisTimer>, millisecondsperiod: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetPeriodicTimer")

public actual fun ndisSetTimer(timer: ConstPtr<NdisTimer>, millisecondstodelay: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetTimer")

public actual fun ndisSetTimerEx(ndistimer: ConstPtr<NdisTimer>, millisecondstodelay: UInt, functioncontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetTimerEx")

public actual fun ndisSetupDmaTransfer(status: MutPtr<Int>, ndisdmahandle: MutPtr<CVoid>, buffer: MutPtr<Mdl>, offset: UInt, length: UInt, writetodevice: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisSetupDmaTransfer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount")
private external fun wasiWindowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount(): Int

public actual fun ndisSystemProcessorCount(): Byte =
    wasiWindowssysWindowsWdkNetworkmanagementNdisNdisSystemProcessorCount().toByte()

public actual fun ndisUnmapFile(filehandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisUnmapFile")

public actual fun ndisUpdateSharedMemory(ndisadapterhandle: MutPtr<CVoid>, length: UInt, virtualaddress: MutPtr<CVoid>, physicaladdress: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisUpdateSharedMemory")

public actual fun ndisWaitEvent(event: ConstPtr<NdisEvent>, mstowait: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWaitEvent")

public actual fun ndisWriteConfiguration(status: MutPtr<Int>, configurationhandle: ConstPtr<CVoid>, keyword: ConstPtr<UnicodeString>, parametervalue: ConstPtr<NdisConfigurationParameter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWriteConfiguration")

public actual fun ndisWriteErrorLogEntry(ndisadapterhandle: ConstPtr<CVoid>, errorcode: UInt, numberoferrorvalues: UInt, vararg variadicArgs: Long): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWriteErrorLogEntry")

public actual fun ndisWriteEventLogEntry(loghandle: ConstPtr<CVoid>, eventcode: Int, uniqueeventvalue: UInt, numstrings: UShort, stringslist: ConstPtr<CVoid>, datasize: UInt, data: ConstPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkNetworkmanagementNdisNdisWriteEventLogEntry")
